package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * (default: 0.8)
    * Scale factor to be applied against measured bandwidth average, to determine whether we can stay on current or lower quality level.
    * If abrBandWidthFactor * bandwidth average < level.bitrate then ABR can switch to that level providing that it is equal or less than current level.
    */
  var abrBandWidthFactor: scala.Double
  /**
    * (default: 0.7)
    * Scale factor to be applied against measured bandwidth average, to determine whether we can switch up to a higher quality level.
    * If abrBandWidthUpFactor * bandwidth average < level.bitrate then ABR can switch up to that quality level.
    */
  var abrBandWidthUpFactor: scala.Double
  /**
    * (default: internal ABR controller)
    * Customized Adaptive Bitrate Streaming Controller.
    * Parameter should be a class providing 2 getters, 2 setters and a destroy() method:
    * get/set nextAutoLevel: return next auto-quality level/force next auto-quality level that should be returned (currently used for emergency switch down)
    * get/set autoLevelCapping: capping/max level value that could be used by ABR Controller
    * destroy(): should clean-up all used resources
    */
  var abrController: AbrController
  /**
    * (default: 500000)
    * Default bandwidth estimate in bits/second prior to collecting fragment bandwidth samples.
    * parameter should be a float
    */
  var abrEwmaDefaultEstimate: scala.Double
  /**
    * (default: 5.0)
    * Fast bitrate Exponential moving average half-life, used to compute average bitrate for Live streams.
    * Half of the estimate is based on the last abrEwmaFastLive seconds of sample history. Each of the sample is weighted by the fragment loading duration.
    * parameter should be a float greater than 0
    */
  var abrEwmaFastLive: scala.Double
  /**
    * (default: 4.0)
    * Fast bitrate Exponential moving average half-life, used to compute average bitrate for VoD streams.
    * Half of the estimate is based on the last abrEwmaFastVoD seconds of sample history. Each of the sample is weighted by the fragment loading duration.
    * parameter should be a float greater than 0
    */
  var abrEwmaFastVod: scala.Double
  /**
    * (default: 9.0)
    * Slow bitrate Exponential moving average half-life, used to compute average bitrate for Live streams.
    * Half of the estimate is based on the last abrEwmaSlowLive seconds of sample history. Each of the sample is weighted by the fragment loading duration.
    * parameter should be a float greater than abrEwmaFastLive
    */
  var abrEwmaSlowLive: scala.Double
  /**
    * (default: 15.0)
    * Slow bitrate Exponential moving average half-life, used to compute average bitrate for VoD streams.
    * Half of the estimate is based on the last abrEwmaSlowVoD seconds of sample history. Each of the sample is weighted by the fragment loading duration.
    * parameter should be a float greater than abrEwmaFastVoD
    */
  var abrEwmaSlowVod: scala.Double
  /**
    * (default: false)
    * max bitrate used in ABR by avg measured bitrate i.e. if bitrate signaled in variant manifest for a given level is 2Mb/s but average bitrate measured on this level is 2.5Mb/s,
    * then if config value is set to true, ABR will use 2.5 Mb/s for this quality level.
    */
  var abrMaxWithRealBitrate: scala.Boolean
  /**
    * (default: 3)
    * Max number of sourceBuffer.appendBuffer() retry upon error. Such error could happen in loop with UHD streams, when internal buffer is full. (Quota Exceeding Error will be triggered).
    * In that case we need to wait for the browser to evict some data before being able to append buffer correctly.
    */
  var appendErrorMaxRetry: scala.Double
  /**
    * (default: true)
    * if set to true, start level playlist and first fragments will be loaded automatically, after triggering of Hls.Events.MANIFEST_PARSED event
    * if set to false, an explicit API call (hls.startLoad(startPosition=-1)) will be needed to start quality level/fragment loading.
    */
  var autoStartLoad: scala.Boolean
  /**
    * (default: false)
    * if set to true, the adaptive algorithm with limit levels usable in auto-quality by the HTML video element dimensions (width and height)
    * if set to false, levels will not be limited. All available levels could be used in auto-quality mode taking only bandwidth into consideration.
    */
  var capLevelToPlayerSize: scala.Boolean
  /**
    * (default: English)
    * Label for the text track generated for CEA-708 captions track 1. This is how it will appear in the browser's native menu for subtitles and captions.
    */
  var captionsTextTrack1Label: java.lang.String
  /**
    * (default: en)
    * RFC 3066 language code for the text track generated for CEA-708 captions track 1.
    */
  var captionsTextTrack1LanguagedCode: java.lang.String
  /**
    * (default: Spanish)
    * Label for the text track generated for CEA-708 captions track 2. This is how it will appear in the browser's native menu for subtitles and captions.
    */
  var captionsTextTrack2Label: java.lang.String
  /**
    * (default: es)
    * RFC 3066 language code for the text track generated for CEA-708 captions track 2.
    */
  var captionsTextTrack2LanguageCode: java.lang.String
  /**
    * (default: false)
    * setting config.debug = true; will turn on debug logs on JS console.
    * a logger object could also be provided for custom logging: config.debug = customLogger;
    */
  var debug: scala.Boolean | CustomLoggerObject
  /**
    * (default: undefined)
    * if audio codec is not signaled in variant manifest, or if only a stream manifest is provided, hls.js tries to guess audio codec by parsing audio sampling rate in ADTS header.
    * If sampling rate is less or equal than 22050 Hz, then hls.js assumes it is HE-AAC, otherwise it assumes it is AAC-LC.
    * This could result in bad guess, leading to audio decode error, ending up in media error.
    * It is possible to hint default audiocodec to hls.js by configuring this value as below:
    * mp4a.40.2 (AAC-LC) or
    * mp4a.40.5 (HE-AAC) or
    * undefined (guess based on sampling rate)
    */
  var defaultAudioCodec: java.lang.String
  /**
    * (default: true)
    * whether or not to enable CEA-708 captions
    */
  var enableCEA708Captions: scala.Boolean
  /**
    * (default: true)
    * Enable to use JavaScript version AES decryption for fallback of WebCrypto API.
    */
  var enableSoftwareAES: scala.Boolean
  /**
    * (default: true)
    * Whether or not to enable WebVTT captions on HLS
    */
  var enableWebVTT: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (default: true)
    * Enable WebWorker (if available on browser) for TS demuxing/MP4 remuxing, to improve performance and avoid lag/frame drops.
    */
  var enableWorker: scala.Boolean
  /**
    * (default: undefined)
    * This enables the manipulation of the fragment loader.
    * Note: This will overwrite the default loader, as well as your own loader function.
    */
  var fLoader: js.UndefOr[org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader]] = js.undefined
  /**
    * (default: undefined)
    * Fetch customization callback for Fetch based loader.
    * Parameter should be a function with two arguments (context and Request Init Params).
    * If fetchSetup is specified and Fetch loader is used, fetchSetup will be triggered to instantiate Request Object. This allows user to easily tweak Fetch loader.
    */
  var fetchSetup: js.UndefOr[js.Function2[/* context */ js.Any, /* initParams */ js.Any, stdLib.Request]] = js.undefined
  /**
    * (default: true)
    * Whether or not to force having a key frame in the first AVC sample after a discontinuity.
    * If set to true, after a discontinuity, the AVC samples without any key frame will be dropped until finding one that contains a key frame.
    * If set to false, all AVC samples will be kept, which can help avoid holes in the stream.
    * Setting this parameter to false can also generate decoding weirdness when switching level or seeking.
    */
  var forceKeyFrameOnDiscontinuity: scala.Boolean
  /**
    * (default: 3)
    * Max number of load retries.
    */
  var fragLoadingMaxRetry: scala.Double
  /**
    * (default: 64000 ms)
    * Maximum frag/manifest/key retry timeout (in milliseconds) in case I/O errors are met.
    */
  var fragLoadingMaxRetryDelay: scala.Double
  /**
    * (default: 1000 ms)
    * Initial delay between XMLHttpRequest error and first load retry (in ms).
    * Any I/O error will trigger retries every 500ms,1s,2s,4s,8s, ...
    * capped to fragLoadingMaxRetryTimeout / manifestLoadingMaxRetryTimeout / levelLoadingMaxRetryTimeout value (exponential backoff).
    * Prefetch start fragment although media not attached.
    */
  var fragLoadingRetryDelay: scala.Double
  /**
    * (default: 60000ms for fragment)
    * URL Loader timeout. A timeout callback will be triggered if loading duration exceeds this timeout. no further action will be done : the load operation will not be cancelled/aborted.
    * It is up to the application to catch this event and treat it as needed.
    */
  var fragLoadingTimeOut: scala.Double
  /**
    * (default: 3s)
    * if media element is expected to play and if currentTime has not moved for more than highBufferWatchdogPeriod and if there are more than maxBufferHole seconds buffered upfront,
    * hls.js will try to nudge playhead to recover playback
    */
  var highBufferWatchdogPeriod: scala.Double
  /**
    * (default: 1)
    * number of segments needed to start a playback of Live stream.
    */
  var initialLiveManifestSize: scala.Double
  /**
    * (default: 3)
    * Max number of load retries.
    */
  var levelLoadingMaxRetry: scala.Double
  /**
    * (default: 64000 ms)
    * Maximum frag/manifest/key retry timeout (in milliseconds) in case I/O errors are met.
    */
  var levelLoadingMaxRetryTimeout: scala.Double
  /**
    * (default: 1000 ms)
    * Initial delay between XMLHttpRequest error and first load retry (in ms).
    * Any I/O error will trigger retries every 500ms,1s,2s,4s,8s, ...
    * capped to fragLoadingMaxRetryTimeout / manifestLoadingMaxRetryTimeout / levelLoadingMaxRetryTimeout value (exponential backoff).
    * Prefetch start fragment although media not attached.
    */
  var levelLoadingRetryDelay: scala.Double
  /**
    * (default: 60000ms for fragment)
    * URL Loader timeout. A timeout callback will be triggered if loading duration exceeds this timeout. no further action will be done : the load operation will not be cancelled/aborted.
    * It is up to the application to catch this event and treat it as needed.
    */
  var levelLoadingTimeOut: scala.Double
  /**
    * (default: Infinity)
    * Sets the maximum length of the buffer, in seconds, to keep during a live stream. Any video
    * buffered past this time will be evicted. Infinity means no restriction on back buffer length;
    * 0 keeps the minimum amount. The minimum amount is equal to the target duration of a segment
    * to ensure that current playback is not interrupted.
    */
  var liveBackBufferLength: scala.Double
  /**
    * (default: false)
    * Override current Media Source duration to Infinity for a live broadcast. Useful, if you are building a player which relies
    * on native UI capabilities in modern browsers. If you want to have a native Live UI in environments like iOS Safari, Safari,
    * Android Google Chrome, etc. set this value to true.
    */
  var liveDurationInfinity: scala.Boolean
  /**
    * (default: undefined)
    * Alternative parameter to liveMaxLatencyDurationCount, expressed in seconds vs number of segments.
    * If defined in the configuration object, liveMaxLatencyDuration will take precedence over the default liveMaxLatencyDurationCount.
    * If set, this value must be stricly superior to liveSyncDuration which must be defined as well.
    * You can't define this parameter and either liveSyncDurationCount or liveMaxLatencyDurationCount in your configuration object at the same time.
    * A value too close from liveSyncDuration is likely to cause playback stalls.
    */
  var liveMaxLatencyDuration: scala.Double
  /**
    * (default: Infinity)
    * maximum delay allowed from edge of live, expressed in multiple of EXT-X-TARGETDURATION.
    * If set to 10, the player will seek back to liveSyncDurationCount whenever the next fragment to be loaded is older than N-10, N being the last fragment of the live playlist.
    * If set, this value must be stricly superior to liveSyncDurationCount a value too close from liveSyncDurationCount is likely to cause playback stalls.
    */
  var liveMaxLatencyDurationCount: scala.Double
  /**
    * (default: undefined)
    * Alternative parameter to liveSyncDurationCount, expressed in seconds vs number of segments.
    * If defined in the configuration object, liveSyncDuration will take precedence over the default liveSyncDurationCount.
    * You can't define this parameter and either liveSyncDurationCount or liveMaxLatencyDurationCount in your configuration object at the same time.
    * A value too low (inferior to ~3 segment durations) is likely to cause playback stalls.
    */
  var liveSyncDuration: scala.Double
  /**
    * (default: 3)
    * edge of live delay, expressed in multiple of EXT-X-TARGETDURATION. if set to 3, playback will start from fragment N-3, N being the last fragment of the live playlist.
    * Decreasing this value is likely to cause playback stalls.
    */
  var liveSyncDurationCount: scala.Double
  /**
    * (default: standard XMLHttpRequest-based URL loader)
    * Override standard URL loader by a custom one. Could be useful for P2P or stubbing (testing).
    * Use this, if you want to overwrite both the fragment and the playlist loader.
    * Note: If fLoader or pLoader are used, they overwrite loader!
    */
  var loader: org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader]
  /**
    * (default: 0.5s)
    * media element is expected to play and if currentTime has not moved for more than lowBufferWatchdogPeriod and if there are less than maxBufferHole seconds buffered upfront,
    * hls.js will try to nudge playhead to recover playback
    */
  var lowBufferWatchdogPeriod: scala.Double
  /**
    * (default: 3)
    * Max number of load retries.
    */
  var manifestLoadingMaxRetry: scala.Double
  /**
    * (default: 64000 ms)
    * Maximum frag/manifest/key retry timeout (in milliseconds) in case I/O errors are met.
    */
  var manifestLoadingMaxRetryTimeout: scala.Double
  /**
    * (default: 1000 ms)
    * Initial delay between XMLHttpRequest error and first load retry (in ms).
    * Any I/O error will trigger retries every 500ms,1s,2s,4s,8s, ...
    * capped to fragLoadingMaxRetryTimeout / manifestLoadingMaxRetryTimeout / levelLoadingMaxRetryTimeout value (exponential backoff).
    * Prefetch start fragment although media not attached.
    */
  var manifestLoadingRetryDelay: scala.Double
  /**
    * (default: 10000ms for level and manifest)
    * URL Loader timeout. A timeout callback will be triggered if loading duration exceeds this timeout. no further action will be done : the load operation will not be cancelled/aborted.
    * It is up to the application to catch this event and treat it as needed.
    */
  var manifestLoadingTimeOut: scala.Double
  /**
    * (default: 1)
    * Browsers are really strict about audio frames timings. They usually play audio frames one after the other, regardless of
    * the timestamps advertised in the fmp4. If audio timestamps are not consistent (consecutive audio frames too close or too far
    * from each other), audio will easily drift. hls.js is restamping audio frames so that the distance between consecutive audio
    * frame remains constant. If the distance is larger than the max allowed drift, hls.js will either
    *     * drop the next audio frame if distance is too small (if next audio frame timestamp is smaller than expected
    *       timestamp - max allowed drifter)
    *     * insert silent frames if distance is too big (next audio frame timestamp is bigger than expected
    *       timestamp + max allowed drift)
    * Parameter should be an integer representing the max number of audio frames allowed to drifter. Keep in mind that one
    * audio frame is 1024 audio samples (if using AAC), at 44.1 kHz, it gives 1024/44100 = 23ms.
    */
  var maxAudioFramesDrift: scala.Double
  /**
    * (default: 0.5 seconds)
    * 'Maximum' inter-fragment buffer hole tolerance that hls.js can cope with when searching for the next fragment to load. When switching between quality level,
    * fragments might not be perfectly aligned.
    * This could result in small overlapping or hole in media buffer. This tolerance factor helps cope with this.
    */
  var maxBufferHole: scala.Double
  /**
    * (default: 30 seconds)
    * Maximum buffer length in seconds. If buffer length is/become less than this value, a new fragment will be loaded.
    * This is the guaranteed buffer length hls.js will try to reach, regardless of maxBufferSize.
    */
  var maxBufferLength: scala.Double
  /**
    * (default: 60 MB)
    * 'Minimum' maximum buffer size in bytes. If buffer size upfront is bigger than this value, no fragment will be loaded
    */
  var maxBufferSize: scala.Double
  /**
    * (default 4s)
    *
    * max video loading delay used in automatic start level selection : in that mode ABR controller will ensure that video loading time (ie
    * the time to fetch the first fragment at lowest quality level + the time to fetch the fragment at the appropriate quality level is less
    * than maxLoadingDelay )
    */
  var maxFragLookUpTolerance: scala.Double
  /**
    * (default 0.2s)
    * This tolerance factor is used during fragment lookup.
    * Instead of checking whether buffered.end is located within [start, end] range, frag lookup will be done by checking within [start-maxFragLookUpTolerance, end-maxFragLookUpTolerance] range.
    * This tolerance factor is used to cope with situations like:
    *      buffered.end = 9.991
    *      frag[0] : [0,10]
    *      frag[1] : [10,20]
    *      buffered.end is within frag[0] range, but as we are close to frag[1], frag[1] should be choosen instead
    * If maxFragLookUpTolerance = 0.2, this lookup will be adjusted to
    *      frag[0] : [-0.2,9.8]
    *      frag[1] : [9.8,19.8]
    *  This time, buffered.end is within frag[1] range, and frag[1] will be the next fragment to be loaded, as expected
    */
  var maxLoadingDelay: scala.Double
  /**
    * (default 600s)
    * Maximum buffer length in seconds. Hls.js will never exceed this value, even if maxBufferSize is not reached yet.
    * hls.js tries to buffer up to a maximum number of bytes (60 MB by default) rather than to buffer up to a maximum nb of seconds.
    * This is to mimic the browser behaviour (the buffer eviction algorithm is starting after the browser detects that video buffer size reaches a limit in bytes)
    * maxBufferLength is the minimum guaranteed buffer length that hls.js will try to achieve, even if that value exceeds the amount of bytes 60 MB of memory.
    * maxMaxBufferLength acts as a capping value, as if bitrate is really low, you could need more than one hour of buffer to fill 60 MB.
    */
  var maxMaxBufferLength: scala.Double
  /**
    * (default: 2s)
    * In case playback is stalled, and a buffered range is available upfront, less than maxSeekHole seconds from current media position,
    * hls.js will jump over this buffer hole to reach the beginning of this following buffered range.
    * maxSeekHole allows to configure this jumpable threshold.
    */
  var maxSeekHole: scala.Double
  /**
    * (default: 4s)
    *
    * ABR algorithm will always try to choose a quality level that should avoid rebuffering. In case no quality level with this criteria can
    * be found (lets say for example that buffer length is 1s, but fetching a fragment at lowest quality is predicted to take around 2s ...
    * ie we can forecast around 1s of rebuffering ...) then ABR algorithm will try to find a level that should guarantee less than
    * maxStarvationDelay of buffering.
    */
  var maxStarvationDelay: scala.Double
  /**
    * (default: 0)
    * Return the capping/min bandwidth value that could be used by automatic level selection algorithm.
    * Useful when browser or tab of the browser is not in the focus and bandwidth drops
    */
  var minAutoBitrate: scala.Double
  /**
    * (default: 3s)
    * In case playback continues to stall after first playhead nudging, currentTime will be nudged evenmore following nudgeOffset to try to restore playback.
    * media.currentTime += (nb nudge retry -1)*nudgeOffset
    */
  var nudgeMaxRetry: scala.Double
  /**
    * (default: 0.1s)
    * In case playback continues to stall after first playhead nudging, currentTime will be nudged evenmore following nudgeOffset to try to restore playback.
    * media.currentTime += (nb nudge retry -1)*nudgeOffset
    */
  var nudgeOffset: scala.Double
  /**
    * (default: undefined)
    * This enables the manipulation of the playlist loader.
    * Note: This will overwrite the default loader, as well as your own loader function.
    */
  var pLoader: js.UndefOr[org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader]] = js.undefined
  /**
    * (default: false)
    * Start prefetching start fragment although media not attached yet. Max number of append retries.
    */
  var startFragPrefetch: scala.Boolean
  /**
    * (default: undefined)
    * When set, use this level as the default hls.startLevel. Keep in mind that the startLevel set with the API takes precedence over
    * config.startLevel configuration parameter.
    */
  var startLevel: scala.Double
  /**
    * (default -1)
    * if set to -1, playback will start from initialTime=0 for VoD and according to liveSyncDuration/liveSyncDurationCount config params for Live
    * otherwise, playback will start from predefined value. (unless stated otherwise in autoStartLoad=false mode : in that case startPosition can be overrided using hls.startLoad(startPosition)).
    */
  var startPosition: scala.Double
  /**
    * (default: false)
    * If a segment's video track is shorter than its audio track by > min(maxSeekHole, maxBufferHole), extend the final video frame's duration to match the audio track's duration.
    * This helps playback continue in certain cases that might otherwise get stuck.
    */
  var stretchShortVideoTrack: scala.Boolean
  /**
    * (default: internal track timeline controller)
    * Customized text track syncronization controller.
    * Parameter should be a class with a destroy() method:
    * destroy() : should clean-up all used resources
    */
  var timelineController: TimelineController
  /**
    * (default: undefined)
    * XMLHttpRequest customization callback for default XHR based loader.
    * Parameter should be a function with two arguments (xhr: XMLHttpRequest, url: string).
    * If xhrSetup is specified, default loader will invoke it before calling xhr.send(). This allows user to easily modify/setup XHR.
    */
  var xhrSetup: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* url */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    abrBandWidthFactor: scala.Double,
    abrBandWidthUpFactor: scala.Double,
    abrController: AbrController,
    abrEwmaDefaultEstimate: scala.Double,
    abrEwmaFastLive: scala.Double,
    abrEwmaFastVod: scala.Double,
    abrEwmaSlowLive: scala.Double,
    abrEwmaSlowVod: scala.Double,
    abrMaxWithRealBitrate: scala.Boolean,
    appendErrorMaxRetry: scala.Double,
    autoStartLoad: scala.Boolean,
    capLevelToPlayerSize: scala.Boolean,
    captionsTextTrack1Label: java.lang.String,
    captionsTextTrack1LanguagedCode: java.lang.String,
    captionsTextTrack2Label: java.lang.String,
    captionsTextTrack2LanguageCode: java.lang.String,
    debug: scala.Boolean | CustomLoggerObject,
    defaultAudioCodec: java.lang.String,
    enableCEA708Captions: scala.Boolean,
    enableSoftwareAES: scala.Boolean,
    enableWorker: scala.Boolean,
    forceKeyFrameOnDiscontinuity: scala.Boolean,
    fragLoadingMaxRetry: scala.Double,
    fragLoadingMaxRetryDelay: scala.Double,
    fragLoadingRetryDelay: scala.Double,
    fragLoadingTimeOut: scala.Double,
    highBufferWatchdogPeriod: scala.Double,
    initialLiveManifestSize: scala.Double,
    levelLoadingMaxRetry: scala.Double,
    levelLoadingMaxRetryTimeout: scala.Double,
    levelLoadingRetryDelay: scala.Double,
    levelLoadingTimeOut: scala.Double,
    liveBackBufferLength: scala.Double,
    liveDurationInfinity: scala.Boolean,
    liveMaxLatencyDuration: scala.Double,
    liveMaxLatencyDurationCount: scala.Double,
    liveSyncDuration: scala.Double,
    liveSyncDurationCount: scala.Double,
    loader: org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader],
    lowBufferWatchdogPeriod: scala.Double,
    manifestLoadingMaxRetry: scala.Double,
    manifestLoadingMaxRetryTimeout: scala.Double,
    manifestLoadingRetryDelay: scala.Double,
    manifestLoadingTimeOut: scala.Double,
    maxAudioFramesDrift: scala.Double,
    maxBufferHole: scala.Double,
    maxBufferLength: scala.Double,
    maxBufferSize: scala.Double,
    maxFragLookUpTolerance: scala.Double,
    maxLoadingDelay: scala.Double,
    maxMaxBufferLength: scala.Double,
    maxSeekHole: scala.Double,
    maxStarvationDelay: scala.Double,
    minAutoBitrate: scala.Double,
    nudgeMaxRetry: scala.Double,
    nudgeOffset: scala.Double,
    startFragPrefetch: scala.Boolean,
    startLevel: scala.Double,
    startPosition: scala.Double,
    stretchShortVideoTrack: scala.Boolean,
    timelineController: TimelineController,
    enableWebVTT: js.UndefOr[scala.Boolean] = js.undefined,
    fLoader: org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader] = null,
    fetchSetup: js.Function2[/* context */ js.Any, /* initParams */ js.Any, stdLib.Request] = null,
    pLoader: org.scalablytyped.runtime.Instantiable1[/* config */ LoaderConfig, Loader] = null,
    xhrSetup: js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* url */ java.lang.String, scala.Unit] = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abrBandWidthFactor")(abrBandWidthFactor)
    __obj.updateDynamic("abrBandWidthUpFactor")(abrBandWidthUpFactor)
    __obj.updateDynamic("abrController")(abrController)
    __obj.updateDynamic("abrEwmaDefaultEstimate")(abrEwmaDefaultEstimate)
    __obj.updateDynamic("abrEwmaFastLive")(abrEwmaFastLive)
    __obj.updateDynamic("abrEwmaFastVod")(abrEwmaFastVod)
    __obj.updateDynamic("abrEwmaSlowLive")(abrEwmaSlowLive)
    __obj.updateDynamic("abrEwmaSlowVod")(abrEwmaSlowVod)
    __obj.updateDynamic("abrMaxWithRealBitrate")(abrMaxWithRealBitrate)
    __obj.updateDynamic("appendErrorMaxRetry")(appendErrorMaxRetry)
    __obj.updateDynamic("autoStartLoad")(autoStartLoad)
    __obj.updateDynamic("capLevelToPlayerSize")(capLevelToPlayerSize)
    __obj.updateDynamic("captionsTextTrack1Label")(captionsTextTrack1Label)
    __obj.updateDynamic("captionsTextTrack1LanguagedCode")(captionsTextTrack1LanguagedCode)
    __obj.updateDynamic("captionsTextTrack2Label")(captionsTextTrack2Label)
    __obj.updateDynamic("captionsTextTrack2LanguageCode")(captionsTextTrack2LanguageCode)
    __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultAudioCodec")(defaultAudioCodec)
    __obj.updateDynamic("enableCEA708Captions")(enableCEA708Captions)
    __obj.updateDynamic("enableSoftwareAES")(enableSoftwareAES)
    __obj.updateDynamic("enableWorker")(enableWorker)
    __obj.updateDynamic("forceKeyFrameOnDiscontinuity")(forceKeyFrameOnDiscontinuity)
    __obj.updateDynamic("fragLoadingMaxRetry")(fragLoadingMaxRetry)
    __obj.updateDynamic("fragLoadingMaxRetryDelay")(fragLoadingMaxRetryDelay)
    __obj.updateDynamic("fragLoadingRetryDelay")(fragLoadingRetryDelay)
    __obj.updateDynamic("fragLoadingTimeOut")(fragLoadingTimeOut)
    __obj.updateDynamic("highBufferWatchdogPeriod")(highBufferWatchdogPeriod)
    __obj.updateDynamic("initialLiveManifestSize")(initialLiveManifestSize)
    __obj.updateDynamic("levelLoadingMaxRetry")(levelLoadingMaxRetry)
    __obj.updateDynamic("levelLoadingMaxRetryTimeout")(levelLoadingMaxRetryTimeout)
    __obj.updateDynamic("levelLoadingRetryDelay")(levelLoadingRetryDelay)
    __obj.updateDynamic("levelLoadingTimeOut")(levelLoadingTimeOut)
    __obj.updateDynamic("liveBackBufferLength")(liveBackBufferLength)
    __obj.updateDynamic("liveDurationInfinity")(liveDurationInfinity)
    __obj.updateDynamic("liveMaxLatencyDuration")(liveMaxLatencyDuration)
    __obj.updateDynamic("liveMaxLatencyDurationCount")(liveMaxLatencyDurationCount)
    __obj.updateDynamic("liveSyncDuration")(liveSyncDuration)
    __obj.updateDynamic("liveSyncDurationCount")(liveSyncDurationCount)
    __obj.updateDynamic("loader")(loader)
    __obj.updateDynamic("lowBufferWatchdogPeriod")(lowBufferWatchdogPeriod)
    __obj.updateDynamic("manifestLoadingMaxRetry")(manifestLoadingMaxRetry)
    __obj.updateDynamic("manifestLoadingMaxRetryTimeout")(manifestLoadingMaxRetryTimeout)
    __obj.updateDynamic("manifestLoadingRetryDelay")(manifestLoadingRetryDelay)
    __obj.updateDynamic("manifestLoadingTimeOut")(manifestLoadingTimeOut)
    __obj.updateDynamic("maxAudioFramesDrift")(maxAudioFramesDrift)
    __obj.updateDynamic("maxBufferHole")(maxBufferHole)
    __obj.updateDynamic("maxBufferLength")(maxBufferLength)
    __obj.updateDynamic("maxBufferSize")(maxBufferSize)
    __obj.updateDynamic("maxFragLookUpTolerance")(maxFragLookUpTolerance)
    __obj.updateDynamic("maxLoadingDelay")(maxLoadingDelay)
    __obj.updateDynamic("maxMaxBufferLength")(maxMaxBufferLength)
    __obj.updateDynamic("maxSeekHole")(maxSeekHole)
    __obj.updateDynamic("maxStarvationDelay")(maxStarvationDelay)
    __obj.updateDynamic("minAutoBitrate")(minAutoBitrate)
    __obj.updateDynamic("nudgeMaxRetry")(nudgeMaxRetry)
    __obj.updateDynamic("nudgeOffset")(nudgeOffset)
    __obj.updateDynamic("startFragPrefetch")(startFragPrefetch)
    __obj.updateDynamic("startLevel")(startLevel)
    __obj.updateDynamic("startPosition")(startPosition)
    __obj.updateDynamic("stretchShortVideoTrack")(stretchShortVideoTrack)
    __obj.updateDynamic("timelineController")(timelineController)
    if (!js.isUndefined(enableWebVTT)) __obj.updateDynamic("enableWebVTT")(enableWebVTT)
    if (fLoader != null) __obj.updateDynamic("fLoader")(fLoader)
    if (fetchSetup != null) __obj.updateDynamic("fetchSetup")(fetchSetup)
    if (pLoader != null) __obj.updateDynamic("pLoader")(pLoader)
    if (xhrSetup != null) __obj.updateDynamic("xhrSetup")(xhrSetup)
    __obj.asInstanceOf[Config]
  }
}

