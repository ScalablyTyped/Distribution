package typings.instagramPrivateApi.storyPollVotersFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPollVotersFeedResponseVotersItem extends js.Object {
  var ts: Double
  var user: StoryPollVotersFeedResponseUser
  var vote: Double
}

object StoryPollVotersFeedResponseVotersItem {
  @scala.inline
  def apply(ts: Double, user: StoryPollVotersFeedResponseUser, vote: Double): StoryPollVotersFeedResponseVotersItem = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryPollVotersFeedResponseVotersItem]
  }
}

