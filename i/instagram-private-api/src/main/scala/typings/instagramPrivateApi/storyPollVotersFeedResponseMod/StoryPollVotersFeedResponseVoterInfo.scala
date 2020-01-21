package typings.instagramPrivateApi.storyPollVotersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPollVotersFeedResponseVoterInfo extends js.Object {
  var latest_poll_vote_time: Double
  var max_id: Null
  var more_available: Boolean
  var poll_id: String
  var voters: js.Array[StoryPollVotersFeedResponseVotersItem]
}

object StoryPollVotersFeedResponseVoterInfo {
  @scala.inline
  def apply(
    latest_poll_vote_time: Double,
    max_id: Null,
    more_available: Boolean,
    poll_id: String,
    voters: js.Array[StoryPollVotersFeedResponseVotersItem]
  ): StoryPollVotersFeedResponseVoterInfo = {
    val __obj = js.Dynamic.literal(latest_poll_vote_time = latest_poll_vote_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], voters = voters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPollVotersFeedResponseVoterInfo]
  }
}

