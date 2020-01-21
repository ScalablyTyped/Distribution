package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The permission setting of an object.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * If true, the item can be discovered (e.g. in the user&#39;s &quot;Shared
    * with me&quot; collection) without needing a link to the item.
    */
  var allowDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * If set, this permission applies to anyone, even logged out users.
    */
  var anyone: js.UndefOr[SchemaAnyone] = js.native
  /**
    * The domain to whom this permission applies.
    */
  var domain: js.UndefOr[SchemaDomain] = js.native
  /**
    * The group to whom this permission applies.
    */
  var group: js.UndefOr[SchemaGroup] = js.native
  /**
    * Indicates the &lt;a
    * href=&quot;/drive/web/manage-sharing#roles&quot;&gt;Google Drive
    * permissions role&lt;/a&gt;. The role determines a user&#39;s ability to
    * read, write, and comment on items.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The user to whom this permission applies.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(
    allowDiscovery: js.UndefOr[Boolean] = js.undefined,
    anyone: SchemaAnyone = null,
    domain: SchemaDomain = null,
    group: SchemaGroup = null,
    role: String = null,
    user: SchemaUser = null
  ): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDiscovery)) __obj.updateDynamic("allowDiscovery")(allowDiscovery.asInstanceOf[js.Any])
    if (anyone != null) __obj.updateDynamic("anyone")(anyone.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermission]
  }
}

