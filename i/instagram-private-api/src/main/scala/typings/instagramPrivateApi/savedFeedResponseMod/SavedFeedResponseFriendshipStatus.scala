package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseFriendshipStatus extends StObject {
  
  var following: Boolean
  
  var is_bestie: Boolean
  
  var is_restricted: Boolean
  
  var outgoing_request: Boolean
}
object SavedFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): SavedFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class SavedFeedResponseFriendshipStatusMutableBuilder[Self <: SavedFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
