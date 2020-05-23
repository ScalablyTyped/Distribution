package typings.ibmMobilefirst.WL.Client

import typings.ibmMobilefirst.WL.FailureResponse
import typings.ibmMobilefirst.WL.IResponse
import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends Options {
  var authenticator: js.UndefOr[js.Object] = js.undefined
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
    */
  var connectOnStartup: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
    */
  var enableLogger: js.UndefOr[Boolean] = js.undefined
  var heartBeatIntervalInSecs: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[String] = js.undefined
  var onConnectionFailure: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onDisabledCookies: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  /**
    * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
    */
  var onErrorAppVersionAccessDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onErrorRemoteDisableDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onRequestTimeout: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUnsupportedBrowser: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUnsupportedVersion: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUserInstanceAccessViolation: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var validateArguments: js.UndefOr[Boolean] = js.undefined
  def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, Unit]): Unit
}

object InitOptions {
  @scala.inline
  def apply(
    onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Unit,
    authenticator: js.Object = null,
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    connectOnStartup: js.UndefOr[Boolean] = js.undefined,
    enableLogger: js.UndefOr[Boolean] = js.undefined,
    heartBeatIntervalInSecs: js.UndefOr[Double] = js.undefined,
    invocationContext: js.Any = null,
    messages: String = null,
    onConnectionFailure: /* response */ FailureResponse => Unit = null,
    onDisabledCookies: /* response */ FailureResponse => Unit = null,
    onErrorAppVersionAccessDenial: /* response */ FailureResponse => Unit = null,
    onErrorRemoteDisableDenial: /* response */ FailureResponse => Unit = null,
    onFailure: /* response */ IResponse => Unit = null,
    onRequestTimeout: /* response */ FailureResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    onUnsupportedBrowser: /* response */ FailureResponse => Unit = null,
    onUnsupportedVersion: /* response */ FailureResponse => Unit = null,
    onUserInstanceAccessViolation: /* response */ FailureResponse => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined,
    validateArguments: js.UndefOr[Boolean] = js.undefined
  ): InitOptions = {
    val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectOnStartup)) __obj.updateDynamic("connectOnStartup")(connectOnStartup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogger)) __obj.updateDynamic("enableLogger")(enableLogger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartBeatIntervalInSecs)) __obj.updateDynamic("heartBeatIntervalInSecs")(heartBeatIntervalInSecs.get.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onConnectionFailure != null) __obj.updateDynamic("onConnectionFailure")(js.Any.fromFunction1(onConnectionFailure))
    if (onDisabledCookies != null) __obj.updateDynamic("onDisabledCookies")(js.Any.fromFunction1(onDisabledCookies))
    if (onErrorAppVersionAccessDenial != null) __obj.updateDynamic("onErrorAppVersionAccessDenial")(js.Any.fromFunction1(onErrorAppVersionAccessDenial))
    if (onErrorRemoteDisableDenial != null) __obj.updateDynamic("onErrorRemoteDisableDenial")(js.Any.fromFunction1(onErrorRemoteDisableDenial))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onRequestTimeout != null) __obj.updateDynamic("onRequestTimeout")(js.Any.fromFunction1(onRequestTimeout))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (onUnsupportedBrowser != null) __obj.updateDynamic("onUnsupportedBrowser")(js.Any.fromFunction1(onUnsupportedBrowser))
    if (onUnsupportedVersion != null) __obj.updateDynamic("onUnsupportedVersion")(js.Any.fromFunction1(onUnsupportedVersion))
    if (onUserInstanceAccessViolation != null) __obj.updateDynamic("onUserInstanceAccessViolation")(js.Any.fromFunction1(onUserInstanceAccessViolation))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateArguments)) __obj.updateDynamic("validateArguments")(validateArguments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

