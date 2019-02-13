package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDClientBase extends js.Object {
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
  def flush(): js.Promise[scala.Unit] = js.native
  def flush(onDone: js.Function0[scala.Unit]): js.Promise[scala.Unit] = js.native
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
  def identify(user: LDUser, hash: java.lang.String): js.Promise[LDFlagSet] = js.native
  def identify(
    user: LDUser,
    hash: java.lang.String,
    onDone: js.Function2[/* err */ stdLib.Error | scala.Null, /* flags */ LDFlagSet | scala.Null, scala.Unit]
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
  def off(key: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def off(key: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
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
  def on(key: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(key: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
  /**
    * Specifies whether or not to open a streaming connection to LaunchDarkly for live flag updates.
    *
    * If this is true, the client will always attempt to maintain a streaming connection; if false,
    * it never will. If you leave the value undefined (the default), the client will open a streaming
    * connection if you subscribe to `"change"` or `"change:flag-key"` events (see [[LDClient.on]]).
    *
    * This can also be set as the `streaming` property of [[LDOptions]].
    */
  def setStreaming(): scala.Unit = js.native
  def setStreaming(value: scala.Boolean): scala.Unit = js.native
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
  def track(key: java.lang.String): scala.Unit = js.native
  def track(key: java.lang.String, data: js.Any): scala.Unit = js.native
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
  def variation(key: java.lang.String): LDFlagValue = js.native
  def variation(key: java.lang.String, defaultValue: LDFlagValue): LDFlagValue = js.native
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
  def variationDetail(key: java.lang.String): LDEvaluationDetail = js.native
  def variationDetail(key: java.lang.String, defaultValue: LDFlagValue): LDEvaluationDetail = js.native
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
  def waitForInitialization(): js.Promise[scala.Unit] = js.native
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
  def waitUntilReady(): js.Promise[scala.Unit] = js.native
}

