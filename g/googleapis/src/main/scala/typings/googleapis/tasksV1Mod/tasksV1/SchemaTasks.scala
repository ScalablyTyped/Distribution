package typings.googleapis.tasksV1Mod.tasksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTasks extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Collection of tasks.
    */
  var items: js.UndefOr[js.Array[SchemaTask]] = js.native
  /**
    * Type of the resource. This is always &quot;tasks#tasks&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaTasks {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaTask] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaTasks = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTasks]
  }
}

