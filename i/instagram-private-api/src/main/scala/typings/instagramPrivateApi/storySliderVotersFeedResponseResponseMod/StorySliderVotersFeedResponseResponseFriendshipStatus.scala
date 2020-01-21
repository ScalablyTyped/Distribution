package typings.instagramPrivateApi.storySliderVotersFeedResponseResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySliderVotersFeedResponseResponseFriendshipStatus extends js.Object {
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object StorySliderVotersFeedResponseResponseFriendshipStatus {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    outgoing_request: Boolean
  ): StorySliderVotersFeedResponseResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorySliderVotersFeedResponseResponseFriendshipStatus]
  }
}

