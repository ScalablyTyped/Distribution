package typings.ldclientJsCommon.mod

import typings.ldclientJsCommon.ldclientJsCommonStrings.localStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDOptionsBase extends js.Object {
  
  /**
    * Whether all user attributes (except the user key) should be marked as private, and
    * not sent to LaunchDarkly in analytics events.
    *
    * By default, this is false.
    */
  var allAttributesPrivate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to send an analytics event for a flag evaluation even if the same flag was
    * evaluated with the same value within the last five minutes.
    *
    * By default, this is false (duplicate events within five minutes will be dropped).
    */
  var allowFrequentDuplicateEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * The base URL for the LaunchDarkly server.
    *
    * Most users should use the default value.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * The initial set of flags to use until the remote set is retrieved.
    *
    * If `"localStorage"` is specified, the flags will be saved and retrieved from browser local
    * storage. Alternatively, an [[LDFlagSet]] can be specified which will be used as the initial
    * source of flag values.
    *
    * For more information, see the [SDK Reference Guide](https://docs.launchdarkly.com/docs/js-sdk-reference#section-bootstrapping).
    */
  var bootstrap: js.UndefOr[localStorage | LDFlagSet] = js.native
  
  /**
    * Whether LaunchDarkly should provide additional information about how flag values were
    * calculated.
    *
    * The additional information will then be available through the client's
    * [[LDClient.variationDetail]] method. Since this increases the size of network requests,
    * such information is not sent unless you set this option to true.
    */
  var evaluationReasons: js.UndefOr[Boolean] = js.native
  
  /**
    * The base URL for the LaunchDarkly events server.
    *
    * Most users should use the default value.
    */
  var eventsUrl: js.UndefOr[String] = js.native
  
  /**
    * The interval in between flushes of the analytics events queue, in milliseconds.
    *
    * The default value is 2000ms.
    */
  var flushInterval: js.UndefOr[Double] = js.native
  
  /**
    * An object that will perform logging for the client.
    *
    * If not specified, the default is [[createConsoleLogger]] in the browser SDK, or a logger
    * from the `winston` package in Electron.
    */
  var logger: js.UndefOr[LDLogger] = js.native
  
  /**
    * The names of user attributes that should be marked as private, and not sent
    * to LaunchDarkly in analytics events. You can also specify this on a per-user basis
    * with [[LDUser.privateAttributeNames]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If specified, enables event sampling so that only some fraction of analytics events will be
    * sent pseudo-randomly.
    *
    * When set to greater than zero, there is a 1 in `samplingInterval` chance that events will be
    * sent: for example, a value of 20 means that on average 1 in 20, or 5%, of all events will be sent.
    */
  var samplingInterval: js.UndefOr[Double] = js.native
  
  /**
    * Whether to send analytics events back to LaunchDarkly. By default, this is true.
    */
  var sendEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether analytics events should be sent only when you call variation (true), or also when you
    * call allFlags (false).
    *
    * By default, this is false (events will be sent in both cases).
    */
  var sendEventsOnlyForVariation: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to include custom HTTP headers when requesting flags from LaunchDarkly.
    *
    * Currently these are used to track what version of the SDK is active. This defaults to true
    * (custom headers will be sent). One reason you might want to set it to false is that the presence
    * of custom headers causes browsers to make an extra OPTIONS request (a CORS preflight check)
    * before each flag request, which could affect performance.
    */
  var sendLDHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * How long (in milliseconds) to wait after a failure of the stream connection before trying to
    * reconnect.
    *
    * This only applies if streaming has been enabled by setting [[streaming]] to true or
    * subscribing to `"change"` events. The default is 1000ms.
    */
  var streamReconnectDelay: js.UndefOr[Double] = js.native
  
  /**
    * The base URL for the LaunchDarkly streaming server.
    *
    * Most users should use the default value.
    */
  var streamUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to open a streaming connection to LaunchDarkly for live flag updates.
    *
    * If this is true, the client will always attempt to maintain a streaming connection; if false,
    * it never will. If you leave the value undefined (the default), the client will open a streaming
    * connection if you subscribe to `"change"` or `"change:flag-key"` events (see [[LDClient.on]]).
    *
    * This is equivalent to calling `client.setStreaming()` with the same value.
    */
  var streaming: js.UndefOr[Boolean] = js.native
  
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
  var useReport: js.UndefOr[Boolean] = js.native
}
object LDOptionsBase {
  
  @scala.inline
  def apply(): LDOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDOptionsBase]
  }
  
  @scala.inline
  implicit class LDOptionsBaseOps[Self <: LDOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setAllAttributesPrivate(value: Boolean): Self = this.set("allAttributesPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAttributesPrivate: Self = this.set("allAttributesPrivate", js.undefined)
    
    @scala.inline
    def setAllowFrequentDuplicateEvents(value: Boolean): Self = this.set("allowFrequentDuplicateEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFrequentDuplicateEvents: Self = this.set("allowFrequentDuplicateEvents", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBootstrap(value: localStorage | LDFlagSet): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap: Self = this.set("bootstrap", js.undefined)
    
    @scala.inline
    def setEvaluationReasons(value: Boolean): Self = this.set("evaluationReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationReasons: Self = this.set("evaluationReasons", js.undefined)
    
    @scala.inline
    def setEventsUrl(value: String): Self = this.set("eventsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsUrl: Self = this.set("eventsUrl", js.undefined)
    
    @scala.inline
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    
    @scala.inline
    def setLogger(value: LDLogger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPrivateAttributeNamesVarargs(value: String*): Self = this.set("privateAttributeNames", js.Array(value :_*))
    
    @scala.inline
    def setPrivateAttributeNames(value: js.Array[String]): Self = this.set("privateAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateAttributeNames: Self = this.set("privateAttributeNames", js.undefined)
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingInterval: Self = this.set("samplingInterval", js.undefined)
    
    @scala.inline
    def setSendEvents(value: Boolean): Self = this.set("sendEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendEvents: Self = this.set("sendEvents", js.undefined)
    
    @scala.inline
    def setSendEventsOnlyForVariation(value: Boolean): Self = this.set("sendEventsOnlyForVariation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendEventsOnlyForVariation: Self = this.set("sendEventsOnlyForVariation", js.undefined)
    
    @scala.inline
    def setSendLDHeaders(value: Boolean): Self = this.set("sendLDHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendLDHeaders: Self = this.set("sendLDHeaders", js.undefined)
    
    @scala.inline
    def setStreamReconnectDelay(value: Double): Self = this.set("streamReconnectDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamReconnectDelay: Self = this.set("streamReconnectDelay", js.undefined)
    
    @scala.inline
    def setStreamUrl(value: String): Self = this.set("streamUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamUrl: Self = this.set("streamUrl", js.undefined)
    
    @scala.inline
    def setStreaming(value: Boolean): Self = this.set("streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreaming: Self = this.set("streaming", js.undefined)
    
    @scala.inline
    def setUseReport(value: Boolean): Self = this.set("useReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseReport: Self = this.set("useReport", js.undefined)
  }
}
