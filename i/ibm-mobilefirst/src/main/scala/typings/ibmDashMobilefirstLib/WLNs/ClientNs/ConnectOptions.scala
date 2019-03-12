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
    onFailure: ibmDashMobilefirstLib.WLNs.FailureResponse => scala.Unit,
    onSuccess: ibmDashMobilefirstLib.WLNs.ResponseBase => scala.Unit,
    timeout: scala.Int | scala.Double = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

