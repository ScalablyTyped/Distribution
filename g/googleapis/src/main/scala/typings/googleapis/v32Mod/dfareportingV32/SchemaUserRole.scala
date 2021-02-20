package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of auser role, which is used to manage user access.
  */
@js.native
trait SchemaUserRole extends StObject {
  
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
  implicit class SchemaUserRoleMutableBuilder[Self <: SchemaUserRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setDefaultUserRole(value: Boolean): Self = StObject.set(x, "defaultUserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserRoleUndefined: Self = StObject.set(x, "defaultUserRole", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentUserRoleId(value: String): Self = StObject.set(x, "parentUserRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUserRoleIdUndefined: Self = StObject.set(x, "parentUserRoleId", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaUserRolePermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaUserRolePermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
