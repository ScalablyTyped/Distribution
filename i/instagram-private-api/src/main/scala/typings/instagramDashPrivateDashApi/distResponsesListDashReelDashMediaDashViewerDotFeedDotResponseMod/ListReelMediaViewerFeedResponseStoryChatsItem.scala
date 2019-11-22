package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryChatsItem extends js.Object {
  var chat_sticker: ListReelMediaViewerFeedResponseChat_sticker
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
    chat_sticker: ListReelMediaViewerFeedResponseChat_sticker,
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
    val __obj = js.Dynamic.literal(chat_sticker = chat_sticker, height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryChatsItem]
  }
}

