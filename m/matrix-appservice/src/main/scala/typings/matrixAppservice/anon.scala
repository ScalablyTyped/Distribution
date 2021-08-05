package typings.matrixAppservice

import typings.matrixAppservice.appServiceRegistrationMod.RegexObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aliases extends StObject {
    
    var aliases: js.UndefOr[js.Array[RegexObj]] = js.undefined
    
    var rooms: js.UndefOr[js.Array[RegexObj]] = js.undefined
    
    var users: js.UndefOr[js.Array[RegexObj]] = js.undefined
  }
  object Aliases {
    
    inline def apply(): Aliases = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aliases]
    }
    
    extension [Self <: Aliases](x: Self) {
      
      inline def setAliases(value: js.Array[RegexObj]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: RegexObj*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      inline def setRooms(value: js.Array[RegexObj]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
      
      inline def setRoomsVarargs(value: RegexObj*): Self = StObject.set(x, "rooms", js.Array(value :_*))
      
      inline def setUsers(value: js.Array[RegexObj]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsersVarargs(value: RegexObj*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait HomeserverToken extends StObject {
    
    var homeserverToken: String
    
    var httpMaxSizeBytes: js.UndefOr[Double] = js.undefined
  }
  object HomeserverToken {
    
    inline def apply(homeserverToken: String): HomeserverToken = {
      val __obj = js.Dynamic.literal(homeserverToken = homeserverToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[HomeserverToken]
    }
    
    extension [Self <: HomeserverToken](x: Self) {
      
      inline def setHomeserverToken(value: String): Self = StObject.set(x, "homeserverToken", value.asInstanceOf[js.Any])
      
      inline def setHttpMaxSizeBytes(value: Double): Self = StObject.set(x, "httpMaxSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setHttpMaxSizeBytesUndefined: Self = StObject.set(x, "httpMaxSizeBytes", js.undefined)
    }
  }
}
