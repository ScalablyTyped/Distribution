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
    
    @scala.inline
    def apply(): Aliases = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aliases]
    }
    
    @scala.inline
    implicit class AliasesMutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[RegexObj]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: RegexObj*): Self = StObject.set(x, "aliases", js.Array(value :_*))
      
      @scala.inline
      def setRooms(value: js.Array[RegexObj]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
      
      @scala.inline
      def setRoomsVarargs(value: RegexObj*): Self = StObject.set(x, "rooms", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[RegexObj]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      @scala.inline
      def setUsersVarargs(value: RegexObj*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait HomeserverToken extends StObject {
    
    var homeserverToken: String
    
    var httpMaxSizeBytes: js.UndefOr[Double] = js.undefined
  }
  object HomeserverToken {
    
    @scala.inline
    def apply(homeserverToken: String): HomeserverToken = {
      val __obj = js.Dynamic.literal(homeserverToken = homeserverToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[HomeserverToken]
    }
    
    @scala.inline
    implicit class HomeserverTokenMutableBuilder[Self <: HomeserverToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHomeserverToken(value: String): Self = StObject.set(x, "homeserverToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMaxSizeBytes(value: Double): Self = StObject.set(x, "httpMaxSizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMaxSizeBytesUndefined: Self = StObject.set(x, "httpMaxSizeBytes", js.undefined)
    }
  }
}
