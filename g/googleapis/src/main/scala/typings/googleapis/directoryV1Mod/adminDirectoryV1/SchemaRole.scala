package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.PrivilegeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for role resource in Directory API.
  */
@js.native
trait SchemaRole extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Returns true if the role is a super admin role.
    */
  var isSuperAdminRole: js.UndefOr[Boolean] = js.native
  /**
    * Returns true if this is a pre-defined system role.
    */
  var isSystemRole: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#role.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A short description of the role.
    */
  var roleDescription: js.UndefOr[String] = js.native
  /**
    * ID of the role.
    */
  var roleId: js.UndefOr[String] = js.native
  /**
    * Name of the role.
    */
  var roleName: js.UndefOr[String] = js.native
  /**
    * The set of privileges that are granted to this role.
    */
  var rolePrivileges: js.UndefOr[js.Array[PrivilegeName]] = js.native
}

object SchemaRole {
  @scala.inline
  def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  @scala.inline
  implicit class SchemaRoleOps[Self <: SchemaRole] (val x: Self) extends AnyVal {
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
    def setIsSuperAdminRole(value: Boolean): Self = this.set("isSuperAdminRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSuperAdminRole: Self = this.set("isSuperAdminRole", js.undefined)
    @scala.inline
    def setIsSystemRole(value: Boolean): Self = this.set("isSystemRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSystemRole: Self = this.set("isSystemRole", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRoleDescription(value: String): Self = this.set("roleDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleDescription: Self = this.set("roleDescription", js.undefined)
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    @scala.inline
    def setRolePrivilegesVarargs(value: PrivilegeName*): Self = this.set("rolePrivileges", js.Array(value :_*))
    @scala.inline
    def setRolePrivileges(value: js.Array[PrivilegeName]): Self = this.set("rolePrivileges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolePrivileges: Self = this.set("rolePrivileges", js.undefined)
  }
  
}

