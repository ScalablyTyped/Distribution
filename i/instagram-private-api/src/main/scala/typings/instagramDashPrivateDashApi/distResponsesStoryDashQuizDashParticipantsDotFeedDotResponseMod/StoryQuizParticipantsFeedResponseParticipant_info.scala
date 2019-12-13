package typings.instagramDashPrivateDashApi.distResponsesStoryDashQuizDashParticipantsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuizParticipantsFeedResponseParticipant_info extends js.Object {
  var max_id: Null
  var more_available: Boolean
  var participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]
  var quiz_id: String
}

object StoryQuizParticipantsFeedResponseParticipant_info {
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem],
    quiz_id: String
  ): StoryQuizParticipantsFeedResponseParticipant_info = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipant_info]
  }
}

