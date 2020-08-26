package typings.hlsJs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.hlsJs.mod.AbrController
import typings.hlsJs.mod.CustomLoggerObject
import typings.hlsJs.mod.Loader
import typings.hlsJs.mod.LoaderConfig
import typings.hlsJs.mod.TimelineController
import typings.std.Request
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hls.js.hls.js.Config> */
@js.native
trait PartialConfig extends js.Object {
  var abrBandWidthFactor: js.UndefOr[Double] = js.native
  var abrBandWidthUpFactor: js.UndefOr[Double] = js.native
  var abrController: js.UndefOr[AbrController] = js.native
  var abrEwmaDefaultEstimate: js.UndefOr[Double] = js.native
  var abrEwmaFastLive: js.UndefOr[Double] = js.native
  var abrEwmaFastVod: js.UndefOr[Double] = js.native
  var abrEwmaSlowLive: js.UndefOr[Double] = js.native
  var abrEwmaSlowVod: js.UndefOr[Double] = js.native
  var abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.native
  var appendErrorMaxRetry: js.UndefOr[Double] = js.native
  var autoStartLoad: js.UndefOr[Boolean] = js.native
  var capLevelToPlayerSize: js.UndefOr[Boolean] = js.native
  var captionsTextTrack1Label: js.UndefOr[String] = js.native
  var captionsTextTrack1LanguagedCode: js.UndefOr[String] = js.native
  var captionsTextTrack2Label: js.UndefOr[String] = js.native
  var captionsTextTrack2LanguageCode: js.UndefOr[String] = js.native
  var debug: js.UndefOr[Boolean | CustomLoggerObject] = js.native
  var defaultAudioCodec: js.UndefOr[String] = js.native
  var enableCEA708Captions: js.UndefOr[Boolean] = js.native
  var enableSoftwareAES: js.UndefOr[Boolean] = js.native
  var enableWebVTT: js.UndefOr[Boolean] = js.native
  var enableWorker: js.UndefOr[Boolean] = js.native
  var fLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var fetchSetup: js.UndefOr[js.Function2[/* context */ js.Any, /* initParams */ js.Any, Request]] = js.native
  var forceKeyFrameOnDiscontinuity: js.UndefOr[Boolean] = js.native
  var fragLoadingMaxRetry: js.UndefOr[Double] = js.native
  var fragLoadingMaxRetryDelay: js.UndefOr[Double] = js.native
  var fragLoadingRetryDelay: js.UndefOr[Double] = js.native
  var fragLoadingTimeOut: js.UndefOr[Double] = js.native
  var highBufferWatchdogPeriod: js.UndefOr[Double] = js.native
  var initialLiveManifestSize: js.UndefOr[Double] = js.native
  var levelLoadingMaxRetry: js.UndefOr[Double] = js.native
  var levelLoadingMaxRetryTimeout: js.UndefOr[Double] = js.native
  var levelLoadingRetryDelay: js.UndefOr[Double] = js.native
  var levelLoadingTimeOut: js.UndefOr[Double] = js.native
  var liveBackBufferLength: js.UndefOr[Double] = js.native
  var liveDurationInfinity: js.UndefOr[Boolean] = js.native
  var liveMaxLatencyDuration: js.UndefOr[Double] = js.native
  var liveMaxLatencyDurationCount: js.UndefOr[Double] = js.native
  var liveSyncDuration: js.UndefOr[Double] = js.native
  var liveSyncDurationCount: js.UndefOr[Double] = js.native
  var loader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var lowBufferWatchdogPeriod: js.UndefOr[Double] = js.native
  var manifestLoadingMaxRetry: js.UndefOr[Double] = js.native
  var manifestLoadingMaxRetryTimeout: js.UndefOr[Double] = js.native
  var manifestLoadingRetryDelay: js.UndefOr[Double] = js.native
  var manifestLoadingTimeOut: js.UndefOr[Double] = js.native
  var maxAudioFramesDrift: js.UndefOr[Double] = js.native
  var maxBufferHole: js.UndefOr[Double] = js.native
  var maxBufferLength: js.UndefOr[Double] = js.native
  var maxBufferSize: js.UndefOr[Double] = js.native
  var maxFragLookUpTolerance: js.UndefOr[Double] = js.native
  var maxLoadingDelay: js.UndefOr[Double] = js.native
  var maxMaxBufferLength: js.UndefOr[Double] = js.native
  var maxSeekHole: js.UndefOr[Double] = js.native
  var maxStarvationDelay: js.UndefOr[Double] = js.native
  var minAutoBitrate: js.UndefOr[Double] = js.native
  var nudgeMaxRetry: js.UndefOr[Double] = js.native
  var nudgeOffset: js.UndefOr[Double] = js.native
  var pLoader: js.UndefOr[Instantiable1[/* config */ LoaderConfig, Loader]] = js.native
  var startFragPrefetch: js.UndefOr[Boolean] = js.native
  var startLevel: js.UndefOr[Double] = js.native
  var startPosition: js.UndefOr[Double] = js.native
  var stretchShortVideoTrack: js.UndefOr[Boolean] = js.native
  var timelineController: js.UndefOr[TimelineController] = js.native
  var xhrSetup: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
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
    def setAbrBandWidthFactor(value: Double): Self = this.set("abrBandWidthFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrBandWidthFactor: Self = this.set("abrBandWidthFactor", js.undefined)
    @scala.inline
    def setAbrBandWidthUpFactor(value: Double): Self = this.set("abrBandWidthUpFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrBandWidthUpFactor: Self = this.set("abrBandWidthUpFactor", js.undefined)
    @scala.inline
    def setAbrController(value: AbrController): Self = this.set("abrController", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrController: Self = this.set("abrController", js.undefined)
    @scala.inline
    def setAbrEwmaDefaultEstimate(value: Double): Self = this.set("abrEwmaDefaultEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrEwmaDefaultEstimate: Self = this.set("abrEwmaDefaultEstimate", js.undefined)
    @scala.inline
    def setAbrEwmaFastLive(value: Double): Self = this.set("abrEwmaFastLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrEwmaFastLive: Self = this.set("abrEwmaFastLive", js.undefined)
    @scala.inline
    def setAbrEwmaFastVod(value: Double): Self = this.set("abrEwmaFastVod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrEwmaFastVod: Self = this.set("abrEwmaFastVod", js.undefined)
    @scala.inline
    def setAbrEwmaSlowLive(value: Double): Self = this.set("abrEwmaSlowLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrEwmaSlowLive: Self = this.set("abrEwmaSlowLive", js.undefined)
    @scala.inline
    def setAbrEwmaSlowVod(value: Double): Self = this.set("abrEwmaSlowVod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrEwmaSlowVod: Self = this.set("abrEwmaSlowVod", js.undefined)
    @scala.inline
    def setAbrMaxWithRealBitrate(value: Boolean): Self = this.set("abrMaxWithRealBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbrMaxWithRealBitrate: Self = this.set("abrMaxWithRealBitrate", js.undefined)
    @scala.inline
    def setAppendErrorMaxRetry(value: Double): Self = this.set("appendErrorMaxRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendErrorMaxRetry: Self = this.set("appendErrorMaxRetry", js.undefined)
    @scala.inline
    def setAutoStartLoad(value: Boolean): Self = this.set("autoStartLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStartLoad: Self = this.set("autoStartLoad", js.undefined)
    @scala.inline
    def setCapLevelToPlayerSize(value: Boolean): Self = this.set("capLevelToPlayerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapLevelToPlayerSize: Self = this.set("capLevelToPlayerSize", js.undefined)
    @scala.inline
    def setCaptionsTextTrack1Label(value: String): Self = this.set("captionsTextTrack1Label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionsTextTrack1Label: Self = this.set("captionsTextTrack1Label", js.undefined)
    @scala.inline
    def setCaptionsTextTrack1LanguagedCode(value: String): Self = this.set("captionsTextTrack1LanguagedCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionsTextTrack1LanguagedCode: Self = this.set("captionsTextTrack1LanguagedCode", js.undefined)
    @scala.inline
    def setCaptionsTextTrack2Label(value: String): Self = this.set("captionsTextTrack2Label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionsTextTrack2Label: Self = this.set("captionsTextTrack2Label", js.undefined)
    @scala.inline
    def setCaptionsTextTrack2LanguageCode(value: String): Self = this.set("captionsTextTrack2LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionsTextTrack2LanguageCode: Self = this.set("captionsTextTrack2LanguageCode", js.undefined)
    @scala.inline
    def setDebug(value: Boolean | CustomLoggerObject): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultAudioCodec(value: String): Self = this.set("defaultAudioCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultAudioCodec: Self = this.set("defaultAudioCodec", js.undefined)
    @scala.inline
    def setEnableCEA708Captions(value: Boolean): Self = this.set("enableCEA708Captions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCEA708Captions: Self = this.set("enableCEA708Captions", js.undefined)
    @scala.inline
    def setEnableSoftwareAES(value: Boolean): Self = this.set("enableSoftwareAES", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSoftwareAES: Self = this.set("enableSoftwareAES", js.undefined)
    @scala.inline
    def setEnableWebVTT(value: Boolean): Self = this.set("enableWebVTT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWebVTT: Self = this.set("enableWebVTT", js.undefined)
    @scala.inline
    def setEnableWorker(value: Boolean): Self = this.set("enableWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWorker: Self = this.set("enableWorker", js.undefined)
    @scala.inline
    def setFLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = this.set("fLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFLoader: Self = this.set("fLoader", js.undefined)
    @scala.inline
    def setFetchSetup(value: (/* context */ js.Any, /* initParams */ js.Any) => Request): Self = this.set("fetchSetup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFetchSetup: Self = this.set("fetchSetup", js.undefined)
    @scala.inline
    def setForceKeyFrameOnDiscontinuity(value: Boolean): Self = this.set("forceKeyFrameOnDiscontinuity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceKeyFrameOnDiscontinuity: Self = this.set("forceKeyFrameOnDiscontinuity", js.undefined)
    @scala.inline
    def setFragLoadingMaxRetry(value: Double): Self = this.set("fragLoadingMaxRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragLoadingMaxRetry: Self = this.set("fragLoadingMaxRetry", js.undefined)
    @scala.inline
    def setFragLoadingMaxRetryDelay(value: Double): Self = this.set("fragLoadingMaxRetryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragLoadingMaxRetryDelay: Self = this.set("fragLoadingMaxRetryDelay", js.undefined)
    @scala.inline
    def setFragLoadingRetryDelay(value: Double): Self = this.set("fragLoadingRetryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragLoadingRetryDelay: Self = this.set("fragLoadingRetryDelay", js.undefined)
    @scala.inline
    def setFragLoadingTimeOut(value: Double): Self = this.set("fragLoadingTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragLoadingTimeOut: Self = this.set("fragLoadingTimeOut", js.undefined)
    @scala.inline
    def setHighBufferWatchdogPeriod(value: Double): Self = this.set("highBufferWatchdogPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighBufferWatchdogPeriod: Self = this.set("highBufferWatchdogPeriod", js.undefined)
    @scala.inline
    def setInitialLiveManifestSize(value: Double): Self = this.set("initialLiveManifestSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialLiveManifestSize: Self = this.set("initialLiveManifestSize", js.undefined)
    @scala.inline
    def setLevelLoadingMaxRetry(value: Double): Self = this.set("levelLoadingMaxRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelLoadingMaxRetry: Self = this.set("levelLoadingMaxRetry", js.undefined)
    @scala.inline
    def setLevelLoadingMaxRetryTimeout(value: Double): Self = this.set("levelLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelLoadingMaxRetryTimeout: Self = this.set("levelLoadingMaxRetryTimeout", js.undefined)
    @scala.inline
    def setLevelLoadingRetryDelay(value: Double): Self = this.set("levelLoadingRetryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelLoadingRetryDelay: Self = this.set("levelLoadingRetryDelay", js.undefined)
    @scala.inline
    def setLevelLoadingTimeOut(value: Double): Self = this.set("levelLoadingTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelLoadingTimeOut: Self = this.set("levelLoadingTimeOut", js.undefined)
    @scala.inline
    def setLiveBackBufferLength(value: Double): Self = this.set("liveBackBufferLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveBackBufferLength: Self = this.set("liveBackBufferLength", js.undefined)
    @scala.inline
    def setLiveDurationInfinity(value: Boolean): Self = this.set("liveDurationInfinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveDurationInfinity: Self = this.set("liveDurationInfinity", js.undefined)
    @scala.inline
    def setLiveMaxLatencyDuration(value: Double): Self = this.set("liveMaxLatencyDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveMaxLatencyDuration: Self = this.set("liveMaxLatencyDuration", js.undefined)
    @scala.inline
    def setLiveMaxLatencyDurationCount(value: Double): Self = this.set("liveMaxLatencyDurationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveMaxLatencyDurationCount: Self = this.set("liveMaxLatencyDurationCount", js.undefined)
    @scala.inline
    def setLiveSyncDuration(value: Double): Self = this.set("liveSyncDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSyncDuration: Self = this.set("liveSyncDuration", js.undefined)
    @scala.inline
    def setLiveSyncDurationCount(value: Double): Self = this.set("liveSyncDurationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSyncDurationCount: Self = this.set("liveSyncDurationCount", js.undefined)
    @scala.inline
    def setLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLowBufferWatchdogPeriod(value: Double): Self = this.set("lowBufferWatchdogPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowBufferWatchdogPeriod: Self = this.set("lowBufferWatchdogPeriod", js.undefined)
    @scala.inline
    def setManifestLoadingMaxRetry(value: Double): Self = this.set("manifestLoadingMaxRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestLoadingMaxRetry: Self = this.set("manifestLoadingMaxRetry", js.undefined)
    @scala.inline
    def setManifestLoadingMaxRetryTimeout(value: Double): Self = this.set("manifestLoadingMaxRetryTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestLoadingMaxRetryTimeout: Self = this.set("manifestLoadingMaxRetryTimeout", js.undefined)
    @scala.inline
    def setManifestLoadingRetryDelay(value: Double): Self = this.set("manifestLoadingRetryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestLoadingRetryDelay: Self = this.set("manifestLoadingRetryDelay", js.undefined)
    @scala.inline
    def setManifestLoadingTimeOut(value: Double): Self = this.set("manifestLoadingTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestLoadingTimeOut: Self = this.set("manifestLoadingTimeOut", js.undefined)
    @scala.inline
    def setMaxAudioFramesDrift(value: Double): Self = this.set("maxAudioFramesDrift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAudioFramesDrift: Self = this.set("maxAudioFramesDrift", js.undefined)
    @scala.inline
    def setMaxBufferHole(value: Double): Self = this.set("maxBufferHole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBufferHole: Self = this.set("maxBufferHole", js.undefined)
    @scala.inline
    def setMaxBufferLength(value: Double): Self = this.set("maxBufferLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBufferLength: Self = this.set("maxBufferLength", js.undefined)
    @scala.inline
    def setMaxBufferSize(value: Double): Self = this.set("maxBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBufferSize: Self = this.set("maxBufferSize", js.undefined)
    @scala.inline
    def setMaxFragLookUpTolerance(value: Double): Self = this.set("maxFragLookUpTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFragLookUpTolerance: Self = this.set("maxFragLookUpTolerance", js.undefined)
    @scala.inline
    def setMaxLoadingDelay(value: Double): Self = this.set("maxLoadingDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLoadingDelay: Self = this.set("maxLoadingDelay", js.undefined)
    @scala.inline
    def setMaxMaxBufferLength(value: Double): Self = this.set("maxMaxBufferLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMaxBufferLength: Self = this.set("maxMaxBufferLength", js.undefined)
    @scala.inline
    def setMaxSeekHole(value: Double): Self = this.set("maxSeekHole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSeekHole: Self = this.set("maxSeekHole", js.undefined)
    @scala.inline
    def setMaxStarvationDelay(value: Double): Self = this.set("maxStarvationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStarvationDelay: Self = this.set("maxStarvationDelay", js.undefined)
    @scala.inline
    def setMinAutoBitrate(value: Double): Self = this.set("minAutoBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAutoBitrate: Self = this.set("minAutoBitrate", js.undefined)
    @scala.inline
    def setNudgeMaxRetry(value: Double): Self = this.set("nudgeMaxRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNudgeMaxRetry: Self = this.set("nudgeMaxRetry", js.undefined)
    @scala.inline
    def setNudgeOffset(value: Double): Self = this.set("nudgeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNudgeOffset: Self = this.set("nudgeOffset", js.undefined)
    @scala.inline
    def setPLoader(value: Instantiable1[/* config */ LoaderConfig, Loader]): Self = this.set("pLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePLoader: Self = this.set("pLoader", js.undefined)
    @scala.inline
    def setStartFragPrefetch(value: Boolean): Self = this.set("startFragPrefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartFragPrefetch: Self = this.set("startFragPrefetch", js.undefined)
    @scala.inline
    def setStartLevel(value: Double): Self = this.set("startLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLevel: Self = this.set("startLevel", js.undefined)
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    @scala.inline
    def setStretchShortVideoTrack(value: Boolean): Self = this.set("stretchShortVideoTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchShortVideoTrack: Self = this.set("stretchShortVideoTrack", js.undefined)
    @scala.inline
    def setTimelineController(value: TimelineController): Self = this.set("timelineController", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimelineController: Self = this.set("timelineController", js.undefined)
    @scala.inline
    def setXhrSetup(value: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit): Self = this.set("xhrSetup", js.Any.fromFunction2(value))
    @scala.inline
    def deleteXhrSetup: Self = this.set("xhrSetup", js.undefined)
  }
  
}

