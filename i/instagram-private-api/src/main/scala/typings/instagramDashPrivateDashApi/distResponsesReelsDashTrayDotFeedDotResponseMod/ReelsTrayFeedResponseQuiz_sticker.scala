package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseQuiz_sticker extends js.Object {
  var correct_answer: Double
  var end_background_color: String
  var finished: Boolean
  var id: String
  var question: String
  var quiz_id: String
  var start_background_color: String
  var tallies: js.Array[ReelsTrayFeedResponseTalliesItem]
  var text_color: String
  var viewer_can_answer: Boolean
}

object ReelsTrayFeedResponseQuiz_sticker {
  @scala.inline
  def apply(
    correct_answer: Double,
    end_background_color: String,
    finished: Boolean,
    id: String,
    question: String,
    quiz_id: String,
    start_background_color: String,
    tallies: js.Array[ReelsTrayFeedResponseTalliesItem],
    text_color: String,
    viewer_can_answer: Boolean
  ): ReelsTrayFeedResponseQuiz_sticker = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer, end_background_color = end_background_color, finished = finished, id = id, question = question, quiz_id = quiz_id, start_background_color = start_background_color, tallies = tallies, text_color = text_color, viewer_can_answer = viewer_can_answer)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseQuiz_sticker]
  }
}

