package typings.jupyterlabServices

import typings.jupyterlabServices.kernelKernelMod.Kernel.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutionstate extends js.Object {
  var execution_state: Status
}

object AnonExecutionstate {
  @scala.inline
  def apply(execution_state: Status): AnonExecutionstate = {
    val __obj = js.Dynamic.literal(execution_state = execution_state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExecutionstate]
  }
}

