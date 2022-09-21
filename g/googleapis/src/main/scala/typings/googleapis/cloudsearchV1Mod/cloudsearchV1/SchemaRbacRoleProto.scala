package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRbacRoleProto extends StObject {
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DEPRECATED as of 01.11.2019
    */
  var rbacNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format: "RbacNamespaceName.RbacRoleName(/field=value)*", e.g., "hr.v1.Reader", "hr.v1.Reader/language=EN_US/country=USA/room=NYC-9th-11A201".
    */
  var rbacRoleName: js.UndefOr[String | Null] = js.undefined
}
object SchemaRbacRoleProto {
  
  inline def apply(): SchemaRbacRoleProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRbacRoleProto]
  }
  
  extension [Self <: SchemaRbacRoleProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRbacNamespace(value: String): Self = StObject.set(x, "rbacNamespace", value.asInstanceOf[js.Any])
    
    inline def setRbacNamespaceNull: Self = StObject.set(x, "rbacNamespace", null)
    
    inline def setRbacNamespaceUndefined: Self = StObject.set(x, "rbacNamespace", js.undefined)
    
    inline def setRbacRoleName(value: String): Self = StObject.set(x, "rbacRoleName", value.asInstanceOf[js.Any])
    
    inline def setRbacRoleNameNull: Self = StObject.set(x, "rbacRoleName", null)
    
    inline def setRbacRoleNameUndefined: Self = StObject.set(x, "rbacRoleName", js.undefined)
  }
}
