package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseFriendshipStatus extends StObject {
  
  var blocking: js.UndefOr[Boolean] = js.undefined
  
  var followed_by: js.UndefOr[Boolean] = js.undefined
  
  var following: Boolean
  
  var incoming_request: js.UndefOr[Boolean] = js.undefined
  
  var is_bestie: js.UndefOr[Boolean] = js.undefined
  
  var is_muting_reel: Boolean
  
  var is_private: js.UndefOr[Boolean] = js.undefined
  
  var is_restricted: js.UndefOr[Boolean] = js.undefined
  
  var muting: Boolean
  
  var outgoing_request: Boolean
}
object ReelsTrayFeedResponseFriendshipStatus {
  
  inline def apply(following: Boolean, is_muting_reel: Boolean, muting: Boolean, outgoing_request: Boolean): ReelsTrayFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseFriendshipStatus]
  }
  
  extension [Self <: ReelsTrayFeedResponseFriendshipStatus](x: Self) {
    
    inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
    
    inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
    
    inline def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
    
    inline def setFollowed_byUndefined: Self = StObject.set(x, "followed_by", js.undefined)
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
    
    inline def setIncoming_requestUndefined: Self = StObject.set(x, "incoming_request", js.undefined)
    
    inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    inline def setIs_bestieUndefined: Self = StObject.set(x, "is_bestie", js.undefined)
    
    inline def setIs_muting_reel(value: Boolean): Self = StObject.set(x, "is_muting_reel", value.asInstanceOf[js.Any])
    
    inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    inline def setIs_privateUndefined: Self = StObject.set(x, "is_private", js.undefined)
    
    inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
    
    inline def setIs_restrictedUndefined: Self = StObject.set(x, "is_restricted", js.undefined)
    
    inline def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
    
    inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
