/**
 *  Xbox
 *
 *  Copyright 2018 Neto Neto
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "Xbox", namespace: "v&iacute;deo game ", author: "Neto Neto") {
		capability "Media Playback"
		capability "Media Playback Shuffle"
		capability "Media Presets"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'playbackStatus' attribute
	// TODO: handle 'supportedPlaybackCommands' attribute
	// TODO: handle 'playbackShuffle' attribute
	// TODO: handle 'presets' attribute

}

// handle commands
def setPlaybackStatus() {
	log.debug "Executing 'setPlaybackStatus'"
	// TODO: handle 'setPlaybackStatus' command
}

def play() {
	log.debug "Executing 'play'"
	// TODO: handle 'play' command
}

def pause() {
	log.debug "Executing 'pause'"
	// TODO: handle 'pause' command
}

def stop() {
	log.debug "Executing 'stop'"
	// TODO: handle 'stop' command
}

def fastForward() {
	log.debug "Executing 'fastForward'"
	// TODO: handle 'fastForward' command
}

def rewind() {
	log.debug "Executing 'rewind'"
	// TODO: handle 'rewind' command
}

def setPlaybackShuffle() {
	log.debug "Executing 'setPlaybackShuffle'"
	// TODO: handle 'setPlaybackShuffle' command
}

def playPreset() {
	log.debug "Executing 'playPreset'"
	// TODO: handle 'playPreset' command
}