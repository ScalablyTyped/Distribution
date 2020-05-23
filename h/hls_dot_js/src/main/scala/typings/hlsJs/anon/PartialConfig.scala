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
    abrBandWidthFactor: js.UndefOr[Double] = js.undefined,
    abrBandWidthUpFactor: js.UndefOr[Double] = js.undefined,
    abrController: AbrController = null,
    abrEwmaDefaultEstimate: js.UndefOr[Double] = js.undefined,
    abrEwmaFastLive: js.UndefOr[Double] = js.undefined,
    abrEwmaFastVod: js.UndefOr[Double] = js.undefined,
    abrEwmaSlowLive: js.UndefOr[Double] = js.undefined,
    abrEwmaSlowVod: js.UndefOr[Double] = js.undefined,
    abrMaxWithRealBitrate: js.UndefOr[Boolean] = js.undefined,
    appendErrorMaxRetry: js.UndefOr[Double] = js.undefined,
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
    fragLoadingMaxRetry: js.UndefOr[Double] = js.undefined,
    fragLoadingMaxRetryDelay: js.UndefOr[Double] = js.undefined,
    fragLoadingRetryDelay: js.UndefOr[Double] = js.undefined,
    fragLoadingTimeOut: js.UndefOr[Double] = js.undefined,
    highBufferWatchdogPeriod: js.UndefOr[Double] = js.undefined,
    initialLiveManifestSize: js.UndefOr[Double] = js.undefined,
    levelLoadingMaxRetry: js.UndefOr[Double] = js.undefined,
    levelLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined,
    levelLoadingRetryDelay: js.UndefOr[Double] = js.undefined,
    levelLoadingTimeOut: js.UndefOr[Double] = js.undefined,
    liveBackBufferLength: js.UndefOr[Double] = js.undefined,
    liveDurationInfinity: js.UndefOr[Boolean] = js.undefined,
    liveMaxLatencyDuration: js.UndefOr[Double] = js.undefined,
    liveMaxLatencyDurationCount: js.UndefOr[Double] = js.undefined,
    liveSyncDuration: js.UndefOr[Double] = js.undefined,
    liveSyncDurationCount: js.UndefOr[Double] = js.undefined,
    loader: Instantiable1[/* config */ LoaderConfig, Loader] = null,
    lowBufferWatchdogPeriod: js.UndefOr[Double] = js.undefined,
    manifestLoadingMaxRetry: js.UndefOr[Double] = js.undefined,
    manifestLoadingMaxRetryTimeout: js.UndefOr[Double] = js.undefined,
    manifestLoadingRetryDelay: js.UndefOr[Double] = js.undefined,
    manifestLoadingTimeOut: js.UndefOr[Double] = js.undefined,
    maxAudioFramesDrift: js.UndefOr[Double] = js.undefined,
    maxBufferHole: js.UndefOr[Double] = js.undefined,
    maxBufferLength: js.UndefOr[Double] = js.undefined,
    maxBufferSize: js.UndefOr[Double] = js.undefined,
    maxFragLookUpTolerance: js.UndefOr[Double] = js.undefined,
    maxLoadingDelay: js.UndefOr[Double] = js.undefined,
    maxMaxBufferLength: js.UndefOr[Double] = js.undefined,
    maxSeekHole: js.UndefOr[Double] = js.undefined,
    maxStarvationDelay: js.UndefOr[Double] = js.undefined,
    minAutoBitrate: js.UndefOr[Double] = js.undefined,
    nudgeMaxRetry: js.UndefOr[Double] = js.undefined,
    nudgeOffset: js.UndefOr[Double] = js.undefined,
    pLoader: Instantiable1[/* config */ LoaderConfig, Loader] = null,
    startFragPrefetch: js.UndefOr[Boolean] = js.undefined,
    startLevel: js.UndefOr[Double] = js.undefined,
    startPosition: js.UndefOr[Double] = js.undefined,
    stretchShortVideoTrack: js.UndefOr[Boolean] = js.undefined,
    timelineController: TimelineController = null,
    xhrSetup: (/* xhr */ XMLHttpRequest, /* url */ String) => Unit = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abrBandWidthFactor)) __obj.updateDynamic("abrBandWidthFactor")(abrBandWidthFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrBandWidthUpFactor)) __obj.updateDynamic("abrBandWidthUpFactor")(abrBandWidthUpFactor.get.asInstanceOf[js.Any])
    if (abrController != null) __obj.updateDynamic("abrController")(abrController.asInstanceOf[js.Any])
    if (!js.isUndefined(abrEwmaDefaultEstimate)) __obj.updateDynamic("abrEwmaDefaultEstimate")(abrEwmaDefaultEstimate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrEwmaFastLive)) __obj.updateDynamic("abrEwmaFastLive")(abrEwmaFastLive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrEwmaFastVod)) __obj.updateDynamic("abrEwmaFastVod")(abrEwmaFastVod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrEwmaSlowLive)) __obj.updateDynamic("abrEwmaSlowLive")(abrEwmaSlowLive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrEwmaSlowVod)) __obj.updateDynamic("abrEwmaSlowVod")(abrEwmaSlowVod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(abrMaxWithRealBitrate)) __obj.updateDynamic("abrMaxWithRealBitrate")(abrMaxWithRealBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appendErrorMaxRetry)) __obj.updateDynamic("appendErrorMaxRetry")(appendErrorMaxRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStartLoad)) __obj.updateDynamic("autoStartLoad")(autoStartLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capLevelToPlayerSize)) __obj.updateDynamic("capLevelToPlayerSize")(capLevelToPlayerSize.get.asInstanceOf[js.Any])
    if (captionsTextTrack1Label != null) __obj.updateDynamic("captionsTextTrack1Label")(captionsTextTrack1Label.asInstanceOf[js.Any])
    if (captionsTextTrack1LanguagedCode != null) __obj.updateDynamic("captionsTextTrack1LanguagedCode")(captionsTextTrack1LanguagedCode.asInstanceOf[js.Any])
    if (captionsTextTrack2Label != null) __obj.updateDynamic("captionsTextTrack2Label")(captionsTextTrack2Label.asInstanceOf[js.Any])
    if (captionsTextTrack2LanguageCode != null) __obj.updateDynamic("captionsTextTrack2LanguageCode")(captionsTextTrack2LanguageCode.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaultAudioCodec != null) __obj.updateDynamic("defaultAudioCodec")(defaultAudioCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCEA708Captions)) __obj.updateDynamic("enableCEA708Captions")(enableCEA708Captions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSoftwareAES)) __obj.updateDynamic("enableSoftwareAES")(enableSoftwareAES.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWebVTT)) __obj.updateDynamic("enableWebVTT")(enableWebVTT.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWorker)) __obj.updateDynamic("enableWorker")(enableWorker.get.asInstanceOf[js.Any])
    if (fLoader != null) __obj.updateDynamic("fLoader")(fLoader.asInstanceOf[js.Any])
    if (fetchSetup != null) __obj.updateDynamic("fetchSetup")(js.Any.fromFunction2(fetchSetup))
    if (!js.isUndefined(forceKeyFrameOnDiscontinuity)) __obj.updateDynamic("forceKeyFrameOnDiscontinuity")(forceKeyFrameOnDiscontinuity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragLoadingMaxRetry)) __obj.updateDynamic("fragLoadingMaxRetry")(fragLoadingMaxRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragLoadingMaxRetryDelay)) __obj.updateDynamic("fragLoadingMaxRetryDelay")(fragLoadingMaxRetryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragLoadingRetryDelay)) __obj.updateDynamic("fragLoadingRetryDelay")(fragLoadingRetryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragLoadingTimeOut)) __obj.updateDynamic("fragLoadingTimeOut")(fragLoadingTimeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highBufferWatchdogPeriod)) __obj.updateDynamic("highBufferWatchdogPeriod")(highBufferWatchdogPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialLiveManifestSize)) __obj.updateDynamic("initialLiveManifestSize")(initialLiveManifestSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(levelLoadingMaxRetry)) __obj.updateDynamic("levelLoadingMaxRetry")(levelLoadingMaxRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(levelLoadingMaxRetryTimeout)) __obj.updateDynamic("levelLoadingMaxRetryTimeout")(levelLoadingMaxRetryTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(levelLoadingRetryDelay)) __obj.updateDynamic("levelLoadingRetryDelay")(levelLoadingRetryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(levelLoadingTimeOut)) __obj.updateDynamic("levelLoadingTimeOut")(levelLoadingTimeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveBackBufferLength)) __obj.updateDynamic("liveBackBufferLength")(liveBackBufferLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveDurationInfinity)) __obj.updateDynamic("liveDurationInfinity")(liveDurationInfinity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveMaxLatencyDuration)) __obj.updateDynamic("liveMaxLatencyDuration")(liveMaxLatencyDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveMaxLatencyDurationCount)) __obj.updateDynamic("liveMaxLatencyDurationCount")(liveMaxLatencyDurationCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveSyncDuration)) __obj.updateDynamic("liveSyncDuration")(liveSyncDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(liveSyncDurationCount)) __obj.updateDynamic("liveSyncDurationCount")(liveSyncDurationCount.get.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(lowBufferWatchdogPeriod)) __obj.updateDynamic("lowBufferWatchdogPeriod")(lowBufferWatchdogPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestLoadingMaxRetry)) __obj.updateDynamic("manifestLoadingMaxRetry")(manifestLoadingMaxRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestLoadingMaxRetryTimeout)) __obj.updateDynamic("manifestLoadingMaxRetryTimeout")(manifestLoadingMaxRetryTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestLoadingRetryDelay)) __obj.updateDynamic("manifestLoadingRetryDelay")(manifestLoadingRetryDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestLoadingTimeOut)) __obj.updateDynamic("manifestLoadingTimeOut")(manifestLoadingTimeOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAudioFramesDrift)) __obj.updateDynamic("maxAudioFramesDrift")(maxAudioFramesDrift.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferHole)) __obj.updateDynamic("maxBufferHole")(maxBufferHole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferLength)) __obj.updateDynamic("maxBufferLength")(maxBufferLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferSize)) __obj.updateDynamic("maxBufferSize")(maxBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFragLookUpTolerance)) __obj.updateDynamic("maxFragLookUpTolerance")(maxFragLookUpTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLoadingDelay)) __obj.updateDynamic("maxLoadingDelay")(maxLoadingDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMaxBufferLength)) __obj.updateDynamic("maxMaxBufferLength")(maxMaxBufferLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSeekHole)) __obj.updateDynamic("maxSeekHole")(maxSeekHole.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxStarvationDelay)) __obj.updateDynamic("maxStarvationDelay")(maxStarvationDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minAutoBitrate)) __obj.updateDynamic("minAutoBitrate")(minAutoBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeMaxRetry)) __obj.updateDynamic("nudgeMaxRetry")(nudgeMaxRetry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nudgeOffset)) __obj.updateDynamic("nudgeOffset")(nudgeOffset.get.asInstanceOf[js.Any])
    if (pLoader != null) __obj.updateDynamic("pLoader")(pLoader.asInstanceOf[js.Any])
    if (!js.isUndefined(startFragPrefetch)) __obj.updateDynamic("startFragPrefetch")(startFragPrefetch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startLevel)) __obj.updateDynamic("startLevel")(startLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startPosition)) __obj.updateDynamic("startPosition")(startPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchShortVideoTrack)) __obj.updateDynamic("stretchShortVideoTrack")(stretchShortVideoTrack.get.asInstanceOf[js.Any])
    if (timelineController != null) __obj.updateDynamic("timelineController")(timelineController.asInstanceOf[js.Any])
    if (xhrSetup != null) __obj.updateDynamic("xhrSetup")(js.Any.fromFunction2(xhrSetup))
    __obj.asInstanceOf[PartialConfig]
  }
}

