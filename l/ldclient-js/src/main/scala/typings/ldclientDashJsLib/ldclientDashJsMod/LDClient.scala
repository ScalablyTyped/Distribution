package typings
package ldclientDashJsLib.ldclientDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDClient extends js.Object {
  /**
       * Deregisters an event listener. See LDEventSignature for the available event types.
       *
       * @param key
       *   The name of the event for which to stop listening.
       * @param callback
       *   The function to deregister.
       * @param context
       *   The "this" context for the callback.
       */
  @JSName("off")
  var off_Original: LDEventSignature = js.native
  /**
       * Registers an event listener. See LDEventSignature for the available event types
       * and the data that can be associated with them.
       *
       * @param key
       *   The name of the event for which to listen.
       * @param callback
       *   The function to execute when the event fires. The callback may or may not
       *   receive parameters, depending on the type of event; see LDEventSignature.
       * @param context
       *   The "this" context to use for the callback.
       */
  @JSName("on")
  var on_Original: LDEventSignature = js.native
  /**
       * Returns a map of all available flags to the current user's values.
       */
  def allFlags(): LDFlagSet = js.native
  /**
       * Flushes pending events asynchronously.
       *
       * @param onDone
       *   A callback to invoke after the events were flushed.
       */
  def flush(): js.Promise[scala.Unit] = js.native
  /**
       * Flushes pending events asynchronously.
       *
       * @param onDone
       *   A callback to invoke after the events were flushed.
       */
  def flush(onDone: js.Function): js.Promise[scala.Unit] = js.native
  /**
       * Identifies a user to LaunchDarkly.
       *
       * This only needs to be called if the user changes identities because
       * normally the user's identity is set during client initialization.
       *
       * @param user
       *   A map of user options. Must contain at least the `key` property
       *   which identifies the user.
       * @param hash
       *   The signed user key for Secure Mode; see
       *   http://docs.launchdarkly.com/docs/js-sdk-reference#secure-mode
       * @param onDone
       *   A callback to invoke after the user is identified.
       */
  def identify(user: LDUser): js.Promise[scala.Unit] = js.native
  /**
       * Identifies a user to LaunchDarkly.
       *
       * This only needs to be called if the user changes identities because
       * normally the user's identity is set during client initialization.
       *
       * @param user
       *   A map of user options. Must contain at least the `key` property
       *   which identifies the user.
       * @param hash
       *   The signed user key for Secure Mode; see
       *   http://docs.launchdarkly.com/docs/js-sdk-reference#secure-mode
       * @param onDone
       *   A callback to invoke after the user is identified.
       */
  def identify(user: LDUser, hash: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
       * Identifies a user to LaunchDarkly.
       *
       * This only needs to be called if the user changes identities because
       * normally the user's identity is set during client initialization.
       *
       * @param user
       *   A map of user options. Must contain at least the `key` property
       *   which identifies the user.
       * @param hash
       *   The signed user key for Secure Mode; see
       *   http://docs.launchdarkly.com/docs/js-sdk-reference#secure-mode
       * @param onDone
       *   A callback to invoke after the user is identified.
       */
  def identify(
    user: LDUser,
    hash: java.lang.String,
    onDone: js.Function2[/* err */ stdLib.Error | scala.Null, /* flags */ LDFlagSet | scala.Null, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  /**
       * Deregisters an event listener. See LDEventSignature for the available event types.
       *
       * @param key
       *   The name of the event for which to stop listening.
       * @param callback
       *   The function to deregister.
       * @param context
       *   The "this" context for the callback.
       */
  def off(
    key: java.lang.String,
    callback: js.Function2[
      /* current */ js.UndefOr[LDFlagValue | LDFlagChangeset], 
      /* previous */ js.UndefOr[LDFlagValue], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Deregisters an event listener. See LDEventSignature for the available event types.
       *
       * @param key
       *   The name of the event for which to stop listening.
       * @param callback
       *   The function to deregister.
       * @param context
       *   The "this" context for the callback.
       */
  def off(
    key: java.lang.String,
    callback: js.Function2[
      /* current */ js.UndefOr[LDFlagValue | LDFlagChangeset], 
      /* previous */ js.UndefOr[LDFlagValue], 
      scala.Unit
    ],
    context: js.Any
  ): scala.Unit = js.native
  /**
       * Registers an event listener. See LDEventSignature for the available event types
       * and the data that can be associated with them.
       *
       * @param key
       *   The name of the event for which to listen.
       * @param callback
       *   The function to execute when the event fires. The callback may or may not
       *   receive parameters, depending on the type of event; see LDEventSignature.
       * @param context
       *   The "this" context to use for the callback.
       */
  def on(
    key: java.lang.String,
    callback: js.Function2[
      /* current */ js.UndefOr[LDFlagValue | LDFlagChangeset], 
      /* previous */ js.UndefOr[LDFlagValue], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Registers an event listener. See LDEventSignature for the available event types
       * and the data that can be associated with them.
       *
       * @param key
       *   The name of the event for which to listen.
       * @param callback
       *   The function to execute when the event fires. The callback may or may not
       *   receive parameters, depending on the type of event; see LDEventSignature.
       * @param context
       *   The "this" context to use for the callback.
       */
  def on(
    key: java.lang.String,
    callback: js.Function2[
      /* current */ js.UndefOr[LDFlagValue | LDFlagChangeset], 
      /* previous */ js.UndefOr[LDFlagValue], 
      scala.Unit
    ],
    context: js.Any
  ): scala.Unit = js.native
  /**
       * Specifies whether or not to open a streaming connection to LaunchDarkly for live flag updates.
       *
       * If this is true, the client will always attempt to maintain a streaming connection; if false,
       * it never will. If you leave the value undefined (the default), the client will open a streaming
       * connection if you subscribe to "change" or "change:flag-key" events (see LDClient.on()).
       *
       * This can also be set as the "streaming" property of the client options.
       */
  def setStreaming(): scala.Unit = js.native
  /**
       * Specifies whether or not to open a streaming connection to LaunchDarkly for live flag updates.
       *
       * If this is true, the client will always attempt to maintain a streaming connection; if false,
       * it never will. If you leave the value undefined (the default), the client will open a streaming
       * connection if you subscribe to "change" or "change:flag-key" events (see LDClient.on()).
       *
       * This can also be set as the "streaming" property of the client options.
       */
  def setStreaming(value: scala.Boolean): scala.Unit = js.native
  /**
       * Track page events to use in goals or A/B tests.
       *
       * LaunchDarkly automatically tracks pageviews and clicks that are
       * specified in the Goals section of their dashboard. This can be used
       * to track custom goals or other events that do not currently have
       * goals.
       *
       * @param key
       *   The event to record.
       * @param data
       *   Additional information to associate with the event.
       */
  def track(key: java.lang.String): scala.Unit = js.native
  /**
       * Track page events to use in goals or A/B tests.
       *
       * LaunchDarkly automatically tracks pageviews and clicks that are
       * specified in the Goals section of their dashboard. This can be used
       * to track custom goals or other events that do not currently have
       * goals.
       *
       * @param key
       *   The event to record.
       * @param data
       *   Additional information to associate with the event.
       */
  def track(key: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
       * Retrieves a flag's value.
       *
       * @param key
       *   The key of the flag for which to retrieve the corresponding value.
       * @param defaultValue
       *   The value to use if the flag is not available (for example, if the
       *   user is offline or a flag is requested that does not exist).
       *
       * @returns
       *   The flag's value.
       */
  def variation(key: java.lang.String): LDFlagValue = js.native
  /**
       * Retrieves a flag's value.
       *
       * @param key
       *   The key of the flag for which to retrieve the corresponding value.
       * @param defaultValue
       *   The value to use if the flag is not available (for example, if the
       *   user is offline or a flag is requested that does not exist).
       *
       * @returns
       *   The flag's value.
       */
  def variation(key: java.lang.String, defaultValue: LDFlagValue): LDFlagValue = js.native
  /**
       * Retrieves a flag's value, along with information about how it was calculated, in the form
       * of an LDEvaluationDetail object. Note that the "reason" property will only have a value
       * if you specified "evaluationExplanations: true" in your configuration.
       *
       * The reason property of the result will also be included in analytics events, if you are
       * capturing detailed event data for this flag.
       *
       * @param key
       *   The key of the flag for which to retrieve the corresponding value.
       * @param defaultValue
       *   The value to use if the flag is not available (for example, if the
       *   user is offline or a flag is requested that does not exist).
       *
       * @returns LDEvaluationDetail object containing the value and explanation.
       */
  def variationDetail(key: java.lang.String): LDEvaluationDetail = js.native
  /**
       * Retrieves a flag's value, along with information about how it was calculated, in the form
       * of an LDEvaluationDetail object. Note that the "reason" property will only have a value
       * if you specified "evaluationExplanations: true" in your configuration.
       *
       * The reason property of the result will also be included in analytics events, if you are
       * capturing detailed event data for this flag.
       *
       * @param key
       *   The key of the flag for which to retrieve the corresponding value.
       * @param defaultValue
       *   The value to use if the flag is not available (for example, if the
       *   user is offline or a flag is requested that does not exist).
       *
       * @returns LDEvaluationDetail object containing the value and explanation.
       */
  def variationDetail(key: java.lang.String, defaultValue: LDFlagValue): LDEvaluationDetail = js.native
  /**
       * Allows you to wait for client initialization using Promise syntax. The returned
       * Promise will be resolved if the client successfully initializes, or rejected (with
       * an error object) if it fails to initialize (e.g. due to an invalid environment key
       * or a server error). This is different from waitUntilReady(), which resolves the
       * Promise in either case.
       * 
       * If you prefer to use event handlers rather than Promises, you can listen on the
       * client for the events "initialized" and "failed".
       * 
       * @returns a Promise containing the initialization state of the client
       */
  def waitForInitialization(): js.Promise[scala.Unit] = js.native
  /**
       * Allows you to wait for client initialization using Promise syntax. The returned
       * Promise will be resolved once the client has either successfully initialized or
       * failed to initialize (e.g. due to an invalid environment key or a server error).
       * 
       * If you want to distinguish between these success and failure conditions, use
       * waitForInitialization() instead.
       * 
       * If you prefer to use event handlers rather than Promises, you can listen on the
       * client for a "ready" event.
       * 
       * @returns a Promise containing the initialization state of the client
       */
  def waitUntilReady(): js.Promise[scala.Unit] = js.native
}

