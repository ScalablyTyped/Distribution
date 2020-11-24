package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponseItemsItem extends js.Object {
  
  var client_context: js.UndefOr[String] = js.native
  
  var item_id: String = js.native
  
  var item_type: String = js.native
  
  var link: js.UndefOr[DirectInboxFeedResponseLink] = js.native
  
  var placeholder: js.UndefOr[DirectInboxFeedResponsePlaceholder] = js.native
  
  var profile: js.UndefOr[DirectInboxFeedResponseProfile] = js.native
  
  var reel_share: js.UndefOr[DirectInboxFeedResponseReelShare] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var timestamp: String = js.native
  
  var user_id: Double = js.native
}
object DirectInboxFeedResponseItemsItem {
  
  @scala.inline
  def apply(item_id: String, item_type: String, timestamp: String, user_id: Double): DirectInboxFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseItemsItem]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseItemsItemOps[Self <: DirectInboxFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setItem_id(value: String): Self = this.set("item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_type(value: String): Self = this.set("item_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_context(value: String): Self = this.set("client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_context: Self = this.set("client_context", js.undefined)
    
    @scala.inline
    def setLink(value: DirectInboxFeedResponseLink): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: DirectInboxFeedResponsePlaceholder): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setProfile(value: DirectInboxFeedResponseProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setReel_share(value: DirectInboxFeedResponseReelShare): Self = this.set("reel_share", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_share: Self = this.set("reel_share", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
