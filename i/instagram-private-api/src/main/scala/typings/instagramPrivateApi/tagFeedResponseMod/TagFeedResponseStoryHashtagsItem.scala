package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseStoryHashtagsItem extends js.Object {
  var hashtag: TagFeedResponseHashtag
  var height: String | Double
  var is_hidden: Double
  var is_pinned: Double
  var rotation: String | Double
  var width: String | Double
  var x: String | Double
  var y: String | Double
  var z: Double
}

object TagFeedResponseStoryHashtagsItem {
  @scala.inline
  def apply(
    hashtag: TagFeedResponseHashtag,
    height: String | Double,
    is_hidden: Double,
    is_pinned: Double,
    rotation: String | Double,
    width: String | Double,
    x: String | Double,
    y: String | Double,
    z: Double
  ): TagFeedResponseStoryHashtagsItem = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseStoryHashtagsItem]
  }
}

