package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseStoryChatsItem extends StObject {
  
  var chat_sticker: ListReelMediaViewerFeedResponseChatSticker
  
  var height: Double
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var rotation: Double
  
  var width: Double
  
  var x: String
  
  var y: Double
  
  var z: Double
}
object ListReelMediaViewerFeedResponseStoryChatsItem {
  
  @scala.inline
  def apply(
    chat_sticker: ListReelMediaViewerFeedResponseChatSticker,
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: Double,
    x: String,
    y: Double,
    z: Double
  ): ListReelMediaViewerFeedResponseStoryChatsItem = {
    val __obj = js.Dynamic.literal(chat_sticker = chat_sticker.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryChatsItem]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryChatsItemMutableBuilder[Self <: ListReelMediaViewerFeedResponseStoryChatsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat_sticker(value: ListReelMediaViewerFeedResponseChatSticker): Self = StObject.set(x, "chat_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
