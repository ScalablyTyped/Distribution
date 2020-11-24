package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.FailureResponse
import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends Options {
  
  var authenticator: js.UndefOr[js.Object] = js.native
  
  var autoHideSplash: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
    */
  var connectOnStartup: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
    */
  var enableLogger: js.UndefOr[Boolean] = js.native
  
  var heartBeatIntervalInSecs: js.UndefOr[Double] = js.native
  
  var messages: js.UndefOr[String] = js.native
  
  var onConnectionFailure: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var onDisabledCookies: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  /**
    * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
    */
  var onErrorAppVersionAccessDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var onErrorRemoteDisableDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  var onRequestTimeout: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var onUnsupportedBrowser: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var onUnsupportedVersion: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var onUserInstanceAccessViolation: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var validateArguments: js.UndefOr[Boolean] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Unit): InitOptions = {
    val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setOnGetCustomDeviceProvisioningProperties(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = this.set("onGetCustomDeviceProvisioningProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthenticator(value: js.Object): Self = this.set("authenticator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticator: Self = this.set("authenticator", js.undefined)
    
    @scala.inline
    def setAutoHideSplash(value: Boolean): Self = this.set("autoHideSplash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideSplash: Self = this.set("autoHideSplash", js.undefined)
    
    @scala.inline
    def setConnectOnStartup(value: Boolean): Self = this.set("connectOnStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectOnStartup: Self = this.set("connectOnStartup", js.undefined)
    
    @scala.inline
    def setEnableLogger(value: Boolean): Self = this.set("enableLogger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLogger: Self = this.set("enableLogger", js.undefined)
    
    @scala.inline
    def setHeartBeatIntervalInSecs(value: Double): Self = this.set("heartBeatIntervalInSecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartBeatIntervalInSecs: Self = this.set("heartBeatIntervalInSecs", js.undefined)
    
    @scala.inline
    def setMessages(value: String): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnConnectionFailure(value: /* response */ FailureResponse => Unit): Self = this.set("onConnectionFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConnectionFailure: Self = this.set("onConnectionFailure", js.undefined)
    
    @scala.inline
    def setOnDisabledCookies(value: /* response */ FailureResponse => Unit): Self = this.set("onDisabledCookies", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDisabledCookies: Self = this.set("onDisabledCookies", js.undefined)
    
    @scala.inline
    def setOnErrorAppVersionAccessDenial(value: /* response */ FailureResponse => Unit): Self = this.set("onErrorAppVersionAccessDenial", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnErrorAppVersionAccessDenial: Self = this.set("onErrorAppVersionAccessDenial", js.undefined)
    
    @scala.inline
    def setOnErrorRemoteDisableDenial(value: /* response */ FailureResponse => Unit): Self = this.set("onErrorRemoteDisableDenial", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnErrorRemoteDisableDenial: Self = this.set("onErrorRemoteDisableDenial", js.undefined)
    
    @scala.inline
    def setOnRequestTimeout(value: /* response */ FailureResponse => Unit): Self = this.set("onRequestTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRequestTimeout: Self = this.set("onRequestTimeout", js.undefined)
    
    @scala.inline
    def setOnUnsupportedBrowser(value: /* response */ FailureResponse => Unit): Self = this.set("onUnsupportedBrowser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnsupportedBrowser: Self = this.set("onUnsupportedBrowser", js.undefined)
    
    @scala.inline
    def setOnUnsupportedVersion(value: /* response */ FailureResponse => Unit): Self = this.set("onUnsupportedVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnsupportedVersion: Self = this.set("onUnsupportedVersion", js.undefined)
    
    @scala.inline
    def setOnUserInstanceAccessViolation(value: /* response */ FailureResponse => Unit): Self = this.set("onUserInstanceAccessViolation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserInstanceAccessViolation: Self = this.set("onUserInstanceAccessViolation", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setValidateArguments(value: Boolean): Self = this.set("validateArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateArguments: Self = this.set("validateArguments", js.undefined)
  }
}
