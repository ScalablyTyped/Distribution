package typings.ldclientJs.mod

import typings.ldclientJsCommon.ldclientJsCommonStrings.localStorage
import typings.ldclientJsCommon.mod.LDFlagSet
import typings.ldclientJsCommon.mod.LDLogger
import typings.ldclientJsCommon.mod.LDOptionsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDOptions extends LDOptionsBase {
  /**
    * Whether the client should make a request to LaunchDarkly for A/B testing goals.
    *
    * This is true by default, meaning that this request will be made on every page load.
    * Set it to false if you are not using A/B testing and want to skip the request.
    */
  var fetchGoals: js.UndefOr[Boolean] = js.undefined
  /**
    * The signed user key for Secure Mode.
    *
    * For more information, see the JavaScript SDK Reference Guide on
    * [Secure mode](https://github.com/launchdarkly/js-client#secure-mode).
    */
  var hash: js.UndefOr[String] = js.undefined
}

object LDOptions {
  @scala.inline
  def apply(
    allAttributesPrivate: js.UndefOr[Boolean] = js.undefined,
    allowFrequentDuplicateEvents: js.UndefOr[Boolean] = js.undefined,
    baseUrl: String = null,
    bootstrap: localStorage | LDFlagSet = null,
    evaluationReasons: js.UndefOr[Boolean] = js.undefined,
    eventsUrl: String = null,
    fetchGoals: js.UndefOr[Boolean] = js.undefined,
    flushInterval: js.UndefOr[Double] = js.undefined,
    hash: String = null,
    logger: LDLogger = null,
    privateAttributeNames: js.Array[String] = null,
    samplingInterval: js.UndefOr[Double] = js.undefined,
    sendEvents: js.UndefOr[Boolean] = js.undefined,
    sendEventsOnlyForVariation: js.UndefOr[Boolean] = js.undefined,
    sendLDHeaders: js.UndefOr[Boolean] = js.undefined,
    streamReconnectDelay: js.UndefOr[Double] = js.undefined,
    streamUrl: String = null,
    streaming: js.UndefOr[Boolean] = js.undefined,
    useReport: js.UndefOr[Boolean] = js.undefined
  ): LDOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAttributesPrivate)) __obj.updateDynamic("allAttributesPrivate")(allAttributesPrivate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFrequentDuplicateEvents)) __obj.updateDynamic("allowFrequentDuplicateEvents")(allowFrequentDuplicateEvents.get.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluationReasons)) __obj.updateDynamic("evaluationReasons")(evaluationReasons.get.asInstanceOf[js.Any])
    if (eventsUrl != null) __obj.updateDynamic("eventsUrl")(eventsUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchGoals)) __obj.updateDynamic("fetchGoals")(fetchGoals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flushInterval)) __obj.updateDynamic("flushInterval")(flushInterval.get.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (privateAttributeNames != null) __obj.updateDynamic("privateAttributeNames")(privateAttributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(samplingInterval)) __obj.updateDynamic("samplingInterval")(samplingInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEvents)) __obj.updateDynamic("sendEvents")(sendEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEventsOnlyForVariation)) __obj.updateDynamic("sendEventsOnlyForVariation")(sendEventsOnlyForVariation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendLDHeaders)) __obj.updateDynamic("sendLDHeaders")(sendLDHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(streamReconnectDelay)) __obj.updateDynamic("streamReconnectDelay")(streamReconnectDelay.get.asInstanceOf[js.Any])
    if (streamUrl != null) __obj.updateDynamic("streamUrl")(streamUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useReport)) __obj.updateDynamic("useReport")(useReport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDOptions]
  }
}

