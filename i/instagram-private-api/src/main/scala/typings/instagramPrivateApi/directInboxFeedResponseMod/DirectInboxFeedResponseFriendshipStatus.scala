package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponseFriendshipStatus extends StObject {
  
  var blocking: Boolean
  
  var following: Boolean
  
  var incoming_request: Boolean
  
  var is_bestie: Boolean
  
  var is_private: Boolean
  
  var outgoing_request: Boolean
}
object DirectInboxFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(
    blocking: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    outgoing_request: Boolean
  ): DirectInboxFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseFriendshipStatusMutableBuilder[Self <: DirectInboxFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
