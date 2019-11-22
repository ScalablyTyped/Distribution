package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuiz extends StorySticker {
  var correct_answer: String
  var end_background_color: String
  var options: js.Array[Anon_Count]
  var question: String
  var start_background_color: String
  var text_color: String
  var viewer_answer: Double
  var viewer_can_answer: Boolean
}

object StoryQuiz {
  @scala.inline
  def apply(
    correct_answer: String,
    end_background_color: String,
    height: Double,
    options: js.Array[Anon_Count],
    question: String,
    rotation: Double,
    start_background_color: String,
    text_color: String,
    viewer_answer: Double,
    viewer_can_answer: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuiz = {
    val __obj = js.Dynamic.literal(correct_answer = correct_answer, end_background_color = end_background_color, height = height, options = options, question = question, rotation = rotation, start_background_color = start_background_color, text_color = text_color, viewer_answer = viewer_answer, viewer_can_answer = viewer_can_answer, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryQuiz]
  }
}

