package typings.hlsJs

import org.scalablytyped.runtime.Shortcut
import typings.hlsJs.anon.PartialConfig
import typings.hlsJs.mod.Config
import typings.hlsJs.mod.K_AUDIO_TRACKS_UPDATED
import typings.hlsJs.mod.K_AUDIO_TRACK_LOADED
import typings.hlsJs.mod.K_AUDIO_TRACK_LOADING
import typings.hlsJs.mod.K_AUDIO_TRACK_LOAD_ERROR
import typings.hlsJs.mod.K_AUDIO_TRACK_LOAD_TIMEOUT
import typings.hlsJs.mod.K_AUDIO_TRACK_SWITCH
import typings.hlsJs.mod.K_AUDIO_TRACK_SWITCHED
import typings.hlsJs.mod.K_AUDIO_TRACK_SWITCHING
import typings.hlsJs.mod.K_BUFFER_ADD_CODEC_ERROR
import typings.hlsJs.mod.K_BUFFER_APPENDED
import typings.hlsJs.mod.K_BUFFER_APPENDING
import typings.hlsJs.mod.K_BUFFER_APPENDING_ERROR
import typings.hlsJs.mod.K_BUFFER_APPEND_ERROR
import typings.hlsJs.mod.K_BUFFER_CODECS
import typings.hlsJs.mod.K_BUFFER_CREATED
import typings.hlsJs.mod.K_BUFFER_EOS
import typings.hlsJs.mod.K_BUFFER_FLUSHED
import typings.hlsJs.mod.K_BUFFER_FLUSHING
import typings.hlsJs.mod.K_BUFFER_FULL_ERROR
import typings.hlsJs.mod.K_BUFFER_NUDGE_ON_STALL
import typings.hlsJs.mod.K_BUFFER_RESET
import typings.hlsJs.mod.K_BUFFER_SEEK_OVER_HOLE
import typings.hlsJs.mod.K_BUFFER_STALLED_ERROR
import typings.hlsJs.mod.K_DESTROYING
import typings.hlsJs.mod.K_ERROR
import typings.hlsJs.mod.K_FPS_DROP
import typings.hlsJs.mod.K_FPS_DROP_LEVEL_CAPPING
import typings.hlsJs.mod.K_FRAG_BUFFERED
import typings.hlsJs.mod.K_FRAG_CHANGED
import typings.hlsJs.mod.K_FRAG_DECRYPTED
import typings.hlsJs.mod.K_FRAG_DECRYPT_ERROR
import typings.hlsJs.mod.K_FRAG_LOADED
import typings.hlsJs.mod.K_FRAG_LOADING
import typings.hlsJs.mod.K_FRAG_LOAD_EMERGENCY_ABORTED
import typings.hlsJs.mod.K_FRAG_LOAD_ERROR
import typings.hlsJs.mod.K_FRAG_LOAD_PROGRESS
import typings.hlsJs.mod.K_FRAG_LOAD_TIMEOUT
import typings.hlsJs.mod.K_FRAG_LOOP_LOADING_ERROR
import typings.hlsJs.mod.K_FRAG_PARSED
import typings.hlsJs.mod.K_FRAG_PARSING_DATA
import typings.hlsJs.mod.K_FRAG_PARSING_ERROR
import typings.hlsJs.mod.K_FRAG_PARSING_INIT_SEGMENT
import typings.hlsJs.mod.K_FRAG_PARSING_METADATA
import typings.hlsJs.mod.K_FRAG_PARSING_USERDATA
import typings.hlsJs.mod.K_INIT_PTS_FOUND
import typings.hlsJs.mod.K_INTERNAL_EXCEPTION
import typings.hlsJs.mod.K_KEY_LOADED
import typings.hlsJs.mod.K_KEY_LOADING
import typings.hlsJs.mod.K_KEY_LOAD_ERROR
import typings.hlsJs.mod.K_KEY_LOAD_TIMEOUT
import typings.hlsJs.mod.K_KEY_SYSTEM_ERROR
import typings.hlsJs.mod.K_LEVEL_LOADED
import typings.hlsJs.mod.K_LEVEL_LOADING
import typings.hlsJs.mod.K_LEVEL_LOAD_ERROR
import typings.hlsJs.mod.K_LEVEL_LOAD_TIMEOUT
import typings.hlsJs.mod.K_LEVEL_PTS_UPDATED
import typings.hlsJs.mod.K_LEVEL_SWITCHED
import typings.hlsJs.mod.K_LEVEL_SWITCHING
import typings.hlsJs.mod.K_LEVEL_SWITCH_ERROR
import typings.hlsJs.mod.K_LEVEL_UPDATED
import typings.hlsJs.mod.K_MANIFEST_INCOMPATIBLE_CODECS_ERROR
import typings.hlsJs.mod.K_MANIFEST_LOADED
import typings.hlsJs.mod.K_MANIFEST_LOADING
import typings.hlsJs.mod.K_MANIFEST_LOAD_ERROR
import typings.hlsJs.mod.K_MANIFEST_LOAD_TIMEOUT
import typings.hlsJs.mod.K_MANIFEST_PARSED
import typings.hlsJs.mod.K_MANIFEST_PARSING_ERROR
import typings.hlsJs.mod.K_MEDIA_ATTACHED
import typings.hlsJs.mod.K_MEDIA_ATTACHING
import typings.hlsJs.mod.K_MEDIA_DETACHED
import typings.hlsJs.mod.K_MEDIA_DETACHING
import typings.hlsJs.mod.K_MEDIA_ERROR
import typings.hlsJs.mod.K_MUX_ERROR
import typings.hlsJs.mod.K_NETWORK_ERROR
import typings.hlsJs.mod.K_OTHER_ERROR
import typings.hlsJs.mod.K_REMUX_ALLOC_ERROR
import typings.hlsJs.mod.K_STREAM_STATE_TRANSITION
import typings.hlsJs.mod.K_SUBTITLE_FRAG_PROCESSED
import typings.hlsJs.mod.K_SUBTITLE_TRACKS_UPDATED
import typings.hlsJs.mod.K_SUBTITLE_TRACK_LOADED
import typings.hlsJs.mod.K_SUBTITLE_TRACK_LOADING
import typings.hlsJs.mod.K_SUBTITLE_TRACK_SWITCH
import typings.hlsJs.mod.LoaderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hlsLightMod {
  
  @JSImport("hls.js/dist/hls.light", JSImport.Namespace)
  @js.native
  /**
    * Constructor. Can be provided an HlsConfig object as default properties and or overrides
    */
  class ^ ()
    extends typings.hlsJs.mod.^ {
    def this(config: PartialConfig) = this()
  }
  @JSImport("hls.js/dist/hls.light", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * override Hls default configuration
    * this configuration will be applied by default to all instances
    */
  /* static member */
  object DefaultConfig extends Shortcut {
    
    @JSImport("hls.js/dist/hls.light", "DefaultConfig")
    @js.native
    val ^ : Config = js.native
    
    /**
      * (default: standard XMLHttpRequest-based URL loader)
      * Override standard URL loader by a custom one. Could be useful for P2P or stubbing (testing).
      * Use this, if you want to overwrite both the fragment and the playlist loader.
      * Note: If fLoader or pLoader are used, they overwrite loader!
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("hls.js/dist/hls.light", "DefaultConfig.loader")
    @js.native
    class loader protected ()
      extends typings.hlsJs.mod.Loader {
      def this(config: LoaderConfig) = this()
    }
    
    type _To = Config
    
    /* This means you don't have to write `^`, but can instead just say `DefaultConfig.foo` */
    override def _to: Config = ^
  }
  
  /**
    * Hls error details
    */
  /* static member */
  object ErrorDetails {
    
    @JSImport("hls.js/dist/hls.light", "ErrorDetails")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * raised when audio track loading fails because of a network error
      * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_ERROR, fatal: false, url: audio URL, loader: URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.AUDIO_TRACK_LOAD_ERROR")
    @js.native
    def AUDIO_TRACK_LOAD_ERROR: K_AUDIO_TRACK_LOAD_ERROR = js.native
    inline def AUDIO_TRACK_LOAD_ERROR_=(x: K_AUDIO_TRACK_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOAD_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when audio track loading fails because of a timeout
      * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT, fatal: false, url: audio URL, response: { code: error code, text: error text }, loader: URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT")
    @js.native
    def AUDIO_TRACK_LOAD_TIMEOUT: K_AUDIO_TRACK_LOAD_TIMEOUT = js.native
    inline def AUDIO_TRACK_LOAD_TIMEOUT_=(x: K_AUDIO_TRACK_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
    
    /**
      *  raised when MediaSource fails to add new sourceBuffer
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_ADD_CODEC_ERROR, fatal : false, err : error raised by MediaSource, mimeType: mimeType on which the failure happened }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_ADD_CODEC_ERROR")
    @js.native
    def BUFFER_ADD_CODEC_ERROR: K_BUFFER_ADD_CODEC_ERROR = js.native
    inline def BUFFER_ADD_CODEC_ERROR_=(x: K_BUFFER_ADD_CODEC_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_ADD_CODEC_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when exception is raised during buffer appending
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPENDING_ERROR, fatal : false }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_APPENDING_ERROR")
    @js.native
    def BUFFER_APPENDING_ERROR: K_BUFFER_APPENDING_ERROR = js.native
    inline def BUFFER_APPENDING_ERROR_=(x: K_BUFFER_APPENDING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDING_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when exception is raised while calling buffer append
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_APPEND_ERROR, fatal : true, frag : fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_APPEND_ERROR")
    @js.native
    def BUFFER_APPEND_ERROR: K_BUFFER_APPEND_ERROR = js.native
    inline def BUFFER_APPEND_ERROR_=(x: K_BUFFER_APPEND_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPEND_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when no data can be appended anymore in media buffer because it is full.
      * This error is recovered automatically by performing a smooth level switching that empty buffers (without disrupting the playback) and reducing the max buffer length.
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_FULL_ERROR, fatal : false }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_FULL_ERROR")
    @js.native
    def BUFFER_FULL_ERROR: K_BUFFER_FULL_ERROR = js.native
    inline def BUFFER_FULL_ERROR_=(x: K_BUFFER_FULL_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FULL_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when playback is stuck although currentTime is in a buffered aread
      * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.BUFFERED_STALLED_ERROR, fatal: true }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_NUDGE_ON_STALL")
    @js.native
    def BUFFER_NUDGE_ON_STALL: K_BUFFER_NUDGE_ON_STALL = js.native
    inline def BUFFER_NUDGE_ON_STALL_=(x: K_BUFFER_NUDGE_ON_STALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_NUDGE_ON_STALL")(x.asInstanceOf[js.Any])
    
    /**
      * raised after hls.js seeks over a buffer hole to unstuck the playback,
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_SEEK_OVER_HOLE, fatal : false, hole : hole duration }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_SEEK_OVER_HOLE")
    @js.native
    def BUFFER_SEEK_OVER_HOLE: K_BUFFER_SEEK_OVER_HOLE = js.native
    inline def BUFFER_SEEK_OVER_HOLE_=(x: K_BUFFER_SEEK_OVER_HOLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_SEEK_OVER_HOLE")(x.asInstanceOf[js.Any])
    
    /**
      * raised when playback is stuck because buffer is running out of data
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.BUFFER_STALLED_ERROR, fatal : false }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.BUFFER_STALLED_ERROR")
    @js.native
    def BUFFER_STALLED_ERROR: K_BUFFER_STALLED_ERROR = js.native
    inline def BUFFER_STALLED_ERROR_=(x: K_BUFFER_STALLED_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_STALLED_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when fragment decryption fails
      * data: { type: MEDIA_ERROR, details: Hls.ErrorDetails.FRAG_DECRYPT_ERROR, fatal: true, reason: failure reason }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.FRAG_DECRYPT_ERROR")
    @js.native
    def FRAG_DECRYPT_ERROR: K_FRAG_DECRYPT_ERROR = js.native
    inline def FRAG_DECRYPT_ERROR_=(x: K_FRAG_DECRYPT_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_DECRYPT_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when fragment loading fails because of a network error
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_ERROR, fatal : true or false, frag : fragment object, response : { code: error code, text: error text } }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.FRAG_LOAD_ERROR")
    @js.native
    def FRAG_LOAD_ERROR: K_FRAG_LOAD_ERROR = js.native
    inline def FRAG_LOAD_ERROR_=(x: K_FRAG_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when fragment loading fails because of a timeout
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOAD_TIMEOUT, fatal : true or false, frag : fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.FRAG_LOAD_TIMEOUT")
    @js.native
    def FRAG_LOAD_TIMEOUT: K_FRAG_LOAD_TIMEOUT = js.native
    inline def FRAG_LOAD_TIMEOUT_=(x: K_FRAG_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
    
    /**
      * raised upon detection of same fragment being requested in loop
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_LOOP_LOADING_ERROR, fatal : true or false, frag : fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.FRAG_LOOP_LOADING_ERROR")
    @js.native
    def FRAG_LOOP_LOADING_ERROR: K_FRAG_LOOP_LOADING_ERROR = js.native
    inline def FRAG_LOOP_LOADING_ERROR_=(x: K_FRAG_LOOP_LOADING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOOP_LOADING_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when fragment parsing fails
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.FRAG_PARSING_ERROR, fatal : true or false, reason : failure reason }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.FRAG_PARSING_ERROR")
    @js.native
    def FRAG_PARSING_ERROR: K_FRAG_PARSING_ERROR = js.native
    inline def FRAG_PARSING_ERROR_=(x: K_FRAG_PARSING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when an exception occurs in an internal hls.js event handler
      * data: { type: OTHER_ERROR, details: Hls.ErrorDetails.INTERNAL_EXCEPTION, fatal: true or false, event: event object or string, error: { message: error message } }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.INTERNAL_EXCEPTION")
    @js.native
    def INTERNAL_EXCEPTION: K_INTERNAL_EXCEPTION = js.native
    inline def INTERNAL_EXCEPTION_=(x: K_INTERNAL_EXCEPTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_EXCEPTION")(x.asInstanceOf[js.Any])
    
    /**
      * raised when decrypt key loading fails because of a network error
      * data: { type: NETWORK_ERROR, details: Hls.ErrorDetails.KEY_LOAD_ERROR, fatal: false, frag: fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.KEY_LOAD_ERROR")
    @js.native
    def KEY_LOAD_ERROR: K_KEY_LOAD_ERROR = js.native
    inline def KEY_LOAD_ERROR_=(x: K_KEY_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOAD_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when decrypt key loading fails because of timeout
      * data: { type: NETWORK_EROR, details: Hls.ErrorDetails.KEY_LOAD_TIMEOUT, fatal: true, frag: fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.KEY_LOAD_TIMEOUT")
    @js.native
    def KEY_LOAD_TIMEOUT: K_KEY_LOAD_TIMEOUT = js.native
    inline def KEY_LOAD_TIMEOUT_=(x: K_KEY_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
    
    /**
      * raised when level loading fails because of a network error
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_ERROR, fatal : true, url : level URL, response : { code: error code, text: error text }, loader : URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.LEVEL_LOAD_ERROR")
    @js.native
    def LEVEL_LOAD_ERROR: K_LEVEL_LOAD_ERROR = js.native
    inline def LEVEL_LOAD_ERROR_=(x: K_LEVEL_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOAD_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when level loading fails because of a timeout
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.LEVEL_LOAD_TIMEOUT, fatal : true, url : level URL, loader : URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.LEVEL_LOAD_TIMEOUT")
    @js.native
    def LEVEL_LOAD_TIMEOUT: K_LEVEL_LOAD_TIMEOUT = js.native
    inline def LEVEL_LOAD_TIMEOUT_=(x: K_LEVEL_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
    
    // OTHER_ERROR //
    /**
      * raised when level switching fails
      * data: { type : OTHER_ERROR, details : Hls.ErrorDetails.LEVEL_SWITCH_ERROR, fatal : false, level : failed level index, reason : failure reason }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.LEVEL_SWITCH_ERROR")
    @js.native
    def LEVEL_SWITCH_ERROR: K_LEVEL_SWITCH_ERROR = js.native
    inline def LEVEL_SWITCH_ERROR_=(x: K_LEVEL_SWITCH_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCH_ERROR")(x.asInstanceOf[js.Any])
    
    // MEDIA_ERRORS //
    /**
      * raised when manifest only contains quality level with codecs incompatible with MediaSource Engine.
      * data: { type : MEDIA_ERROR, details : Hls.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR, fatal : true, url : manifest URL }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR")
    @js.native
    def MANIFEST_INCOMPATIBLE_CODECS_ERROR: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR = js.native
    inline def MANIFEST_INCOMPATIBLE_CODECS_ERROR_=(x: K_MANIFEST_INCOMPATIBLE_CODECS_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_INCOMPATIBLE_CODECS_ERROR")(x.asInstanceOf[js.Any])
    
    // NETWORK_ERRORS //
    /**
      * raised when manifest loading fails because of a network error
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_ERROR, fatal : true, url : manifest URL, response : { code: error code, text: error text }, loader : URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.MANIFEST_LOAD_ERROR")
    @js.native
    def MANIFEST_LOAD_ERROR: K_MANIFEST_LOAD_ERROR = js.native
    inline def MANIFEST_LOAD_ERROR_=(x: K_MANIFEST_LOAD_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOAD_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * raised when manifest loading fails because of a timeout
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_LOAD_TIMEOUT, fatal : true, url : manifest URL, loader : URL loader }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.MANIFEST_LOAD_TIMEOUT")
    @js.native
    def MANIFEST_LOAD_TIMEOUT: K_MANIFEST_LOAD_TIMEOUT = js.native
    inline def MANIFEST_LOAD_TIMEOUT_=(x: K_MANIFEST_LOAD_TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOAD_TIMEOUT")(x.asInstanceOf[js.Any])
    
    /**
      * raised when manifest parsing failed to find proper content
      * data: { type : NETWORK_ERROR, details : Hls.ErrorDetails.MANIFEST_PARSING_ERROR, fatal : true, url : manifest URL, reason : parsing error reason }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.MANIFEST_PARSING_ERROR")
    @js.native
    def MANIFEST_PARSING_ERROR: K_MANIFEST_PARSING_ERROR = js.native
    inline def MANIFEST_PARSING_ERROR_=(x: K_MANIFEST_PARSING_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_PARSING_ERROR")(x.asInstanceOf[js.Any])
    
    // MUX_ERROR //
    /**
      * raised when memory allocation fails during remuxing
      * data: { type: MUX_ERROR, details: Hls.ErrorDetails.REMUX_ALLOC_ERROR, fatal: false, bytes: mdat size, reason: failure reason }
      */
    @JSImport("hls.js/dist/hls.light", "ErrorDetails.REMUX_ALLOC_ERROR")
    @js.native
    def REMUX_ALLOC_ERROR: K_REMUX_ALLOC_ERROR = js.native
    inline def REMUX_ALLOC_ERROR_=(x: K_REMUX_ALLOC_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMUX_ALLOC_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Hls error types
    */
  /* static member */
  object ErrorTypes {
    
    @JSImport("hls.js/dist/hls.light", "ErrorTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * EME (encrypted media extensions) errors
      */
    @JSImport("hls.js/dist/hls.light", "ErrorTypes.KEY_SYSTEM_ERROR")
    @js.native
    def KEY_SYSTEM_ERROR: K_KEY_SYSTEM_ERROR = js.native
    inline def KEY_SYSTEM_ERROR_=(x: K_KEY_SYSTEM_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_SYSTEM_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Identifier for a media Error (video/parsing/mediasource error)
      */
    @JSImport("hls.js/dist/hls.light", "ErrorTypes.MEDIA_ERROR")
    @js.native
    def MEDIA_ERROR: K_MEDIA_ERROR = js.native
    inline def MEDIA_ERROR_=(x: K_MEDIA_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Identifier for a mux Error (demuxing/remuxing)
      */
    @JSImport("hls.js/dist/hls.light", "ErrorTypes.MUX_ERROR")
    @js.native
    def MUX_ERROR: K_MUX_ERROR = js.native
    inline def MUX_ERROR_=(x: K_MUX_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUX_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Identifier for a network error (loading error / timeout ...)
      */
    @JSImport("hls.js/dist/hls.light", "ErrorTypes.NETWORK_ERROR")
    @js.native
    def NETWORK_ERROR: K_NETWORK_ERROR = js.native
    inline def NETWORK_ERROR_=(x: K_NETWORK_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Identifier for all other errors
      */
    @JSImport("hls.js/dist/hls.light", "ErrorTypes.OTHER_ERROR")
    @js.native
    def OTHER_ERROR: K_OTHER_ERROR = js.native
    inline def OTHER_ERROR_=(x: K_OTHER_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Hls events
    */
  /* static member */
  object Events {
    
    @JSImport("hls.js/dist/hls.light", "Events")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * fired to notify that audio track lists has been updated
      * data: { audioTracks : audioTracks }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACKS_UPDATED")
    @js.native
    def AUDIO_TRACKS_UPDATED: K_AUDIO_TRACKS_UPDATED = js.native
    inline def AUDIO_TRACKS_UPDATED_=(x: K_AUDIO_TRACKS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACKS_UPDATED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when an audio track loading finishes
      * data: { details : levelDetails object, id : audio track id, stats : { trequest, tfirst, tload, mtime } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACK_LOADED")
    @js.native
    def AUDIO_TRACK_LOADED: K_AUDIO_TRACK_LOADED = js.native
    inline def AUDIO_TRACK_LOADED_=(x: K_AUDIO_TRACK_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when an audio track loading starts
      * data: { url : audio track URL, id : audio track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACK_LOADING")
    @js.native
    def AUDIO_TRACK_LOADING: K_AUDIO_TRACK_LOADING = js.native
    inline def AUDIO_TRACK_LOADING_=(x: K_AUDIO_TRACK_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when an audio track switch occurs. deprecated in favor AUDIO_TRACK_SWITCHING
      * data: { id : audio track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACK_SWITCH")
    @js.native
    def AUDIO_TRACK_SWITCH: K_AUDIO_TRACK_SWITCH = js.native
    
    /**
      * fired when an audio track switch actually occurs
      * data: { id : audio track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACK_SWITCHED")
    @js.native
    def AUDIO_TRACK_SWITCHED: K_AUDIO_TRACK_SWITCHED = js.native
    inline def AUDIO_TRACK_SWITCHED_=(x: K_AUDIO_TRACK_SWITCHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when an audio track switching is requested
      * data: { id : audio track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.AUDIO_TRACK_SWITCHING")
    @js.native
    def AUDIO_TRACK_SWITCHING: K_AUDIO_TRACK_SWITCHING = js.native
    inline def AUDIO_TRACK_SWITCHING_=(x: K_AUDIO_TRACK_SWITCHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCHING")(x.asInstanceOf[js.Any])
    
    inline def AUDIO_TRACK_SWITCH_=(x: K_AUDIO_TRACK_SWITCH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO_TRACK_SWITCH")(x.asInstanceOf[js.Any])
    
    /**
      * fired when we are done with appending a media segment to the buffer
      * data: { parent : segment parent that triggered BUFFER_APPENDING, pending : nb of segments waiting for appending for this segment parent }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_APPENDED")
    @js.native
    def BUFFER_APPENDED: K_BUFFER_APPENDED = js.native
    inline def BUFFER_APPENDED_=(x: K_BUFFER_APPENDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when we append a segment to the buffer
      * data: { segment: segment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_APPENDING")
    @js.native
    def BUFFER_APPENDING: K_BUFFER_APPENDING = js.native
    inline def BUFFER_APPENDING_=(x: K_BUFFER_APPENDING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_APPENDING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when we know about the codecs that we need buffers for to push into
      * data: { tracks : { container, codec, levelCodec, initSegment, metadata } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_CODECS")
    @js.native
    def BUFFER_CODECS: K_BUFFER_CODECS = js.native
    inline def BUFFER_CODECS_=(x: K_BUFFER_CODECS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CODECS")(x.asInstanceOf[js.Any])
    
    /**
      * fired when sourcebuffers have been created
      * data: { tracks: tracks }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_CREATED")
    @js.native
    def BUFFER_CREATED: K_BUFFER_CREATED = js.native
    inline def BUFFER_CREATED_=(x: K_BUFFER_CREATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_CREATED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when the stream is finished and we want to notify the media buffer that there will be no more data
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_EOS")
    @js.native
    def BUFFER_EOS: K_BUFFER_EOS = js.native
    inline def BUFFER_EOS_=(x: K_BUFFER_EOS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_EOS")(x.asInstanceOf[js.Any])
    
    /**
      * fired when the media buffer has been flushed
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_FLUSHED")
    @js.native
    def BUFFER_FLUSHED: K_BUFFER_FLUSHED = js.native
    inline def BUFFER_FLUSHED_=(x: K_BUFFER_FLUSHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when the media buffer should be flushed
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_FLUSHING")
    @js.native
    def BUFFER_FLUSHING: K_BUFFER_FLUSHING = js.native
    inline def BUFFER_FLUSHING_=(x: K_BUFFER_FLUSHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_FLUSHING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when the buffer is going to be reset
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.BUFFER_RESET")
    @js.native
    def BUFFER_RESET: K_BUFFER_RESET = js.native
    inline def BUFFER_RESET_=(x: K_BUFFER_RESET): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUFFER_RESET")(x.asInstanceOf[js.Any])
    
    /**
      * fired when hls.js instance starts destroying. Different from MEDIA_DETACHED as one could want to detach and reattach a video to the instance of hls.js to handle mid-rolls for example.
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.DESTROYING")
    @js.native
    def DESTROYING: K_DESTROYING = js.native
    inline def DESTROYING_=(x: K_DESTROYING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROYING")(x.asInstanceOf[js.Any])
    
    /**
      *  Identifier for an error event
      * data: { type : error type, details : error details, fatal : is error fatal or not, other error specific data }
      */
    @JSImport("hls.js/dist/hls.light", "Events.ERROR")
    @js.native
    def ERROR: K_ERROR = js.native
    inline def ERROR_=(x: K_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * triggered when FPS drop in last monitoring period is higher than given threshold
      * data: { curentDropped : nb of dropped frames in last monitoring period,
      *         currentDecoded : nb of decoded frames in last monitoring period,
      *         totalDropped : total dropped frames on this video element }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FPS_DROP")
    @js.native
    def FPS_DROP: K_FPS_DROP = js.native
    inline def FPS_DROP_=(x: K_FPS_DROP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP")(x.asInstanceOf[js.Any])
    
    /**
      * triggered when FPS drop triggers auto level capping
      * data: { level: suggested new auto level capping by fps controller, droppedLevel : level has to much dropped frame will be restricted }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FPS_DROP_LEVEL_CAPPING")
    @js.native
    def FPS_DROP_LEVEL_CAPPING: K_FPS_DROP_LEVEL_CAPPING = js.native
    inline def FPS_DROP_LEVEL_CAPPING_=(x: K_FPS_DROP_LEVEL_CAPPING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FPS_DROP_LEVEL_CAPPING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when fragment remuxed MP4 boxes have all been appended into SourceBuffer
      * data: { id: demuxer id, frag : fragment object, stats : { trequest, tfirst, tload, tparsed, tbuffered, length} }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_BUFFERED")
    @js.native
    def FRAG_BUFFERED: K_FRAG_BUFFERED = js.native
    inline def FRAG_BUFFERED_=(x: K_FRAG_BUFFERED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_BUFFERED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when fragment matching with current video position is changing
      * data: { frag : fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_CHANGED")
    @js.native
    def FRAG_CHANGED: K_FRAG_CHANGED = js.native
    inline def FRAG_CHANGED_=(x: K_FRAG_CHANGED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_CHANGED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a fragment decryption is completed
      * data: { id: demuxer id, frag: fragment object, stats: { tstart, tdecrypt } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_DECRYPTED")
    @js.native
    def FRAG_DECRYPTED: K_FRAG_DECRYPTED = js.native
    inline def FRAG_DECRYPTED_=(x: K_FRAG_DECRYPTED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_DECRYPTED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a fragment loading is completed
      * data: { frag : fragment object, payload : fragment payload, stats : { trequest, tfirst, tload, length}}
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_LOADED")
    @js.native
    def FRAG_LOADED: K_FRAG_LOADED = js.native
    inline def FRAG_LOADED_=(x: K_FRAG_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a fragment loading starts
      * data: { frag : fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_LOADING")
    @js.native
    def FRAG_LOADING: K_FRAG_LOADING = js.native
    inline def FRAG_LOADING_=(x: K_FRAG_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * identifier for fragment load aborting for emergency switch down
      * data: { frag: fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_LOAD_EMERGENCY_ABORTED")
    @js.native
    def FRAG_LOAD_EMERGENCY_ABORTED: K_FRAG_LOAD_EMERGENCY_ABORTED = js.native
    inline def FRAG_LOAD_EMERGENCY_ABORTED_=(x: K_FRAG_LOAD_EMERGENCY_ABORTED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_EMERGENCY_ABORTED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a fragment load is in progress
      * data: { frag : fragment object with frag.loaded=stats.loaded, stats : { trequest, tfirst, loaded, total } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_LOAD_PROGRESS")
    @js.native
    def FRAG_LOAD_PROGRESS: K_FRAG_LOAD_PROGRESS = js.native
    inline def FRAG_LOAD_PROGRESS_=(x: K_FRAG_LOAD_PROGRESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_LOAD_PROGRESS")(x.asInstanceOf[js.Any])
    
    /**
      * fired when fragment parsing is completed
      * data: { id: demuxer id}
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_PARSED")
    @js.native
    def FRAG_PARSED: K_FRAG_PARSED = js.native
    inline def FRAG_PARSED_=(x: K_FRAG_PARSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when moof/mdat have been extracted from fragment
      * data: { id: demuxer id,
      *        moof : moof MP4 box,
      *        mdat : mdat MP4 box,
      *        startPTS : PTS of first sample,
      *        endPTS : PTS of last sample,
      *        startDTS : DTS of first sample,
      *        endDTS : DTS of last sample,
      *        type : stream type (audio or video),
      *        nb : number of samples}
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_PARSING_DATA")
    @js.native
    def FRAG_PARSING_DATA: K_FRAG_PARSING_DATA = js.native
    inline def FRAG_PARSING_DATA_=(x: K_FRAG_PARSING_DATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_DATA")(x.asInstanceOf[js.Any])
    
    /**
      * fired when Init Segment has been extracted from fragment
      * data: { id: demuxer id, moov : moov MP4 box, codecs : codecs found while parsing fragment}
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_PARSING_INIT_SEGMENT")
    @js.native
    def FRAG_PARSING_INIT_SEGMENT: K_FRAG_PARSING_INIT_SEGMENT = js.native
    inline def FRAG_PARSING_INIT_SEGMENT_=(x: K_FRAG_PARSING_INIT_SEGMENT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_INIT_SEGMENT")(x.asInstanceOf[js.Any])
    
    /**
      * fired when parsing id3 is completed
      * data: { id: demuxer id, samples : [ id3 pes - pts and dts timestamp are relative, values are in seconds]}
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_PARSING_METADATA")
    @js.native
    def FRAG_PARSING_METADATA: K_FRAG_PARSING_METADATA = js.native
    inline def FRAG_PARSING_METADATA_=(x: K_FRAG_PARSING_METADATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_METADATA")(x.asInstanceOf[js.Any])
    
    /**
      * fired when parsing sei text is completed
      * data: { id : demuxer id, frag: fragment object, samples : [ sei samples pes ] }
      */
    @JSImport("hls.js/dist/hls.light", "Events.FRAG_PARSING_USERDATA")
    @js.native
    def FRAG_PARSING_USERDATA: K_FRAG_PARSING_USERDATA = js.native
    inline def FRAG_PARSING_USERDATA_=(x: K_FRAG_PARSING_USERDATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAG_PARSING_USERDATA")(x.asInstanceOf[js.Any])
    
    /**
      * fired when first timestamp has been found
      * data: { id: demuxer id, frag: fragment object, initPTS: initPTS }
      */
    @JSImport("hls.js/dist/hls.light", "Events.INIT_PTS_FOUND")
    @js.native
    def INIT_PTS_FOUND: K_INIT_PTS_FOUND = js.native
    inline def INIT_PTS_FOUND_=(x: K_INIT_PTS_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INIT_PTS_FOUND")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a decryption key loading is completed
      * data: { frag: fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.KEY_LOADED")
    @js.native
    def KEY_LOADED: K_KEY_LOADED = js.native
    inline def KEY_LOADED_=(x: K_KEY_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a decryption key loading starts
      * data: { frag: fragment object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.KEY_LOADING")
    @js.native
    def KEY_LOADING: K_KEY_LOADING = js.native
    inline def KEY_LOADING_=(x: K_KEY_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level playlist loading finishes
      * data: { details : levelDetails object, levelId : id of loaded level, stats : { trequest, tfirst, tload, mtime } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_LOADED")
    @js.native
    def LEVEL_LOADED: K_LEVEL_LOADED = js.native
    inline def LEVEL_LOADED_=(x: K_LEVEL_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level playlist loading starts
      * data: { url : level URL, level : id of level being loaded }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_LOADING")
    @js.native
    def LEVEL_LOADING: K_LEVEL_LOADING = js.native
    inline def LEVEL_LOADING_=(x: K_LEVEL_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level's PTS information has been updated after parsing a fragment
      * data: { details: levelDetails object, level : id of updated level, drift: PTS drift observed when parsing last fragment }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_PTS_UPDATED")
    @js.native
    def LEVEL_PTS_UPDATED: K_LEVEL_PTS_UPDATED = js.native
    inline def LEVEL_PTS_UPDATED_=(x: K_LEVEL_PTS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_PTS_UPDATED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level switch is effective
      * data: { level: level object }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_SWITCHED")
    @js.native
    def LEVEL_SWITCHED: K_LEVEL_SWITCHED = js.native
    inline def LEVEL_SWITCHED_=(x: K_LEVEL_SWITCHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level switch is requested
      * data: { level: Level }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_SWITCHING")
    @js.native
    def LEVEL_SWITCHING: K_LEVEL_SWITCHING = js.native
    inline def LEVEL_SWITCHING_=(x: K_LEVEL_SWITCHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_SWITCHING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a level's details have been updated based on previous details, after it has been loaded
      * data: { details : levelDetails object, level : id of updated level }
      */
    @JSImport("hls.js/dist/hls.light", "Events.LEVEL_UPDATED")
    @js.native
    def LEVEL_UPDATED: K_LEVEL_UPDATED = js.native
    inline def LEVEL_UPDATED_=(x: K_LEVEL_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_UPDATED")(x.asInstanceOf[js.Any])
    
    /**
      * fired after manifest has been loaded
      * data: { levels : [available quality levels] , audioTracks : [ available audio tracks], url : manifestURL, stats : { trequest, tfirst, tload, mtime}}
      */
    @JSImport("hls.js/dist/hls.light", "Events.MANIFEST_LOADED")
    @js.native
    def MANIFEST_LOADED: K_MANIFEST_LOADED = js.native
    inline def MANIFEST_LOADED_=(x: K_MANIFEST_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired to signal that a manifest loading starts
      * data: { url : manifestURL }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MANIFEST_LOADING")
    @js.native
    def MANIFEST_LOADING: K_MANIFEST_LOADING = js.native
    inline def MANIFEST_LOADING_=(x: K_MANIFEST_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * fired after manifest has been parsed
      * data: { levels : [ available quality levels ], firstLevel : index of first quality level appearing in Manifest }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MANIFEST_PARSED")
    @js.native
    def MANIFEST_PARSED: K_MANIFEST_PARSED = js.native
    inline def MANIFEST_PARSED_=(x: K_MANIFEST_PARSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANIFEST_PARSED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when Media has been succesfully attached to hls instance
      * data: { video , mediaSource }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MEDIA_ATTACHED")
    @js.native
    def MEDIA_ATTACHED: K_MEDIA_ATTACHED = js.native
    inline def MEDIA_ATTACHED_=(x: K_MEDIA_ATTACHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHED")(x.asInstanceOf[js.Any])
    
    /**
      * fired to attach Media to hls instance
      * data: { video , mediaSource }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MEDIA_ATTACHING")
    @js.native
    def MEDIA_ATTACHING: K_MEDIA_ATTACHING = js.native
    inline def MEDIA_ATTACHING_=(x: K_MEDIA_ATTACHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ATTACHING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when Media has been detached from hls instance
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MEDIA_DETACHED")
    @js.native
    def MEDIA_DETACHED: K_MEDIA_DETACHED = js.native
    inline def MEDIA_DETACHED_=(x: K_MEDIA_DETACHED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHED")(x.asInstanceOf[js.Any])
    
    /**
      * fired before detaching Media from hls instance
      * data: { }
      */
    @JSImport("hls.js/dist/hls.light", "Events.MEDIA_DETACHING")
    @js.native
    def MEDIA_DETACHING: K_MEDIA_DETACHING = js.native
    inline def MEDIA_DETACHING_=(x: K_MEDIA_DETACHING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DETACHING")(x.asInstanceOf[js.Any])
    
    /**
      * fired upon stream controller state transitions
      * data: { previousState, nextState }
      */
    @JSImport("hls.js/dist/hls.light", "Events.STREAM_STATE_TRANSITION")
    @js.native
    def STREAM_STATE_TRANSITION: K_STREAM_STATE_TRANSITION = js.native
    inline def STREAM_STATE_TRANSITION_=(x: K_STREAM_STATE_TRANSITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM_STATE_TRANSITION")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a subtitle fragment has been processed
      * data: { success : boolean, frag : the processed frag }
      */
    @JSImport("hls.js/dist/hls.light", "Events.SUBTITLE_FRAG_PROCESSED")
    @js.native
    def SUBTITLE_FRAG_PROCESSED: K_SUBTITLE_FRAG_PROCESSED = js.native
    inline def SUBTITLE_FRAG_PROCESSED_=(x: K_SUBTITLE_FRAG_PROCESSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_FRAG_PROCESSED")(x.asInstanceOf[js.Any])
    
    /**
      * fired to notify that subtitle track lists has been updated
      * data: { subtitleTracks : subtitleTracks }
      */
    @JSImport("hls.js/dist/hls.light", "Events.SUBTITLE_TRACKS_UPDATED")
    @js.native
    def SUBTITLE_TRACKS_UPDATED: K_SUBTITLE_TRACKS_UPDATED = js.native
    inline def SUBTITLE_TRACKS_UPDATED_=(x: K_SUBTITLE_TRACKS_UPDATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACKS_UPDATED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a subtitle track loading finishes
      * data: { details : levelDetails object, id : subtitle track id, stats : { trequest, tfirst, tload, mtime } }
      */
    @JSImport("hls.js/dist/hls.light", "Events.SUBTITLE_TRACK_LOADED")
    @js.native
    def SUBTITLE_TRACK_LOADED: K_SUBTITLE_TRACK_LOADED = js.native
    inline def SUBTITLE_TRACK_LOADED_=(x: K_SUBTITLE_TRACK_LOADED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADED")(x.asInstanceOf[js.Any])
    
    /**
      * fired when a subtitle track loading starts
      * data: { url : subtitle track URL, id : subtitle track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.SUBTITLE_TRACK_LOADING")
    @js.native
    def SUBTITLE_TRACK_LOADING: K_SUBTITLE_TRACK_LOADING = js.native
    inline def SUBTITLE_TRACK_LOADING_=(x: K_SUBTITLE_TRACK_LOADING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_LOADING")(x.asInstanceOf[js.Any])
    
    /**
      * fired when an subtitle track switch occurs
      * data: { id : subtitle track id }
      */
    @JSImport("hls.js/dist/hls.light", "Events.SUBTITLE_TRACK_SWITCH")
    @js.native
    def SUBTITLE_TRACK_SWITCH: K_SUBTITLE_TRACK_SWITCH = js.native
    inline def SUBTITLE_TRACK_SWITCH_=(x: K_SUBTITLE_TRACK_SWITCH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBTITLE_TRACK_SWITCH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hls.js/dist/hls.light", "Loader")
  @js.native
  class Loader protected ()
    extends typings.hlsJs.mod.Loader {
    def this(config: LoaderConfig) = this()
  }
  
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  /**
    * returns hls.js dist version number
    */
  /* static member */
  @JSImport("hls.js/dist/hls.light", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
