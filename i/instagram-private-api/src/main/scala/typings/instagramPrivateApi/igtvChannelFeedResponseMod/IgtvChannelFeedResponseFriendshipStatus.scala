package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvChannelFeedResponseFriendshipStatus extends js.Object {
  
  var blocking: js.UndefOr[Boolean] = js.native
  
  var followed_by: js.UndefOr[Boolean] = js.native
  
  var following: Boolean = js.native
  
  var incoming_request: js.UndefOr[Boolean] = js.native
  
  var is_bestie: Boolean = js.native
  
  var is_private: js.UndefOr[Boolean] = js.native
  
  var is_restricted: Boolean = js.native
  
  var muting: js.UndefOr[Boolean] = js.native
  
  var outgoing_request: Boolean = js.native
}
object IgtvChannelFeedResponseFriendshipStatus {
  
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): IgtvChannelFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class IgtvChannelFeedResponseFriendshipStatusOps[Self <: IgtvChannelFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
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
    def setIs_bestie(value: Boolean): Self = this.set("is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = this.set("is_restricted", value.asInstanceOf[js.Any])
    
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
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_private: Self = this.set("is_private", js.undefined)
    
    @scala.inline
    def setMuting(value: Boolean): Self = this.set("muting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuting: Self = this.set("muting", js.undefined)
  }
}
