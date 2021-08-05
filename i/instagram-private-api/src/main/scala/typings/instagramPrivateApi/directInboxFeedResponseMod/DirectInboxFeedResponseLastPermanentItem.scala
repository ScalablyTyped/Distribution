package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponseLastPermanentItem extends StObject {
  
  var client_context: js.UndefOr[String] = js.undefined
  
  var item_id: String
  
  var item_type: String
  
  var link: js.UndefOr[DirectInboxFeedResponseLink] = js.undefined
  
  var placeholder: js.UndefOr[DirectInboxFeedResponsePlaceholder] = js.undefined
  
  var profile: js.UndefOr[DirectInboxFeedResponseProfile] = js.undefined
  
  var reel_share: js.UndefOr[DirectInboxFeedResponseReelShare] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var timestamp: String
  
  var user_id: Double
}
object DirectInboxFeedResponseLastPermanentItem {
  
  inline def apply(item_id: String, item_type: String, timestamp: String, user_id: Double): DirectInboxFeedResponseLastPermanentItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseLastPermanentItem]
  }
  
  extension [Self <: DirectInboxFeedResponseLastPermanentItem](x: Self) {
    
    inline def setClient_context(value: String): Self = StObject.set(x, "client_context", value.asInstanceOf[js.Any])
    
    inline def setClient_contextUndefined: Self = StObject.set(x, "client_context", js.undefined)
    
    inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
    
    inline def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
    
    inline def setLink(value: DirectInboxFeedResponseLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setPlaceholder(value: DirectInboxFeedResponsePlaceholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setProfile(value: DirectInboxFeedResponseProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setReel_share(value: DirectInboxFeedResponseReelShare): Self = StObject.set(x, "reel_share", value.asInstanceOf[js.Any])
    
    inline def setReel_shareUndefined: Self = StObject.set(x, "reel_share", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
