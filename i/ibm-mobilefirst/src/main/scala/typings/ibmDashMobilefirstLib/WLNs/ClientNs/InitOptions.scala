package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var authenticator: js.UndefOr[js.Object] = js.undefined
  var autoHideSplash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
    */
  var connectOnStartup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
    */
  var enableLogger: js.UndefOr[scala.Boolean] = js.undefined
  var heartBeatIntervalInSecs: js.UndefOr[scala.Double] = js.undefined
  var messages: js.UndefOr[java.lang.String] = js.undefined
  var onConnectionFailure: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onDisabledCookies: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  /**
    * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
    */
  var onErrorAppVersionAccessDenial: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onErrorRemoteDisableDenial: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onRequestTimeout: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onUnsupportedBrowser: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onUnsupportedVersion: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var onUserInstanceAccessViolation: js.UndefOr[
    js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var validateArguments: js.UndefOr[scala.Boolean] = js.undefined
  def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit
}

object InitOptions {
  @scala.inline
  def apply(
    onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, scala.Unit] => scala.Unit,
    authenticator: js.Object = null,
    autoHideSplash: js.UndefOr[scala.Boolean] = js.undefined,
    connectOnStartup: js.UndefOr[scala.Boolean] = js.undefined,
    enableLogger: js.UndefOr[scala.Boolean] = js.undefined,
    heartBeatIntervalInSecs: scala.Int | scala.Double = null,
    invocationContext: js.Any = null,
    messages: java.lang.String = null,
    onConnectionFailure: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onDisabledCookies: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onErrorAppVersionAccessDenial: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onErrorRemoteDisableDenial: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onRequestTimeout: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onSuccess: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null,
    onUnsupportedBrowser: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onUnsupportedVersion: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    onUserInstanceAccessViolation: /* response */ ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    validateArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): InitOptions = {
    val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator)
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash)
    if (!js.isUndefined(connectOnStartup)) __obj.updateDynamic("connectOnStartup")(connectOnStartup)
    if (!js.isUndefined(enableLogger)) __obj.updateDynamic("enableLogger")(enableLogger)
    if (heartBeatIntervalInSecs != null) __obj.updateDynamic("heartBeatIntervalInSecs")(heartBeatIntervalInSecs.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (messages != null) __obj.updateDynamic("messages")(messages)
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
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(validateArguments)) __obj.updateDynamic("validateArguments")(validateArguments)
    __obj.asInstanceOf[InitOptions]
  }
}

