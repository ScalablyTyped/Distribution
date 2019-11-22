package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryHashtagsItem extends js.Object {
  var hashtag: ListReelMediaViewerFeedResponseHashtag
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var width: Double
  var x: Double
  var y: Double
  var z: Double
}

object ListReelMediaViewerFeedResponseStoryHashtagsItem {
  @scala.inline
  def apply(
    hashtag: ListReelMediaViewerFeedResponseHashtag,
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ListReelMediaViewerFeedResponseStoryHashtagsItem = {
    val __obj = js.Dynamic.literal(hashtag = hashtag, height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryHashtagsItem]
  }
}

