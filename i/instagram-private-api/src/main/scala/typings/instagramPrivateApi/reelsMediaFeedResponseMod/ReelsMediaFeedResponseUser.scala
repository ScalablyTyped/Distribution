package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseUser extends js.Object {
  
  var friendship_status: js.UndefOr[ReelsMediaFeedResponseFriendshipStatus] = js.native
  
  var full_name: js.UndefOr[String] = js.native
  
  var is_private: js.UndefOr[Boolean] = js.native
  
  var is_verified: js.UndefOr[Boolean] = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ReelsMediaFeedResponseUser {
  
  @scala.inline
  def apply(pk: Double): ReelsMediaFeedResponseUser = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseUser]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseUserOps[Self <: ReelsMediaFeedResponseUser] (val x: Self) extends AnyVal {
    
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
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendship_status(value: ReelsMediaFeedResponseFriendshipStatus): Self = this.set("friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendship_status: Self = this.set("friendship_status", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_name: Self = this.set("full_name", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_private: Self = this.set("is_private", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_verified: Self = this.set("is_verified", js.undefined)
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_id: Self = this.set("profile_pic_id", js.undefined)
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_url: Self = this.set("profile_pic_url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
