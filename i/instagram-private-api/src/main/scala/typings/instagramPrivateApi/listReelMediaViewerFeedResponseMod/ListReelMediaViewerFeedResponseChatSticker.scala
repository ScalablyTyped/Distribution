package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseChatSticker extends StObject {
  
  var end_background_color: String
  
  var has_started_chat: Boolean
  
  var start_background_color: String
  
  var status: String
  
  var story_chat_id: String
  
  var text: String
  
  var thread_id: String
}
object ListReelMediaViewerFeedResponseChatSticker {
  
  inline def apply(
    end_background_color: String,
    has_started_chat: Boolean,
    start_background_color: String,
    status: String,
    story_chat_id: String,
    text: String,
    thread_id: String
  ): ListReelMediaViewerFeedResponseChatSticker = {
    val __obj = js.Dynamic.literal(end_background_color = end_background_color.asInstanceOf[js.Any], has_started_chat = has_started_chat.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], story_chat_id = story_chat_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseChatSticker]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseChatSticker](x: Self) {
    
    inline def setEnd_background_color(value: String): Self = StObject.set(x, "end_background_color", value.asInstanceOf[js.Any])
    
    inline def setHas_started_chat(value: Boolean): Self = StObject.set(x, "has_started_chat", value.asInstanceOf[js.Any])
    
    inline def setStart_background_color(value: String): Self = StObject.set(x, "start_background_color", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStory_chat_id(value: String): Self = StObject.set(x, "story_chat_id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
