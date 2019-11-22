package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseChat_sticker extends js.Object {
  var end_background_color: String
  var has_started_chat: Boolean
  var start_background_color: String
  var status: String
  var story_chat_id: String
  var text: String
  var thread_id: String
}

object ListReelMediaViewerFeedResponseChat_sticker {
  @scala.inline
  def apply(
    end_background_color: String,
    has_started_chat: Boolean,
    start_background_color: String,
    status: String,
    story_chat_id: String,
    text: String,
    thread_id: String
  ): ListReelMediaViewerFeedResponseChat_sticker = {
    val __obj = js.Dynamic.literal(end_background_color = end_background_color, has_started_chat = has_started_chat, start_background_color = start_background_color, status = status, story_chat_id = story_chat_id, text = text, thread_id = thread_id)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseChat_sticker]
  }
}

