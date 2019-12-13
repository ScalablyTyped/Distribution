package typings.instagramDashPrivateDashApi.distResponsesStoryDashSliderDashVotersDotFeedDotResponseDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySliderVotersFeedResponseResponseVoter_info extends js.Object {
  var latest_slider_vote_time: Double
  var max_id: Null
  var more_available: Boolean
  var slider_id: String
  var voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem]
}

object StorySliderVotersFeedResponseResponseVoter_info {
  @scala.inline
  def apply(
    latest_slider_vote_time: Double,
    max_id: Null,
    more_available: Boolean,
    slider_id: String,
    voters: js.Array[StorySliderVotersFeedResponseResponseVotersItem]
  ): StorySliderVotersFeedResponseResponseVoter_info = {
    val __obj = js.Dynamic.literal(latest_slider_vote_time = latest_slider_vote_time.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], voters = voters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseVoter_info]
  }
}

