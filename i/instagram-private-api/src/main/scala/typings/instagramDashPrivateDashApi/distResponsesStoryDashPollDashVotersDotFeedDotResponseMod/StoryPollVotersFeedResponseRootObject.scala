package typings.instagramDashPrivateDashApi.distResponsesStoryDashPollDashVotersDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPollVotersFeedResponseRootObject extends js.Object {
  var status: String
  var voter_info: StoryPollVotersFeedResponseVoter_info
}

object StoryPollVotersFeedResponseRootObject {
  @scala.inline
  def apply(status: String, voter_info: StoryPollVotersFeedResponseVoter_info): StoryPollVotersFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPollVotersFeedResponseRootObject]
  }
}

