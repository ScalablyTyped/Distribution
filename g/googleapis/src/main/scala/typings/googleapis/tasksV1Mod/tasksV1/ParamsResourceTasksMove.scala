package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTasksMove extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * New parent task identifier. If the task is moved to the top level, this
    * parameter is omitted. Optional.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * New previous sibling task identifier. If the task is moved to the first
    * position among its siblings, this parameter is omitted. Optional.
    */
  var previous: js.UndefOr[String] = js.native
  /**
    * Task identifier.
    */
  var task: js.UndefOr[String] = js.native
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.native
}

object ParamsResourceTasksMove {
  @scala.inline
  def apply(): ParamsResourceTasksMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksMove]
  }
  @scala.inline
  implicit class ParamsResourceTasksMoveOps[Self <: ParamsResourceTasksMove] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    @scala.inline
    def setTask(value: String): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
    @scala.inline
    def setTasklist(value: String): Self = this.set("tasklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasklist: Self = this.set("tasklist", js.undefined)
  }
  
}

