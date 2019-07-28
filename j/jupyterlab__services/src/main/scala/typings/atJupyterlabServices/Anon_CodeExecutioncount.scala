package typings.atJupyterlabServices

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeExecutioncount extends js.Object {
  var code: String
  var execution_count: ExecutionCount
}

object Anon_CodeExecutioncount {
  @scala.inline
  def apply(code: String, execution_count: ExecutionCount): Anon_CodeExecutioncount = {
    val __obj = js.Dynamic.literal(code = code, execution_count = execution_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CodeExecutioncount]
  }
}

