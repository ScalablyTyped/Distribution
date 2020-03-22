package typings.ionicCliFramework.tasksMod

import typings.ionicCliFramework.PartialTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskChainOptions extends js.Object {
  val taskOptions: js.UndefOr[PartialTaskOptions] = js.undefined
}

object TaskChainOptions {
  @scala.inline
  def apply(taskOptions: PartialTaskOptions = null): TaskChainOptions = {
    val __obj = js.Dynamic.literal()
    if (taskOptions != null) __obj.updateDynamic("taskOptions")(taskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskChainOptions]
  }
}

