package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDOptions
  extends ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDOptionsBase {
  /**
    * Whether the client should make a request to LaunchDarkly for A/B testing goals.
    *
    * This is true by default, meaning that this request will be made on every page load.
    * Set it to false if you are not using A/B testing and want to skip the request.
    */
  var fetchGoals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The signed user key for Secure Mode.
    *
    * For more information, see the JavaScript SDK Reference Guide on
    * [Secure mode](https://github.com/launchdarkly/js-client#secure-mode).
    */
  var hash: js.UndefOr[java.lang.String] = js.undefined
}

object LDOptions {
  @scala.inline
  def apply(
    allAttributesPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    allowFrequentDuplicateEvents: js.UndefOr[scala.Boolean] = js.undefined,
    baseUrl: java.lang.String = null,
    bootstrap: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonLibStrings.localStorage | ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDFlagSet = null,
    evaluationReasons: js.UndefOr[scala.Boolean] = js.undefined,
    eventsUrl: java.lang.String = null,
    fetchGoals: js.UndefOr[scala.Boolean] = js.undefined,
    flushInterval: scala.Int | scala.Double = null,
    hash: java.lang.String = null,
    logger: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod.LDLogger = null,
    privateAttributeNames: js.Array[java.lang.String] = null,
    samplingInterval: scala.Int | scala.Double = null,
    sendEvents: js.UndefOr[scala.Boolean] = js.undefined,
    sendEventsOnlyForVariation: js.UndefOr[scala.Boolean] = js.undefined,
    sendLDHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    streamReconnectDelay: scala.Int | scala.Double = null,
    streamUrl: java.lang.String = null,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    useReport: js.UndefOr[scala.Boolean] = js.undefined
  ): LDOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAttributesPrivate)) __obj.updateDynamic("allAttributesPrivate")(allAttributesPrivate)
    if (!js.isUndefined(allowFrequentDuplicateEvents)) __obj.updateDynamic("allowFrequentDuplicateEvents")(allowFrequentDuplicateEvents)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluationReasons)) __obj.updateDynamic("evaluationReasons")(evaluationReasons)
    if (eventsUrl != null) __obj.updateDynamic("eventsUrl")(eventsUrl)
    if (!js.isUndefined(fetchGoals)) __obj.updateDynamic("fetchGoals")(fetchGoals)
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (privateAttributeNames != null) __obj.updateDynamic("privateAttributeNames")(privateAttributeNames)
    if (samplingInterval != null) __obj.updateDynamic("samplingInterval")(samplingInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(sendEvents)) __obj.updateDynamic("sendEvents")(sendEvents)
    if (!js.isUndefined(sendEventsOnlyForVariation)) __obj.updateDynamic("sendEventsOnlyForVariation")(sendEventsOnlyForVariation)
    if (!js.isUndefined(sendLDHeaders)) __obj.updateDynamic("sendLDHeaders")(sendLDHeaders)
    if (streamReconnectDelay != null) __obj.updateDynamic("streamReconnectDelay")(streamReconnectDelay.asInstanceOf[js.Any])
    if (streamUrl != null) __obj.updateDynamic("streamUrl")(streamUrl)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    if (!js.isUndefined(useReport)) __obj.updateDynamic("useReport")(useReport)
    __obj.asInstanceOf[LDOptions]
  }
}

