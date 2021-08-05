package typings.keycloakConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Grant extends StObject {
    
    var grant: js.UndefOr[typings.keycloakConnect.mod.Grant] = js.undefined
  }
  object Grant {
    
    inline def apply(): Grant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grant]
    }
    
    extension [Self <: Grant](x: Self) {
      
      inline def setGrant(value: typings.keycloakConnect.mod.Grant): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
    }
  }
  
  trait Roles extends StObject {
    
    var roles: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Roles {
    
    inline def apply(): Roles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Roles]
    }
    
    extension [Self <: Roles](x: Self) {
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
}
