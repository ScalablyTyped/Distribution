package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseStoryQuizsItem extends js.Object {
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var quiz_sticker: ReelsTrayFeedResponseQuizSticker
  var rotation: String
  var width: Double
  var x: String
  var y: Double
  var z: Double
}

object ReelsTrayFeedResponseStoryQuizsItem {
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    quiz_sticker: ReelsTrayFeedResponseQuizSticker,
    rotation: String,
    width: Double,
    x: String,
    y: Double,
    z: Double
  ): ReelsTrayFeedResponseStoryQuizsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], quiz_sticker = quiz_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseStoryQuizsItem]
  }
}

