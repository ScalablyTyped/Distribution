package typings.ibmDashMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationResult extends js.Object {
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var isSuccessful: Boolean
}

object ProcedureInvocationResult {
  @scala.inline
  def apply(isSuccessful: Boolean, errors: js.Array[String] = null): ProcedureInvocationResult = {
    val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationResult]
  }
}

