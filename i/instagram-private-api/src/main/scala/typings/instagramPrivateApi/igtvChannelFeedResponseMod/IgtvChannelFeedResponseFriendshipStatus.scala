package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseFriendshipStatus extends StObject {
  
  var blocking: js.UndefOr[Boolean] = js.undefined
  
  var followed_by: js.UndefOr[Boolean] = js.undefined
  
  var following: Boolean
  
  var incoming_request: js.UndefOr[Boolean] = js.undefined
  
  var is_bestie: Boolean
  
  var is_private: js.UndefOr[Boolean] = js.undefined
  
  var is_restricted: Boolean
  
  var muting: js.UndefOr[Boolean] = js.undefined
  
  var outgoing_request: Boolean
}
object IgtvChannelFeedResponseFriendshipStatus {
  
  inline def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): IgtvChannelFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseFriendshipStatus]
  }
  
  extension [Self <: IgtvChannelFeedResponseFriendshipStatus](x: Self) {
    
    inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
    
    inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
    
    inline def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
    
    inline def setFollowed_byUndefined: Self = StObject.set(x, "followed_by", js.undefined)
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
    
    inline def setIncoming_requestUndefined: Self = StObject.set(x, "incoming_request", js.undefined)
    
    inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
    
    inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    inline def setIs_privateUndefined: Self = StObject.set(x, "is_private", js.undefined)
    
    inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
    
    inline def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
    
    inline def setMutingUndefined: Self = StObject.set(x, "muting", js.undefined)
    
    inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
  }
}
