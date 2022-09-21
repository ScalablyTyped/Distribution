package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessSelector extends StObject {
  
  /** Optional. The permissions to appear in result. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The roles to appear in result. */
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}
object AccessSelector {
  
  inline def apply(): AccessSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSelector]
  }
  
  extension [Self <: AccessSelector](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
