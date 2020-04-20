package typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuizParticipantsFeedResponseParticipantInfo extends js.Object {
  var max_id: Null
  var more_available: Boolean
  var participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem]
  var quiz_id: String
}

object StoryQuizParticipantsFeedResponseParticipantInfo {
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[StoryQuizParticipantsFeedResponseParticipantsItem],
    quiz_id: String
  ): StoryQuizParticipantsFeedResponseParticipantInfo = {
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantInfo]
  }
}

