package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of auser role, which is used to manage user access.
  */
@js.native
trait SchemaUserRole extends js.Object {
  
  /**
    * Account ID of this user role. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether this is a default user role. Default user roles are created by
    * the system for the account/subaccount and cannot be modified or deleted.
    * Each default user role comes with a basic set of preassigned permissions.
    */
  var defaultUserRole: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of this user role. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRole&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this user role. This is a required field. Must be less than 256
    * characters long. If this user role is under a subaccount, the name must
    * be unique among sites of the same subaccount. Otherwise, this user role
    * is a top-level user role, and the name must be unique among top-level
    * user roles of the same account.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * ID of the user role that this user role is based on or copied from. This
    * is a required field.
    */
  var parentUserRoleId: js.UndefOr[String] = js.native
  
  /**
    * List of permissions associated with this user role.
    */
  var permissions: js.UndefOr[js.Array[SchemaUserRolePermission]] = js.native
  
  /**
    * Subaccount ID of this user role. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}
object SchemaUserRole {
  
  @scala.inline
  def apply(): SchemaUserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRole]
  }
  
  @scala.inline
  implicit class SchemaUserRoleOps[Self <: SchemaUserRole] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setDefaultUserRole(value: Boolean): Self = this.set("defaultUserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUserRole: Self = this.set("defaultUserRole", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentUserRoleId(value: String): Self = this.set("parentUserRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentUserRoleId: Self = this.set("parentUserRoleId", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaUserRolePermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaUserRolePermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
}
