package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directRepositoryGetPresenceResponseMod {
  
  trait DirectRepositoryGetPresenceResponseRootObject extends StObject {
    
    var status: String
    
    var user_presence: js.Any
  }
  object DirectRepositoryGetPresenceResponseRootObject {
    
    inline def apply(status: String, user_presence: js.Any): DirectRepositoryGetPresenceResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_presence = user_presence.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectRepositoryGetPresenceResponseRootObject]
    }
    
    extension [Self <: DirectRepositoryGetPresenceResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser_presence(value: js.Any): Self = StObject.set(x, "user_presence", value.asInstanceOf[js.Any])
    }
  }
}
