package typings.instagramDashPrivateDashApi.distResponsesStoryDashSliderDashVotersDotFeedDotResponseDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySliderVotersFeedResponseResponseVotersItem extends js.Object {
  var ts: Double
  var user: StorySliderVotersFeedResponseResponseUser
  var vote: Double
}

object StorySliderVotersFeedResponseResponseVotersItem {
  @scala.inline
  def apply(ts: Double, user: StorySliderVotersFeedResponseResponseUser, vote: Double): StorySliderVotersFeedResponseResponseVotersItem = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVotersItem]
  }
}

