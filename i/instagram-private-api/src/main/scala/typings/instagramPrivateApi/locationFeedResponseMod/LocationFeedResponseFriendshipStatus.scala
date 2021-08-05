package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseFriendshipStatus extends StObject {
  
  var following: Boolean
  
  var is_bestie: Boolean
  
  var outgoing_request: Boolean
}
object LocationFeedResponseFriendshipStatus {
  
  inline def apply(following: Boolean, is_bestie: Boolean, outgoing_request: Boolean): LocationFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseFriendshipStatus]
  }
  
  extension [Self <: LocationFeedResponseFriendshipStatus](x: Self) {
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
