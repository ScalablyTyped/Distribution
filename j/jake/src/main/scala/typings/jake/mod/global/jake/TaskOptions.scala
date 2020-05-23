package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  /**
    * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    * @default false
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * number of parllel async tasks
    */
  var parallelLimit: js.UndefOr[Double] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, parallelLimit: js.UndefOr[Double] = js.undefined): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelLimit)) __obj.updateDynamic("parallelLimit")(parallelLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

