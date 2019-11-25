package typings.atJupyterlabServices

import typings.atJupyterlabServices.libKernelKernelMod.Kernel.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Executionstate extends js.Object {
  var execution_state: Status
}

object Anon_Executionstate {
  @scala.inline
  def apply(execution_state: Status): Anon_Executionstate = {
    val __obj = js.Dynamic.literal(execution_state = execution_state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Executionstate]
  }
}

