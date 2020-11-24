package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseMedia extends js.Object {
  
  var expiring_at: Double = js.native
  
  var user: DirectInboxFeedResponseUser = js.native
}
object DirectInboxFeedResponseMedia {
  
  @scala.inline
  def apply(expiring_at: Double, user: DirectInboxFeedResponseUser): DirectInboxFeedResponseMedia = {
    val __obj = js.Dynamic.literal(expiring_at = expiring_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseMedia]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseMediaOps[Self <: DirectInboxFeedResponseMedia] (val x: Self) extends AnyVal {
    
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
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: DirectInboxFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
