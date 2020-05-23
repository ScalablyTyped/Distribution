package typings.jupyterlabServices.anon

import typings.jupyterlabNbformat.mod.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executioncount extends js.Object {
  var code: String
  var execution_count: ExecutionCount
}

object Executioncount {
  @scala.inline
  def apply(code: String, execution_count: ExecutionCount = null.asInstanceOf[ExecutionCount]): Executioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executioncount]
  }
}

