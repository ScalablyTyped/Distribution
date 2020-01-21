package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseStoryCountdownsItem extends js.Object {
  var countdown_sticker: ReelsMediaFeedResponseCountdownSticker
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var rotation: Double
  var width: Double
  var x: Double
  var y: Double
  var z: Double
}

object ReelsMediaFeedResponseStoryCountdownsItem {
  @scala.inline
  def apply(
    countdown_sticker: ReelsMediaFeedResponseCountdownSticker,
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ReelsMediaFeedResponseStoryCountdownsItem = {
    val __obj = js.Dynamic.literal(countdown_sticker = countdown_sticker.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsMediaFeedResponseStoryCountdownsItem]
  }
}

