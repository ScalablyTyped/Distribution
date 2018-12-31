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

