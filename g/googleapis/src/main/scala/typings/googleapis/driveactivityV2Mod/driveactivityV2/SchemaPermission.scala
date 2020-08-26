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
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
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
    def setAllowDiscovery(value: Boolean): Self = this.set("allowDiscovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDiscovery: Self = this.set("allowDiscovery", js.undefined)
    @scala.inline
    def setAnyone(value: SchemaAnyone): Self = this.set("anyone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyone: Self = this.set("anyone", js.undefined)
    @scala.inline
    def setDomain(value: SchemaDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setGroup(value: SchemaGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setUser(value: SchemaUser): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

