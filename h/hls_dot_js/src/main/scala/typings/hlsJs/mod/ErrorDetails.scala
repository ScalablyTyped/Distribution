package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hls error details
  */
/* static member */
object ErrorDetails {
  
  @JSImport("hls.js", "ErrorDetails")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * raised when audio track loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_ERROR, fatal: false, url: audio URL, loader: URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.AUDIO_TRACK_LOAD_ERROR")
  @js.native
  def AUDIO_TRACK_LOAD_ERROR: K_AUDIO_TRACK_LOAD_ERROR = js.native
  inline def AUDIO_TRACK_LOAD_ERROR_=(x: K_AUDIO_TRACK_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOAD_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when audio track loading fails because of a timeout
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT, fatal: false, url: audio URL, response: { code: error code, text: error text }, loader: URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT")
  @js.native
  def AUDIO_TRACK_LOAD_TIMEOUT: K_AUDIO_TRACK_LOAD_TIMEOUT = js.native
  inline def AUDIO_TRACK_LOAD_TIMEOUT_=(x: K_AUDIO_TRACK_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /**
    *  raised when MediaSource fails to add new sourceBuffer
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_ADD_CODEC_ERROR, fatal : false, err : error raised by MediaSource, mimeType: mimeType on which the failure happened }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_ADD_CODEC_ERROR")
  @js.native
  def BUFFER_ADD_CODEC_ERROR: K_BUFFER_ADD_CODEC_ERROR = js.native
  inline def BUFFER_ADD_CODEC_ERROR_=(x: K_BUFFER_ADD_CODEC_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_ADD_CODEC_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when exception is raised during buffer appending
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPENDING_ERROR, fatal : false }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_APPENDING_ERROR")
  @js.native
  def BUFFER_APPENDING_ERROR: K_BUFFER_APPENDING_ERROR = js.native
  inline def BUFFER_APPENDING_ERROR_=(x: K_BUFFER_APPENDING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDING_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when exception is raised while calling buffer append
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPEND_ERROR, fatal : true, frag : fragment object }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_APPEND_ERROR")
  @js.native
  def BUFFER_APPEND_ERROR: K_BUFFER_APPEND_ERROR = js.native
  inline def BUFFER_APPEND_ERROR_=(x: K_BUFFER_APPEND_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPEND_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when no data can be appended anymore in media buffer because it is full.
    * This error is recovered automatically by performing a smooth level switching that empty buffers (without disrupting the playback) and reducing the max buffer length.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_FULL_ERROR, fatal : false }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_FULL_ERROR")
  @js.native
  def BUFFER_FULL_ERROR: K_BUFFER_FULL_ERROR = js.native
  inline def BUFFER_FULL_ERROR_=(x: K_BUFFER_FULL_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FULL_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when playback is stuck although currentTime is in a buffered aread
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.BUFFERED_STALLED_ERROR, fatal: true }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_NUDGE_ON_STALL")
  @js.native
  def BUFFER_NUDGE_ON_STALL: K_BUFFER_NUDGE_ON_STALL = js.native
  inline def BUFFER_NUDGE_ON_STALL_=(x: K_BUFFER_NUDGE_ON_STALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_NUDGE_ON_STALL")(x.asInstanceOf[js.Any])
  
  /**
    * raised after hls.js seeks over a buffer hole to unstuck the playback,
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_SEEK_OVER_HOLE, fatal : false, hole : hole duration }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_SEEK_OVER_HOLE")
  @js.native
  def BUFFER_SEEK_OVER_HOLE: K_BUFFER_SEEK_OVER_HOLE = js.native
  inline def BUFFER_SEEK_OVER_HOLE_=(x: K_BUFFER_SEEK_OVER_HOLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_SEEK_OVER_HOLE")(x.asInstanceOf[js.Any])
  
  /**
    * raised when playback is stuck because buffer is running out of data
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_STALLED_ERROR, fatal : false }
    */
  @JSImport("hls.js", "ErrorDetails.BUFFER_STALLED_ERROR")
  @js.native
  def BUFFER_STALLED_ERROR: K_BUFFER_STALLED_ERROR = js.native
  inline def BUFFER_STALLED_ERROR_=(x: K_BUFFER_STALLED_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_STALLED_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when fragment decryption fails
    * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.FRAG_DECRYPT_ERROR, fatal: true, reason: failure reason }
    */
  @JSImport("hls.js", "ErrorDetails.FRAG_DECRYPT_ERROR")
  @js.native
  def FRAG_DECRYPT_ERROR: K_FRAG_DECRYPT_ERROR = js.native
  inline def FRAG_DECRYPT_ERROR_=(x: K_FRAG_DECRYPT_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_DECRYPT_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when fragment loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_ERROR, fatal : true or false, frag : fragment object, response : { code: error code, text: error text } }
    */
  @JSImport("hls.js", "ErrorDetails.FRAG_LOAD_ERROR")
  @js.native
  def FRAG_LOAD_ERROR: K_FRAG_LOAD_ERROR = js.native
  inline def FRAG_LOAD_ERROR_=(x: K_FRAG_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when fragment loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_TIMEOUT, fatal : true or false, frag : fragment object }
    */
  @JSImport("hls.js", "ErrorDetails.FRAG_LOAD_TIMEOUT")
  @js.native
  def FRAG_LOAD_TIMEOUT: K_FRAG_LOAD_TIMEOUT = js.native
  inline def FRAG_LOAD_TIMEOUT_=(x: K_FRAG_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /**
    * raised upon detection of same fragment being requested in loop
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOOP_LOADING_ERROR, fatal : true or false, frag : fragment object }
    */
  @JSImport("hls.js", "ErrorDetails.FRAG_LOOP_LOADING_ERROR")
  @js.native
  def FRAG_LOOP_LOADING_ERROR: K_FRAG_LOOP_LOADING_ERROR = js.native
  inline def FRAG_LOOP_LOADING_ERROR_=(x: K_FRAG_LOOP_LOADING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOOP_LOADING_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when fragment parsing fails
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_PARSING_ERROR, fatal : true or false, reason : failure reason }
    */
  @JSImport("hls.js", "ErrorDetails.FRAG_PARSING_ERROR")
  @js.native
  def FRAG_PARSING_ERROR: K_FRAG_PARSING_ERROR = js.native
  inline def FRAG_PARSING_ERROR_=(x: K_FRAG_PARSING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when an exception occurs in an internal hls.js event handler
    * data: { type: OTHER_ERROR, details: Hls.ErrorDetails.INTERNAL_EXCEPTION, fatal: true or false, event: event object or string, error: { message: error message } }
    */
  @JSImport("hls.js", "ErrorDetails.INTERNAL_EXCEPTION")
  @js.native
  def INTERNAL_EXCEPTION: K_INTERNAL_EXCEPTION = js.native
  inline def INTERNAL_EXCEPTION_=(x: K_INTERNAL_EXCEPTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_EXCEPTION")(x.asInstanceOf[js.Any])
  
  /**
    * raised when decrypt key loading fails because of a network error
    * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.KEY_LOAD_ERROR, fatal: false, frag: fragment object }
    */
  @JSImport("hls.js", "ErrorDetails.KEY_LOAD_ERROR")
  @js.native
  def KEY_LOAD_ERROR: K_KEY_LOAD_ERROR = js.native
  inline def KEY_LOAD_ERROR_=(x: K_KEY_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOAD_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when decrypt key loading fails because of timeout
    * data: { type: NETWORK_EROR, details: Hls.ErrorDetails.KEY_LOAD_TIMEOUT, fatal: true, frag: fragment object }
    */
  @JSImport("hls.js", "ErrorDetails.KEY_LOAD_TIMEOUT")
  @js.native
  def KEY_LOAD_TIMEOUT: K_KEY_LOAD_TIMEOUT = js.native
  inline def KEY_LOAD_TIMEOUT_=(x: K_KEY_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /**
    * raised when level loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_ERROR, fatal : true, url : level URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.LEVEL_LOAD_ERROR")
  @js.native
  def LEVEL_LOAD_ERROR: K_LEVEL_LOAD_ERROR = js.native
  inline def LEVEL_LOAD_ERROR_=(x: K_LEVEL_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOAD_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when level loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_TIMEOUT, fatal : true, url : level URL, loader : URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.LEVEL_LOAD_TIMEOUT")
  @js.native
  def LEVEL_LOAD_TIMEOUT: K_LEVEL_LOAD_TIMEOUT = js.native
  inline def LEVEL_LOAD_TIMEOUT_=(x: K_LEVEL_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
  
  // OTHER_ERROR //
  /**
    * raised when level switching fails
    * data: { type : OTHER_ERROR, details : Hls.ErrorDetails.LEVEL_SWITCH_ERROR, fatal : false, level : failed level index, reason : failure reason }
    */
  @JSImport("hls.js", "ErrorDetails.LEVEL_SWITCH_ERROR")
  @js.native
  def LEVEL_SWITCH_ERROR: K_LEVEL_SWITCH_ERROR = js.native
  inline def LEVEL_SWITCH_ERROR_=(x: K_LEVEL_SWITCH_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCH_ERROR")(x.asInstanceOf[js.Any])
  
  // MEDIA_ERRORS //
  /**
    * raised when manifest only contains quality level with codecs incompatible with MediaSource Engine.
    * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR, fatal : true, url : manifest URL }
    */
  @JSImport("hls.js", "ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR")
  @js.native
  def MANIFEST_INCOMPATIBLE_CODECS_ERROR: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = js.native
  inline def MANIFEST_INCOMPATIBLE_CODECS_ERROR_=(x: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_INCOMPATIBLE_CODECS_ERROR")(x.asInstanceOf[js.Any])
  
  // NETWORK_ERRORS //
  /**
    * raised when manifest loading fails because of a network error
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_ERROR, fatal : true, url : manifest URL, response : { code: error code, text: error text }, loader : URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.MANIFEST_LOAD_ERROR")
  @js.native
  def MANIFEST_LOAD_ERROR: K_MANIFEST_LOAD_ERROR = js.native
  inline def MANIFEST_LOAD_ERROR_=(x: K_MANIFEST_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOAD_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * raised when manifest loading fails because of a timeout
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_TIMEOUT, fatal : true, url : manifest URL, loader : URL loader }
    */
  @JSImport("hls.js", "ErrorDetails.MANIFEST_LOAD_TIMEOUT")
  @js.native
  def MANIFEST_LOAD_TIMEOUT: K_MANIFEST_LOAD_TIMEOUT = js.native
  inline def MANIFEST_LOAD_TIMEOUT_=(x: K_MANIFEST_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /**
    * raised when manifest parsing failed to find proper content
    * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_PARSING_ERROR, fatal : true, url : manifest URL, reason : parsing error reason }
    */
  @JSImport("hls.js", "ErrorDetails.MANIFEST_PARSING_ERROR")
  @js.native
  def MANIFEST_PARSING_ERROR: K_MANIFEST_PARSING_ERROR = js.native
  inline def MANIFEST_PARSING_ERROR_=(x: K_MANIFEST_PARSING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_PARSING_ERROR")(x.asInstanceOf[js.Any])
  
  // MUX_ERROR //
  /**
    * raised when memory allocation fails during remuxing
    * data: { type: MUX_ERROR, details: Hls.ErrorDetails.REMUX_ALLOC_ERROR, fatal: false, bytes: mdat size, reason: failure reason }
    */
  @JSImport("hls.js", "ErrorDetails.REMUX_ALLOC_ERROR")
  @js.native
  def REMUX_ALLOC_ERROR: K_REMUX_ALLOC_ERROR = js.native
  inline def REMUX_ALLOC_ERROR_=(x: K_REMUX_ALLOC_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMUX_ALLOC_ERROR")(x.asInstanceOf[js.Any])
}
