package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDOptionsBase extends js.Object {
  /**
    * Whether all user attributes (except the user key) should be marked as private, and
    * not sent to LaunchDarkly in analytics events.
    *
    * By default, this is false.
    */
  var allAttributesPrivate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to send an analytics event for a flag evaluation even if the same flag was
    * evaluated with the same value within the last five minutes.
    *
    * By default, this is false (duplicate events within five minutes will be dropped).
    */
  var allowFrequentDuplicateEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The base URL for the LaunchDarkly server.
    *
    * Most users should use the default value.
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial set of flags to use until the remote set is retrieved.
    *
    * If `"localStorage"` is specified, the flags will be saved and retrieved from browser local
    * storage. Alternatively, an [[LDFlagSet]] can be specified which will be used as the initial
    * source of flag values.
    *
    * For more information, see the [SDK Reference Guide](https://docs.launchdarkly.com/docs/js-sdk-reference#section-bootstrapping).
    */
  var bootstrap: js.UndefOr[
    ldclientDashJsDashCommonLib.ldclientDashJsDashCommonLibStrings.localStorage | LDFlagSet
  ] = js.undefined
  /**
    * Whether LaunchDarkly should provide additional information about how flag values were
    * calculated.
    *
    * The additional information will then be available through the client's
    * [[LDClient.variationDetail]] method. Since this increases the size of network requests,
    * such information is not sent unless you set this option to true.
    */
  var evaluationReasons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The base URL for the LaunchDarkly events server.
    *
    * Most users should use the default value.
    */
  var eventsUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The interval in between flushes of the analytics events queue, in milliseconds.
    *
    * The default value is 2000ms.
    */
  var flushInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object that will perform logging for the client.
    *
    * If not specified, the default is [[createConsoleLogger]] in the browser SDK, or a logger
    * from the `winston` package in Electron.
    */
  var logger: js.UndefOr[LDLogger] = js.undefined
  /**
    * The names of user attributes that should be marked as private, and not sent
    * to LaunchDarkly in analytics events. You can also specify this on a per-user basis
    * with [[LDUser.privateAttributeNames]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If specified, enables event sampling so that only some fraction of analytics events will be
    * sent pseudo-randomly.
    *
    * When set to greater than zero, there is a 1 in `samplingInterval` chance that events will be
    * sent: for example, a value of 20 means that on average 1 in 20, or 5%, of all events will be sent.
    */
  var samplingInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to send analytics events back to LaunchDarkly. By default, this is true.
    */
  var sendEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether analytics events should be sent only when you call variation (true), or also when you
    * call allFlags (false).
    *
    * By default, this is false (events will be sent in both cases).
    */
  var sendEventsOnlyForVariation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to include custom HTTP headers when requesting flags from LaunchDarkly.
    *
    * Currently these are used to track what version of the SDK is active. This defaults to true
    * (custom headers will be sent). One reason you might want to set it to false is that the presence
    * of custom headers causes browsers to make an extra OPTIONS request (a CORS preflight check)
    * before each flag request, which could affect performance.
    */
  var sendLDHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How long (in milliseconds) to wait after a failure of the stream connection before trying to
    * reconnect.
    *
    * This only applies if streaming has been enabled by setting [[streaming]] to true or
    * subscribing to `"change"` events. The default is 1000ms.
    */
  var streamReconnectDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The base URL for the LaunchDarkly streaming server.
    *
    * Most users should use the default value.
    */
  var streamUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to open a streaming connection to LaunchDarkly for live flag updates.
    *
    * If this is true, the client will always attempt to maintain a streaming connection; if false,
    * it never will. If you leave the value undefined (the default), the client will open a streaming
    * connection if you subscribe to `"change"` or `"change:flag-key"` events (see [[LDClient.on]]).
    *
    * This is equivalent to calling `client.setStreaming()` with the same value.
    */
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to use the REPORT verb to fetch flag settings.
    *
    * If this is true, flag settings will be fetched with a REPORT request
    * including a JSON entity body with the user object.
    *
    * Otherwise (by default) a GET request will be issued with the user passed as
    * a base64 URL-encoded path parameter.
    *
    * Do not use unless advised by LaunchDarkly.
    */
  var useReport: js.UndefOr[scala.Boolean] = js.undefined
}

object LDOptionsBase {
  @scala.inline
  def apply(
    allAttributesPrivate: js.UndefOr[scala.Boolean] = js.undefined,
    allowFrequentDuplicateEvents: js.UndefOr[scala.Boolean] = js.undefined,
    baseUrl: java.lang.String = null,
    bootstrap: ldclientDashJsDashCommonLib.ldclientDashJsDashCommonLibStrings.localStorage | LDFlagSet = null,
    evaluationReasons: js.UndefOr[scala.Boolean] = js.undefined,
    eventsUrl: java.lang.String = null,
    flushInterval: scala.Int | scala.Double = null,
    logger: LDLogger = null,
    privateAttributeNames: js.Array[java.lang.String] = null,
    samplingInterval: scala.Int | scala.Double = null,
    sendEvents: js.UndefOr[scala.Boolean] = js.undefined,
    sendEventsOnlyForVariation: js.UndefOr[scala.Boolean] = js.undefined,
    sendLDHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    streamReconnectDelay: scala.Int | scala.Double = null,
    streamUrl: java.lang.String = null,
    streaming: js.UndefOr[scala.Boolean] = js.undefined,
    useReport: js.UndefOr[scala.Boolean] = js.undefined
  ): LDOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allAttributesPrivate)) __obj.updateDynamic("allAttributesPrivate")(allAttributesPrivate)
    if (!js.isUndefined(allowFrequentDuplicateEvents)) __obj.updateDynamic("allowFrequentDuplicateEvents")(allowFrequentDuplicateEvents)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (bootstrap != null) __obj.updateDynamic("bootstrap")(bootstrap.asInstanceOf[js.Any])
    if (!js.isUndefined(evaluationReasons)) __obj.updateDynamic("evaluationReasons")(evaluationReasons)
    if (eventsUrl != null) __obj.updateDynamic("eventsUrl")(eventsUrl)
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LDOptionsBase]
  }
}

