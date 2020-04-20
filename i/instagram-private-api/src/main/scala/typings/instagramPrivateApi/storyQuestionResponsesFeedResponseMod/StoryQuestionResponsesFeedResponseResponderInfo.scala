package typings.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuestionResponsesFeedResponseResponderInfo extends js.Object {
  var background_color: String
  var latest_question_response_time: Double
  var max_id: Null
  var more_available: Boolean
  var question: String
  var question_id: String
  var question_response_count: Double
  var question_type: String
  var responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem]
  var text_color: String
  var unanswered_response_count: Double
}

object StoryQuestionResponsesFeedResponseResponderInfo {
  @scala.inline
  def apply(
    background_color: String,
    latest_question_response_time: Double,
    max_id: Null,
    more_available: Boolean,
    question: String,
    question_id: String,
    question_response_count: Double,
    question_type: String,
    responders: js.Array[StoryQuestionResponsesFeedResponseRespondersItem],
    text_color: String,
    unanswered_response_count: Double
  ): StoryQuestionResponsesFeedResponseResponderInfo = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], latest_question_response_time = latest_question_response_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_response_count = question_response_count.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], responders = responders.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], unanswered_response_count = unanswered_response_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseResponderInfo]
  }
}

