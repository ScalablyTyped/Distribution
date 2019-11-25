package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeExecutioncount extends js.Object {
  var code: String
  var execution_count: ExecutionCount
}

object Anon_CodeExecutioncount {
  @scala.inline
  def apply(code: String, execution_count: Int | Double = null): Anon_CodeExecutioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CodeExecutioncount]
  }
}

