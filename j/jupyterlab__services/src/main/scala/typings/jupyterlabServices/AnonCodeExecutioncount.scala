package typings.jupyterlabServices

import typings.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeExecutioncount extends js.Object {
  var code: String
  var execution_count: ExecutionCount
}

object AnonCodeExecutioncount {
  @scala.inline
  def apply(code: String, execution_count: Int | Double = null): AnonCodeExecutioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeExecutioncount]
  }
}

