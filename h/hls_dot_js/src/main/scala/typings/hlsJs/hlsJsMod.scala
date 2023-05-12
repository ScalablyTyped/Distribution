package typings.hlsJs

import typings.hlsJs.anon.PartialCMCDHeaders
import typings.hlsJs.hlsJsStrings.NONE
import typings.hlsJs.hlsJsStrings.`TYPE-0`
import typings.hlsJs.hlsJsStrings.`TYPE-1`
import typings.hlsJs.mod.CMCD
import typings.hlsJs.mod.FragmentTracker
import typings.hlsJs.mod.Hls
import typings.hlsJs.mod.HlsSkip
import typings.hlsJs.mod.KeyLoader
import typings.hlsJs.mod.LevelParsed
import typings.hlsJs.mod.PlaylistLevelType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object hlsJsMod {
  
  @JSImport("hls/js", "AbrController")
  @js.native
  open class AbrController protected ()
    extends typings.hlsJs.mod.AbrController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "AttrList")
  @js.native
  open class AttrList protected ()
    extends typings.hlsJs.mod.AttrList {
    def this(attrs: String) = this()
    def this(attrs: Record[String, Any]) = this()
  }
  /* static members */
  object AttrList {
    
    @JSImport("hls/js", "AttrList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAttrList(input: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAttrList")(input.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  }
  
  @JSImport("hls/js", "AudioStreamController")
  @js.native
  open class AudioStreamController protected ()
    extends typings.hlsJs.mod.AudioStreamController {
    def this(hls: Hls, fragmentTracker: FragmentTracker, keyLoader: KeyLoader) = this()
  }
  
  @JSImport("hls/js", "AudioTrackController")
  @js.native
  open class AudioTrackController protected ()
    extends typings.hlsJs.mod.AudioTrackController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "BasePlaylistController")
  @js.native
  open class BasePlaylistController protected ()
    extends typings.hlsJs.mod.BasePlaylistController {
    def this(hls: Hls, logPrefix: String) = this()
  }
  
  @JSImport("hls/js", "BaseSegment")
  @js.native
  open class BaseSegment protected ()
    extends typings.hlsJs.mod.BaseSegment {
    def this(baseurl: String) = this()
  }
  
  @JSImport("hls/js", "BaseStreamController")
  @js.native
  open class BaseStreamController protected ()
    extends typings.hlsJs.mod.BaseStreamController {
    def this(
      hls: Hls,
      fragmentTracker: FragmentTracker,
      keyLoader: KeyLoader,
      logPrefix: String,
      playlistType: PlaylistLevelType
    ) = this()
  }
  
  @JSImport("hls/js", "BufferController")
  @js.native
  open class BufferController protected ()
    extends typings.hlsJs.mod.BufferController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "CMCDController")
  @js.native
  open class CMCDController protected ()
    extends typings.hlsJs.mod.CMCDController {
    def this(hls: Hls) = this()
  }
  /* static members */
  object CMCDController {
    
    @JSImport("hls/js", "CMCDController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Append query args to a uri.
      */
    inline def appendQueryToUri(uri: Any, query: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("appendQueryToUri")(uri.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Serialize a CMCD data object according to the rules defined in the
      * section 3.2 of
      * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
      */
    inline def serialize(data: CMCD): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Convert a CMCD data object to request headers according to the rules
      * defined in the section 2.1 and 3.2 of
      * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
      */
    inline def toHeaders(data: CMCD): PartialCMCDHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("toHeaders")(data.asInstanceOf[js.Any]).asInstanceOf[PartialCMCDHeaders]
    
    /**
      * Convert a CMCD data object to query args according to the rules
      * defined in the section 2.2 and 3.2 of
      * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
      */
    inline def toQuery(data: CMCD): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQuery")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate a random v4 UUI
      *
      * @returns {string}
      */
    inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
  }
  
  @JSImport("hls/js", "CapLevelController")
  @js.native
  open class CapLevelController protected ()
    extends typings.hlsJs.mod.CapLevelController {
    def this(hls: Hls) = this()
  }
  /* static members */
  object CapLevelController {
    
    @JSImport("hls/js", "CapLevelController")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getMaxLevelByMediaSize(levels: js.Array[typings.hlsJs.mod.Level], width: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLevelByMediaSize")(levels.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("hls/js", "ChunkMetadata")
  @js.native
  open class ChunkMetadata protected ()
    extends typings.hlsJs.mod.ChunkMetadata {
    def this(level: Double, sn: Double, id: Double) = this()
    def this(level: Double, sn: Double, id: Double, size: Double) = this()
    def this(level: Double, sn: Double, id: Double, size: Double, part: Double) = this()
    def this(level: Double, sn: Double, id: Double, size: Unit, part: Double) = this()
    def this(level: Double, sn: Double, id: Double, size: Double, part: Double, partial: Boolean) = this()
    def this(level: Double, sn: Double, id: Double, size: Double, part: Unit, partial: Boolean) = this()
    def this(level: Double, sn: Double, id: Double, size: Unit, part: Double, partial: Boolean) = this()
    def this(level: Double, sn: Double, id: Double, size: Unit, part: Unit, partial: Boolean) = this()
  }
  
  @JSImport("hls/js", "ContentSteeringController")
  @js.native
  open class ContentSteeringController protected ()
    extends typings.hlsJs.mod.ContentSteeringController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "DateRange")
  @js.native
  open class DateRange protected ()
    extends typings.hlsJs.mod.DateRange {
    def this(dateRangeAttr: typings.hlsJs.mod.AttrList) = this()
    def this(dateRangeAttr: typings.hlsJs.mod.AttrList, dateRangeWithSameId: typings.hlsJs.mod.DateRange) = this()
  }
  
  @JSImport("hls/js", "EMEController")
  @js.native
  open class EMEController protected ()
    extends typings.hlsJs.mod.EMEController {
    def this(hls: Hls) = this()
  }
  /* static members */
  object EMEController {
    
    @JSImport("hls/js", "EMEController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hls/js", "EMEController.CDMCleanupPromise")
    @js.native
    def CDMCleanupPromise: js.Promise[Unit] | Unit = js.native
    inline def CDMCleanupPromise_=(x: js.Promise[Unit] | Unit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CDMCleanupPromise")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hls/js", "ErrorController")
  @js.native
  open class ErrorController protected ()
    extends typings.hlsJs.mod.ErrorController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "ErrorDetails")
  @js.native
  object ErrorDetails extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hlsJs.mod.ErrorDetails & String] = js.native
    
    /* "audioTrackLoadError" */ val AUDIO_TRACK_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.AUDIO_TRACK_LOAD_ERROR & String = js.native
    
    /* "audioTrackLoadTimeOut" */ val AUDIO_TRACK_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.AUDIO_TRACK_LOAD_TIMEOUT & String = js.native
    
    /* "bufferAddCodecError" */ val BUFFER_ADD_CODEC_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_ADD_CODEC_ERROR & String = js.native
    
    /* "bufferAppendingError" */ val BUFFER_APPENDING_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_APPENDING_ERROR & String = js.native
    
    /* "bufferAppendError" */ val BUFFER_APPEND_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_APPEND_ERROR & String = js.native
    
    /* "bufferFullError" */ val BUFFER_FULL_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_FULL_ERROR & String = js.native
    
    /* "bufferIncompatibleCodecsError" */ val BUFFER_INCOMPATIBLE_CODECS_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_INCOMPATIBLE_CODECS_ERROR & String = js.native
    
    /* "bufferNudgeOnStall" */ val BUFFER_NUDGE_ON_STALL: typings.hlsJs.mod.ErrorDetails.BUFFER_NUDGE_ON_STALL & String = js.native
    
    /* "bufferSeekOverHole" */ val BUFFER_SEEK_OVER_HOLE: typings.hlsJs.mod.ErrorDetails.BUFFER_SEEK_OVER_HOLE & String = js.native
    
    /* "bufferStalledError" */ val BUFFER_STALLED_ERROR: typings.hlsJs.mod.ErrorDetails.BUFFER_STALLED_ERROR & String = js.native
    
    /* "fragDecryptError" */ val FRAG_DECRYPT_ERROR: typings.hlsJs.mod.ErrorDetails.FRAG_DECRYPT_ERROR & String = js.native
    
    /* "fragGap" */ val FRAG_GAP: typings.hlsJs.mod.ErrorDetails.FRAG_GAP & String = js.native
    
    /* "fragLoadError" */ val FRAG_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.FRAG_LOAD_ERROR & String = js.native
    
    /* "fragLoadTimeOut" */ val FRAG_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.FRAG_LOAD_TIMEOUT & String = js.native
    
    /* "fragParsingError" */ val FRAG_PARSING_ERROR: typings.hlsJs.mod.ErrorDetails.FRAG_PARSING_ERROR & String = js.native
    
    /* "aborted" */ val INTERNAL_ABORTED: typings.hlsJs.mod.ErrorDetails.INTERNAL_ABORTED & String = js.native
    
    /* "internalException" */ val INTERNAL_EXCEPTION: typings.hlsJs.mod.ErrorDetails.INTERNAL_EXCEPTION & String = js.native
    
    /* "keyLoadError" */ val KEY_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.KEY_LOAD_ERROR & String = js.native
    
    /* "keyLoadTimeOut" */ val KEY_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.KEY_LOAD_TIMEOUT & String = js.native
    
    /* "keySystemLicenseRequestFailed" */ val KEY_SYSTEM_LICENSE_REQUEST_FAILED: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_LICENSE_REQUEST_FAILED & String = js.native
    
    /* "keySystemNoAccess" */ val KEY_SYSTEM_NO_ACCESS: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_ACCESS & String = js.native
    
    /* "keySystemNoConfiguredLicense" */ val KEY_SYSTEM_NO_CONFIGURED_LICENSE: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_CONFIGURED_LICENSE & String = js.native
    
    /* "keySystemNoKeys" */ val KEY_SYSTEM_NO_KEYS: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_KEYS & String = js.native
    
    /* "keySystemNoSession" */ val KEY_SYSTEM_NO_SESSION: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_NO_SESSION & String = js.native
    
    /* "keySystemServerCertificateRequestFailed" */ val KEY_SYSTEM_SERVER_CERTIFICATE_REQUEST_FAILED: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_SERVER_CERTIFICATE_REQUEST_FAILED & String = js.native
    
    /* "keySystemServerCertificateUpdateFailed" */ val KEY_SYSTEM_SERVER_CERTIFICATE_UPDATE_FAILED: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_SERVER_CERTIFICATE_UPDATE_FAILED & String = js.native
    
    /* "keySystemSessionUpdateFailed" */ val KEY_SYSTEM_SESSION_UPDATE_FAILED: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_SESSION_UPDATE_FAILED & String = js.native
    
    /* "keySystemStatusInternalError" */ val KEY_SYSTEM_STATUS_INTERNAL_ERROR: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_STATUS_INTERNAL_ERROR & String = js.native
    
    /* "keySystemStatusOutputRestricted" */ val KEY_SYSTEM_STATUS_OUTPUT_RESTRICTED: typings.hlsJs.mod.ErrorDetails.KEY_SYSTEM_STATUS_OUTPUT_RESTRICTED & String = js.native
    
    /* "levelEmptyError" */ val LEVEL_EMPTY_ERROR: typings.hlsJs.mod.ErrorDetails.LEVEL_EMPTY_ERROR & String = js.native
    
    /* "levelLoadError" */ val LEVEL_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.LEVEL_LOAD_ERROR & String = js.native
    
    /* "levelLoadTimeOut" */ val LEVEL_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.LEVEL_LOAD_TIMEOUT & String = js.native
    
    /* "levelParsingError" */ val LEVEL_PARSING_ERROR: typings.hlsJs.mod.ErrorDetails.LEVEL_PARSING_ERROR & String = js.native
    
    /* "levelSwitchError" */ val LEVEL_SWITCH_ERROR: typings.hlsJs.mod.ErrorDetails.LEVEL_SWITCH_ERROR & String = js.native
    
    /* "manifestIncompatibleCodecsError" */ val MANIFEST_INCOMPATIBLE_CODECS_ERROR: typings.hlsJs.mod.ErrorDetails.MANIFEST_INCOMPATIBLE_CODECS_ERROR & String = js.native
    
    /* "manifestLoadError" */ val MANIFEST_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.MANIFEST_LOAD_ERROR & String = js.native
    
    /* "manifestLoadTimeOut" */ val MANIFEST_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.MANIFEST_LOAD_TIMEOUT & String = js.native
    
    /* "manifestParsingError" */ val MANIFEST_PARSING_ERROR: typings.hlsJs.mod.ErrorDetails.MANIFEST_PARSING_ERROR & String = js.native
    
    /* "remuxAllocError" */ val REMUX_ALLOC_ERROR: typings.hlsJs.mod.ErrorDetails.REMUX_ALLOC_ERROR & String = js.native
    
    /* "subtitleTrackLoadError" */ val SUBTITLE_LOAD_ERROR: typings.hlsJs.mod.ErrorDetails.SUBTITLE_LOAD_ERROR & String = js.native
    
    /* "subtitleTrackLoadTimeOut" */ val SUBTITLE_TRACK_LOAD_TIMEOUT: typings.hlsJs.mod.ErrorDetails.SUBTITLE_TRACK_LOAD_TIMEOUT & String = js.native
    
    /* "unknown" */ val UNKNOWN: typings.hlsJs.mod.ErrorDetails.UNKNOWN & String = js.native
  }
  
  @JSImport("hls/js", "ErrorTypes")
  @js.native
  object ErrorTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hlsJs.mod.ErrorTypes & String] = js.native
    
    /* "keySystemError" */ val KEY_SYSTEM_ERROR: typings.hlsJs.mod.ErrorTypes.KEY_SYSTEM_ERROR & String = js.native
    
    /* "mediaError" */ val MEDIA_ERROR: typings.hlsJs.mod.ErrorTypes.MEDIA_ERROR & String = js.native
    
    /* "muxError" */ val MUX_ERROR: typings.hlsJs.mod.ErrorTypes.MUX_ERROR & String = js.native
    
    /* "networkError" */ val NETWORK_ERROR: typings.hlsJs.mod.ErrorTypes.NETWORK_ERROR & String = js.native
    
    /* "otherError" */ val OTHER_ERROR: typings.hlsJs.mod.ErrorTypes.OTHER_ERROR & String = js.native
  }
  
  @JSImport("hls/js", "Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hlsJs.mod.Events & String] = js.native
    
    /* "hlsAudioTracksUpdated" */ val AUDIO_TRACKS_UPDATED: typings.hlsJs.mod.Events.AUDIO_TRACKS_UPDATED & String = js.native
    
    /* "hlsAudioTrackLoaded" */ val AUDIO_TRACK_LOADED: typings.hlsJs.mod.Events.AUDIO_TRACK_LOADED & String = js.native
    
    /* "hlsAudioTrackLoading" */ val AUDIO_TRACK_LOADING: typings.hlsJs.mod.Events.AUDIO_TRACK_LOADING & String = js.native
    
    /* "hlsAudioTrackSwitched" */ val AUDIO_TRACK_SWITCHED: typings.hlsJs.mod.Events.AUDIO_TRACK_SWITCHED & String = js.native
    
    /* "hlsAudioTrackSwitching" */ val AUDIO_TRACK_SWITCHING: typings.hlsJs.mod.Events.AUDIO_TRACK_SWITCHING & String = js.native
    
    /* "hlsBackBufferReached" */ val BACK_BUFFER_REACHED: typings.hlsJs.mod.Events.BACK_BUFFER_REACHED & String = js.native
    
    /* "hlsBufferAppended" */ val BUFFER_APPENDED: typings.hlsJs.mod.Events.BUFFER_APPENDED & String = js.native
    
    /* "hlsBufferAppending" */ val BUFFER_APPENDING: typings.hlsJs.mod.Events.BUFFER_APPENDING & String = js.native
    
    /* "hlsBufferCodecs" */ val BUFFER_CODECS: typings.hlsJs.mod.Events.BUFFER_CODECS & String = js.native
    
    /* "hlsBufferCreated" */ val BUFFER_CREATED: typings.hlsJs.mod.Events.BUFFER_CREATED & String = js.native
    
    /* "hlsBufferEos" */ val BUFFER_EOS: typings.hlsJs.mod.Events.BUFFER_EOS & String = js.native
    
    /* "hlsBufferFlushed" */ val BUFFER_FLUSHED: typings.hlsJs.mod.Events.BUFFER_FLUSHED & String = js.native
    
    /* "hlsBufferFlushing" */ val BUFFER_FLUSHING: typings.hlsJs.mod.Events.BUFFER_FLUSHING & String = js.native
    
    /* "hlsBufferReset" */ val BUFFER_RESET: typings.hlsJs.mod.Events.BUFFER_RESET & String = js.native
    
    /* "hlsCuesParsed" */ val CUES_PARSED: typings.hlsJs.mod.Events.CUES_PARSED & String = js.native
    
    /* "hlsDestroying" */ val DESTROYING: typings.hlsJs.mod.Events.DESTROYING & String = js.native
    
    /* "hlsError" */ val ERROR: typings.hlsJs.mod.Events.ERROR & String = js.native
    
    /* "hlsFpsDrop" */ val FPS_DROP: typings.hlsJs.mod.Events.FPS_DROP & String = js.native
    
    /* "hlsFpsDropLevelCapping" */ val FPS_DROP_LEVEL_CAPPING: typings.hlsJs.mod.Events.FPS_DROP_LEVEL_CAPPING & String = js.native
    
    /* "hlsFragBuffered" */ val FRAG_BUFFERED: typings.hlsJs.mod.Events.FRAG_BUFFERED & String = js.native
    
    /* "hlsFragChanged" */ val FRAG_CHANGED: typings.hlsJs.mod.Events.FRAG_CHANGED & String = js.native
    
    /* "hlsFragDecrypted" */ val FRAG_DECRYPTED: typings.hlsJs.mod.Events.FRAG_DECRYPTED & String = js.native
    
    /* "hlsFragLoaded" */ val FRAG_LOADED: typings.hlsJs.mod.Events.FRAG_LOADED & String = js.native
    
    /* "hlsFragLoading" */ val FRAG_LOADING: typings.hlsJs.mod.Events.FRAG_LOADING & String = js.native
    
    /* "hlsFragLoadEmergencyAborted" */ val FRAG_LOAD_EMERGENCY_ABORTED: typings.hlsJs.mod.Events.FRAG_LOAD_EMERGENCY_ABORTED & String = js.native
    
    /* "hlsFragParsed" */ val FRAG_PARSED: typings.hlsJs.mod.Events.FRAG_PARSED & String = js.native
    
    /* "hlsFragParsingInitSegment" */ val FRAG_PARSING_INIT_SEGMENT: typings.hlsJs.mod.Events.FRAG_PARSING_INIT_SEGMENT & String = js.native
    
    /* "hlsFragParsingMetadata" */ val FRAG_PARSING_METADATA: typings.hlsJs.mod.Events.FRAG_PARSING_METADATA & String = js.native
    
    /* "hlsFragParsingUserdata" */ val FRAG_PARSING_USERDATA: typings.hlsJs.mod.Events.FRAG_PARSING_USERDATA & String = js.native
    
    /* "hlsInitPtsFound" */ val INIT_PTS_FOUND: typings.hlsJs.mod.Events.INIT_PTS_FOUND & String = js.native
    
    /* "hlsKeyLoaded" */ val KEY_LOADED: typings.hlsJs.mod.Events.KEY_LOADED & String = js.native
    
    /* "hlsKeyLoading" */ val KEY_LOADING: typings.hlsJs.mod.Events.KEY_LOADING & String = js.native
    
    /* "hlsLevelsUpdated" */ val LEVELS_UPDATED: typings.hlsJs.mod.Events.LEVELS_UPDATED & String = js.native
    
    /* "hlsLevelLoaded" */ val LEVEL_LOADED: typings.hlsJs.mod.Events.LEVEL_LOADED & String = js.native
    
    /* "hlsLevelLoading" */ val LEVEL_LOADING: typings.hlsJs.mod.Events.LEVEL_LOADING & String = js.native
    
    /* "hlsLevelPtsUpdated" */ val LEVEL_PTS_UPDATED: typings.hlsJs.mod.Events.LEVEL_PTS_UPDATED & String = js.native
    
    /* "hlsLevelSwitched" */ val LEVEL_SWITCHED: typings.hlsJs.mod.Events.LEVEL_SWITCHED & String = js.native
    
    /* "hlsLevelSwitching" */ val LEVEL_SWITCHING: typings.hlsJs.mod.Events.LEVEL_SWITCHING & String = js.native
    
    /* "hlsLevelUpdated" */ val LEVEL_UPDATED: typings.hlsJs.mod.Events.LEVEL_UPDATED & String = js.native
    
    /* "hlsLiveBackBufferReached" */ val LIVE_BACK_BUFFER_REACHED: typings.hlsJs.mod.Events.LIVE_BACK_BUFFER_REACHED & String = js.native
    
    /* "hlsManifestLoaded" */ val MANIFEST_LOADED: typings.hlsJs.mod.Events.MANIFEST_LOADED & String = js.native
    
    /* "hlsManifestLoading" */ val MANIFEST_LOADING: typings.hlsJs.mod.Events.MANIFEST_LOADING & String = js.native
    
    /* "hlsManifestParsed" */ val MANIFEST_PARSED: typings.hlsJs.mod.Events.MANIFEST_PARSED & String = js.native
    
    /* "hlsMediaAttached" */ val MEDIA_ATTACHED: typings.hlsJs.mod.Events.MEDIA_ATTACHED & String = js.native
    
    /* "hlsMediaAttaching" */ val MEDIA_ATTACHING: typings.hlsJs.mod.Events.MEDIA_ATTACHING & String = js.native
    
    /* "hlsMediaDetached" */ val MEDIA_DETACHED: typings.hlsJs.mod.Events.MEDIA_DETACHED & String = js.native
    
    /* "hlsMediaDetaching" */ val MEDIA_DETACHING: typings.hlsJs.mod.Events.MEDIA_DETACHING & String = js.native
    
    /* "hlsNonNativeTextTracksFound" */ val NON_NATIVE_TEXT_TRACKS_FOUND: typings.hlsJs.mod.Events.NON_NATIVE_TEXT_TRACKS_FOUND & String = js.native
    
    /* "hlsSubtitleFragProcessed" */ val SUBTITLE_FRAG_PROCESSED: typings.hlsJs.mod.Events.SUBTITLE_FRAG_PROCESSED & String = js.native
    
    /* "hlsSubtitleTracksCleared" */ val SUBTITLE_TRACKS_CLEARED: typings.hlsJs.mod.Events.SUBTITLE_TRACKS_CLEARED & String = js.native
    
    /* "hlsSubtitleTracksUpdated" */ val SUBTITLE_TRACKS_UPDATED: typings.hlsJs.mod.Events.SUBTITLE_TRACKS_UPDATED & String = js.native
    
    /* "hlsSubtitleTrackLoaded" */ val SUBTITLE_TRACK_LOADED: typings.hlsJs.mod.Events.SUBTITLE_TRACK_LOADED & String = js.native
    
    /* "hlsSubtitleTrackLoading" */ val SUBTITLE_TRACK_LOADING: typings.hlsJs.mod.Events.SUBTITLE_TRACK_LOADING & String = js.native
    
    /* "hlsSubtitleTrackSwitch" */ val SUBTITLE_TRACK_SWITCH: typings.hlsJs.mod.Events.SUBTITLE_TRACK_SWITCH & String = js.native
  }
  
  @JSImport("hls/js", "FPSController")
  @js.native
  open class FPSController protected ()
    extends typings.hlsJs.mod.FPSController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "Fragment")
  @js.native
  open class Fragment protected ()
    extends typings.hlsJs.mod.Fragment {
    def this(`type`: PlaylistLevelType, baseurl: String) = this()
  }
  
  @JSImport("hls/js", "HdcpLevels")
  @js.native
  val HdcpLevels: js.Tuple4[NONE, `TYPE-0`, `TYPE-1`, Null] = js.native
  
  @JSImport("hls/js", "HlsUrlParameters")
  @js.native
  open class HlsUrlParameters ()
    extends typings.hlsJs.mod.HlsUrlParameters {
    def this(msn: Double) = this()
    def this(msn: Double, part: Double) = this()
    def this(msn: Unit, part: Double) = this()
    def this(msn: Double, part: Double, skip: HlsSkip) = this()
    def this(msn: Double, part: Unit, skip: HlsSkip) = this()
    def this(msn: Unit, part: Double, skip: HlsSkip) = this()
    def this(msn: Unit, part: Unit, skip: HlsSkip) = this()
  }
  
  @JSImport("hls/js", "Level")
  @js.native
  open class Level protected ()
    extends typings.hlsJs.mod.Level {
    def this(data: LevelParsed) = this()
  }
  
  @JSImport("hls/js", "LevelDetails")
  @js.native
  open class LevelDetails protected ()
    extends typings.hlsJs.mod.LevelDetails {
    def this(baseUrl: Any) = this()
  }
  
  @JSImport("hls/js", "LevelKey")
  @js.native
  open class LevelKey protected ()
    extends typings.hlsJs.mod.LevelKey {
    def this(method: String, uri: String, format: String) = this()
    def this(method: String, uri: String, format: String, formatversions: js.Array[Double]) = this()
    def this(
      method: String,
      uri: String,
      format: String,
      formatversions: js.Array[Double],
      iv: js.typedarray.Uint8Array
    ) = this()
    def this(method: String, uri: String, format: String, formatversions: Unit, iv: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object LevelKey {
    
    @JSImport("hls/js", "LevelKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearKeyUriToKeyIdMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearKeyUriToKeyIdMap")().asInstanceOf[Unit]
  }
  
  @JSImport("hls/js", "LoadStats")
  @js.native
  open class LoadStats ()
    extends typings.hlsJs.mod.LoadStats
  
  @JSImport("hls/js", "Part")
  @js.native
  open class Part protected ()
    extends typings.hlsJs.mod.Part {
    def this(
      partAttrs: typings.hlsJs.mod.AttrList,
      frag: typings.hlsJs.mod.Fragment,
      baseurl: String,
      index: Double
    ) = this()
    def this(
      partAttrs: typings.hlsJs.mod.AttrList,
      frag: typings.hlsJs.mod.Fragment,
      baseurl: String,
      index: Double,
      previous: typings.hlsJs.mod.Part
    ) = this()
  }
  
  @JSImport("hls/js", "SubtitleStreamController")
  @js.native
  open class SubtitleStreamController protected ()
    extends typings.hlsJs.mod.SubtitleStreamController {
    def this(hls: Hls, fragmentTracker: FragmentTracker, keyLoader: KeyLoader) = this()
  }
  
  @JSImport("hls/js", "SubtitleTrackController")
  @js.native
  open class SubtitleTrackController protected ()
    extends typings.hlsJs.mod.SubtitleTrackController {
    def this(hls: Hls) = this()
  }
  
  @JSImport("hls/js", "TimelineController")
  @js.native
  open class TimelineController protected ()
    extends typings.hlsJs.mod.TimelineController {
    def this(hls: Hls) = this()
  }
}
