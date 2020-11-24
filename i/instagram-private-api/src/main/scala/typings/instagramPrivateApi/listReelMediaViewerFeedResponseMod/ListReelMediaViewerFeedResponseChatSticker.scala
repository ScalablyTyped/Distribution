package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseChatSticker extends js.Object {
  
  var end_background_color: String = js.native
  
  var has_started_chat: Boolean = js.native
  
  var start_background_color: String = js.native
  
  var status: String = js.native
  
  var story_chat_id: String = js.native
  
  var text: String = js.native
  
  var thread_id: String = js.native
}
object ListReelMediaViewerFeedResponseChatSticker {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseChatStickerOps[Self <: ListReelMediaViewerFeedResponseChatSticker] (val x: Self) extends AnyVal {
    
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
    def setEnd_background_color(value: String): Self = this.set("end_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_started_chat(value: Boolean): Self = this.set("has_started_chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_background_color(value: String): Self = this.set("start_background_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_chat_id(value: String): Self = this.set("story_chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_id(value: String): Self = this.set("thread_id", value.asInstanceOf[js.Any])
  }
}
