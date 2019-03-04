package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationResult extends js.Object {
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isSuccessful: scala.Boolean
}

object ProcedureInvocationResult {
  @scala.inline
  def apply(isSuccessful: scala.Boolean, errors: js.Array[java.lang.String] = null): ProcedureInvocationResult = {
    val __obj = js.Dynamic.literal(isSuccessful = isSuccessful)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ProcedureInvocationResult]
  }
}

