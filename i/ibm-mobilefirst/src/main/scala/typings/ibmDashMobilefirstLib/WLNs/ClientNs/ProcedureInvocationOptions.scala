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
    onSuccess: js.Function1[ProcedureResponse, scala.Unit],
    timeout: scala.Double,
    invocationContext: js.Any = null,
    onFailure: js.Function1[/* response */ ibmDashMobilefirstLib.WLNs.IResponse, scala.Unit] = null
  ): ProcedureInvocationOptions = {
    val __obj = js.Dynamic.literal(onSuccess = onSuccess, timeout = timeout)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    __obj.asInstanceOf[ProcedureInvocationOptions]
  }
}

