package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseStoryPollsItem extends js.Object {
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var poll_sticker: MediaUpdatedMediaResponsePollSticker
  var rotation: Double
  var width: String
  var x: Double
  var y: Double
  var z: Double
}

object MediaUpdatedMediaResponseStoryPollsItem {
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    poll_sticker: MediaUpdatedMediaResponsePollSticker,
    rotation: Double,
    width: String,
    x: Double,
    y: Double,
    z: Double
  ): MediaUpdatedMediaResponseStoryPollsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], poll_sticker = poll_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseStoryPollsItem]
  }
}

