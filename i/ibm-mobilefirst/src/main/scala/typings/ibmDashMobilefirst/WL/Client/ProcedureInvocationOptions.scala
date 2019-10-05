package typings.ibmDashMobilefirst.WL.Client

import typings.ibmDashMobilefirst.WL.IResponse
import typings.ibmDashMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationOptions extends Options {
  var timeout: Double
  @JSName("onSuccess")
  def onSuccess_MProcedureInvocationOptions(response: ProcedureResponse): Unit
}

object ProcedureInvocationOptions {
  @scala.inline
  def apply(
    onSuccess: ProcedureResponse => Unit,
    timeout: Double,
    invocationContext: js.Any = null,
    onFailure: /* response */ IResponse => Unit = null
  ): ProcedureInvocationOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), timeout = timeout)
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext)
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    __obj.asInstanceOf[ProcedureInvocationOptions]
  }
}

