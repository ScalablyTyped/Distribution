package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakRoles extends StObject {
  
  var roles: js.Array[String]
}
object KeycloakRoles {
  
  inline def apply(roles: js.Array[String]): KeycloakRoles = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakRoles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakRoles] (val x: Self) extends AnyVal {
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
