package typings.hlsJs

import org.scalablytyped.runtime.Instantiable1
import typings.hlsJs.mod.AbrController
import typings.hlsJs.mod.CustomLoggerObject
import typings.hlsJs.mod.Loader
import typings.hlsJs.mod.LoaderConfig
import typings.hlsJs.mod.TimelineController
import typings.std.Request
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject
  
  /* Inlined std.Partial<hls.js.hls.js.Config> */
  trait PartialConfig extends StObject {
    
    var abrBandWidthFactor: js.UndefOr[Double] = js.undefined
    
    var abrBandWidthUpFactor: js.UndefOr[Double] = js.undefined
    
    var abrController: js.UndefOr[AbrController] = js.undefined
    
    var abrEwmaDefaultEstimate: js.UndefOr[Double] = js.undefined
    
    var abrEwmaFastLive: js.UndefOr[Double] = js.undefined
    
    var abrEwmaFastVod: js.UndefOr[Double] = js.undefined
    
    var abrEwmaSlowLive: js.UndefOr[Double] = js.undefined
    
    var abrEwmaSlowVod: js.UndefOr[Double] = js.undefined
    
    var abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.undefined
    
    var appendErrorMaxRetry: js.UndefOr[Double] = js.undefined
    
    var autoStartLoad: js.UndefOr[Boolean] = js.undefined
    
    var capLevelToPlayerSize: js.UndefOr[Boolean] = js.undefined
    
    var captionsTextTrack1Label: js.UndefOr[String] = js.undefined
    
    var captionsTextTrack1LanguagedCode: js.UndefOr[String] = js.undefined
    
    var captionsTextTrack2Label: js.UndefOr[String] = js.undefined
    
    var captionsTextTrack2LanguageCode: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean | CustomLoggerObject] = js.undefined
    
    var defaultAudioCodec: js.UndefOr[String] = js.undefined
    
    var enableCEA708Captions: js.UndefOr[Boolean] = js.undefined
    
    var enableSoftwareAES: js.UndefOr[Boolean] = js.undefined
    
    var enableWebVTT: js.UndefOr[Boolean] = js.undefined
    
    var enableWorker: js.UndefOr[Boolean] = js.undefined
    
    var fLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.undefined
    
    var fetchSetup: js.UndefOr[js.Function2[/* context */ js.Any, /* initParams */ js.Any, Request]] = js.undefined
    
    var forceKeyFrameOnDiscontinuity: js.UndefOr[Boolean] = js.undefined
    
    var fragLoadingMaxRetry: js.UndefOr[Double] = js.undefined
    
    var fragLoadingMaxRetryDelay: js.UndefOr[Double] = js.undefined
    
    var fragLoadingRetryDelay: js.UndefOr[Double] = js.undefined
    
    var fragLoadingTimeOut: js.UndefOr[Double] = js.undefined
    
    var highBufferWatchdogPeriod: js.UndefOr[Double] = js.undefined
    
    var initialLiveManifestSize: js.UndefOr[Double] = js.undefined
    
    var levelLoadingMaxRetry: js.UndefOr[Double] = js.undefined
    
    var levelLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var levelLoadingRetryDelay: js.UndefOr[Double] = js.undefined
    
    var levelLoadingTimeOut: js.UndefOr[Double] = js.undefined
    
    var liveBackBufferLength: js.UndefOr[Double] = js.undefined
    
    var liveDurationInfinity: js.UndefOr[Boolean] = js.undefined
    
    var liveMaxLatencyDuration: js.UndefOr[Double] = js.undefined
    
    var liveMaxLatencyDurationCount: js.UndefOr[Double] = js.undefined
    
    var liveSyncDuration: js.UndefOr[Double] = js.undefined
    
    var liveSyncDurationCount: js.UndefOr[Double] = js.undefined
    
    var loader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.undefined
    
    var lowBufferWatchdogPeriod: js.UndefOr[Double] = js.undefined
    
    var manifestLoadingMaxRetry: js.UndefOr[Double] = js.undefined
    
    var manifestLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var manifestLoadingRetryDelay: js.UndefOr[Double] = js.undefined
    
    var manifestLoadingTimeOut: js.UndefOr[Double] = js.undefined
    
    var maxAudioFramesDrift: js.UndefOr[Double] = js.undefined
    
    var maxBufferHole: js.UndefOr[Double] = js.undefined
    
    var maxBufferLength: js.UndefOr[Double] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var maxFragLookUpTolerance: js.UndefOr[Double] = js.undefined
    
    var maxLoadingDelay: js.UndefOr[Double] = js.undefined
    
    var maxMaxBufferLength: js.UndefOr[Double] = js.undefined
    
    var maxSeekHole: js.UndefOr[Double] = js.undefined
    
    var maxStarvationDelay: js.UndefOr[Double] = js.undefined
    
    var minAutoBitrate: js.UndefOr[Double] = js.undefined
    
    var nudgeMaxRetry: js.UndefOr[Double] = js.undefined
    
    var nudgeOffset: js.UndefOr[Double] = js.undefined
    
    var pLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.undefined
    
    var startFragPrefetch: js.UndefOr[Boolean] = js.undefined
    
    var startLevel: js.UndefOr[Double] = js.undefined
    
    var startPosition: js.UndefOr[Double] = js.undefined
    
    var stretchShortVideoTrack: js.UndefOr[Boolean] = js.undefined
    
    var timelineController: js.UndefOr[TimelineController] = js.undefined
    
    var xhrSetup: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbrBandWidthFactor(value: Double): Self = StObject.set(x, "abrBandWidthFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrBandWidthFactorUndefined: Self = StObject.set(x, "abrBandWidthFactor", js.undefined)
      
      @scala.inline
      def setAbrBandWidthUpFactor(value: Double): Self = StObject.set(x, "abrBandWidthUpFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrBandWidthUpFactorUndefined: Self = StObject.set(x, "abrBandWidthUpFactor", js.undefined)
      
      @scala.inline
      def setAbrController(value: AbrController): Self = StObject.set(x, "abrController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrControllerUndefined: Self = StObject.set(x, "abrController", js.undefined)
      
      @scala.inline
      def setAbrEwmaDefaultEstimate(value: Double): Self = StObject.set(x, "abrEwmaDefaultEstimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrEwmaDefaultEstimateUndefined: Self = StObject.set(x, "abrEwmaDefaultEstimate", js.undefined)
      
      @scala.inline
      def setAbrEwmaFastLive(value: Double): Self = StObject.set(x, "abrEwmaFastLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrEwmaFastLiveUndefined: Self = StObject.set(x, "abrEwmaFastLive", js.undefined)
      
      @scala.inline
      def setAbrEwmaFastVod(value: Double): Self = StObject.set(x, "abrEwmaFastVod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrEwmaFastVodUndefined: Self = StObject.set(x, "abrEwmaFastVod", js.undefined)
      
      @scala.inline
      def setAbrEwmaSlowLive(value: Double): Self = StObject.set(x, "abrEwmaSlowLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrEwmaSlowLiveUndefined: Self = StObject.set(x, "abrEwmaSlowLive", js.undefined)
      
      @scala.inline
      def setAbrEwmaSlowVod(value: Double): Self = StObject.set(x, "abrEwmaSlowVod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrEwmaSlowVodUndefined: Self = StObject.set(x, "abrEwmaSlowVod", js.undefined)
      
      @scala.inline
      def setAbrMaxWithRealBitrate(value: Boolean): Self = StObject.set(x, "abrMaxWithRealBitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbrMaxWithRealBitrateUndefined: Self = StObject.set(x, "abrMaxWithRealBitrate", js.undefined)
      
      @scala.inline
      def setAppendErrorMaxRetry(value: Double): Self = StObject.set(x, "appendErrorMaxRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendErrorMaxRetryUndefined: Self = StObject.set(x, "appendErrorMaxRetry", js.undefined)
      
      @scala.inline
      def setAutoStartLoad(value: Boolean): Self = StObject.set(x, "autoStartLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartLoadUndefined: Self = StObject.set(x, "autoStartLoad", js.undefined)
      
      @scala.inline
      def setCapLevelToPlayerSize(value: Boolean): Self = StObject.set(x, "capLevelToPlayerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapLevelToPlayerSizeUndefined: Self = StObject.set(x, "capLevelToPlayerSize", js.undefined)
      
      @scala.inline
      def setCaptionsTextTrack1Label(value: String): Self = StObject.set(x, "captionsTextTrack1Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionsTextTrack1LabelUndefined: Self = StObject.set(x, "captionsTextTrack1Label", js.undefined)
      
      @scala.inline
      def setCaptionsTextTrack1LanguagedCode(value: String): Self = StObject.set(x, "captionsTextTrack1LanguagedCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionsTextTrack1LanguagedCodeUndefined: Self = StObject.set(x, "captionsTextTrack1LanguagedCode", js.undefined)
      
      @scala.inline
      def setCaptionsTextTrack2Label(value: String): Self = StObject.set(x, "captionsTextTrack2Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionsTextTrack2LabelUndefined: Self = StObject.set(x, "captionsTextTrack2Label", js.undefined)
      
      @scala.inline
      def setCaptionsTextTrack2LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack2LanguageCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionsTextTrack2LanguageCodeUndefined: Self = StObject.set(x, "captionsTextTrack2LanguageCode", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean | CustomLoggerObject): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultAudioCodec(value: String): Self = StObject.set(x, "defaultAudioCodec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAudioCodecUndefined: Self = StObject.set(x, "defaultAudioCodec", js.undefined)
      
      @scala.inline
      def setEnableCEA708Captions(value: Boolean): Self = StObject.set(x, "enableCEA708Captions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableCEA708CaptionsUndefined: Self = StObject.set(x, "enableCEA708Captions", js.undefined)
      
      @scala.inline
      def setEnableSoftwareAES(value: Boolean): Self = StObject.set(x, "enableSoftwareAES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSoftwareAESUndefined: Self = StObject.set(x, "enableSoftwareAES", js.undefined)
      
      @scala.inline
      def setEnableWebVTT(value: Boolean): Self = StObject.set(x, "enableWebVTT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWebVTTUndefined: Self = StObject.set(x, "enableWebVTT", js.undefined)
      
      @scala.inline
      def setEnableWorker(value: Boolean): Self = StObject.set(x, "enableWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWorkerUndefined: Self = StObject.set(x, "enableWorker", js.undefined)
      
      @scala.inline
      def setFLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = StObject.set(x, "fLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLoaderUndefined: Self = StObject.set(x, "fLoader", js.undefined)
      
      @scala.inline
      def setFetchSetup(value: (/* context */ js.Any, /* initParams */ js.Any) => Request): Self = StObject.set(x, "fetchSetup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFetchSetupUndefined: Self = StObject.set(x, "fetchSetup", js.undefined)
      
      @scala.inline
      def setForceKeyFrameOnDiscontinuity(value: Boolean): Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceKeyFrameOnDiscontinuityUndefined: Self = StObject.set(x, "forceKeyFrameOnDiscontinuity", js.undefined)
      
      @scala.inline
      def setFragLoadingMaxRetry(value: Double): Self = StObject.set(x, "fragLoadingMaxRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragLoadingMaxRetryDelay(value: Double): Self = StObject.set(x, "fragLoadingMaxRetryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragLoadingMaxRetryDelayUndefined: Self = StObject.set(x, "fragLoadingMaxRetryDelay", js.undefined)
      
      @scala.inline
      def setFragLoadingMaxRetryUndefined: Self = StObject.set(x, "fragLoadingMaxRetry", js.undefined)
      
      @scala.inline
      def setFragLoadingRetryDelay(value: Double): Self = StObject.set(x, "fragLoadingRetryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragLoadingRetryDelayUndefined: Self = StObject.set(x, "fragLoadingRetryDelay", js.undefined)
      
      @scala.inline
      def setFragLoadingTimeOut(value: Double): Self = StObject.set(x, "fragLoadingTimeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragLoadingTimeOutUndefined: Self = StObject.set(x, "fragLoadingTimeOut", js.undefined)
      
      @scala.inline
      def setHighBufferWatchdogPeriod(value: Double): Self = StObject.set(x, "highBufferWatchdogPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighBufferWatchdogPeriodUndefined: Self = StObject.set(x, "highBufferWatchdogPeriod", js.undefined)
      
      @scala.inline
      def setInitialLiveManifestSize(value: Double): Self = StObject.set(x, "initialLiveManifestSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLiveManifestSizeUndefined: Self = StObject.set(x, "initialLiveManifestSize", js.undefined)
      
      @scala.inline
      def setLevelLoadingMaxRetry(value: Double): Self = StObject.set(x, "levelLoadingMaxRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "levelLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelLoadingMaxRetryTimeoutUndefined: Self = StObject.set(x, "levelLoadingMaxRetryTimeout", js.undefined)
      
      @scala.inline
      def setLevelLoadingMaxRetryUndefined: Self = StObject.set(x, "levelLoadingMaxRetry", js.undefined)
      
      @scala.inline
      def setLevelLoadingRetryDelay(value: Double): Self = StObject.set(x, "levelLoadingRetryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelLoadingRetryDelayUndefined: Self = StObject.set(x, "levelLoadingRetryDelay", js.undefined)
      
      @scala.inline
      def setLevelLoadingTimeOut(value: Double): Self = StObject.set(x, "levelLoadingTimeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelLoadingTimeOutUndefined: Self = StObject.set(x, "levelLoadingTimeOut", js.undefined)
      
      @scala.inline
      def setLiveBackBufferLength(value: Double): Self = StObject.set(x, "liveBackBufferLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveBackBufferLengthUndefined: Self = StObject.set(x, "liveBackBufferLength", js.undefined)
      
      @scala.inline
      def setLiveDurationInfinity(value: Boolean): Self = StObject.set(x, "liveDurationInfinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveDurationInfinityUndefined: Self = StObject.set(x, "liveDurationInfinity", js.undefined)
      
      @scala.inline
      def setLiveMaxLatencyDuration(value: Double): Self = StObject.set(x, "liveMaxLatencyDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveMaxLatencyDurationCount(value: Double): Self = StObject.set(x, "liveMaxLatencyDurationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveMaxLatencyDurationCountUndefined: Self = StObject.set(x, "liveMaxLatencyDurationCount", js.undefined)
      
      @scala.inline
      def setLiveMaxLatencyDurationUndefined: Self = StObject.set(x, "liveMaxLatencyDuration", js.undefined)
      
      @scala.inline
      def setLiveSyncDuration(value: Double): Self = StObject.set(x, "liveSyncDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveSyncDurationCount(value: Double): Self = StObject.set(x, "liveSyncDurationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveSyncDurationCountUndefined: Self = StObject.set(x, "liveSyncDurationCount", js.undefined)
      
      @scala.inline
      def setLiveSyncDurationUndefined: Self = StObject.set(x, "liveSyncDuration", js.undefined)
      
      @scala.inline
      def setLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLowBufferWatchdogPeriod(value: Double): Self = StObject.set(x, "lowBufferWatchdogPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowBufferWatchdogPeriodUndefined: Self = StObject.set(x, "lowBufferWatchdogPeriod", js.undefined)
      
      @scala.inline
      def setManifestLoadingMaxRetry(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestLoadingMaxRetryTimeout(value: Double): Self = StObject.set(x, "manifestLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestLoadingMaxRetryTimeoutUndefined: Self = StObject.set(x, "manifestLoadingMaxRetryTimeout", js.undefined)
      
      @scala.inline
      def setManifestLoadingMaxRetryUndefined: Self = StObject.set(x, "manifestLoadingMaxRetry", js.undefined)
      
      @scala.inline
      def setManifestLoadingRetryDelay(value: Double): Self = StObject.set(x, "manifestLoadingRetryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestLoadingRetryDelayUndefined: Self = StObject.set(x, "manifestLoadingRetryDelay", js.undefined)
      
      @scala.inline
      def setManifestLoadingTimeOut(value: Double): Self = StObject.set(x, "manifestLoadingTimeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestLoadingTimeOutUndefined: Self = StObject.set(x, "manifestLoadingTimeOut", js.undefined)
      
      @scala.inline
      def setMaxAudioFramesDrift(value: Double): Self = StObject.set(x, "maxAudioFramesDrift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAudioFramesDriftUndefined: Self = StObject.set(x, "maxAudioFramesDrift", js.undefined)
      
      @scala.inline
      def setMaxBufferHole(value: Double): Self = StObject.set(x, "maxBufferHole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferHoleUndefined: Self = StObject.set(x, "maxBufferHole", js.undefined)
      
      @scala.inline
      def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
      
      @scala.inline
      def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      @scala.inline
      def setMaxFragLookUpTolerance(value: Double): Self = StObject.set(x, "maxFragLookUpTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFragLookUpToleranceUndefined: Self = StObject.set(x, "maxFragLookUpTolerance", js.undefined)
      
      @scala.inline
      def setMaxLoadingDelay(value: Double): Self = StObject.set(x, "maxLoadingDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLoadingDelayUndefined: Self = StObject.set(x, "maxLoadingDelay", js.undefined)
      
      @scala.inline
      def setMaxMaxBufferLength(value: Double): Self = StObject.set(x, "maxMaxBufferLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMaxBufferLengthUndefined: Self = StObject.set(x, "maxMaxBufferLength", js.undefined)
      
      @scala.inline
      def setMaxSeekHole(value: Double): Self = StObject.set(x, "maxSeekHole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSeekHoleUndefined: Self = StObject.set(x, "maxSeekHole", js.undefined)
      
      @scala.inline
      def setMaxStarvationDelay(value: Double): Self = StObject.set(x, "maxStarvationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStarvationDelayUndefined: Self = StObject.set(x, "maxStarvationDelay", js.undefined)
      
      @scala.inline
      def setMinAutoBitrate(value: Double): Self = StObject.set(x, "minAutoBitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinAutoBitrateUndefined: Self = StObject.set(x, "minAutoBitrate", js.undefined)
      
      @scala.inline
      def setNudgeMaxRetry(value: Double): Self = StObject.set(x, "nudgeMaxRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNudgeMaxRetryUndefined: Self = StObject.set(x, "nudgeMaxRetry", js.undefined)
      
      @scala.inline
      def setNudgeOffset(value: Double): Self = StObject.set(x, "nudgeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNudgeOffsetUndefined: Self = StObject.set(x, "nudgeOffset", js.undefined)
      
      @scala.inline
      def setPLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = StObject.set(x, "pLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLoaderUndefined: Self = StObject.set(x, "pLoader", js.undefined)
      
      @scala.inline
      def setStartFragPrefetch(value: Boolean): Self = StObject.set(x, "startFragPrefetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartFragPrefetchUndefined: Self = StObject.set(x, "startFragPrefetch", js.undefined)
      
      @scala.inline
      def setStartLevel(value: Double): Self = StObject.set(x, "startLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLevelUndefined: Self = StObject.set(x, "startLevel", js.undefined)
      
      @scala.inline
      def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setStretchShortVideoTrack(value: Boolean): Self = StObject.set(x, "stretchShortVideoTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchShortVideoTrackUndefined: Self = StObject.set(x, "stretchShortVideoTrack", js.undefined)
      
      @scala.inline
      def setTimelineController(value: TimelineController): Self = StObject.set(x, "timelineController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineControllerUndefined: Self = StObject.set(x, "timelineController", js.undefined)
      
      @scala.inline
      def setXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = StObject.set(x, "xhrSetup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setXhrSetupUndefined: Self = StObject.set(x, "xhrSetup", js.undefined)
    }
  }
}
