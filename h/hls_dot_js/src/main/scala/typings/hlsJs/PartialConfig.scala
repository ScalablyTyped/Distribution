package typings.hlsJs

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
trait PartialConfig extends js.Object {
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
  def apply(
    abrBandWidthFactor: Int | Double = null,
    abrBandWidthUpFactor: Int | Double = null,
    abrController: AbrController = null,
    abrEwmaDefaultEstimate: Int | Double = null,
    abrEwmaFastLive: Int | Double = null,
    abrEwmaFastVod: Int | Double = null,
    abrEwmaSlowLive: Int | Double = null,
    abrEwmaSlowVod: Int | Double = null,
    abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.undefined,
    appendErrorMaxRetry: Int | Double = null,
    autoStartLoad: js.UndefOr[Boolean] = js.undefined,
    capLevelToPlayerSize: js.UndefOr[Boolean] = js.undefined,
    captionsTextTrack1Label: String = null,
    captionsTextTrack1LanguagedCode: String = null,
    captionsTextTrack2Label: String = null,
    captionsTextTrack2LanguageCode: String = null,
    debug: Boolean | CustomLoggerObject = null,
    defaultAudioCodec: String = null,
    enableCEA708Captions: js.UndefOr[Boolean] = js.undefined,
    enableSoftwareAES: js.UndefOr[Boolean] = js.undefined,
    enableWebVTT: js.UndefOr[Boolean] = js.undefined,
    enableWorker: js.UndefOr[Boolean] = js.undefined,
    fLoader: Instantiable1[/* config */ LoaderConfig, Loader] = null,
    fetchSetup: (/* context */ js.Any, /* initParams */ js.Any) => Request = null,
    forceKeyFrameOnDiscontinuity: js.UndefOr[Boolean] = js.undefined,
    fragLoadingMaxRetry: Int | Double = null,
    fragLoadingMaxRetryDelay: Int | Double = null,
    fragLoadingRetryDelay: Int | Double = null,
    fragLoadingTimeOut: Int | Double = null,
    highBufferWatchdogPeriod: Int | Double = null,
    initialLiveManifestSize: Int | Double = null,
    levelLoadingMaxRetry: Int | Double = null,
    levelLoadingMaxRetryTimeout: Int | Double = null,
    levelLoadingRetryDelay: Int | Double = null,
    levelLoadingTimeOut: Int | Double = null,
    liveBackBufferLength: Int | Double = null,
    liveDurationInfinity: js.UndefOr[Boolean] = js.undefined,
    liveMaxLatencyDuration: Int | Double = null,
    liveMaxLatencyDurationCount: Int | Double = null,
    liveSyncDuration: Int | Double = null,
    liveSyncDurationCount: Int | Double = null,
    loader: Instantiable1[/* config */ LoaderConfig, Loader] = null,
    lowBufferWatchdogPeriod: Int | Double = null,
    manifestLoadingMaxRetry: Int | Double = null,
    manifestLoadingMaxRetryTimeout: Int | Double = null,
    manifestLoadingRetryDelay: Int | Double = null,
    manifestLoadingTimeOut: Int | Double = null,
    maxAudioFramesDrift: Int | Double = null,
    maxBufferHole: Int | Double = null,
    maxBufferLength: Int | Double = null,
    maxBufferSize: Int | Double = null,
    maxFragLookUpTolerance: Int | Double = null,
    maxLoadingDelay: Int | Double = null,
    maxMaxBufferLength: Int | Double = null,
    maxSeekHole: Int | Double = null,
    maxStarvationDelay: Int | Double = null,
    minAutoBitrate: Int | Double = null,
    nudgeMaxRetry: Int | Double = null,
    nudgeOffset: Int | Double = null,
    pLoader: Instantiable1[/* config */ LoaderConfig, Loader] = null,
    startFragPrefetch: js.UndefOr[Boolean] = js.undefined,
    startLevel: Int | Double = null,
    startPosition: Int | Double = null,
    stretchShortVideoTrack: js.UndefOr[Boolean] = js.undefined,
    timelineController: TimelineController = null,
    xhrSetup: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (abrBandWidthFactor != null) __obj.updateDynamic("abrBandWidthFactor")(abrBandWidthFactor.asInstanceOf[js.Any])
    if (abrBandWidthUpFactor != null) __obj.updateDynamic("abrBandWidthUpFactor")(abrBandWidthUpFactor.asInstanceOf[js.Any])
    if (abrController != null) __obj.updateDynamic("abrController")(abrController.asInstanceOf[js.Any])
    if (abrEwmaDefaultEstimate != null) __obj.updateDynamic("abrEwmaDefaultEstimate")(abrEwmaDefaultEstimate.asInstanceOf[js.Any])
    if (abrEwmaFastLive != null) __obj.updateDynamic("abrEwmaFastLive")(abrEwmaFastLive.asInstanceOf[js.Any])
    if (abrEwmaFastVod != null) __obj.updateDynamic("abrEwmaFastVod")(abrEwmaFastVod.asInstanceOf[js.Any])
    if (abrEwmaSlowLive != null) __obj.updateDynamic("abrEwmaSlowLive")(abrEwmaSlowLive.asInstanceOf[js.Any])
    if (abrEwmaSlowVod != null) __obj.updateDynamic("abrEwmaSlowVod")(abrEwmaSlowVod.asInstanceOf[js.Any])
    if (!js.isUndefined(abrMaxWithRealBitrate)) __obj.updateDynamic("abrMaxWithRealBitrate")(abrMaxWithRealBitrate.asInstanceOf[js.Any])
    if (appendErrorMaxRetry != null) __obj.updateDynamic("appendErrorMaxRetry")(appendErrorMaxRetry.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStartLoad)) __obj.updateDynamic("autoStartLoad")(autoStartLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(capLevelToPlayerSize)) __obj.updateDynamic("capLevelToPlayerSize")(capLevelToPlayerSize.asInstanceOf[js.Any])
    if (captionsTextTrack1Label != null) __obj.updateDynamic("captionsTextTrack1Label")(captionsTextTrack1Label.asInstanceOf[js.Any])
    if (captionsTextTrack1LanguagedCode != null) __obj.updateDynamic("captionsTextTrack1LanguagedCode")(captionsTextTrack1LanguagedCode.asInstanceOf[js.Any])
    if (captionsTextTrack2Label != null) __obj.updateDynamic("captionsTextTrack2Label")(captionsTextTrack2Label.asInstanceOf[js.Any])
    if (captionsTextTrack2LanguageCode != null) __obj.updateDynamic("captionsTextTrack2LanguageCode")(captionsTextTrack2LanguageCode.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaultAudioCodec != null) __obj.updateDynamic("defaultAudioCodec")(defaultAudioCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCEA708Captions)) __obj.updateDynamic("enableCEA708Captions")(enableCEA708Captions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSoftwareAES)) __obj.updateDynamic("enableSoftwareAES")(enableSoftwareAES.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWebVTT)) __obj.updateDynamic("enableWebVTT")(enableWebVTT.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWorker)) __obj.updateDynamic("enableWorker")(enableWorker.asInstanceOf[js.Any])
    if (fLoader != null) __obj.updateDynamic("fLoader")(fLoader.asInstanceOf[js.Any])
    if (fetchSetup != null) __obj.updateDynamic("fetchSetup")(js.Any.fromFunction2(fetchSetup))
    if (!js.isUndefined(forceKeyFrameOnDiscontinuity)) __obj.updateDynamic("forceKeyFrameOnDiscontinuity")(forceKeyFrameOnDiscontinuity.asInstanceOf[js.Any])
    if (fragLoadingMaxRetry != null) __obj.updateDynamic("fragLoadingMaxRetry")(fragLoadingMaxRetry.asInstanceOf[js.Any])
    if (fragLoadingMaxRetryDelay != null) __obj.updateDynamic("fragLoadingMaxRetryDelay")(fragLoadingMaxRetryDelay.asInstanceOf[js.Any])
    if (fragLoadingRetryDelay != null) __obj.updateDynamic("fragLoadingRetryDelay")(fragLoadingRetryDelay.asInstanceOf[js.Any])
    if (fragLoadingTimeOut != null) __obj.updateDynamic("fragLoadingTimeOut")(fragLoadingTimeOut.asInstanceOf[js.Any])
    if (highBufferWatchdogPeriod != null) __obj.updateDynamic("highBufferWatchdogPeriod")(highBufferWatchdogPeriod.asInstanceOf[js.Any])
    if (initialLiveManifestSize != null) __obj.updateDynamic("initialLiveManifestSize")(initialLiveManifestSize.asInstanceOf[js.Any])
    if (levelLoadingMaxRetry != null) __obj.updateDynamic("levelLoadingMaxRetry")(levelLoadingMaxRetry.asInstanceOf[js.Any])
    if (levelLoadingMaxRetryTimeout != null) __obj.updateDynamic("levelLoadingMaxRetryTimeout")(levelLoadingMaxRetryTimeout.asInstanceOf[js.Any])
    if (levelLoadingRetryDelay != null) __obj.updateDynamic("levelLoadingRetryDelay")(levelLoadingRetryDelay.asInstanceOf[js.Any])
    if (levelLoadingTimeOut != null) __obj.updateDynamic("levelLoadingTimeOut")(levelLoadingTimeOut.asInstanceOf[js.Any])
    if (liveBackBufferLength != null) __obj.updateDynamic("liveBackBufferLength")(liveBackBufferLength.asInstanceOf[js.Any])
    if (!js.isUndefined(liveDurationInfinity)) __obj.updateDynamic("liveDurationInfinity")(liveDurationInfinity.asInstanceOf[js.Any])
    if (liveMaxLatencyDuration != null) __obj.updateDynamic("liveMaxLatencyDuration")(liveMaxLatencyDuration.asInstanceOf[js.Any])
    if (liveMaxLatencyDurationCount != null) __obj.updateDynamic("liveMaxLatencyDurationCount")(liveMaxLatencyDurationCount.asInstanceOf[js.Any])
    if (liveSyncDuration != null) __obj.updateDynamic("liveSyncDuration")(liveSyncDuration.asInstanceOf[js.Any])
    if (liveSyncDurationCount != null) __obj.updateDynamic("liveSyncDurationCount")(liveSyncDurationCount.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (lowBufferWatchdogPeriod != null) __obj.updateDynamic("lowBufferWatchdogPeriod")(lowBufferWatchdogPeriod.asInstanceOf[js.Any])
    if (manifestLoadingMaxRetry != null) __obj.updateDynamic("manifestLoadingMaxRetry")(manifestLoadingMaxRetry.asInstanceOf[js.Any])
    if (manifestLoadingMaxRetryTimeout != null) __obj.updateDynamic("manifestLoadingMaxRetryTimeout")(manifestLoadingMaxRetryTimeout.asInstanceOf[js.Any])
    if (manifestLoadingRetryDelay != null) __obj.updateDynamic("manifestLoadingRetryDelay")(manifestLoadingRetryDelay.asInstanceOf[js.Any])
    if (manifestLoadingTimeOut != null) __obj.updateDynamic("manifestLoadingTimeOut")(manifestLoadingTimeOut.asInstanceOf[js.Any])
    if (maxAudioFramesDrift != null) __obj.updateDynamic("maxAudioFramesDrift")(maxAudioFramesDrift.asInstanceOf[js.Any])
    if (maxBufferHole != null) __obj.updateDynamic("maxBufferHole")(maxBufferHole.asInstanceOf[js.Any])
    if (maxBufferLength != null) __obj.updateDynamic("maxBufferLength")(maxBufferLength.asInstanceOf[js.Any])
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    if (maxFragLookUpTolerance != null) __obj.updateDynamic("maxFragLookUpTolerance")(maxFragLookUpTolerance.asInstanceOf[js.Any])
    if (maxLoadingDelay != null) __obj.updateDynamic("maxLoadingDelay")(maxLoadingDelay.asInstanceOf[js.Any])
    if (maxMaxBufferLength != null) __obj.updateDynamic("maxMaxBufferLength")(maxMaxBufferLength.asInstanceOf[js.Any])
    if (maxSeekHole != null) __obj.updateDynamic("maxSeekHole")(maxSeekHole.asInstanceOf[js.Any])
    if (maxStarvationDelay != null) __obj.updateDynamic("maxStarvationDelay")(maxStarvationDelay.asInstanceOf[js.Any])
    if (minAutoBitrate != null) __obj.updateDynamic("minAutoBitrate")(minAutoBitrate.asInstanceOf[js.Any])
    if (nudgeMaxRetry != null) __obj.updateDynamic("nudgeMaxRetry")(nudgeMaxRetry.asInstanceOf[js.Any])
    if (nudgeOffset != null) __obj.updateDynamic("nudgeOffset")(nudgeOffset.asInstanceOf[js.Any])
    if (pLoader != null) __obj.updateDynamic("pLoader")(pLoader.asInstanceOf[js.Any])
    if (!js.isUndefined(startFragPrefetch)) __obj.updateDynamic("startFragPrefetch")(startFragPrefetch.asInstanceOf[js.Any])
    if (startLevel != null) __obj.updateDynamic("startLevel")(startLevel.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchShortVideoTrack)) __obj.updateDynamic("stretchShortVideoTrack")(stretchShortVideoTrack.asInstanceOf[js.Any])
    if (timelineController != null) __obj.updateDynamic("timelineController")(timelineController.asInstanceOf[js.Any])
    if (xhrSetup != null) __obj.updateDynamic("xhrSetup")(js.Any.fromFunction2(xhrSetup))
    __obj.asInstanceOf[PartialConfig]
  }
}

