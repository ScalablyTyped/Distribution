package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for privilege resource in Directory API.
  */
trait SchemaPrivilege extends StObject {
  
  /**
    * A list of child privileges. Privileges for a service form a tree. Each
    * privilege can have a list of child privileges; this list is empty for a
    * leaf privilege.
    */
  var childPrivileges: js.UndefOr[js.Array[SchemaPrivilege]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * If the privilege can be restricted to an organization unit.
    */
  var isOuScopable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the API resource. This is always admin#directory#privilege.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the privilege.
    */
  var privilegeName: js.UndefOr[String] = js.undefined
  
  /**
    * The obfuscated ID of the service this privilege is for.
    */
  var serviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service this privilege is for.
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object SchemaPrivilege {
  
  inline def apply(): SchemaPrivilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivilege]
  }
  
  extension [Self <: SchemaPrivilege](x: Self) {
    
    inline def setChildPrivileges(value: js.Array[SchemaPrivilege]): Self = StObject.set(x, "childPrivileges", value.asInstanceOf[js.Any])
    
    inline def setChildPrivilegesUndefined: Self = StObject.set(x, "childPrivileges", js.undefined)
    
    inline def setChildPrivilegesVarargs(value: SchemaPrivilege*): Self = StObject.set(x, "childPrivileges", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIsOuScopable(value: Boolean): Self = StObject.set(x, "isOuScopable", value.asInstanceOf[js.Any])
    
    inline def setIsOuScopableUndefined: Self = StObject.set(x, "isOuScopable", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrivilegeName(value: String): Self = StObject.set(x, "privilegeName", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeNameUndefined: Self = StObject.set(x, "privilegeName", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
