package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseChatSticker extends js.Object {
  var end_background_color: String
  var has_started_chat: Boolean
  var start_background_color: String
  var status: String
  var story_chat_id: String
  var text: String
  var thread_id: String
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
}

