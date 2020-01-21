package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var is_muting_reel: Boolean
  var outgoing_request: Boolean
}

object TimelineFeedResponseFriendshipStatus {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_muting_reel: Boolean, outgoing_request: Boolean): TimelineFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_muting_reel = is_muting_reel.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineFeedResponseFriendshipStatus]
  }
}

