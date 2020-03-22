package typings.jupyterlabServices

import typings.jupyterlabNbformat.mod.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExecutioncount extends js.Object {
  var code: String
  var execution_count: ExecutionCount
}

object AnonExecutioncount {
  @scala.inline
  def apply(code: String, execution_count: Int | Double = null): AnonExecutioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExecutioncount]
  }
}

