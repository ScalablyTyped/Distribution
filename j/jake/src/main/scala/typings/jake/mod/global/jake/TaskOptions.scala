package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskOptions extends js.Object {
  /**
    * Perform this task asynchronously. If you flag a task with this option, you must call the global `complete` method inside the task's action, for execution to proceed to the next task.
    * @default false
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * number of parllel async tasks
    */
  var parallelLimit: js.UndefOr[Double] = js.native
}

object TaskOptions {
  @scala.inline
  def apply(): TaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskOptions]
  }
  @scala.inline
  implicit class TaskOptionsOps[Self <: TaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setParallelLimit(value: Double): Self = this.set("parallelLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelLimit: Self = this.set("parallelLimit", js.undefined)
  }
  
}

