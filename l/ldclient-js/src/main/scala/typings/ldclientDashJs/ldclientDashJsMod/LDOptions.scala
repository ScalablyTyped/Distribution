package typings.ldclientDashJs.ldclientDashJsMod

import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDFlagSet
import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDLogger
import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonMod.LDOptionsBase
import typings.ldclientDashJsDashCommon.ldclientDashJsDashCommonStrings.localStorage
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
    flushInterval: Int | Double = null,
    hash: String = null,
    logger: LDLogger = null,
    privateAttributeNames: js.Array[String] = null,
    samplingInterval: Int | Double = null,
    sendEvents: js.UndefOr[Boolean] = js.undefined,
    sendEventsOnlyForVariation: js.UndefOr[Boolean] = js.undefined,
    sendLDHeaders: js.UndefOr[Boolean] = js.undefined,
    streamReconnectDelay: Int | Double = null,
    streamUrl: String = null,
    streaming: js.UndefOr[Boolean] = js.undefined,
    useReport: js.UndefOr[Boolean] = js.undefined
  ): LDOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAttributesPrivate)) __obj.updateDynamic("allAttributesPrivate")(allAttributesPrivate.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFrequentDuplicateEvents)) __obj.updateDynamic("allowFrequentDuplicateEvents")(allowFrequentDuplicateEvents.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluationReasons)) __obj.updateDynamic("evaluationReasons")(evaluationReasons.asInstanceOf[js.Any])
    if (eventsUrl != null) __obj.updateDynamic("eventsUrl")(eventsUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchGoals)) __obj.updateDynamic("fetchGoals")(fetchGoals.asInstanceOf[js.Any])
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (privateAttributeNames != null) __obj.updateDynamic("privateAttributeNames")(privateAttributeNames.asInstanceOf[js.Any])
    if (samplingInterval != null) __obj.updateDynamic("samplingInterval")(samplingInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEvents)) __obj.updateDynamic("sendEvents")(sendEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEventsOnlyForVariation)) __obj.updateDynamic("sendEventsOnlyForVariation")(sendEventsOnlyForVariation.asInstanceOf[js.Any])
    if (!js.isUndefined(sendLDHeaders)) __obj.updateDynamic("sendLDHeaders")(sendLDHeaders.asInstanceOf[js.Any])
    if (streamReconnectDelay != null) __obj.updateDynamic("streamReconnectDelay")(streamReconnectDelay.asInstanceOf[js.Any])
    if (streamUrl != null) __obj.updateDynamic("streamUrl")(streamUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (!js.isUndefined(useReport)) __obj.updateDynamic("useReport")(useReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDOptions]
  }
}

