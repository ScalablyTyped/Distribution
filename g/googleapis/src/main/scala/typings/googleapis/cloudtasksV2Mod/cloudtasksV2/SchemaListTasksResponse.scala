package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing tasks using ListTasks.
  */
@js.native
trait SchemaListTasksResponse extends js.Object {
  /**
    * A token to retrieve next page of results.  To return the next page of
    * results, call ListTasks with this value as the page_token.  If the
    * next_page_token is empty, there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.native
}

object SchemaListTasksResponse {
  @scala.inline
  def apply(): SchemaListTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTasksResponse]
  }
  @scala.inline
  implicit class SchemaListTasksResponseOps[Self <: SchemaListTasksResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTasksVarargs(value: SchemaTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[SchemaTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

