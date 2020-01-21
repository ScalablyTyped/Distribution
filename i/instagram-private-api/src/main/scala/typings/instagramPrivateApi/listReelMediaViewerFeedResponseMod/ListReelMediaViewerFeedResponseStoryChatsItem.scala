package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryChatsItem extends js.Object {
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
}

