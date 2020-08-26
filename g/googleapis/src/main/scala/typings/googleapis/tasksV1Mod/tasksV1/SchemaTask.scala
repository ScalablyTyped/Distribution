package typings.googleapis.tasksV1Mod.tasksV1

import typings.googleapis.anon.Link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTask extends js.Object {
  /**
    * Completion date of the task (as a RFC 3339 timestamp). This field is
    * omitted if the task has not been completed.
    */
  var completed: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether the task has been deleted. The default if False.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Due date of the task (as a RFC 3339 timestamp). Optional.
    */
  var due: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether the task is hidden. This is the case if the task
    * had been marked completed when the task list was last cleared. The
    * default is False. This field is read-only.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * Task identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource. This is always &quot;tasks#task&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Collection of links. This collection is read-only.
    */
  var links: js.UndefOr[js.Array[Link]] = js.native
  /**
    * Notes describing the task. Optional.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Parent task identifier. This field is omitted if it is a top-level task.
    * This field is read-only. Use the &quot;move&quot; method to move the task
    * under a different parent or to the top level.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * String indicating the position of the task among its sibling tasks under
    * the same parent task or at the top level. If this string is greater than
    * another task&#39;s corresponding position string according to
    * lexicographical ordering, the task is positioned after the other task
    * under the same parent task (or at the top level). This field is
    * read-only. Use the &quot;move&quot; method to move the task to another
    * position.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * URL pointing to this task. Used to retrieve, update, or delete this task.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Status of the task. This is either &quot;needsAction&quot; or
    * &quot;completed&quot;.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Title of the task.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Last modification time of the task (as a RFC 3339 timestamp).
    */
  var updated: js.UndefOr[String] = js.native
}

object SchemaTask {
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  @scala.inline
  implicit class SchemaTaskOps[Self <: SchemaTask] (val x: Self) extends AnyVal {
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
    def setCompleted(value: String): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setDue(value: String): Self = this.set("due", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDue: Self = this.set("due", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
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

