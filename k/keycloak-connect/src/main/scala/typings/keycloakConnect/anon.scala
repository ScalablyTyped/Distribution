package typings.keycloakConnect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Admin extends StObject {
    
    var admin: js.UndefOr[String] = js.undefined
    
    var logout: js.UndefOr[String] = js.undefined
  }
  object Admin {
    
    inline def apply(): Admin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Admin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Admin] (val x: Self) extends AnyVal {
      
      inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      inline def setLogout(value: String): Self = StObject.set(x, "logout", value.asInstanceOf[js.Any])
      
      inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var scopes: js.Array[String]
  }
  object Id {
    
    inline def apply(id: String, scopes: js.Array[String]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
}
