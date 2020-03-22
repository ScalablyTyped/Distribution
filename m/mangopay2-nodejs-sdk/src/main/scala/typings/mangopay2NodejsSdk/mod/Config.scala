package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * API Version
    * @default 'v2.01'
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  /**
    * API Base URL.The fault base value points to sandbox.
    * Production is 'https://api.mangopay.com'
    *
    * @default "https://api.sandbox.mangopay.com"
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * API Client Api Key
    */
  var clientApiKey: String
  /**
    * API Client Id
    */
  var clientId: String
  /**
    * Set the connection timeout limit(in milliseconds)
    * @default 30000
    */
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Active debugging
    * @default false
    */
  var debugMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Set a custom error handler
    * @default `console.error`
    */
  var errorHandler: js.UndefOr[js.Function2[/* options */ js.Any, /* err */ js.Any, Unit]] = js.undefined
  /**
    * Log function to be used for debug
    * @default `console.log`
    */
  var logClass: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /**
    * Set the response timeout limit(in milliseconds)
    * @default 80000
    */
  var responseTimeout: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    clientApiKey: String,
    clientId: String,
    apiVersion: String = null,
    baseUrl: String = null,
    connectionTimeout: Int | Double = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    errorHandler: (/* options */ js.Any, /* err */ js.Any) => Unit = null,
    logClass: /* repeated */ js.Any => Unit = null,
    responseTimeout: Int | Double = null
  ): Config = {
    val __obj = js.Dynamic.literal(clientApiKey = clientApiKey.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction2(errorHandler))
    if (logClass != null) __obj.updateDynamic("logClass")(js.Any.fromFunction1(logClass))
    if (responseTimeout != null) __obj.updateDynamic("responseTimeout")(responseTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

