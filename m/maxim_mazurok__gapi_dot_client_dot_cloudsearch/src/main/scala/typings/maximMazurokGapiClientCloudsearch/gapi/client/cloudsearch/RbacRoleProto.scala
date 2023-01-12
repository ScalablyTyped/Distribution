package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RbacRoleProto extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var objectId: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED as of 01.11.2019 */
  var rbacNamespace: js.UndefOr[String] = js.undefined
  
  /** Format: "RbacNamespaceName.RbacRoleName(/field=value)*", e.g., "hr.v1.Reader", "hr.v1.Reader/language=EN_US/country=USA/room=NYC-9th-11A201". */
  var rbacRoleName: js.UndefOr[String] = js.undefined
}
object RbacRoleProto {
  
  inline def apply(): RbacRoleProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RbacRoleProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RbacRoleProto] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRbacNamespace(value: String): Self = StObject.set(x, "rbacNamespace", value.asInstanceOf[js.Any])
    
    inline def setRbacNamespaceUndefined: Self = StObject.set(x, "rbacNamespace", js.undefined)
    
    inline def setRbacRoleName(value: String): Self = StObject.set(x, "rbacRoleName", value.asInstanceOf[js.Any])
    
    inline def setRbacRoleNameUndefined: Self = StObject.set(x, "rbacRoleName", js.undefined)
  }
}
