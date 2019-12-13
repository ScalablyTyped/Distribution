package typings.instagramDashPrivateDashApi.distResponsesStoryDashQuizDashParticipantsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuizParticipantsFeedResponseRootObject extends js.Object {
  var participant_info: StoryQuizParticipantsFeedResponseParticipant_info
  var status: String
}

object StoryQuizParticipantsFeedResponseRootObject {
  @scala.inline
  def apply(participant_info: StoryQuizParticipantsFeedResponseParticipant_info, status: String): StoryQuizParticipantsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(participant_info = participant_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseRootObject]
  }
}

