package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List privileges operation in Directory API.
  */
@js.native
trait SchemaPrivileges extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * A list of Privilege resources.
    */
  var items: js.UndefOr[js.Array[SchemaPrivilege]] = js.native
  /**
    * The type of the API resource. This is always admin#directory#privileges.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaPrivileges {
  @scala.inline
  def apply(etag: String = null, items: js.Array[SchemaPrivilege] = null, kind: String = null): SchemaPrivileges = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrivileges]
  }
}

