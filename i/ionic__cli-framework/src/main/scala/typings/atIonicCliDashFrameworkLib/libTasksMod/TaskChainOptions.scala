package typings
package atIonicCliDashFrameworkLib.libTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskChainOptions extends js.Object {
  val taskOptions: js.UndefOr[stdLib.Partial[TaskOptions]] = js.undefined
}

object TaskChainOptions {
  @scala.inline
  def apply(taskOptions: stdLib.Partial[TaskOptions] = null): TaskChainOptions = {
    val __obj = js.Dynamic.literal()
    if (taskOptions != null) __obj.updateDynamic("taskOptions")(taskOptions)
    __obj.asInstanceOf[TaskChainOptions]
  }
}

