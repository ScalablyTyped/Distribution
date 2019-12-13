package typings.instagramDashPrivateDashApi.distResponsesStoryDashQuestionDashResponsesDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuestionResponsesFeedResponseRespondersItem extends js.Object {
  var has_shared_response: Boolean
  var id: String
  var response: String
  var ts: Double
  var user: StoryQuestionResponsesFeedResponseUser
}

object StoryQuestionResponsesFeedResponseRespondersItem {
  @scala.inline
  def apply(
    has_shared_response: Boolean,
    id: String,
    response: String,
    ts: Double,
    user: StoryQuestionResponsesFeedResponseUser
  ): StoryQuestionResponsesFeedResponseRespondersItem = {
    val __obj = js.Dynamic.literal(has_shared_response = has_shared_response.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRespondersItem]
  }
}

