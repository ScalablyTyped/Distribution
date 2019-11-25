package typings.atIonicCliDashFramework.libTasksMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskChainOptions extends js.Object {
  val taskOptions: js.UndefOr[Partial[TaskOptions]] = js.undefined
}

object TaskChainOptions {
  @scala.inline
  def apply(taskOptions: Partial[TaskOptions] = null): TaskChainOptions = {
    val __obj = js.Dynamic.literal()
    if (taskOptions != null) __obj.updateDynamic("taskOptions")(taskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskChainOptions]
  }
}

