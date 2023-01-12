package typings.hlsJs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.hlsJs.anon.Instantiable
import typings.hlsJs.anon.TypeofCMCDController
import typings.hlsJs.anon.TypeofCapLevelController
import typings.std.Request
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsConfig
  extends StObject
     with ABRControllerConfig
     with BufferControllerConfig
     with CapLevelControllerConfig
     with EMEControllerConfig
     with FPSControllerConfig
     with FragmentLoaderConfig
     with LevelControllerConfig
     with MP4RemuxerConfig
     with PlaylistLoaderConfig
     with StreamControllerConfig
     with LatencyControllerConfig
     with MetadataControllerConfig
     with TimelineControllerConfig
     with TSDemuxerConfig {
  
  var abrController: Instantiable1[/* hls */ Hls, AbrController]
  
  var audioStreamController: js.UndefOr[
    Instantiable2[/* hls */ Hls, /* fragmentTracker */ FragmentTracker, AudioStreamController]
  ] = js.undefined
  
  var audioTrackController: js.UndefOr[Instantiable1[/* hls */ Hls, AudioTrackController]] = js.undefined
  
  var bufferController: Instantiable1[/* hls */ Hls, BufferController]
  
  var capLevelController: TypeofCapLevelController & (Instantiable1[/* hls */ Hls, CapLevelController])
  
  var cmcd: js.UndefOr[CMCDControllerConfig] = js.undefined
  
  var cmcdController: js.UndefOr[TypeofCMCDController & (Instantiable1[/* hls */ Hls, CMCDController])] = js.undefined
  
  var debug: Boolean | ILogger
  
  var emeController: js.UndefOr[Instantiable1[/* hls */ Hls, EMEController]] = js.undefined
  
  var enableSoftwareAES: Boolean
  
  var enableWorker: Boolean
  
  var fetchSetup: js.UndefOr[js.Function2[/* context */ LoaderContext, /* initParams */ Any, Request]] = js.undefined
  
  var fpsController: Instantiable1[/* hls */ Hls, FPSController]
  
  var ignoreDevicePixelRatio: Boolean
  
  var loader: Instantiable
  
  var lowLatencyMode: Boolean
  
  var minAutoBitrate: Double
  
  var progressive: Boolean
  
  var subtitleStreamController: js.UndefOr[
    Instantiable2[/* hls */ Hls, /* fragmentTracker */ FragmentTracker, SubtitleStreamController]
  ] = js.undefined
  
  var subtitleTrackController: js.UndefOr[Instantiable1[/* hls */ Hls, SubtitleTrackController]] = js.undefined
  
  var timelineController: js.UndefOr[Instantiable1[/* hls */ Hls, TimelineController]] = js.undefined
  
  var xhrSetup: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
}
object HlsConfig {
  
  inline def apply(
    abrBandWidthFactor: Double,
    abrBandWidthUpFactor: Double,
    abrController: Instantiable1[/* hls */ Hls, AbrController],
    abrEwmaDefaultEstimate: Double,
    abrEwmaFastLive: Double,
    abrEwmaFastVoD: Double,
    abrEwmaSlowLive: Double,
    abrEwmaSlowVoD: Double,
    abrMaxWithRealBitrate: Boolean,
    appendErrorMaxRetry: Double,
    autoStartLoad: Boolean,
    backBufferLength: Double,
    bufferController: Instantiable1[/* hls */ Hls, BufferController],
    capLevelController: TypeofCapLevelController & (Instantiable1[/* hls */ Hls, CapLevelController]),
    capLevelOnFPSDrop: Boolean,
    capLevelToPlayerSize: Boolean,
    captionsTextTrack1Label: String,
    captionsTextTrack1LanguageCode: String,
    captionsTextTrack2Label: String,
    captionsTextTrack2LanguageCode: String,
    captionsTextTrack3Label: String,
    captionsTextTrack3LanguageCode: String,
    captionsTextTrack4Label: String,
    captionsTextTrack4LanguageCode: String,
    cueHandler: CuesInterface,
    debug: Boolean | ILogger,
    drmSystemOptions: DRMSystemOptions,
    emeEnabled: Boolean,
    enableCEA708Captions: Boolean,
    enableDateRangeMetadataCues: Boolean,
    enableEmsgMetadataCues: Boolean,
    enableID3MetadataCues: Boolean,
    enableIMSC1: Boolean,
    enableSoftwareAES: Boolean,
    enableWebVTT: Boolean,
    enableWorker: Boolean,
    forceKeyFrameOnDiscontinuity: Boolean,
    fpsController: Instantiable1[/* hls */ Hls, FPSController],
    fpsDroppedMonitoringPeriod: Double,
    fpsDroppedMonitoringThreshold: Double,
    fragLoadingMaxRetry: Double,
    fragLoadingMaxRetryTimeout: Double,
    fragLoadingRetryDelay: Double,
    fragLoadingTimeOut: Double,
    highBufferWatchdogPeriod: Double,
    ignoreDevicePixelRatio: Boolean,
    initialLiveManifestSize: Double,
    levelLoadingMaxRetry: Double,
    levelLoadingMaxRetryTimeout: Double,
    levelLoadingRetryDelay: Double,
    levelLoadingTimeOut: Double,
    liveDurationInfinity: Boolean,
    liveMaxLatencyDurationCount: Double,
    liveSyncDurationCount: Double,
    loader: Instantiable,
    lowLatencyMode: Boolean,
    manifestLoadingMaxRetry: Double,
    manifestLoadingMaxRetryTimeout: Double,
    manifestLoadingRetryDelay: Double,
    manifestLoadingTimeOut: Double,
    maxAudioFramesDrift: Double,
    maxBufferHole: Double,
    maxBufferLength: Double,
    maxBufferSize: Double,
    maxFragLookUpTolerance: Double,
    maxLiveSyncPlaybackRate: Double,
    maxLoadingDelay: Double,
    maxMaxBufferLength: Double,
    maxStarvationDelay: Double,
    minAutoBitrate: Double,
    nudgeMaxRetry: Double,
    nudgeOffset: Double,
    progressive: Boolean,
    renderTextTracksNatively: Boolean,
    startFragPrefetch: Boolean,
    startPosition: Double,
    stretchShortVideoTrack: Boolean,
    testBandwidth: Boolean
  ): HlsConfig = {
    val __obj = js.Dynamic.literal(abrBandWidthFactor = abrBandWidthFactor.asInstanceOf[js.Any], abrBandWidthUpFactor = abrBandWidthUpFactor.asInstanceOf[js.Any], abrController = abrController.asInstanceOf[js.Any], abrEwmaDefaultEstimate = abrEwmaDefaultEstimate.asInstanceOf[js.Any], abrEwmaFastLive = abrEwmaFastLive.asInstanceOf[js.Any], abrEwmaFastVoD = abrEwmaFastVoD.asInstanceOf[js.Any], abrEwmaSlowLive = abrEwmaSlowLive.asInstanceOf[js.Any], abrEwmaSlowVoD = abrEwmaSlowVoD.asInstanceOf[js.Any], abrMaxWithRealBitrate = abrMaxWithRealBitrate.asInstanceOf[js.Any], appendErrorMaxRetry = appendErrorMaxRetry.asInstanceOf[js.Any], autoStartLoad = autoStartLoad.asInstanceOf[js.Any], backBufferLength = backBufferLength.asInstanceOf[js.Any], bufferController = bufferController.asInstanceOf[js.Any], capLevelController = capLevelController.asInstanceOf[js.Any], capLevelOnFPSDrop = capLevelOnFPSDrop.asInstanceOf[js.Any], capLevelToPlayerSize = capLevelToPlayerSize.asInstanceOf[js.Any], captionsTextTrack1Label = captionsTextTrack1Label.asInstanceOf[js.Any], captionsTextTrack1LanguageCode = captionsTextTrack1LanguageCode.asInstanceOf[js.Any], captionsTextTrack2Label = captionsTextTrack2Label.asInstanceOf[js.Any], captionsTextTrack2LanguageCode = captionsTextTrack2LanguageCode.asInstanceOf[js.Any], captionsTextTrack3Label = captionsTextTrack3Label.asInstanceOf[js.Any], captionsTextTrack3LanguageCode = captionsTextTrack3LanguageCode.asInstanceOf[js.Any], captionsTextTrack4Label = captionsTextTrack4Label.asInstanceOf[js.Any], captionsTextTrack4LanguageCode = captionsTextTrack4LanguageCode.asInstanceOf[js.Any], cueHandler = cueHandler.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], drmSystemOptions = drmSystemOptions.asInstanceOf[js.Any], emeEnabled = emeEnabled.asInstanceOf[js.Any], enableCEA708Captions = enableCEA708Captions.asInstanceOf[js.Any], enableDateRangeMetadataCues = enableDateRangeMetadataCues.asInstanceOf[js.Any], enableEmsgMetadataCues = enableEmsgMetadataCues.asInstanceOf[js.Any], enableID3MetadataCues = enableID3MetadataCues.asInstanceOf[js.Any], enableIMSC1 = enableIMSC1.asInstanceOf[js.Any], enableSoftwareAES = enableSoftwareAES.asInstanceOf[js.Any], enableWebVTT = enableWebVTT.asInstanceOf[js.Any], enableWorker = enableWorker.asInstanceOf[js.Any], forceKeyFrameOnDiscontinuity = forceKeyFrameOnDiscontinuity.asInstanceOf[js.Any], fpsController = fpsController.asInstanceOf[js.Any], fpsDroppedMonitoringPeriod = fpsDroppedMonitoringPeriod.asInstanceOf[js.Any], fpsDroppedMonitoringThreshold = fpsDroppedMonitoringThreshold.asInstanceOf[js.Any], fragLoadingMaxRetry = fragLoadingMaxRetry.asInstanceOf[js.Any], fragLoadingMaxRetryTimeout = fragLoadingMaxRetryTimeout.asInstanceOf[js.Any], fragLoadingRetryDelay = fragLoadingRetryDelay.asInstanceOf[js.Any], fragLoadingTimeOut = fragLoadingTimeOut.asInstanceOf[js.Any], highBufferWatchdogPeriod = highBufferWatchdogPeriod.asInstanceOf[js.Any], ignoreDevicePixelRatio = ignoreDevicePixelRatio.asInstanceOf[js.Any], initialLiveManifestSize = initialLiveManifestSize.asInstanceOf[js.Any], levelLoadingMaxRetry = levelLoadingMaxRetry.asInstanceOf[js.Any], levelLoadingMaxRetryTimeout = levelLoadingMaxRetryTimeout.asInstanceOf[js.Any], levelLoadingRetryDelay = levelLoadingRetryDelay.asInstanceOf[js.Any], levelLoadingTimeOut = levelLoadingTimeOut.asInstanceOf[js.Any], liveDurationInfinity = liveDurationInfinity.asInstanceOf[js.Any], liveMaxLatencyDurationCount = liveMaxLatencyDurationCount.asInstanceOf[js.Any], liveSyncDurationCount = liveSyncDurationCount.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], lowLatencyMode = lowLatencyMode.asInstanceOf[js.Any], manifestLoadingMaxRetry = manifestLoadingMaxRetry.asInstanceOf[js.Any], manifestLoadingMaxRetryTimeout = manifestLoadingMaxRetryTimeout.asInstanceOf[js.Any], manifestLoadingRetryDelay = manifestLoadingRetryDelay.asInstanceOf[js.Any], manifestLoadingTimeOut = manifestLoadingTimeOut.asInstanceOf[js.Any], maxAudioFramesDrift = maxAudioFramesDrift.asInstanceOf[js.Any], maxBufferHole = maxBufferHole.asInstanceOf[js.Any], maxBufferLength = maxBufferLength.asInstanceOf[js.Any], maxBufferSize = maxBufferSize.asInstanceOf[js.Any], maxFragLookUpTolerance = maxFragLookUpTolerance.asInstanceOf[js.Any], maxLiveSyncPlaybackRate = maxLiveSyncPlaybackRate.asInstanceOf[js.Any], maxLoadingDelay = maxLoadingDelay.asInstanceOf[js.Any], maxMaxBufferLength = maxMaxBufferLength.asInstanceOf[js.Any], maxStarvationDelay = maxStarvationDelay.asInstanceOf[js.Any], minAutoBitrate = minAutoBitrate.asInstanceOf[js.Any], nudgeMaxRetry = nudgeMaxRetry.asInstanceOf[js.Any], nudgeOffset = nudgeOffset.asInstanceOf[js.Any], progressive = progressive.asInstanceOf[js.Any], renderTextTracksNatively = renderTextTracksNatively.asInstanceOf[js.Any], startFragPrefetch = startFragPrefetch.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], stretchShortVideoTrack = stretchShortVideoTrack.asInstanceOf[js.Any], testBandwidth = testBandwidth.asInstanceOf[js.Any], liveBackBufferLength = null, requestMediaKeySystemAccessFunc = null)
    __obj.asInstanceOf[HlsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsConfig] (val x: Self) extends AnyVal {
    
    inline def setAbrController(value: Instantiable1[/* hls */ Hls, AbrController]): Self = StObject.set(x, "abrController", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamController(value: Instantiable2[/* hls */ Hls, /* fragmentTracker */ FragmentTracker, AudioStreamController]): Self = StObject.set(x, "audioStreamController", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamControllerUndefined: Self = StObject.set(x, "audioStreamController", js.undefined)
    
    inline def setAudioTrackController(value: Instantiable1[/* hls */ Hls, AudioTrackController]): Self = StObject.set(x, "audioTrackController", value.asInstanceOf[js.Any])
    
    inline def setAudioTrackControllerUndefined: Self = StObject.set(x, "audioTrackController", js.undefined)
    
    inline def setBufferController(value: Instantiable1[/* hls */ Hls, BufferController]): Self = StObject.set(x, "bufferController", value.asInstanceOf[js.Any])
    
    inline def setCapLevelController(value: TypeofCapLevelController & (Instantiable1[/* hls */ Hls, CapLevelController])): Self = StObject.set(x, "capLevelController", value.asInstanceOf[js.Any])
    
    inline def setCmcd(value: CMCDControllerConfig): Self = StObject.set(x, "cmcd", value.asInstanceOf[js.Any])
    
    inline def setCmcdController(value: TypeofCMCDController & (Instantiable1[/* hls */ Hls, CMCDController])): Self = StObject.set(x, "cmcdController", value.asInstanceOf[js.Any])
    
    inline def setCmcdControllerUndefined: Self = StObject.set(x, "cmcdController", js.undefined)
    
    inline def setCmcdUndefined: Self = StObject.set(x, "cmcd", js.undefined)
    
    inline def setDebug(value: Boolean | ILogger): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setEmeController(value: Instantiable1[/* hls */ Hls, EMEController]): Self = StObject.set(x, "emeController", value.asInstanceOf[js.Any])
    
    inline def setEmeControllerUndefined: Self = StObject.set(x, "emeController", js.undefined)
    
    inline def setEnableSoftwareAES(value: Boolean): Self = StObject.set(x, "enableSoftwareAES", value.asInstanceOf[js.Any])
    
    inline def setEnableWorker(value: Boolean): Self = StObject.set(x, "enableWorker", value.asInstanceOf[js.Any])
    
    inline def setFetchSetup(value: (/* context */ LoaderContext, /* initParams */ Any) => Request): Self = StObject.set(x, "fetchSetup", js.Any.fromFunction2(value))
    
    inline def setFetchSetupUndefined: Self = StObject.set(x, "fetchSetup", js.undefined)
    
    inline def setFpsController(value: Instantiable1[/* hls */ Hls, FPSController]): Self = StObject.set(x, "fpsController", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDevicePixelRatio(value: Boolean): Self = StObject.set(x, "ignoreDevicePixelRatio", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Instantiable): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLowLatencyMode(value: Boolean): Self = StObject.set(x, "lowLatencyMode", value.asInstanceOf[js.Any])
    
    inline def setMinAutoBitrate(value: Double): Self = StObject.set(x, "minAutoBitrate", value.asInstanceOf[js.Any])
    
    inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStreamController(
      value: Instantiable2[/* hls */ Hls, /* fragmentTracker */ FragmentTracker, SubtitleStreamController]
    ): Self = StObject.set(x, "subtitleStreamController", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStreamControllerUndefined: Self = StObject.set(x, "subtitleStreamController", js.undefined)
    
    inline def setSubtitleTrackController(value: Instantiable1[/* hls */ Hls, SubtitleTrackController]): Self = StObject.set(x, "subtitleTrackController", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTrackControllerUndefined: Self = StObject.set(x, "subtitleTrackController", js.undefined)
    
    inline def setTimelineController(value: Instantiable1[/* hls */ Hls, TimelineController]): Self = StObject.set(x, "timelineController", value.asInstanceOf[js.Any])
    
    inline def setTimelineControllerUndefined: Self = StObject.set(x, "timelineController", js.undefined)
    
    inline def setXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = StObject.set(x, "xhrSetup", js.Any.fromFunction2(value))
    
    inline def setXhrSetupUndefined: Self = StObject.set(x, "xhrSetup", js.undefined)
  }
}
