package typings.instagramPrivateApi.storyQuizParticipantsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuizParticipantsFeedResponseParticipantsItem extends js.Object {
  var answer: Double
  var ts: Double
  var user: StoryQuizParticipantsFeedResponseUser
}

object StoryQuizParticipantsFeedResponseParticipantsItem {
  @scala.inline
  def apply(answer: Double, ts: Double, user: StoryQuizParticipantsFeedResponseUser): StoryQuizParticipantsFeedResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuizParticipantsFeedResponseParticipantsItem]
  }
}

