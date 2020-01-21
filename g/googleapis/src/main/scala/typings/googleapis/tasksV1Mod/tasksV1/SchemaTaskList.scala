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
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null
  ): SchemaTaskList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTaskList]
  }
}

