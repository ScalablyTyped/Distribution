package typings.instagramPrivateApi.restrictActionRepositoryRestrictResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestrictActionRepositoryRestrictResponseFriendshipStatus extends js.Object {
  
  var blocking: Boolean = js.native
  
  var followed_by: Boolean = js.native
  
  var following: Boolean = js.native
  
  var incoming_request: Boolean = js.native
  
  var is_bestie: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_restricted: Boolean = js.native
  
  var muting: Boolean = js.native
  
  var outgoing_request: Boolean = js.native
}
object RestrictActionRepositoryRestrictResponseFriendshipStatus {
  
  @scala.inline
  def apply(
    blocking: Boolean,
    followed_by: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    muting: Boolean,
    outgoing_request: Boolean
  ): RestrictActionRepositoryRestrictResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseFriendshipStatus]
  }
  
  @scala.inline
  implicit class RestrictActionRepositoryRestrictResponseFriendshipStatusOps[Self <: RestrictActionRepositoryRestrictResponseFriendshipStatus] (val x: Self) extends AnyVal {
    
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
    def setBlocking(value: Boolean): Self = this.set("blocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowed_by(value: Boolean): Self = this.set("followed_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncoming_request(value: Boolean): Self = this.set("incoming_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bestie(value: Boolean): Self = this.set("is_bestie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = this.set("is_restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuting(value: Boolean): Self = this.set("muting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoing_request(value: Boolean): Self = this.set("outgoing_request", value.asInstanceOf[js.Any])
  }
}
