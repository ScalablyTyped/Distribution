package typings.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySliderVotersFeedResponseResponseRootObject extends js.Object {
  var status: String
  var voter_info: StorySliderVotersFeedResponseResponseVoterInfo
}

object StorySliderVotersFeedResponseResponseRootObject {
  @scala.inline
  def apply(status: String, voter_info: StorySliderVotersFeedResponseResponseVoterInfo): StorySliderVotersFeedResponseResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], voter_info = voter_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseRootObject]
  }
}

