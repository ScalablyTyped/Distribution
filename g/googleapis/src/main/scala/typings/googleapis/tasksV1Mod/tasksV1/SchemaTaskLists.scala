package typings.googleapis.tasksV1Mod.tasksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTaskLists extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Collection of task lists.
    */
  var items: js.UndefOr[js.Array[SchemaTaskList]] = js.native
  /**
    * Type of the resource. This is always &quot;tasks#taskLists&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token that can be used to request the next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaTaskLists {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaTaskList] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaTaskLists = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTaskLists]
  }
}

