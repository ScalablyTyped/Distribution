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

