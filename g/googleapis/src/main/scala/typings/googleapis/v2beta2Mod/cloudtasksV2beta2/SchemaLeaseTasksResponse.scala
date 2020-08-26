package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for leasing tasks using LeaseTasks.
  */
@js.native
trait SchemaLeaseTasksResponse extends js.Object {
  /**
    * The leased tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.native
}

object SchemaLeaseTasksResponse {
  @scala.inline
  def apply(): SchemaLeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksResponse]
  }
  @scala.inline
  implicit class SchemaLeaseTasksResponseOps[Self <: SchemaLeaseTasksResponse] (val x: Self) extends AnyVal {
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
    def setTasksVarargs(value: SchemaTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[SchemaTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

