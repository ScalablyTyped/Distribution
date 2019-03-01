package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  def onFailure(response: ibmDashMobilefirstLib.WLNs.FailureResponse): scala.Unit
  def onSuccess(response: ibmDashMobilefirstLib.WLNs.ResponseBase): scala.Unit
}

object ConnectOptions {
  @scala.inline
  def apply(
    onFailure: js.Function1[ibmDashMobilefirstLib.WLNs.FailureResponse, scala.Unit],
    onSuccess: js.Function1[ibmDashMobilefirstLib.WLNs.ResponseBase, scala.Unit],
    timeout: scala.Int | scala.Double = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFailure")(onFailure)
    __obj.updateDynamic("onSuccess")(onSuccess)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

