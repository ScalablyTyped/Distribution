package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseStoryQuizsItem extends js.Object {
  var height: Double
  var is_hidden: Double
  var is_pinned: Double
  var is_sticker: Double
  var quiz_sticker: HighlightsRepositoryEditReelResponseQuiz_sticker
  var rotation: Double
  var width: Double
  var x: Double
  var y: Double
  var z: Double
}

object HighlightsRepositoryEditReelResponseStoryQuizsItem {
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    quiz_sticker: HighlightsRepositoryEditReelResponseQuiz_sticker,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): HighlightsRepositoryEditReelResponseStoryQuizsItem = {
    val __obj = js.Dynamic.literal(height = height, is_hidden = is_hidden, is_pinned = is_pinned, is_sticker = is_sticker, quiz_sticker = quiz_sticker, rotation = rotation, width = width, x = x, y = y, z = z)
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseStoryQuizsItem]
  }
}

