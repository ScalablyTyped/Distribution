package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List roles operation in Directory API.
  */
@js.native
trait SchemaRoles extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of Role resources.
    */
  var items: js.UndefOr[js.Array[SchemaRole]] = js.native
  /**
    * The type of the API resource. This is always admin#directory#roles.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaRoles {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaRole] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaRoles = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoles]
  }
}

