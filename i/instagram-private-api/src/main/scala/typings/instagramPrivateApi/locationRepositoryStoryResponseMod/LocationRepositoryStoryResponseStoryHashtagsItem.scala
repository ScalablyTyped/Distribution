package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseStoryHashtagsItem extends js.Object {
  var hashtag: LocationRepositoryStoryResponseHashtag
  var height: String
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var width: String
  var x: String
  var y: String
  var z: Double
}

object LocationRepositoryStoryResponseStoryHashtagsItem {
  @scala.inline
  def apply(
    hashtag: LocationRepositoryStoryResponseHashtag,
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: String,
    x: String,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseStoryHashtagsItem = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseStoryHashtagsItem]
  }
}

