package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationOptions
  extends ibmDashMobilefirstLib.WLNs.Options {
  var timeout: scala.Double
  @JSName("onSuccess")
  def onSuccess_MProcedureInvocationOptions(response: ProcedureResponse): scala.Unit
}

object ProcedureInvocationOptions {
  @scala.inline
  def apply(
    onSuccess: ProcedureResponse => scala.Unit,
    timeout: scala.Double,
    invocationContext: js.Any = null,
    onFailure: /* response */ ibmDashMobilefirstLib.WLNs.IResponse => scala.Unit = null
  ): ProcedureInvocationOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), timeout = timeout)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    __obj.asInstanceOf[ProcedureInvocationOptions]
  }
}

