package typings
package hlsDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIOTRACKLOADERROR extends js.Object {
  /**
    * raised when audio track loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_ERROR, fatal: false, url: audio URL, loader: URL loader }
    */
  var AUDIO_TRACK_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_AUDIO_TRACK_LOAD_ERROR
  /**
    * raised when audio track loading fails because of a timeout
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT, fatal: false, url: audio URL, response: { code: error code, text: error text }, loader: URL loader }
    */
  var AUDIO_TRACK_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_AUDIO_TRACK_LOAD_TIMEOUT
  /**
    *  raised when MediaSource fails to add new sourceBuffer
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_ADD_CODEC_ERROR, fatal : false, err : error raised by MediaSource, mimeType: mimeType on which the failure happened }
    */
  var BUFFER_ADD_CODEC_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_ADD_CODEC_ERROR
  /**
    * raised when exception is raised during buffer appending
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPENDING_ERROR, fatal : false }
    */
  var BUFFER_APPENDING_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_APPENDING_ERROR
  /**
    * raised when exception is raised while calling buffer append
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPEND_ERROR, fatal : true, frag : fragment object }
    */
  var BUFFER_APPEND_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_APPEND_ERROR
  /**
    * raised when no data can be appended anymore in media buffer because it is full.
    * This error is recovered automatically by performing a smooth level switching that empty buffers (without disrupting the playback) and reducing the max buffer length.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_FULL_ERROR, fatal : false }
    */
  var BUFFER_FULL_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_FULL_ERROR
  /**
    * raised when playback is stuck although currentTime is in a buffered aread
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.BUFFERED_STALLED_ERROR, fatal: true }
    */
  var BUFFER_NUDGE_ON_STALL: hlsDotJsLib.hlsDotJsMod.K_BUFFER_NUDGE_ON_STALL
  /**
    * raised after hls.js seeks over a buffer hole to unstuck the playback,
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_SEEK_OVER_HOLE, fatal : false, hole : hole duration }
    */
  var BUFFER_SEEK_OVER_HOLE: hlsDotJsLib.hlsDotJsMod.K_BUFFER_SEEK_OVER_HOLE
  /**
    * raised when playback is stuck because buffer is running out of data
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_STALLED_ERROR, fatal : false }
    */
  var BUFFER_STALLED_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_STALLED_ERROR
  /**
    * raised when fragment decryption fails
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.FRAG_DECRYPT_ERROR, fatal: true, reason: failure reason }
    */
  var FRAG_DECRYPT_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_DECRYPT_ERROR
  /**
    * raised when fragment loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_ERROR, fatal : true or false, frag : fragment object, response : { code: error code, text: error text } }
    */
  var FRAG_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOAD_ERROR
  /**
    * raised when fragment loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_TIMEOUT, fatal : true or false, frag : fragment object }
    */
  var FRAG_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOAD_TIMEOUT
  /**
    * raised upon detection of same fragment being requested in loop
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOOP_LOADING_ERROR, fatal : true or false, frag : fragment object }
    */
  var FRAG_LOOP_LOADING_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOOP_LOADING_ERROR
  /**
    * raised when fragment parsing fails
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_PARSING_ERROR, fatal : true or false, reason : failure reason }
    */
  var FRAG_PARSING_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_PARSING_ERROR
  /**
    * raised when an exception occurs in an internal hls.js event handler
    * data: { type: OTHER_ERROR, details: Hls.ErrorDetails.INTERNAL_EXCEPTION, fatal: true or false, event: event object or string, error: { message: error message } }
    */
  var INTERNAL_EXCEPTION: hlsDotJsLib.hlsDotJsMod.K_INTERNAL_EXCEPTION
  /**
    * raised when decrypt key loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.KEY_LOAD_ERROR, fatal: false, frag: fragment object }
    */
  var KEY_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_KEY_LOAD_ERROR
  /**
    * raised when decrypt key loading fails because of timeout
    * data: { type: NETWORK_EROR, details: Hls.ErrorDetails.KEY_LOAD_TIMEOUT, fatal: true, frag: fragment object }
    */
  var KEY_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_KEY_LOAD_TIMEOUT
  /**
    * raised when level loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_ERROR, fatal : true, url : level URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  var LEVEL_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_LEVEL_LOAD_ERROR
  /**
    * raised when level loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_TIMEOUT, fatal : true, url : level URL, loader : URL loader }
    */
  var LEVEL_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_LEVEL_LOAD_TIMEOUT
  // OTHER_ERROR //
  /**
    * raised when level switching fails
    * data: { type : OTHER_ERROR, details : Hls.ErrorDetails.LEVEL_SWITCH_ERROR, fatal : false, level : failed level index, reason : failure reason }
    */
  var LEVEL_SWITCH_ERROR: hlsDotJsLib.hlsDotJsMod.K_LEVEL_SWITCH_ERROR
  // MEDIA_ERRORS //
  /**
    * raised when manifest only contains quality level with codecs incompatible with MediaSource Engine.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR, fatal : true, url : manifest URL }
    */
  var MANIFEST_INCOMPATIBLE_CODECS_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_INCOMPATIBLE_CODECS_ERROR
  // NETWORK_ERRORS //
  /**
    * raised when manifest loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_ERROR, fatal : true, url : manifest URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  var MANIFEST_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_LOAD_ERROR
  /**
    * raised when manifest loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_TIMEOUT, fatal : true, url : manifest URL, loader : URL loader }
    */
  var MANIFEST_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_LOAD_TIMEOUT
  /**
    * raised when manifest parsing failed to find proper content
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_PARSING_ERROR, fatal : true, url : manifest URL, reason : parsing error reason }
    */
  var MANIFEST_PARSING_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_PARSING_ERROR
  // MUX_ERROR //
  /**
    * raised when memory allocation fails during remuxing
    * data: { type: MUX_ERROR, details: Hls.ErrorDetails.REMUX_ALLOC_ERROR, fatal: false, bytes: mdat size, reason: failure reason }
    */
  var REMUX_ALLOC_ERROR: hlsDotJsLib.hlsDotJsMod.K_REMUX_ALLOC_ERROR
}

object Anon_AUDIOTRACKLOADERROR {
  @scala.inline
  def apply(
    AUDIO_TRACK_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_AUDIO_TRACK_LOAD_ERROR,
    AUDIO_TRACK_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_AUDIO_TRACK_LOAD_TIMEOUT,
    BUFFER_ADD_CODEC_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_ADD_CODEC_ERROR,
    BUFFER_APPENDING_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_APPENDING_ERROR,
    BUFFER_APPEND_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_APPEND_ERROR,
    BUFFER_FULL_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_FULL_ERROR,
    BUFFER_NUDGE_ON_STALL: hlsDotJsLib.hlsDotJsMod.K_BUFFER_NUDGE_ON_STALL,
    BUFFER_SEEK_OVER_HOLE: hlsDotJsLib.hlsDotJsMod.K_BUFFER_SEEK_OVER_HOLE,
    BUFFER_STALLED_ERROR: hlsDotJsLib.hlsDotJsMod.K_BUFFER_STALLED_ERROR,
    FRAG_DECRYPT_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_DECRYPT_ERROR,
    FRAG_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOAD_ERROR,
    FRAG_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOAD_TIMEOUT,
    FRAG_LOOP_LOADING_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_LOOP_LOADING_ERROR,
    FRAG_PARSING_ERROR: hlsDotJsLib.hlsDotJsMod.K_FRAG_PARSING_ERROR,
    INTERNAL_EXCEPTION: hlsDotJsLib.hlsDotJsMod.K_INTERNAL_EXCEPTION,
    KEY_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_KEY_LOAD_ERROR,
    KEY_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_KEY_LOAD_TIMEOUT,
    LEVEL_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_LEVEL_LOAD_ERROR,
    LEVEL_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_LEVEL_LOAD_TIMEOUT,
    LEVEL_SWITCH_ERROR: hlsDotJsLib.hlsDotJsMod.K_LEVEL_SWITCH_ERROR,
    MANIFEST_INCOMPATIBLE_CODECS_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_INCOMPATIBLE_CODECS_ERROR,
    MANIFEST_LOAD_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_LOAD_ERROR,
    MANIFEST_LOAD_TIMEOUT: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_LOAD_TIMEOUT,
    MANIFEST_PARSING_ERROR: hlsDotJsLib.hlsDotJsMod.K_MANIFEST_PARSING_ERROR,
    REMUX_ALLOC_ERROR: hlsDotJsLib.hlsDotJsMod.K_REMUX_ALLOC_ERROR
  ): Anon_AUDIOTRACKLOADERROR = {
    val __obj = js.Dynamic.literal(AUDIO_TRACK_LOAD_ERROR = AUDIO_TRACK_LOAD_ERROR, AUDIO_TRACK_LOAD_TIMEOUT = AUDIO_TRACK_LOAD_TIMEOUT, BUFFER_ADD_CODEC_ERROR = BUFFER_ADD_CODEC_ERROR, BUFFER_APPENDING_ERROR = BUFFER_APPENDING_ERROR, BUFFER_APPEND_ERROR = BUFFER_APPEND_ERROR, BUFFER_FULL_ERROR = BUFFER_FULL_ERROR, BUFFER_NUDGE_ON_STALL = BUFFER_NUDGE_ON_STALL, BUFFER_SEEK_OVER_HOLE = BUFFER_SEEK_OVER_HOLE, BUFFER_STALLED_ERROR = BUFFER_STALLED_ERROR, FRAG_DECRYPT_ERROR = FRAG_DECRYPT_ERROR, FRAG_LOAD_ERROR = FRAG_LOAD_ERROR, FRAG_LOAD_TIMEOUT = FRAG_LOAD_TIMEOUT, FRAG_LOOP_LOADING_ERROR = FRAG_LOOP_LOADING_ERROR, FRAG_PARSING_ERROR = FRAG_PARSING_ERROR, INTERNAL_EXCEPTION = INTERNAL_EXCEPTION, KEY_LOAD_ERROR = KEY_LOAD_ERROR, KEY_LOAD_TIMEOUT = KEY_LOAD_TIMEOUT, LEVEL_LOAD_ERROR = LEVEL_LOAD_ERROR, LEVEL_LOAD_TIMEOUT = LEVEL_LOAD_TIMEOUT, LEVEL_SWITCH_ERROR = LEVEL_SWITCH_ERROR, MANIFEST_INCOMPATIBLE_CODECS_ERROR = MANIFEST_INCOMPATIBLE_CODECS_ERROR, MANIFEST_LOAD_ERROR = MANIFEST_LOAD_ERROR, MANIFEST_LOAD_TIMEOUT = MANIFEST_LOAD_TIMEOUT, MANIFEST_PARSING_ERROR = MANIFEST_PARSING_ERROR, REMUX_ALLOC_ERROR = REMUX_ALLOC_ERROR)
  
    __obj.asInstanceOf[Anon_AUDIOTRACKLOADERROR]
  }
}

