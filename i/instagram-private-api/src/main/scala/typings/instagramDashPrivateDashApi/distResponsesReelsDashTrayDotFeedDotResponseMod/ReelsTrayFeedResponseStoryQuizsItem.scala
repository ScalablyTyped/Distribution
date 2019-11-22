package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseStoryQuizsItem extends js.Object {
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var quiz_sticker: ReelsTrayFeedResponseQuiz_sticker
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
    quiz_sticker: ReelsTrayFeedResponseQuiz_sticker,
    rotation: String,
    width: Double,
    x: String,
    y: Double,
    z: Double
  ): ReelsTrayFeedResponseStoryQuizsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, quiz_sticker = quiz_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseStoryQuizsItem]
  }
}

