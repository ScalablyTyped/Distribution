package typings.hlsJs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.hlsJs.mod.AbrController
import typings.hlsJs.mod.AudioStreamController
import typings.hlsJs.mod.AudioTrackController
import typings.hlsJs.mod.BufferController
import typings.hlsJs.mod.CMCDControllerConfig
import typings.hlsJs.mod.ContentSteeringController
import typings.hlsJs.mod.CuesInterface
import typings.hlsJs.mod.DRMSystemOptions
import typings.hlsJs.mod.DRMSystemsConfiguration
import typings.hlsJs.mod.ErrorController
import typings.hlsJs.mod.FPSController
import typings.hlsJs.mod.FragmentLoaderConstructor
import typings.hlsJs.mod.FragmentTracker
import typings.hlsJs.mod.Hls
import typings.hlsJs.mod.ILogger
import typings.hlsJs.mod.KeyLoader
import typings.hlsJs.mod.KeySystems
import typings.hlsJs.mod.LoadPolicy
import typings.hlsJs.mod.LoaderContext
import typings.hlsJs.mod.MediaKeyFunc
import typings.hlsJs.mod.MediaKeySessionContext
import typings.hlsJs.mod.PlaylistLoaderConstructor
import typings.hlsJs.mod.SubtitleStreamController
import typings.hlsJs.mod.SubtitleTrackController
import typings.hlsJs.mod.TimelineController
import typings.std.MediaKeySystemAccess
import typings.std.MediaKeySystemConfiguration
import typings.std.Request
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hls.js.hls.js.HlsConfig> */
trait PartialHlsConfig extends StObject {
  
  var abrBandWidthFactor: js.UndefOr[Double] = js.undefined
  
  var abrBandWidthUpFactor: js.UndefOr[Double] = js.undefined
  
  var abrController: js.UndefOr[Instantiable1[/* hls */ Hls, AbrController]] = js.undefined
  
  var abrEwmaDefaultEstimate: js.UndefOr[Double] = js.undefined
  
  var abrEwmaFastLive: js.UndefOr[Double] = js.undefined
  
  var abrEwmaFastVoD: js.UndefOr[Double] = js.undefined
  
  var abrEwmaSlowLive: js.UndefOr[Double] = js.undefined
  
  var abrEwmaSlowVoD: js.UndefOr[Double] = js.undefined
  
  var abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.undefined
  
  var appendErrorMaxRetry: js.UndefOr[Double] = js.undefined
  
  var audioStreamController: js.UndefOr[
    Instantiable3[
      /* hls */ Hls, 
      /* fragmentTracker */ FragmentTracker, 
      /* keyLoader */ KeyLoader, 
      AudioStreamController
    ]
  ] = js.undefined
  
  var audioTrackController: js.UndefOr[Instantiable1[/* hls */ Hls, AudioTrackController]] = js.undefined
  
  var autoStartLoad: js.UndefOr[Boolean] = js.undefined
  
  var backBufferLength: js.UndefOr[Double] = js.undefined
  
  var bufferController: js.UndefOr[Instantiable1[/* hls */ Hls, BufferController]] = js.undefined
  
  var capLevelController: js.UndefOr[TypeofCapLevelController] = js.undefined
  
  var capLevelOnFPSDrop: js.UndefOr[Boolean] = js.undefined
  
  var capLevelToPlayerSize: js.UndefOr[Boolean] = js.undefined
  
  var captionsTextTrack1Label: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack1LanguageCode: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack2Label: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack2LanguageCode: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack3Label: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack3LanguageCode: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack4Label: js.UndefOr[String] = js.undefined
  
  var captionsTextTrack4LanguageCode: js.UndefOr[String] = js.undefined
  
  var certLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var cmcd: js.UndefOr[CMCDControllerConfig] = js.undefined
  
  var cmcdController: js.UndefOr[TypeofCMCDController] = js.undefined
  
  var contentSteeringController: js.UndefOr[Instantiable1[/* hls */ Hls, ContentSteeringController]] = js.undefined
  
  var cueHandler: js.UndefOr[CuesInterface] = js.undefined
  
  var debug: js.UndefOr[Boolean | ILogger] = js.undefined
  
  var defaultAudioCodec: js.UndefOr[String] = js.undefined
  
  var drmSystemOptions: js.UndefOr[DRMSystemOptions] = js.undefined
  
  var drmSystems: js.UndefOr[DRMSystemsConfiguration] = js.undefined
  
  var emeController: js.UndefOr[TypeofEMEController] = js.undefined
  
  var emeEnabled: js.UndefOr[Boolean] = js.undefined
  
  var enableCEA708Captions: js.UndefOr[Boolean] = js.undefined
  
  var enableDateRangeMetadataCues: js.UndefOr[Boolean] = js.undefined
  
  var enableEmsgMetadataCues: js.UndefOr[Boolean] = js.undefined
  
  var enableID3MetadataCues: js.UndefOr[Boolean] = js.undefined
  
  var enableIMSC1: js.UndefOr[Boolean] = js.undefined
  
  var enableSoftwareAES: js.UndefOr[Boolean] = js.undefined
  
  var enableWebVTT: js.UndefOr[Boolean] = js.undefined
  
  var enableWorker: js.UndefOr[Boolean] = js.undefined
  
  var errorController: js.UndefOr[Instantiable1[/* hls */ Hls, ErrorController]] = js.undefined
  
  var fLoader: js.UndefOr[FragmentLoaderConstructor] = js.undefined
  
  var fetchSetup: js.UndefOr[js.Function2[/* context */ LoaderContext, /* initParams */ Any, Request]] = js.undefined
  
  var forceKeyFrameOnDiscontinuity: js.UndefOr[Boolean] = js.undefined
  
  var fpsController: js.UndefOr[Instantiable1[/* hls */ Hls, FPSController]] = js.undefined
  
  var fpsDroppedMonitoringPeriod: js.UndefOr[Double] = js.undefined
  
  var fpsDroppedMonitoringThreshold: js.UndefOr[Double] = js.undefined
  
  var fragLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var fragLoadingMaxRetry: js.UndefOr[Double] = js.undefined
  
  var fragLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var fragLoadingRetryDelay: js.UndefOr[Double] = js.undefined
  
  var fragLoadingTimeOut: js.UndefOr[Double] = js.undefined
  
  var highBufferWatchdogPeriod: js.UndefOr[Double] = js.undefined
  
  var ignoreDevicePixelRatio: js.UndefOr[Boolean] = js.undefined
  
  var initialLiveManifestSize: js.UndefOr[Double] = js.undefined
  
  var keyLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var levelLoadingMaxRetry: js.UndefOr[Double] = js.undefined
  
  var levelLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var levelLoadingRetryDelay: js.UndefOr[Double] = js.undefined
  
  var levelLoadingTimeOut: js.UndefOr[Double] = js.undefined
  
  var licenseResponseCallback: js.UndefOr[
    js.ThisFunction3[
      /* this */ Hls, 
      /* xhr */ XMLHttpRequest, 
      /* url */ String, 
      /* keyContext */ MediaKeySessionContext, 
      js.typedarray.ArrayBuffer
    ]
  ] = js.undefined
  
  var licenseXhrSetup: js.UndefOr[
    js.ThisFunction4[
      /* this */ Hls, 
      /* xhr */ XMLHttpRequest, 
      /* url */ String, 
      /* keyContext */ MediaKeySessionContext, 
      /* licenseChallenge */ js.typedarray.Uint8Array, 
      Unit | js.typedarray.Uint8Array | (js.Promise[js.typedarray.Uint8Array | Unit])
    ]
  ] = js.undefined
  
  var liveBackBufferLength: js.UndefOr[Double | Null] = js.undefined
  
  var liveDurationInfinity: js.UndefOr[Boolean] = js.undefined
  
  var liveMaxLatencyDuration: js.UndefOr[Double] = js.undefined
  
  var liveMaxLatencyDurationCount: js.UndefOr[Double] = js.undefined
  
  var liveSyncDuration: js.UndefOr[Double] = js.undefined
  
  var liveSyncDurationCount: js.UndefOr[Double] = js.undefined
  
  var loader: js.UndefOr[Instantiable] = js.undefined
  
  var lowLatencyMode: js.UndefOr[Boolean] = js.undefined
  
  var manifestLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var manifestLoadingMaxRetry: js.UndefOr[Double] = js.undefined
  
  var manifestLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined
  
  var manifestLoadingRetryDelay: js.UndefOr[Double] = js.undefined
  
  var manifestLoadingTimeOut: js.UndefOr[Double] = js.undefined
  
  var maxAudioFramesDrift: js.UndefOr[Double] = js.undefined
  
  var maxBufferHole: js.UndefOr[Double] = js.undefined
  
  var maxBufferLength: js.UndefOr[Double] = js.undefined
  
  var maxBufferSize: js.UndefOr[Double] = js.undefined
  
  var maxFragLookUpTolerance: js.UndefOr[Double] = js.undefined
  
  var maxLiveSyncPlaybackRate: js.UndefOr[Double] = js.undefined
  
  var maxLoadingDelay: js.UndefOr[Double] = js.undefined
  
  var maxMaxBufferLength: js.UndefOr[Double] = js.undefined
  
  var maxStarvationDelay: js.UndefOr[Double] = js.undefined
  
  var minAutoBitrate: js.UndefOr[Double] = js.undefined
  
  var nudgeMaxRetry: js.UndefOr[Double] = js.undefined
  
  var nudgeOffset: js.UndefOr[Double] = js.undefined
  
  var pLoader: js.UndefOr[PlaylistLoaderConstructor] = js.undefined
  
  var playlistLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var progressive: js.UndefOr[Boolean] = js.undefined
  
  var renderTextTracksNatively: js.UndefOr[Boolean] = js.undefined
  
  var requestMediaKeySystemAccessFunc: js.UndefOr[MediaKeyFunc | Null] = js.undefined
  
  var startFragPrefetch: js.UndefOr[Boolean] = js.undefined
  
  var startLevel: js.UndefOr[Double] = js.undefined
  
  var startPosition: js.UndefOr[Double] = js.undefined
  
  var steeringManifestLoadPolicy: js.UndefOr[LoadPolicy] = js.undefined
  
  var stretchShortVideoTrack: js.UndefOr[Boolean] = js.undefined
  
  var subtitleStreamController: js.UndefOr[
    Instantiable3[
      /* hls */ Hls, 
      /* fragmentTracker */ FragmentTracker, 
      /* keyLoader */ KeyLoader, 
      SubtitleStreamController
    ]
  ] = js.undefined
  
  var subtitleTrackController: js.UndefOr[Instantiable1[/* hls */ Hls, SubtitleTrackController]] = js.undefined
  
  var testBandwidth: js.UndefOr[Boolean] = js.undefined
  
  var timelineController: js.UndefOr[Instantiable1[/* hls */ Hls, TimelineController]] = js.undefined
  
  var widevineLicenseUrl: js.UndefOr[String] = js.undefined
  
  var workerPath: js.UndefOr[Null | String] = js.undefined
  
  var xhrSetup: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, js.Promise[Unit] | Unit]
  ] = js.undefined
}
object PartialHlsConfig {
  
  inline def apply(): PartialHlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHlsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialHlsConfig] (val x: Self) extends AnyVal {
    
    inline def setAbrBandWidthFactor(value: Double): Self = StObject.set(x, "abrBandWidthFactor", value.asInstanceOf[js.Any])
    
    inline def setAbrBandWidthFactorUndefined: Self = StObject.set(x, "abrBandWidthFactor", js.undefined)
    
    inline def setAbrBandWidthUpFactor(value: Double): Self = StObject.set(x, "abrBandWidthUpFactor", value.asInstanceOf[js.Any])
    
    inline def setAbrBandWidthUpFactorUndefined: Self = StObject.set(x, "abrBandWidthUpFactor", js.undefined)
    
    inline def setAbrController(value: Instantiable1[/* hls */ Hls, AbrController]): Self = StObject.set(x, "abrController", value.asInstanceOf[js.Any])
    
    inline def setAbrControllerUndefined: Self = StObject.set(x, "abrController", js.undefined)
    
    inline def setAbrEwmaDefaultEstimate(value: Double): Self = StObject.set(x, "abrEwmaDefaultEstimate", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaDefaultEstimateUndefined: Self = StObject.set(x, "abrEwmaDefaultEstimate", js.undefined)
    
    inline def setAbrEwmaFastLive(value: Double): Self = StObject.set(x, "abrEwmaFastLive", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaFastLiveUndefined: Self = StObject.set(x, "abrEwmaFastLive", js.undefined)
    
    inline def setAbrEwmaFastVoD(value: Double): Self = StObject.set(x, "abrEwmaFastVoD", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaFastVoDUndefined: Self = StObject.set(x, "abrEwmaFastVoD", js.undefined)
    
    inline def setAbrEwmaSlowLive(value: Double): Self = StObject.set(x, "abrEwmaSlowLive", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaSlowLiveUndefined: Self = StObject.set(x, "abrEwmaSlowLive", js.undefined)
    
    inline def setAbrEwmaSlowVoD(value: Double): Self = StObject.set(x, "abrEwmaSlowVoD", value.asInstanceOf[js.Any])
    
    inline def setAbrEwmaSlowVoDUndefined: Self = StObject.set(x, "abrEwmaSlowVoD", js.undefined)
    
    inline def setAbrMaxWithRealBitrate(value: Boolean): Self = StObject.set(x, "abrMaxWithRealBitrate", value.asInstanceOf[js.Any])
    
    inline def setAbrMaxWithRealBitrateUndefined: Self = StObject.set(x, "abrMaxWithRealBitrate", js.undefined)
    
    inline def setAppendErrorMaxRetry(value: Double): Self = StObject.set(x, "appendErrorMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setAppendErrorMaxRetryUndefined: Self = StObject.set(x, "appendErrorMaxRetry", js.undefined)
    
    inline def setAudioStreamController(
      value: Instantiable3[
          /* hls */ Hls, 
          /* fragmentTracker */ FragmentTracker, 
          /* keyLoader */ KeyLoader, 
          AudioStreamController
        ]
    ): Self = StObject.set(x, "audioStreamController", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamControllerUndefined: Self = StObject.set(x, "audioStreamController", js.undefined)
    
    inline def setAudioTrackController(value: Instantiable1[/* hls */ Hls, AudioTrackController]): Self = StObject.set(x, "audioTrackController", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackControllerUndefined: Self = StObject.set(x, "audioTrackController", js.undefined)
    
    inline def setAutoStartLoad(value: Boolean): Self = StObject.set(x, "autoStartLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoStartLoadUndefined: Self = StObject.set(x, "autoStartLoad", js.undefined)
    
    inline def setBackBufferLength(value: Double): Self = StObject.set(x, "backBufferLength", value.asInstanceOf[js.Any])
    
    inline def setBackBufferLengthUndefined: Self = StObject.set(x, "backBufferLength", js.undefined)
    
    inline def setBufferController(value: Instantiable1[/* hls */ Hls, BufferController]): Self = StObject.set(x, "bufferController", value.asInstanceOf[js.Any])
    
    inline def setBufferControllerUndefined: Self = StObject.set(x, "bufferController", js.undefined)
    
    inline def setCapLevelController(value: TypeofCapLevelController): Self = StObject.set(x, "capLevelController", value.asInstanceOf[js.Any])
    
    inline def setCapLevelControllerUndefined: Self = StObject.set(x, "capLevelController", js.undefined)
    
    inline def setCapLevelOnFPSDrop(value: Boolean): Self = StObject.set(x, "capLevelOnFPSDrop", value.asInstanceOf[js.Any])
    
    inline def setCapLevelOnFPSDropUndefined: Self = StObject.set(x, "capLevelOnFPSDrop", js.undefined)
    
    inline def setCapLevelToPlayerSize(value: Boolean): Self = StObject.set(x, "capLevelToPlayerSize", value.asInstanceOf[js.Any])
    
    inline def setCapLevelToPlayerSizeUndefined: Self = StObject.set(x, "capLevelToPlayerSize", js.undefined)
    
    inline def setCaptionsTextTrack1Label(value: String): Self = StObject.set(x, "captionsTextTrack1Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack1LabelUndefined: Self = StObject.set(x, "captionsTextTrack1Label", js.undefined)
    
    inline def setCaptionsTextTrack1LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack1LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack1LanguageCodeUndefined: Self = StObject.set(x, "captionsTextTrack1LanguageCode", js.undefined)
    
    inline def setCaptionsTextTrack2Label(value: String): Self = StObject.set(x, "captionsTextTrack2Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack2LabelUndefined: Self = StObject.set(x, "captionsTextTrack2Label", js.undefined)
    
    inline def setCaptionsTextTrack2LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack2LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack2LanguageCodeUndefined: Self = StObject.set(x, "captionsTextTrack2LanguageCode", js.undefined)
    
    inline def setCaptionsTextTrack3Label(value: String): Self = StObject.set(x, "captionsTextTrack3Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack3LabelUndefined: Self = StObject.set(x, "captionsTextTrack3Label", js.undefined)
    
    inline def setCaptionsTextTrack3LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack3LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack3LanguageCodeUndefined: Self = StObject.set(x, "captionsTextTrack3LanguageCode", js.undefined)
    
    inline def setCaptionsTextTrack4Label(value: String): Self = StObject.set(x, "captionsTextTrack4Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack4LabelUndefined: Self = StObject.set(x, "captionsTextTrack4Label", js.undefined)
    
    inline def setCaptionsTextTrack4LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack4LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack4LanguageCodeUndefined: Self = StObject.set(x, "captionsTextTrack4LanguageCode", js.undefined)
    
    inline def setCertLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "certLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setCertLoadPolicyUndefined: Self = StObject.set(x, "certLoadPolicy", js.undefined)
    
    inline def setCmcd(value: CMCDControllerConfig): Self = StObject.set(x, "cmcd", value.asInstanceOf[js.Any])
    
    inline def setCmcdController(value: TypeofCMCDController): Self = StObject.set(x, "cmcdController", value.asInstanceOf[js.Any])
    
    inline def setCmcdControllerUndefined: Self = StObject.set(x, "cmcdController", js.undefined)
    
    inline def setCmcdUndefined: Self = StObject.set(x, "cmcd", js.undefined)
    
    inline def setContentSteeringController(value: Instantiable1[/* hls */ Hls, ContentSteeringController]): Self = StObject.set(x, "contentSteeringController", value.asInstanceOf[js.Any])
    
    inline def setContentSteeringControllerUndefined: Self = StObject.set(x, "contentSteeringController", js.undefined)
    
    inline def setCueHandler(value: CuesInterface): Self = StObject.set(x, "cueHandler", value.asInstanceOf[js.Any])
    
    inline def setCueHandlerUndefined: Self = StObject.set(x, "cueHandler", js.undefined)
    
    inline def setDebug(value: Boolean | ILogger): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDefaultAudioCodec(value: String): Self = StObject.set(x, "defaultAudioCodec", value.asInstanceOf[js.Any])
    
    inline def setDefaultAudioCodecUndefined: Self = StObject.set(x, "defaultAudioCodec", js.undefined)
    
    inline def setDrmSystemOptions(value: DRMSystemOptions): Self = StObject.set(x, "drmSystemOptions", value.asInstanceOf[js.Any])
    
    inline def setDrmSystemOptionsUndefined: Self = StObject.set(x, "drmSystemOptions", js.undefined)
    
    inline def setDrmSystems(value: DRMSystemsConfiguration): Self = StObject.set(x, "drmSystems", value.asInstanceOf[js.Any])
    
    inline def setDrmSystemsUndefined: Self = StObject.set(x, "drmSystems", js.undefined)
    
    inline def setEmeController(value: TypeofEMEController): Self = StObject.set(x, "emeController", value.asInstanceOf[js.Any])
    
    inline def setEmeControllerUndefined: Self = StObject.set(x, "emeController", js.undefined)
    
    inline def setEmeEnabled(value: Boolean): Self = StObject.set(x, "emeEnabled", value.asInstanceOf[js.Any])
    
    inline def setEmeEnabledUndefined: Self = StObject.set(x, "emeEnabled", js.undefined)
    
    inline def setEnableCEA708Captions(value: Boolean): Self = StObject.set(x, "enableCEA708Captions", value.asInstanceOf[js.Any])
    
    inline def setEnableCEA708CaptionsUndefined: Self = StObject.set(x, "enableCEA708Captions", js.undefined)
    
    inline def setEnableDateRangeMetadataCues(value: Boolean): Self = StObject.set(x, "enableDateRangeMetadataCues", value.asInstanceOf[js.Any])
    
    inline def setEnableDateRangeMetadataCuesUndefined: Self = StObject.set(x, "enableDateRangeMetadataCues", js.undefined)
    
    inline def setEnableEmsgMetadataCues(value: Boolean): Self = StObject.set(x, "enableEmsgMetadataCues", value.asInstanceOf[js.Any])
    
    inline def setEnableEmsgMetadataCuesUndefined: Self = StObject.set(x, "enableEmsgMetadataCues", js.undefined)
    
    inline def setEnableID3MetadataCues(value: Boolean): Self = StObject.set(x, "enableID3MetadataCues", value.asInstanceOf[js.Any])
    
    inline def setEnableID3MetadataCuesUndefined: Self = StObject.set(x, "enableID3MetadataCues", js.undefined)
    
    inline def setEnableIMSC1(value: Boolean): Self = StObject.set(x, "enableIMSC1", value.asInstanceOf[js.Any])
    
    inline def setEnableIMSC1Undefined: Self = StObject.set(x, "enableIMSC1", js.undefined)
    
    inline def setEnableSoftwareAES(value: Boolean): Self = StObject.set(x, "enableSoftwareAES", value.asInstanceOf[js.Any])
    
    inline def setEnableSoftwareAESUndefined: Self = StObject.set(x, "enableSoftwareAES", js.undefined)
    
    inline def setEnableWebVTT(value: Boolean): Self = StObject.set(x, "enableWebVTT", value.asInstanceOf[js.Any])
    
    inline def setEnableWebVTTUndefined: Self = StObject.set(x, "enableWebVTT", js.undefined)
    
    inline def setEnableWorker(value: Boolean): Self = StObject.set(x, "enableWorker", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkerUndefined: Self = StObject.set(x, "enableWorker", js.undefined)
    
    inline def setErrorController(value: Instantiable1[/* hls */ Hls, ErrorController]): Self = StObject.set(x, "errorController", value.asInstanceOf[js.Any])
    
    inline def setErrorControllerUndefined: Self = StObject.set(x, "errorController", js.undefined)
    
    inline def setFLoader(value: FragmentLoaderConstructor): Self = StObject.set(x, "fLoader", value.asInstanceOf[js.Any])
    
    inline def setFLoaderUndefined: Self = StObject.set(x, "fLoader", js.undefined)
    
    inline def setFetchSetup(value: (/* context */ LoaderContext, /* initParams */ Any) => Request): Self = StObject.set(x, "fetchSetup", js.Any.fromFunction2(value))
    
    inline def setFetchSetupUndefined: Self = StObject.set(x, "fetchSetup", js.undefined)
    
    inline def setForceKeyFrameOnDiscontinuity(value: Boolean): Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", value.asInstanceOf[js.Any])
    
    inline def setForceKeyFrameOnDiscontinuityUndefined: Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", js.undefined)
    
    inline def setFpsController(value: Instantiable1[/* hls */ Hls, FPSController]): Self = StObject.set(x, "fpsController", value.asInstanceOf[js.Any])
    
    inline def setFpsControllerUndefined: Self = StObject.set(x, "fpsController", js.undefined)
    
    inline def setFpsDroppedMonitoringPeriod(value: Double): Self = StObject.set(x, "fpsDroppedMonitoringPeriod", value.asInstanceOf[js.Any])
    
    inline def setFpsDroppedMonitoringPeriodUndefined: Self = StObject.set(x, "fpsDroppedMonitoringPeriod", js.undefined)
    
    inline def setFpsDroppedMonitoringThreshold(value: Double): Self = StObject.set(x, "fpsDroppedMonitoringThreshold", value.asInstanceOf[js.Any])
    
    inline def setFpsDroppedMonitoringThresholdUndefined: Self = StObject.set(x, "fpsDroppedMonitoringThreshold", js.undefined)
    
    inline def setFragLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "fragLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setFragLoadPolicyUndefined: Self = StObject.set(x, "fragLoadPolicy", js.undefined)
    
    inline def setFragLoadingMaxRetry(value: Double): Self = StObject.set(x, "fragLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "fragLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingMaxRetryTimeoutUndefined: Self = StObject.set(x, "fragLoadingMaxRetryTimeout", js.undefined)
    
    inline def setFragLoadingMaxRetryUndefined: Self = StObject.set(x, "fragLoadingMaxRetry", js.undefined)
    
    inline def setFragLoadingRetryDelay(value: Double): Self = StObject.set(x, "fragLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingRetryDelayUndefined: Self = StObject.set(x, "fragLoadingRetryDelay", js.undefined)
    
    inline def setFragLoadingTimeOut(value: Double): Self = StObject.set(x, "fragLoadingTimeOut", value.asInstanceOf[js.Any])
    
    inline def setFragLoadingTimeOutUndefined: Self = StObject.set(x, "fragLoadingTimeOut", js.undefined)
    
    inline def setHighBufferWatchdogPeriod(value: Double): Self = StObject.set(x, "highBufferWatchdogPeriod", value.asInstanceOf[js.Any])
    
    inline def setHighBufferWatchdogPeriodUndefined: Self = StObject.set(x, "highBufferWatchdogPeriod", js.undefined)
    
    inline def setIgnoreDevicePixelRatio(value: Boolean): Self = StObject.set(x, "ignoreDevicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDevicePixelRatioUndefined: Self = StObject.set(x, "ignoreDevicePixelRatio", js.undefined)
    
    inline def setInitialLiveManifestSize(value: Double): Self = StObject.set(x, "initialLiveManifestSize", value.asInstanceOf[js.Any])
    
    inline def setInitialLiveManifestSizeUndefined: Self = StObject.set(x, "initialLiveManifestSize", js.undefined)
    
    inline def setKeyLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "keyLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setKeyLoadPolicyUndefined: Self = StObject.set(x, "keyLoadPolicy", js.undefined)
    
    inline def setLevelLoadingMaxRetry(value: Double): Self = StObject.set(x, "levelLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "levelLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingMaxRetryTimeoutUndefined: Self = StObject.set(x, "levelLoadingMaxRetryTimeout", js.undefined)
    
    inline def setLevelLoadingMaxRetryUndefined: Self = StObject.set(x, "levelLoadingMaxRetry", js.undefined)
    
    inline def setLevelLoadingRetryDelay(value: Double): Self = StObject.set(x, "levelLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingRetryDelayUndefined: Self = StObject.set(x, "levelLoadingRetryDelay", js.undefined)
    
    inline def setLevelLoadingTimeOut(value: Double): Self = StObject.set(x, "levelLoadingTimeOut", value.asInstanceOf[js.Any])
    
    inline def setLevelLoadingTimeOutUndefined: Self = StObject.set(x, "levelLoadingTimeOut", js.undefined)
    
    inline def setLicenseResponseCallback(
      value: js.ThisFunction3[
          /* this */ Hls, 
          /* xhr */ XMLHttpRequest, 
          /* url */ String, 
          /* keyContext */ MediaKeySessionContext, 
          js.typedarray.ArrayBuffer
        ]
    ): Self = StObject.set(x, "licenseResponseCallback", value.asInstanceOf[js.Any])
    
    inline def setLicenseResponseCallbackUndefined: Self = StObject.set(x, "licenseResponseCallback", js.undefined)
    
    inline def setLicenseXhrSetup(
      value: js.ThisFunction4[
          /* this */ Hls, 
          /* xhr */ XMLHttpRequest, 
          /* url */ String, 
          /* keyContext */ MediaKeySessionContext, 
          /* licenseChallenge */ js.typedarray.Uint8Array, 
          Unit | js.typedarray.Uint8Array | (js.Promise[js.typedarray.Uint8Array | Unit])
        ]
    ): Self = StObject.set(x, "licenseXhrSetup", value.asInstanceOf[js.Any])
    
    inline def setLicenseXhrSetupUndefined: Self = StObject.set(x, "licenseXhrSetup", js.undefined)
    
    inline def setLiveBackBufferLength(value: Double): Self = StObject.set(x, "liveBackBufferLength", value.asInstanceOf[js.Any])
    
    inline def setLiveBackBufferLengthNull: Self = StObject.set(x, "liveBackBufferLength", null)
    
    inline def setLiveBackBufferLengthUndefined: Self = StObject.set(x, "liveBackBufferLength", js.undefined)
    
    inline def setLiveDurationInfinity(value: Boolean): Self = StObject.set(x, "liveDurationInfinity", value.asInstanceOf[js.Any])
    
    inline def setLiveDurationInfinityUndefined: Self = StObject.set(x, "liveDurationInfinity", js.undefined)
    
    inline def setLiveMaxLatencyDuration(value: Double): Self = StObject.set(x, "liveMaxLatencyDuration", value.asInstanceOf[js.Any])
    
    inline def setLiveMaxLatencyDurationCount(value: Double): Self = StObject.set(x, "liveMaxLatencyDurationCount", value.asInstanceOf[js.Any])
    
    inline def setLiveMaxLatencyDurationCountUndefined: Self = StObject.set(x, "liveMaxLatencyDurationCount", js.undefined)
    
    inline def setLiveMaxLatencyDurationUndefined: Self = StObject.set(x, "liveMaxLatencyDuration", js.undefined)
    
    inline def setLiveSyncDuration(value: Double): Self = StObject.set(x, "liveSyncDuration", value.asInstanceOf[js.Any])
    
    inline def setLiveSyncDurationCount(value: Double): Self = StObject.set(x, "liveSyncDurationCount", value.asInstanceOf[js.Any])
    
    inline def setLiveSyncDurationCountUndefined: Self = StObject.set(x, "liveSyncDurationCount", js.undefined)
    
    inline def setLiveSyncDurationUndefined: Self = StObject.set(x, "liveSyncDuration", js.undefined)
    
    inline def setLoader(value: Instantiable): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLowLatencyMode(value: Boolean): Self = StObject.set(x, "lowLatencyMode", value.asInstanceOf[js.Any])
    
    inline def setLowLatencyModeUndefined: Self = StObject.set(x, "lowLatencyMode", js.undefined)
    
    inline def setManifestLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "manifestLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadPolicyUndefined: Self = StObject.set(x, "manifestLoadPolicy", js.undefined)
    
    inline def setManifestLoadingMaxRetry(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingMaxRetryTimeoutUndefined: Self = StObject.set(x, "manifestLoadingMaxRetryTimeout", js.undefined)
    
    inline def setManifestLoadingMaxRetryUndefined: Self = StObject.set(x, "manifestLoadingMaxRetry", js.undefined)
    
    inline def setManifestLoadingRetryDelay(value: Double): Self = StObject.set(x, "manifestLoadingRetryDelay", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingRetryDelayUndefined: Self = StObject.set(x, "manifestLoadingRetryDelay", js.undefined)
    
    inline def setManifestLoadingTimeOut(value: Double): Self = StObject.set(x, "manifestLoadingTimeOut", value.asInstanceOf[js.Any])
    
    inline def setManifestLoadingTimeOutUndefined: Self = StObject.set(x, "manifestLoadingTimeOut", js.undefined)
    
    inline def setMaxAudioFramesDrift(value: Double): Self = StObject.set(x, "maxAudioFramesDrift", value.asInstanceOf[js.Any])
    
    inline def setMaxAudioFramesDriftUndefined: Self = StObject.set(x, "maxAudioFramesDrift", js.undefined)
    
    inline def setMaxBufferHole(value: Double): Self = StObject.set(x, "maxBufferHole", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferHoleUndefined: Self = StObject.set(x, "maxBufferHole", js.undefined)
    
    inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    
    inline def setMaxFragLookUpTolerance(value: Double): Self = StObject.set(x, "maxFragLookUpTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaxFragLookUpToleranceUndefined: Self = StObject.set(x, "maxFragLookUpTolerance", js.undefined)
    
    inline def setMaxLiveSyncPlaybackRate(value: Double): Self = StObject.set(x, "maxLiveSyncPlaybackRate", value.asInstanceOf[js.Any])
    
    inline def setMaxLiveSyncPlaybackRateUndefined: Self = StObject.set(x, "maxLiveSyncPlaybackRate", js.undefined)
    
    inline def setMaxLoadingDelay(value: Double): Self = StObject.set(x, "maxLoadingDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxLoadingDelayUndefined: Self = StObject.set(x, "maxLoadingDelay", js.undefined)
    
    inline def setMaxMaxBufferLength(value: Double): Self = StObject.set(x, "maxMaxBufferLength", value.asInstanceOf[js.Any])
    
    inline def setMaxMaxBufferLengthUndefined: Self = StObject.set(x, "maxMaxBufferLength", js.undefined)
    
    inline def setMaxStarvationDelay(value: Double): Self = StObject.set(x, "maxStarvationDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxStarvationDelayUndefined: Self = StObject.set(x, "maxStarvationDelay", js.undefined)
    
    inline def setMinAutoBitrate(value: Double): Self = StObject.set(x, "minAutoBitrate", value.asInstanceOf[js.Any])
    
    inline def setMinAutoBitrateUndefined: Self = StObject.set(x, "minAutoBitrate", js.undefined)
    
    inline def setNudgeMaxRetry(value: Double): Self = StObject.set(x, "nudgeMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setNudgeMaxRetryUndefined: Self = StObject.set(x, "nudgeMaxRetry", js.undefined)
    
    inline def setNudgeOffset(value: Double): Self = StObject.set(x, "nudgeOffset", value.asInstanceOf[js.Any])
    
    inline def setNudgeOffsetUndefined: Self = StObject.set(x, "nudgeOffset", js.undefined)
    
    inline def setPLoader(value: PlaylistLoaderConstructor): Self = StObject.set(x, "pLoader", value.asInstanceOf[js.Any])
    
    inline def setPLoaderUndefined: Self = StObject.set(x, "pLoader", js.undefined)
    
    inline def setPlaylistLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "playlistLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setPlaylistLoadPolicyUndefined: Self = StObject.set(x, "playlistLoadPolicy", js.undefined)
    
    inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    inline def setRenderTextTracksNatively(value: Boolean): Self = StObject.set(x, "renderTextTracksNatively", value.asInstanceOf[js.Any])
    
    inline def setRenderTextTracksNativelyUndefined: Self = StObject.set(x, "renderTextTracksNatively", js.undefined)
    
    inline def setRequestMediaKeySystemAccessFunc(
      value: (/* keySystem */ KeySystems, /* supportedConfigurations */ js.Array[MediaKeySystemConfiguration]) => js.Promise[MediaKeySystemAccess]
    ): Self = StObject.set(x, "requestMediaKeySystemAccessFunc", js.Any.fromFunction2(value))
    
    inline def setRequestMediaKeySystemAccessFuncNull: Self = StObject.set(x, "requestMediaKeySystemAccessFunc", null)
    
    inline def setRequestMediaKeySystemAccessFuncUndefined: Self = StObject.set(x, "requestMediaKeySystemAccessFunc", js.undefined)
    
    inline def setStartFragPrefetch(value: Boolean): Self = StObject.set(x, "startFragPrefetch", value.asInstanceOf[js.Any])
    
    inline def setStartFragPrefetchUndefined: Self = StObject.set(x, "startFragPrefetch", js.undefined)
    
    inline def setStartLevel(value: Double): Self = StObject.set(x, "startLevel", value.asInstanceOf[js.Any])
    
    inline def setStartLevelUndefined: Self = StObject.set(x, "startLevel", js.undefined)
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
    
    inline def setSteeringManifestLoadPolicy(value: LoadPolicy): Self = StObject.set(x, "steeringManifestLoadPolicy", value.asInstanceOf[js.Any])
    
    inline def setSteeringManifestLoadPolicyUndefined: Self = StObject.set(x, "steeringManifestLoadPolicy", js.undefined)
    
    inline def setStretchShortVideoTrack(value: Boolean): Self = StObject.set(x, "stretchShortVideoTrack", value.asInstanceOf[js.Any])
    
    inline def setStretchShortVideoTrackUndefined: Self = StObject.set(x, "stretchShortVideoTrack", js.undefined)
    
    inline def setSubtitleStreamController(
      value: Instantiable3[
          /* hls */ Hls, 
          /* fragmentTracker */ FragmentTracker, 
          /* keyLoader */ KeyLoader, 
          SubtitleStreamController
        ]
    ): Self = StObject.set(x, "subtitleStreamController", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStreamControllerUndefined: Self = StObject.set(x, "subtitleStreamController", js.undefined)
    
    inline def setSubtitleTrackController(value: Instantiable1[/* hls */ Hls, SubtitleTrackController]): Self = StObject.set(x, "subtitleTrackController", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTrackControllerUndefined: Self = StObject.set(x, "subtitleTrackController", js.undefined)
    
    inline def setTestBandwidth(value: Boolean): Self = StObject.set(x, "testBandwidth", value.asInstanceOf[js.Any])
    
    inline def setTestBandwidthUndefined: Self = StObject.set(x, "testBandwidth", js.undefined)
    
    inline def setTimelineController(value: Instantiable1[/* hls */ Hls, TimelineController]): Self = StObject.set(x, "timelineController", value.asInstanceOf[js.Any])
    
    inline def setTimelineControllerUndefined: Self = StObject.set(x, "timelineController", js.undefined)
    
    inline def setWidevineLicenseUrl(value: String): Self = StObject.set(x, "widevineLicenseUrl", value.asInstanceOf[js.Any])
    
    inline def setWidevineLicenseUrlUndefined: Self = StObject.set(x, "widevineLicenseUrl", js.undefined)
    
    inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    
    inline def setWorkerPathNull: Self = StObject.set(x, "workerPath", null)
    
    inline def setWorkerPathUndefined: Self = StObject.set(x, "workerPath", js.undefined)
    
    inline def setXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "xhrSetup", js.Any.fromFunction2(value))
    
    inline def setXhrSetupUndefined: Self = StObject.set(x, "xhrSetup", js.undefined)
  }
}
