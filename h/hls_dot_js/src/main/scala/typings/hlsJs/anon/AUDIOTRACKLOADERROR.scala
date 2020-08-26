package typings.hlsJs.anon

import typings.hlsJs.mod.K_AUDIO_TRACK_LOAD_ERROR
import typings.hlsJs.mod.K_AUDIO_TRACK_LOAD_TIMEOUT
import typings.hlsJs.mod.K_BUFFER_ADD_CODEC_ERROR
import typings.hlsJs.mod.K_BUFFER_APPENDING_ERROR
import typings.hlsJs.mod.K_BUFFER_APPEND_ERROR
import typings.hlsJs.mod.K_BUFFER_FULL_ERROR
import typings.hlsJs.mod.K_BUFFER_NUDGE_ON_STALL
import typings.hlsJs.mod.K_BUFFER_SEEK_OVER_HOLE
import typings.hlsJs.mod.K_BUFFER_STALLED_ERROR
import typings.hlsJs.mod.K_FRAG_DECRYPT_ERROR
import typings.hlsJs.mod.K_FRAG_LOAD_ERROR
import typings.hlsJs.mod.K_FRAG_LOAD_TIMEOUT
import typings.hlsJs.mod.K_FRAG_LOOP_LOADING_ERROR
import typings.hlsJs.mod.K_FRAG_PARSING_ERROR
import typings.hlsJs.mod.K_INTERNAL_EXCEPTION
import typings.hlsJs.mod.K_KEY_LOAD_ERROR
import typings.hlsJs.mod.K_KEY_LOAD_TIMEOUT
import typings.hlsJs.mod.K_LEVEL_LOAD_ERROR
import typings.hlsJs.mod.K_LEVEL_LOAD_TIMEOUT
import typings.hlsJs.mod.K_LEVEL_SWITCH_ERROR
import typings.hlsJs.mod.K_MANIFEST_INCOMPATIBLE_CODECS_ERROR
import typings.hlsJs.mod.K_MANIFEST_LOAD_ERROR
import typings.hlsJs.mod.K_MANIFEST_LOAD_TIMEOUT
import typings.hlsJs.mod.K_MANIFEST_PARSING_ERROR
import typings.hlsJs.mod.K_REMUX_ALLOC_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDIOTRACKLOADERROR extends js.Object {
  /**
    * raised when audio track loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_ERROR, fatal: false, url: audio URL, loader: URL loader }
    */
  var AUDIO_TRACK_LOAD_ERROR: K_AUDIO_TRACK_LOAD_ERROR = js.native
  /**
    * raised when audio track loading fails because of a timeout
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT, fatal: false, url: audio URL, response: { code: error code, text: error text }, loader: URL loader }
    */
  var AUDIO_TRACK_LOAD_TIMEOUT: K_AUDIO_TRACK_LOAD_TIMEOUT = js.native
  /**
    *  raised when MediaSource fails to add new sourceBuffer
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_ADD_CODEC_ERROR, fatal : false, err : error raised by MediaSource, mimeType: mimeType on which the failure happened }
    */
  var BUFFER_ADD_CODEC_ERROR: K_BUFFER_ADD_CODEC_ERROR = js.native
  /**
    * raised when exception is raised during buffer appending
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPENDING_ERROR, fatal : false }
    */
  var BUFFER_APPENDING_ERROR: K_BUFFER_APPENDING_ERROR = js.native
  /**
    * raised when exception is raised while calling buffer append
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPEND_ERROR, fatal : true, frag : fragment object }
    */
  var BUFFER_APPEND_ERROR: K_BUFFER_APPEND_ERROR = js.native
  /**
    * raised when no data can be appended anymore in media buffer because it is full.
    * This error is recovered automatically by performing a smooth level switching that empty buffers (without disrupting the playback) and reducing the max buffer length.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_FULL_ERROR, fatal : false }
    */
  var BUFFER_FULL_ERROR: K_BUFFER_FULL_ERROR = js.native
  /**
    * raised when playback is stuck although currentTime is in a buffered aread
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.BUFFERED_STALLED_ERROR, fatal: true }
    */
  var BUFFER_NUDGE_ON_STALL: K_BUFFER_NUDGE_ON_STALL = js.native
  /**
    * raised after hls.js seeks over a buffer hole to unstuck the playback,
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_SEEK_OVER_HOLE, fatal : false, hole : hole duration }
    */
  var BUFFER_SEEK_OVER_HOLE: K_BUFFER_SEEK_OVER_HOLE = js.native
  /**
    * raised when playback is stuck because buffer is running out of data
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_STALLED_ERROR, fatal : false }
    */
  var BUFFER_STALLED_ERROR: K_BUFFER_STALLED_ERROR = js.native
  /**
    * raised when fragment decryption fails
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.FRAG_DECRYPT_ERROR, fatal: true, reason: failure reason }
    */
  var FRAG_DECRYPT_ERROR: K_FRAG_DECRYPT_ERROR = js.native
  /**
    * raised when fragment loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_ERROR, fatal : true or false, frag : fragment object, response : { code: error code, text: error text } }
    */
  var FRAG_LOAD_ERROR: K_FRAG_LOAD_ERROR = js.native
  /**
    * raised when fragment loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_TIMEOUT, fatal : true or false, frag : fragment object }
    */
  var FRAG_LOAD_TIMEOUT: K_FRAG_LOAD_TIMEOUT = js.native
  /**
    * raised upon detection of same fragment being requested in loop
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOOP_LOADING_ERROR, fatal : true or false, frag : fragment object }
    */
  var FRAG_LOOP_LOADING_ERROR: K_FRAG_LOOP_LOADING_ERROR = js.native
  /**
    * raised when fragment parsing fails
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_PARSING_ERROR, fatal : true or false, reason : failure reason }
    */
  var FRAG_PARSING_ERROR: K_FRAG_PARSING_ERROR = js.native
  /**
    * raised when an exception occurs in an internal hls.js event handler
    * data: { type: OTHER_ERROR, details: Hls.ErrorDetails.INTERNAL_EXCEPTION, fatal: true or false, event: event object or string, error: { message: error message } }
    */
  var INTERNAL_EXCEPTION: K_INTERNAL_EXCEPTION = js.native
  /**
    * raised when decrypt key loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.KEY_LOAD_ERROR, fatal: false, frag: fragment object }
    */
  var KEY_LOAD_ERROR: K_KEY_LOAD_ERROR = js.native
  /**
    * raised when decrypt key loading fails because of timeout
    * data: { type: NETWORK_EROR, details: Hls.ErrorDetails.KEY_LOAD_TIMEOUT, fatal: true, frag: fragment object }
    */
  var KEY_LOAD_TIMEOUT: K_KEY_LOAD_TIMEOUT = js.native
  /**
    * raised when level loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_ERROR, fatal : true, url : level URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  var LEVEL_LOAD_ERROR: K_LEVEL_LOAD_ERROR = js.native
  /**
    * raised when level loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_TIMEOUT, fatal : true, url : level URL, loader : URL loader }
    */
  var LEVEL_LOAD_TIMEOUT: K_LEVEL_LOAD_TIMEOUT = js.native
  // OTHER_ERROR //
  /**
    * raised when level switching fails
    * data: { type : OTHER_ERROR, details : Hls.ErrorDetails.LEVEL_SWITCH_ERROR, fatal : false, level : failed level index, reason : failure reason }
    */
  var LEVEL_SWITCH_ERROR: K_LEVEL_SWITCH_ERROR = js.native
  // MEDIA_ERRORS //
  /**
    * raised when manifest only contains quality level with codecs incompatible with MediaSource Engine.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR, fatal : true, url : manifest URL }
    */
  var MANIFEST_INCOMPATIBLE_CODECS_ERROR: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = js.native
  // NETWORK_ERRORS //
  /**
    * raised when manifest loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_ERROR, fatal : true, url : manifest URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  var MANIFEST_LOAD_ERROR: K_MANIFEST_LOAD_ERROR = js.native
  /**
    * raised when manifest loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_TIMEOUT, fatal : true, url : manifest URL, loader : URL loader }
    */
  var MANIFEST_LOAD_TIMEOUT: K_MANIFEST_LOAD_TIMEOUT = js.native
  /**
    * raised when manifest parsing failed to find proper content
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_PARSING_ERROR, fatal : true, url : manifest URL, reason : parsing error reason }
    */
  var MANIFEST_PARSING_ERROR: K_MANIFEST_PARSING_ERROR = js.native
  // MUX_ERROR //
  /**
    * raised when memory allocation fails during remuxing
    * data: { type: MUX_ERROR, details: Hls.ErrorDetails.REMUX_ALLOC_ERROR, fatal: false, bytes: mdat size, reason: failure reason }
    */
  var REMUX_ALLOC_ERROR: K_REMUX_ALLOC_ERROR = js.native
}

object AUDIOTRACKLOADERROR {
  @scala.inline
  def apply(
    AUDIO_TRACK_LOAD_ERROR: K_AUDIO_TRACK_LOAD_ERROR,
    AUDIO_TRACK_LOAD_TIMEOUT: K_AUDIO_TRACK_LOAD_TIMEOUT,
    BUFFER_ADD_CODEC_ERROR: K_BUFFER_ADD_CODEC_ERROR,
    BUFFER_APPENDING_ERROR: K_BUFFER_APPENDING_ERROR,
    BUFFER_APPEND_ERROR: K_BUFFER_APPEND_ERROR,
    BUFFER_FULL_ERROR: K_BUFFER_FULL_ERROR,
    BUFFER_NUDGE_ON_STALL: K_BUFFER_NUDGE_ON_STALL,
    BUFFER_SEEK_OVER_HOLE: K_BUFFER_SEEK_OVER_HOLE,
    BUFFER_STALLED_ERROR: K_BUFFER_STALLED_ERROR,
    FRAG_DECRYPT_ERROR: K_FRAG_DECRYPT_ERROR,
    FRAG_LOAD_ERROR: K_FRAG_LOAD_ERROR,
    FRAG_LOAD_TIMEOUT: K_FRAG_LOAD_TIMEOUT,
    FRAG_LOOP_LOADING_ERROR: K_FRAG_LOOP_LOADING_ERROR,
    FRAG_PARSING_ERROR: K_FRAG_PARSING_ERROR,
    INTERNAL_EXCEPTION: K_INTERNAL_EXCEPTION,
    KEY_LOAD_ERROR: K_KEY_LOAD_ERROR,
    KEY_LOAD_TIMEOUT: K_KEY_LOAD_TIMEOUT,
    LEVEL_LOAD_ERROR: K_LEVEL_LOAD_ERROR,
    LEVEL_LOAD_TIMEOUT: K_LEVEL_LOAD_TIMEOUT,
    LEVEL_SWITCH_ERROR: K_LEVEL_SWITCH_ERROR,
    MANIFEST_INCOMPATIBLE_CODECS_ERROR: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR,
    MANIFEST_LOAD_ERROR: K_MANIFEST_LOAD_ERROR,
    MANIFEST_LOAD_TIMEOUT: K_MANIFEST_LOAD_TIMEOUT,
    MANIFEST_PARSING_ERROR: K_MANIFEST_PARSING_ERROR,
    REMUX_ALLOC_ERROR: K_REMUX_ALLOC_ERROR
  ): AUDIOTRACKLOADERROR = {
    val __obj = js.Dynamic.literal(AUDIO_TRACK_LOAD_ERROR = AUDIO_TRACK_LOAD_ERROR.asInstanceOf[js.Any], AUDIO_TRACK_LOAD_TIMEOUT = AUDIO_TRACK_LOAD_TIMEOUT.asInstanceOf[js.Any], BUFFER_ADD_CODEC_ERROR = BUFFER_ADD_CODEC_ERROR.asInstanceOf[js.Any], BUFFER_APPENDING_ERROR = BUFFER_APPENDING_ERROR.asInstanceOf[js.Any], BUFFER_APPEND_ERROR = BUFFER_APPEND_ERROR.asInstanceOf[js.Any], BUFFER_FULL_ERROR = BUFFER_FULL_ERROR.asInstanceOf[js.Any], BUFFER_NUDGE_ON_STALL = BUFFER_NUDGE_ON_STALL.asInstanceOf[js.Any], BUFFER_SEEK_OVER_HOLE = BUFFER_SEEK_OVER_HOLE.asInstanceOf[js.Any], BUFFER_STALLED_ERROR = BUFFER_STALLED_ERROR.asInstanceOf[js.Any], FRAG_DECRYPT_ERROR = FRAG_DECRYPT_ERROR.asInstanceOf[js.Any], FRAG_LOAD_ERROR = FRAG_LOAD_ERROR.asInstanceOf[js.Any], FRAG_LOAD_TIMEOUT = FRAG_LOAD_TIMEOUT.asInstanceOf[js.Any], FRAG_LOOP_LOADING_ERROR = FRAG_LOOP_LOADING_ERROR.asInstanceOf[js.Any], FRAG_PARSING_ERROR = FRAG_PARSING_ERROR.asInstanceOf[js.Any], INTERNAL_EXCEPTION = INTERNAL_EXCEPTION.asInstanceOf[js.Any], KEY_LOAD_ERROR = KEY_LOAD_ERROR.asInstanceOf[js.Any], KEY_LOAD_TIMEOUT = KEY_LOAD_TIMEOUT.asInstanceOf[js.Any], LEVEL_LOAD_ERROR = LEVEL_LOAD_ERROR.asInstanceOf[js.Any], LEVEL_LOAD_TIMEOUT = LEVEL_LOAD_TIMEOUT.asInstanceOf[js.Any], LEVEL_SWITCH_ERROR = LEVEL_SWITCH_ERROR.asInstanceOf[js.Any], MANIFEST_INCOMPATIBLE_CODECS_ERROR = MANIFEST_INCOMPATIBLE_CODECS_ERROR.asInstanceOf[js.Any], MANIFEST_LOAD_ERROR = MANIFEST_LOAD_ERROR.asInstanceOf[js.Any], MANIFEST_LOAD_TIMEOUT = MANIFEST_LOAD_TIMEOUT.asInstanceOf[js.Any], MANIFEST_PARSING_ERROR = MANIFEST_PARSING_ERROR.asInstanceOf[js.Any], REMUX_ALLOC_ERROR = REMUX_ALLOC_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDIOTRACKLOADERROR]
  }
  @scala.inline
  implicit class AUDIOTRACKLOADERROROps[Self <: AUDIOTRACKLOADERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAUDIO_TRACK_LOAD_ERROR(value: K_AUDIO_TRACK_LOAD_ERROR): Self = this.set("AUDIO_TRACK_LOAD_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setAUDIO_TRACK_LOAD_TIMEOUT(value: K_AUDIO_TRACK_LOAD_TIMEOUT): Self = this.set("AUDIO_TRACK_LOAD_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_ADD_CODEC_ERROR(value: K_BUFFER_ADD_CODEC_ERROR): Self = this.set("BUFFER_ADD_CODEC_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_APPENDING_ERROR(value: K_BUFFER_APPENDING_ERROR): Self = this.set("BUFFER_APPENDING_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_APPEND_ERROR(value: K_BUFFER_APPEND_ERROR): Self = this.set("BUFFER_APPEND_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_FULL_ERROR(value: K_BUFFER_FULL_ERROR): Self = this.set("BUFFER_FULL_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_NUDGE_ON_STALL(value: K_BUFFER_NUDGE_ON_STALL): Self = this.set("BUFFER_NUDGE_ON_STALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_SEEK_OVER_HOLE(value: K_BUFFER_SEEK_OVER_HOLE): Self = this.set("BUFFER_SEEK_OVER_HOLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUFFER_STALLED_ERROR(value: K_BUFFER_STALLED_ERROR): Self = this.set("BUFFER_STALLED_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAG_DECRYPT_ERROR(value: K_FRAG_DECRYPT_ERROR): Self = this.set("FRAG_DECRYPT_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAG_LOAD_ERROR(value: K_FRAG_LOAD_ERROR): Self = this.set("FRAG_LOAD_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAG_LOAD_TIMEOUT(value: K_FRAG_LOAD_TIMEOUT): Self = this.set("FRAG_LOAD_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAG_LOOP_LOADING_ERROR(value: K_FRAG_LOOP_LOADING_ERROR): Self = this.set("FRAG_LOOP_LOADING_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRAG_PARSING_ERROR(value: K_FRAG_PARSING_ERROR): Self = this.set("FRAG_PARSING_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINTERNAL_EXCEPTION(value: K_INTERNAL_EXCEPTION): Self = this.set("INTERNAL_EXCEPTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEY_LOAD_ERROR(value: K_KEY_LOAD_ERROR): Self = this.set("KEY_LOAD_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEY_LOAD_TIMEOUT(value: K_KEY_LOAD_TIMEOUT): Self = this.set("KEY_LOAD_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEVEL_LOAD_ERROR(value: K_LEVEL_LOAD_ERROR): Self = this.set("LEVEL_LOAD_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEVEL_LOAD_TIMEOUT(value: K_LEVEL_LOAD_TIMEOUT): Self = this.set("LEVEL_LOAD_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLEVEL_SWITCH_ERROR(value: K_LEVEL_SWITCH_ERROR): Self = this.set("LEVEL_SWITCH_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMANIFEST_INCOMPATIBLE_CODECS_ERROR(value: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR): Self = this.set("MANIFEST_INCOMPATIBLE_CODECS_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMANIFEST_LOAD_ERROR(value: K_MANIFEST_LOAD_ERROR): Self = this.set("MANIFEST_LOAD_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMANIFEST_LOAD_TIMEOUT(value: K_MANIFEST_LOAD_TIMEOUT): Self = this.set("MANIFEST_LOAD_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setMANIFEST_PARSING_ERROR(value: K_MANIFEST_PARSING_ERROR): Self = this.set("MANIFEST_PARSING_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setREMUX_ALLOC_ERROR(value: K_REMUX_ALLOC_ERROR): Self = this.set("REMUX_ALLOC_ERROR", value.asInstanceOf[js.Any])
  }
  
}

