package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponseMedia extends StObject {
  
  var expiring_at: Double
  
  var user: DirectInboxFeedResponseUser
}
object DirectInboxFeedResponseMedia {
  
  inline def apply(expiring_at: Double, user: DirectInboxFeedResponseUser): DirectInboxFeedResponseMedia = {
    val __obj = js.Dynamic.literal(expiring_at = expiring_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseMedia]
  }
  
  extension [Self <: DirectInboxFeedResponseMedia](x: Self) {
    
    inline def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: DirectInboxFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
