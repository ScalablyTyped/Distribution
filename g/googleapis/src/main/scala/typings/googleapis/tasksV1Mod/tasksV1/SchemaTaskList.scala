package typings.googleapis.tasksV1Mod.tasksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTaskList extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Task list identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource. This is always &quot;tasks#taskList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * URL pointing to this task list. Used to retrieve, update, or delete this
    * task list.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Title of the task list.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Last modification time of the task list (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaTaskList {
  @scala.inline
  def apply(): SchemaTaskList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskList]
  }
  @scala.inline
  implicit class SchemaTaskListOps[Self <: SchemaTaskList] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

