package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseFriendshipStatus extends StObject {
  
  var following: Boolean
  
  var is_bestie: Boolean
  
  var is_muting_reel: Boolean
  
  var outgoing_request: Boolean
}
object TimelineFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_muting_reel: Boolean, outgoing_request: Boolean): TimelineFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseFriendshipStatusMutableBuilder[Self <: TimelineFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_muting_reel(value: Boolean): Self = StObject.set(x, "is_muting_reel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
