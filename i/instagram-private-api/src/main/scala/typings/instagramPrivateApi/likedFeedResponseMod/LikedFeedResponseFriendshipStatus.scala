package typings.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikedFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object LikedFeedResponseFriendshipStatus {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): LikedFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseFriendshipStatus]
  }
}

