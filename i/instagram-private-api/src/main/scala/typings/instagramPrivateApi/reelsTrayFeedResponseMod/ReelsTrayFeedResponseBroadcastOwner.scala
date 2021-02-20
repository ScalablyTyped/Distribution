package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseBroadcastOwner extends StObject {
  
  var friendship_status: ReelsTrayFeedResponseFriendshipStatus = js.native
  
  var full_name: String = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var live_subscription_status: String = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var username: String = js.native
}
object ReelsTrayFeedResponseBroadcastOwner {
  
  @scala.inline
  def apply(
    friendship_status: ReelsTrayFeedResponseFriendshipStatus,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    live_subscription_status: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): ReelsTrayFeedResponseBroadcastOwner = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], live_subscription_status = live_subscription_status.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseBroadcastOwner]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseBroadcastOwnerMutableBuilder[Self <: ReelsTrayFeedResponseBroadcastOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendship_status(value: ReelsTrayFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLive_subscription_status(value: String): Self = StObject.set(x, "live_subscription_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
