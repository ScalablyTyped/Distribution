package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTasksList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Upper bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMin: js.UndefOr[String] = js.native
  /**
    * Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMin: js.UndefOr[String] = js.native
  /**
    * Maximum number of task lists returned on one page. Optional. The default
    * is 20 (max allowed: 100).
    */
  var maxResults: js.UndefOr[String] = js.native
  /**
    * Token specifying the result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether completed tasks are returned in the result.
    * Optional. The default is True.
    */
  var showCompleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether deleted tasks are returned in the result.
    * Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether hidden tasks are returned in the result.
    * Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp)
    * to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.native
}

object ParamsResourceTasksList {
  @scala.inline
  def apply(): ParamsResourceTasksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksList]
  }
  @scala.inline
  implicit class ParamsResourceTasksListOps[Self <: ParamsResourceTasksList] (val x: Self) extends AnyVal {
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
    def setCompletedMax(value: String): Self = this.set("completedMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedMax: Self = this.set("completedMax", js.undefined)
    @scala.inline
    def setCompletedMin(value: String): Self = this.set("completedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedMin: Self = this.set("completedMin", js.undefined)
    @scala.inline
    def setDueMax(value: String): Self = this.set("dueMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueMax: Self = this.set("dueMax", js.undefined)
    @scala.inline
    def setDueMin(value: String): Self = this.set("dueMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueMin: Self = this.set("dueMin", js.undefined)
    @scala.inline
    def setMaxResults(value: String): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setShowCompleted(value: Boolean): Self = this.set("showCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCompleted: Self = this.set("showCompleted", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
    @scala.inline
    def setTasklist(value: String): Self = this.set("tasklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasklist: Self = this.set("tasklist", js.undefined)
    @scala.inline
    def setUpdatedMin(value: String): Self = this.set("updatedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedMin: Self = this.set("updatedMin", js.undefined)
  }
  
}

