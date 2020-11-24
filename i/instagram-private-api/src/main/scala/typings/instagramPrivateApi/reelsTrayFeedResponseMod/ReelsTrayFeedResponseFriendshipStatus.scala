package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseFriendshipStatus extends js.Object {
  
  var blocking: js.UndefOr[Boolean] = js.native
  
  var followed_by: js.UndefOr[Boolean] = js.native
  
  var following: Boolean = js.native
  
  var incoming_request: js.UndefOr[Boolean] = js.native
  
  var is_bestie: js.UndefOr[Boolean] = js.native
  
  var is_muting_reel: Boolean = js.native
  
  var is_private: js.UndefOr[Boolean] = js.native
  
  var is_restricted: js.UndefOr[Boolean] = js.native
  
  var muting: Boolean = js.native
  
  var outgoing_request: Boolean = js.native
}
object ReelsTrayFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(following: Boolean, is_muting_reel: Boolean, muting: Boolean, outgoing_request: Boolean): ReelsTrayFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseFriendshipStatusOps[Self <: ReelsTrayFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_muting_reel(value: Boolean): Self = this.set("is_muting_reel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuting(value: Boolean): Self = this.set("muting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = this.set("outgoing_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocking(value: Boolean): Self = this.set("blocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocking: Self = this.set("blocking", js.undefined)
    
    @scala.inline
    def setFollowed_by(value: Boolean): Self = this.set("followed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowed_by: Self = this.set("followed_by", js.undefined)
    
    @scala.inline
    def setIncoming_request(value: Boolean): Self = this.set("incoming_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncoming_request: Self = this.set("incoming_request", js.undefined)
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = this.set("is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_bestie: Self = this.set("is_bestie", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_private: Self = this.set("is_private", js.undefined)
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = this.set("is_restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_restricted: Self = this.set("is_restricted", js.undefined)
  }
}
