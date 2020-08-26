package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * API Version
    * @default 'v2.01'
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * API Base URL.The fault base value points to sandbox.
    * Production is 'https://api.mangopay.com'
    *
    * @default "https://api.sandbox.mangopay.com"
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * API Client Api Key
    */
  var clientApiKey: String = js.native
  /**
    * API Client Id
    */
  var clientId: String = js.native
  /**
    * Set the connection timeout limit(in milliseconds)
    * @default 30000
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * Active debugging
    * @default false
    */
  var debugMode: js.UndefOr[Boolean] = js.native
  /**
    * Set a custom error handler
    * @default `console.error`
    */
  var errorHandler: js.UndefOr[js.Function2[/* options */ js.Any, /* err */ js.Any, Unit]] = js.native
  /**
    * Log function to be used for debug
    * @default `console.log`
    */
  var logClass: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Set the response timeout limit(in milliseconds)
    * @default 80000
    */
  var responseTimeout: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(clientApiKey: String, clientId: String): Config = {
    val __obj = js.Dynamic.literal(clientApiKey = clientApiKey.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setClientApiKey(value: String): Self = this.set("clientApiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    @scala.inline
    def setDebugMode(value: Boolean): Self = this.set("debugMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMode: Self = this.set("debugMode", js.undefined)
    @scala.inline
    def setErrorHandler(value: (/* options */ js.Any, /* err */ js.Any) => Unit): Self = this.set("errorHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    @scala.inline
    def setLogClass(value: /* repeated */ js.Any => Unit): Self = this.set("logClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogClass: Self = this.set("logClass", js.undefined)
    @scala.inline
    def setResponseTimeout(value: Double): Self = this.set("responseTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTimeout: Self = this.set("responseTimeout", js.undefined)
  }
  
}

