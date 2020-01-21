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
  def apply(tasks: js.Array[SchemaTask] = null): SchemaLeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLeaseTasksResponse]
  }
}

