package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteCount extends js.Object {
  var execution_count: ExecutionCount
}

object IExecuteCount {
  @scala.inline
  def apply(execution_count: Int | Double = null): IExecuteCount = {
    val __obj = js.Dynamic.literal()
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteCount]
  }
}

