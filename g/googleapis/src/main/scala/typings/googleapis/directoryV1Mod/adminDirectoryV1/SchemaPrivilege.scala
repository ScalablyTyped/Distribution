package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivilege extends StObject {
  
  /**
    * A list of child privileges. Privileges for a service form a tree. Each privilege can have a list of child privileges; this list is empty for a leaf privilege.
    */
  var childPrivileges: js.UndefOr[js.Array[SchemaPrivilege]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the privilege can be restricted to an organization unit.
    */
  var isOuScopable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of the API resource. This is always `admin#directory#privilege`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the privilege.
    */
  var privilegeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The obfuscated ID of the service this privilege is for. This value is returned with [`Privileges.list()`](/admin-sdk/directory/v1/reference/privileges/list).
    */
  var serviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the service this privilege is for.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrivilege {
  
  inline def apply(): SchemaPrivilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivilege]
  }
  
  extension [Self <: SchemaPrivilege](x: Self) {
    
    inline def setChildPrivileges(value: js.Array[SchemaPrivilege]): Self = StObject.set(x, "childPrivileges", value.asInstanceOf[js.Any])
    
    inline def setChildPrivilegesUndefined: Self = StObject.set(x, "childPrivileges", js.undefined)
    
    inline def setChildPrivilegesVarargs(value: SchemaPrivilege*): Self = StObject.set(x, "childPrivileges", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIsOuScopable(value: Boolean): Self = StObject.set(x, "isOuScopable", value.asInstanceOf[js.Any])
    
    inline def setIsOuScopableNull: Self = StObject.set(x, "isOuScopable", null)
    
    inline def setIsOuScopableUndefined: Self = StObject.set(x, "isOuScopable", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrivilegeName(value: String): Self = StObject.set(x, "privilegeName", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeNameNull: Self = StObject.set(x, "privilegeName", null)
    
    inline def setPrivilegeNameUndefined: Self = StObject.set(x, "privilegeName", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
