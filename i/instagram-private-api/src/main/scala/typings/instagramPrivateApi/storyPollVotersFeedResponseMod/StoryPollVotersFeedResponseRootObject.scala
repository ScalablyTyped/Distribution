package typings.instagramPrivateApi.storyPollVotersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPollVotersFeedResponseRootObject extends js.Object {
  var status: String
  var voter_info: StoryPollVotersFeedResponseVoterInfo
}

object StoryPollVotersFeedResponseRootObject {
  @scala.inline
  def apply(status: String, voter_info: StoryPollVotersFeedResponseVoterInfo): StoryPollVotersFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPollVotersFeedResponseRootObject]
  }
}

