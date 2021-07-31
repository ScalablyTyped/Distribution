package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleapis.anon.PrivilegeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for role resource in Directory API.
  */
trait SchemaRole extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Returns true if the role is a super admin role.
    */
  var isSuperAdminRole: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns true if this is a pre-defined system role.
    */
  var isSystemRole: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the API resource. This is always admin#directory#role.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A short description of the role.
    */
  var roleDescription: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the role.
    */
  var roleId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the role.
    */
  var roleName: js.UndefOr[String] = js.undefined
  
  /**
    * The set of privileges that are granted to this role.
    */
  var rolePrivileges: js.UndefOr[js.Array[PrivilegeName]] = js.undefined
}
object SchemaRole {
  
  @scala.inline
  def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  
  @scala.inline
  implicit class SchemaRoleMutableBuilder[Self <: SchemaRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setIsSuperAdminRole(value: Boolean): Self = StObject.set(x, "isSuperAdminRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuperAdminRoleUndefined: Self = StObject.set(x, "isSuperAdminRole", js.undefined)
    
    @scala.inline
    def setIsSystemRole(value: Boolean): Self = StObject.set(x, "isSystemRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemRoleUndefined: Self = StObject.set(x, "isSystemRole", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRoleDescription(value: String): Self = StObject.set(x, "roleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleDescriptionUndefined: Self = StObject.set(x, "roleDescription", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setRolePrivileges(value: js.Array[PrivilegeName]): Self = StObject.set(x, "rolePrivileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolePrivilegesUndefined: Self = StObject.set(x, "rolePrivileges", js.undefined)
    
    @scala.inline
    def setRolePrivilegesVarargs(value: PrivilegeName*): Self = StObject.set(x, "rolePrivileges", js.Array(value :_*))
  }
}
