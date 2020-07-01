package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Group resource in Directory API.
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * Is the group created by admin (Read-only) *
    */
  var adminCreated: js.UndefOr[Boolean] = js.native
  /**
    * List of aliases (Read-only)
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  /**
    * Description of the group
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Group direct members count
    */
  var directMembersCount: js.UndefOr[String] = js.native
  /**
    * Email of Group
    */
  var email: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier of Group (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Group name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of non editable aliases (Read-only)
    */
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(
    adminCreated: js.UndefOr[Boolean] = js.undefined,
    aliases: js.Array[String] = null,
    description: String = null,
    directMembersCount: String = null,
    email: String = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    nonEditableAliases: js.Array[String] = null
  ): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adminCreated)) __obj.updateDynamic("adminCreated")(adminCreated.get.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (directMembersCount != null) __obj.updateDynamic("directMembersCount")(directMembersCount.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nonEditableAliases != null) __obj.updateDynamic("nonEditableAliases")(nonEditableAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroup]
  }
}

