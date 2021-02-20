package typings.ldclientJsCommon

import org.scalablytyped.runtime.StringDictionary
import typings.ldclientJsCommon.anon.Current
import typings.ldclientJsCommon.ldclientJsCommonStrings.localStorage
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldclient-js-common", "createConsoleLogger")
  @js.native
  def createConsoleLogger(minimumLevel: String): LDLogger = js.native
  
  @JSImport("ldclient-js-common", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait LDClientBase extends StObject {
    
    /**
      * Returns a map of all available flags to the current user's values.
      *
      * @returns
      *   An object in which each key is a feature flag key and each value is the flag value.
      *   Note that there is no way to specify a default value for each flag as there is with
      *   [[variation]], so any flag that cannot be evaluated will have a null value.
      */
    def allFlags(): LDFlagSet = js.native
    
    /**
      * Shuts down the client and releases its resources, after delivering any pending analytics
      * events. After the client is closed, all calls to [[variation]] will return default values,
      * and it will not make any requests to LaunchDarkly.
      *
      * @param onDone
      *   A function which will be called when the operation completes. If omitted, you
      *   will receive a Promise instead.
      *
      * @returns
      *   If you provided a callback, then nothing. Otherwise, a Promise which resolves once
      *   closing is finished. It will never be rejected.
      */
    def close(): js.Promise[Unit] = js.native
    def close(onDone: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Flushes all pending analytics events.
      *
      * Normally, batches of events are delivered in the background at intervals determined by the
      * `flushInterval` property of [[LDOptions]]. Calling `flush()` triggers an immediate delivery.
      *
      * @param onDone
      *   A function which will be called when the flush completes. If omitted, you
      *   will receive a Promise instead.
      *
      * @returns
      *   If you provided a callback, then nothing. Otherwise, a Promise which resolves once
      *   flushing is finished. Note that the Promise will be rejected if the HTTP request
      *   fails, so be sure to attach a rejection handler to it.
      */
    def flush(): js.Promise[Unit] = js.native
    def flush(onDone: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Returns the client's current user.
      *
      * This is the user that was most recently passed to [[identify]], or, if [[identify]] has never
      * been called, the initial user specified when the client was created.
      */
    def getUser(): LDUser = js.native
    
    /**
      * Identifies a user to LaunchDarkly.
      *
      * Unlike the server-side SDKs, the client-side JavaScript SDKs maintain a current user state,
      * which is set at initialization time. You only need to call `identify()` if the user has changed
      * since then.
      *
      * Changing the current user also causes all feature flag values to be reloaded. Until that has
      * finished, calls to [[variation]] will still return flag values for the previous user. You can
      * use a callback or a Promise to determine when the new flag values are available.
      *
      * @param user
      *   The user properties. Must contain at least the `key` property.
      * @param hash
      *   The signed user key for [Secure Mode](http://docs.launchdarkly.com/docs/js-sdk-reference#secure-mode).
      * @param onDone
      *   A function which will be called as soon as the flag values for the new user are available,
      *   with two parameters: an error value (if any), and an [[LDFlagSet]] containing the new values
      *   (which can also be obtained by calling [[variation]]). If the callback is omitted, you will
      *   receive a Promise instead.
      * @returns
      *   If you provided a callback, then nothing. Otherwise, a Promise which resolve once the flag
      *   values for the new user are available, providing an [[LDFlagSet]] containing the new values
      *   (which can also be obtained by calling [[variation]]).
      */
    def identify(user: LDUser): js.Promise[LDFlagSet] = js.native
    def identify(
      user: LDUser,
      hash: js.UndefOr[scala.Nothing],
      onDone: js.Function2[/* err */ Error | Null, /* flags */ LDFlagSet | Null, Unit]
    ): js.Promise[LDFlagSet] = js.native
    def identify(user: LDUser, hash: String): js.Promise[LDFlagSet] = js.native
    def identify(
      user: LDUser,
      hash: String,
      onDone: js.Function2[/* err */ Error | Null, /* flags */ LDFlagSet | Null, Unit]
    ): js.Promise[LDFlagSet] = js.native
    
    /**
      * Deregisters an event listener. See [[on]] for the available event types.
      *
      * @param key
      *   The name of the event for which to stop listening.
      * @param callback
      *   The function to deregister.
      * @param context
      *   The `this` context for the callback, if one was specified for [[on]].
      */
    def off(key: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def off(key: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Unit = js.native
    
    /**
      * Registers an event listener.
      *
      * The following event names (keys) are used by the cliet:
      *
      * - `"ready"`: The client has finished starting up. This event will be sent regardless
      *   of whether it successfully connected to LaunchDarkly, or encountered an error
      *   and had to give up; to distinguish between these cases, see below.
      * - `"initialized"`: The client successfully started up and has valid feature flag
      *   data. This will always be accompanied by `"ready"`.
      * - `"failed"`: The client encountered an error that prevented it from connecting to
      *   LaunchDarkly, such as an invalid environment ID. All flag evaluations will
      *   therefore receive default values. This will always be accompanied by `"ready"`.
      * - `"error"`: General event for any kind of error condition during client operation.
      *   The callback parameter is an Error object. If you do not listen for "error"
      *   events, then the errors will be logged with `console.log()`.
      * - `"change"`: The client has received new feature flag data. This can happen either
      *   because you have switched users with [[identify]], or because the client has a
      *   stream connection and has received a live change to a flag value (see below).
      *   The callback parameter is an [[LDFlagChangeset]].
      * - `"change:FLAG-KEY"`: The client has received a new value for a specific flag
      *   whose key is `FLAG-KEY`. The callback receives two parameters: the current (new)
      *   flag value, and the previous value. This is always accompanied by a general
      *   `"change"` event as described above; you can listen for either or both.
      *
      * The `"change"` and `"change:FLAG-KEY"` events have special behavior: by default, the
      * client will open a streaming connection to receive live changes if and only if
      * you are listening for one of these events. This behavior can be overridden by
      * setting `streaming` in [[LDOptions]] or calling [[LDClient.setStreaming]].
      *
      * @param key
      *   The name of the event for which to listen.
      * @param callback
      *   The function to execute when the event fires. The callback may or may not
      *   receive parameters, depending on the type of event; see [[LDEventSignature]].
      * @param context
      *   The `this` context to use for the callback.
      */
    def on(key: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def on(key: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Unit = js.native
    
    /**
      * Specifies whether or not to open a streaming connection to LaunchDarkly for live flag updates.
      *
      * If this is true, the client will always attempt to maintain a streaming connection; if false,
      * it never will. If you leave the value undefined (the default), the client will open a streaming
      * connection if you subscribe to `"change"` or `"change:flag-key"` events (see [[LDClient.on]]).
      *
      * This can also be set as the `streaming` property of [[LDOptions]].
      */
    def setStreaming(): Unit = js.native
    def setStreaming(value: Boolean): Unit = js.native
    
    /**
      * Track page events to use in goals or A/B tests.
      *
      * LaunchDarkly automatically tracks pageviews and clicks that are specified in the
      * Goals section of their dashboard. This can be used to track custom goals or other
      * events that do not currently have goals.
      *
      * @param key
      *   The name of the event, which may correspond to a goal in A/B tests.
      * @param data
      *   Additional information to associate with the event.
      */
    def track(key: String): Unit = js.native
    def track(key: String, data: js.Any): Unit = js.native
    
    /**
      * Determines the variation of a feature flag for the current user.
      *
      * In the client-side JavaScript SDKs, this is always a fast synchronous operation because all of
      * the feature flag values for the current user have already been loaded into memory.
      *
      * @param key
      *   The unique key of the feature flag.
      * @param defaultValue
      *   The default value of the flag, to be used if the value is not available from LaunchDarkly.
      * @returns
      *   The flag's value.
      */
    def variation(key: String): LDFlagValue = js.native
    def variation(key: String, defaultValue: LDFlagValue): LDFlagValue = js.native
    
    /**
      * Determines the variation of a feature flag for a user, along with information about how it was
      * calculated.
      *
      * Note that this will only work if you have set `evaluationExplanations` to true in [[LDOptions]].
      * Otherwise, the `reason` property of the result will be null.
      *
      * The `reason` property of the result will also be included in analytics events, if you are
      * capturing detailed event data for this flag.
      *
      * For more information, see the [SDK reference guide](https://docs.launchdarkly.com/docs/evaluation-reasons).
      *
      * @param key
      *   The unique key of the feature flag.
      * @param defaultValue
      *   The default value of the flag, to be used if the value is not available from LaunchDarkly.
      *
      * @returns
      *   An [[LDEvaluationDetail]] object containing the value and explanation.
      */
    def variationDetail(key: String): LDEvaluationDetail = js.native
    def variationDetail(key: String, defaultValue: LDFlagValue): LDEvaluationDetail = js.native
    
    /**
      * Returns a Promise that tracks the client's initialization state.
      *
      * The Promise will be resolved if the client successfully initializes, or rejected if client
      * initialization has irrevocably failed (for instance, if it detects that the SDK key is invalid).
      *
      * Note that you can also use event listeners ([[on]]) for the same purpose: the event `"initialized"`
      * indicates success, and `"failed"` indicates failure.
      * 
      * @returns
      *   A Promise that will be resolved if the client initializes successfully, or rejected if it
      *   fails.
      */
    def waitForInitialization(): js.Promise[Unit] = js.native
    
    /**
      * Returns a Promise that tracks the client's initialization state.
      *
      * The returned Promise will be resolved once the client has either successfully initialized
      * or failed to initialize (e.g. due to an invalid environment key or a server error).
      * 
      * If you want to distinguish between these success and failure conditions, use
      * [[waitForInitialization]] instead.
      * 
      * If you prefer to use event listeners ([[on]]) rather than Promises, you can listen on the
      * client for a `"ready"` event, which will be fired in either case.
      * 
      * @returns
      *   A Promise that will be resolved once the client is no longer trying to initialize.
      */
    def waitUntilReady(): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait LDEvaluationDetail extends StObject {
    
    /**
      * An object describing the main factor that influenced the flag evaluation value.
      */
    var reason: LDEvaluationReason = js.native
    
    /**
      * The result of the flag evaluation. This will be either one of the flag's variations or
      * the default value that was passed to [[LDClient.variationDetail]].
      */
    var value: LDFlagValue = js.native
    
    /**
      * The index of the returned value within the flag's list of variations, e.g. 0 for the
      * first variation-- or `null` if the default value was returned.
      */
    var variationIndex: js.UndefOr[Double] = js.native
  }
  object LDEvaluationDetail {
    
    @scala.inline
    def apply(reason: LDEvaluationReason, value: LDFlagValue): LDEvaluationDetail = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDEvaluationDetail]
    }
    
    @scala.inline
    implicit class LDEvaluationDetailMutableBuilder[Self <: LDEvaluationDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReason(value: LDEvaluationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: LDFlagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariationIndex(value: Double): Self = StObject.set(x, "variationIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariationIndexUndefined: Self = StObject.set(x, "variationIndex", js.undefined)
    }
  }
  
  @js.native
  trait LDEvaluationReason extends StObject {
    
    /**
      * A further description of the error condition, if the kind was `'ERROR'`.
      */
    var errorKind: js.UndefOr[String] = js.native
    
    /**
      * The general category of the reason:
      *
      * - `'OFF'`: The flag was off and therefore returned its configured off value.
      * - `'FALLTHROUGH'`: The flag was on but the user did not match any targets or rules.
      * - `'TARGET_MATCH'`: The user key was specifically targeted for this flag.
      * - `'RULE_MATCH'`: the user matched one of the flag's rules.
      * - `'PREREQUISITE_FAILED'`: The flag was considered off because it had at least one
      *   prerequisite flag that either was off or did not return the desired variation.
      * - `'ERROR'`: The flag could not be evaluated, e.g. because it does not exist or due
      *   to an unexpected error.
      */
    var kind: String = js.native
    
    /**
      * The key of the failed prerequisite flag, if the kind was `'PREREQUISITE_FAILED'`.
      */
    var prerequisiteKey: js.UndefOr[String] = js.native
    
    /**
      * The unique identifier of the matched rule, if the kind was `'RULE_MATCH'`.
      */
    var ruleId: js.UndefOr[String] = js.native
    
    /**
      * The index of the matched rule (0 for the first), if the kind was `'RULE_MATCH'`.
      */
    var ruleIndex: js.UndefOr[Double] = js.native
  }
  object LDEvaluationReason {
    
    @scala.inline
    def apply(kind: String): LDEvaluationReason = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDEvaluationReason]
    }
    
    @scala.inline
    implicit class LDEvaluationReasonMutableBuilder[Self <: LDEvaluationReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorKind(value: String): Self = StObject.set(x, "errorKind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorKindUndefined: Self = StObject.set(x, "errorKind", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerequisiteKey(value: String): Self = StObject.set(x, "prerequisiteKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerequisiteKeyUndefined: Self = StObject.set(x, "prerequisiteKey", js.undefined)
      
      @scala.inline
      def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
      
      @scala.inline
      def setRuleIndex(value: Double): Self = StObject.set(x, "ruleIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleIndexUndefined: Self = StObject.set(x, "ruleIndex", js.undefined)
    }
  }
  
  type LDFlagChangeset = StringDictionary[Current]
  
  type LDFlagSet = StringDictionary[LDFlagValue]
  
  type LDFlagValue = js.Any
  
  @js.native
  trait LDLogger extends StObject {
    
    def debug(message: String): Unit = js.native
    
    def error(message: String): Unit = js.native
    
    def info(message: String): Unit = js.native
    
    def warn(message: String): Unit = js.native
  }
  object LDLogger {
    
    @scala.inline
    def apply(debug: String => Unit, error: String => Unit, info: String => Unit, warn: String => Unit): LDLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[LDLogger]
    }
    
    @scala.inline
    implicit class LDLoggerMutableBuilder[Self <: LDLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LDOptionsBase extends StObject {
    
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
    implicit class LDOptionsBaseMutableBuilder[Self <: LDOptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllAttributesPrivate(value: Boolean): Self = StObject.set(x, "allAttributesPrivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllAttributesPrivateUndefined: Self = StObject.set(x, "allAttributesPrivate", js.undefined)
      
      @scala.inline
      def setAllowFrequentDuplicateEvents(value: Boolean): Self = StObject.set(x, "allowFrequentDuplicateEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFrequentDuplicateEventsUndefined: Self = StObject.set(x, "allowFrequentDuplicateEvents", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBootstrap(value: localStorage | LDFlagSet): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
      
      @scala.inline
      def setEvaluationReasons(value: Boolean): Self = StObject.set(x, "evaluationReasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluationReasonsUndefined: Self = StObject.set(x, "evaluationReasons", js.undefined)
      
      @scala.inline
      def setEventsUrl(value: String): Self = StObject.set(x, "eventsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUrlUndefined: Self = StObject.set(x, "eventsUrl", js.undefined)
      
      @scala.inline
      def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      @scala.inline
      def setLogger(value: LDLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPrivateAttributeNames(value: js.Array[String]): Self = StObject.set(x, "privateAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateAttributeNamesUndefined: Self = StObject.set(x, "privateAttributeNames", js.undefined)
      
      @scala.inline
      def setPrivateAttributeNamesVarargs(value: String*): Self = StObject.set(x, "privateAttributeNames", js.Array(value :_*))
      
      @scala.inline
      def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
      
      @scala.inline
      def setSendEvents(value: Boolean): Self = StObject.set(x, "sendEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendEventsOnlyForVariation(value: Boolean): Self = StObject.set(x, "sendEventsOnlyForVariation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendEventsOnlyForVariationUndefined: Self = StObject.set(x, "sendEventsOnlyForVariation", js.undefined)
      
      @scala.inline
      def setSendEventsUndefined: Self = StObject.set(x, "sendEvents", js.undefined)
      
      @scala.inline
      def setSendLDHeaders(value: Boolean): Self = StObject.set(x, "sendLDHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendLDHeadersUndefined: Self = StObject.set(x, "sendLDHeaders", js.undefined)
      
      @scala.inline
      def setStreamReconnectDelay(value: Double): Self = StObject.set(x, "streamReconnectDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamReconnectDelayUndefined: Self = StObject.set(x, "streamReconnectDelay", js.undefined)
      
      @scala.inline
      def setStreamUrl(value: String): Self = StObject.set(x, "streamUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUrlUndefined: Self = StObject.set(x, "streamUrl", js.undefined)
      
      @scala.inline
      def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
      
      @scala.inline
      def setUseReport(value: Boolean): Self = StObject.set(x, "useReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseReportUndefined: Self = StObject.set(x, "useReport", js.undefined)
    }
  }
  
  @js.native
  trait LDUser extends StObject {
    
    /**
      * Whether to show the user on the Users page in LaunchDarkly.
      */
    var anonymous: js.UndefOr[Boolean] = js.native
    
    /**
      * An absolute URL to an avatar image for the user.
      */
    var avatar: js.UndefOr[String] = js.native
    
    /**
      * The country associated with the user.
      */
    var country: js.UndefOr[String] = js.native
    
    /**
      * Any additional attributes associated with the user.
      */
    var custom: js.UndefOr[
        StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]
      ] = js.native
    
    /**
      * The user's email address.
      *
      * If an `avatar` URL is not provided, LaunchDarkly will use Gravatar
      * to try to display an avatar for the user on the Users page.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The user's first name.
      */
    var firstName: js.UndefOr[String] = js.native
    
    /**
      * The user's IP address.
      */
    var ip: js.UndefOr[String] = js.native
    
    /**
      * A unique string identifying a user.
      *
      * If you omit this property, and also set `anonymous` to `true`, the SDK will generate a UUID string
      * and use that as the key; it will attempt to persist that value in local storage if possible so the
      * next anonymous user will get the same key, but if local storage is unavailable then it will
      * generate a new key each time you specify the user.
      *
      * It is an error to omit the `key` property if `anonymous` is not set.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * The user's last name.
      */
    var lastName: js.UndefOr[String] = js.native
    
    /**
      * The user's name.
      *
      * You can search for users on the User page by name.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Specifies a list of attribute names (either built-in or custom) which should be
      * marked as private, and not sent to LaunchDarkly in analytics events. This is in
      * addition to any private attributes designated in the global configuration
      * with [[LDOptions.privateAttributeNames]] or [[LDOptions.allAttributesPrivate]].
      */
    var privateAttributeNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An optional secondary key for a user. This affects
      * [feature flag targeting](https://docs.launchdarkly.com/docs/targeting-users#section-targeting-rules-based-on-user-attributes)
      * as follows: if you have chosen to bucket users by a specific attribute, the secondary key (if set)
      * is used to further distinguish between users who are otherwise identical according to that attribute.
      */
    var secondary: js.UndefOr[String] = js.native
  }
  object LDUser {
    
    @scala.inline
    def apply(): LDUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LDUser]
    }
    
    @scala.inline
    implicit class LDUserMutableBuilder[Self <: LDUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCustom(value: StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrivateAttributeNames(value: js.Array[String]): Self = StObject.set(x, "privateAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateAttributeNamesUndefined: Self = StObject.set(x, "privateAttributeNames", js.undefined)
      
      @scala.inline
      def setPrivateAttributeNamesVarargs(value: String*): Self = StObject.set(x, "privateAttributeNames", js.Array(value :_*))
      
      @scala.inline
      def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    }
  }
}
