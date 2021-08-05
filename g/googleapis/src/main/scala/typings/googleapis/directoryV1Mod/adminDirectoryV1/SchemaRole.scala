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
  
  inline def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  
  extension [Self <: SchemaRole](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIsSuperAdminRole(value: Boolean): Self = StObject.set(x, "isSuperAdminRole", value.asInstanceOf[js.Any])
    
    inline def setIsSuperAdminRoleUndefined: Self = StObject.set(x, "isSuperAdminRole", js.undefined)
    
    inline def setIsSystemRole(value: Boolean): Self = StObject.set(x, "isSystemRole", value.asInstanceOf[js.Any])
    
    inline def setIsSystemRoleUndefined: Self = StObject.set(x, "isSystemRole", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRoleDescription(value: String): Self = StObject.set(x, "roleDescription", value.asInstanceOf[js.Any])
    
    inline def setRoleDescriptionUndefined: Self = StObject.set(x, "roleDescription", js.undefined)
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setRolePrivileges(value: js.Array[PrivilegeName]): Self = StObject.set(x, "rolePrivileges", value.asInstanceOf[js.Any])
    
    inline def setRolePrivilegesUndefined: Self = StObject.set(x, "rolePrivileges", js.undefined)
    
    inline def setRolePrivilegesVarargs(value: PrivilegeName*): Self = StObject.set(x, "rolePrivileges", js.Array(value :_*))
  }
}
