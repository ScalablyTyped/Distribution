package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

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
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryHashtagsItem]
  }
}

