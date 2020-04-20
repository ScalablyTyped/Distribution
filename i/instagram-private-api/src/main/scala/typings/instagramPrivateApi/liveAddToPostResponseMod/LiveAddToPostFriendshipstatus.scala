package typings.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveAddToPostFriendshipstatus extends js.Object {
  var blocking: Boolean
  var followed_by: Boolean
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var is_restricted: Boolean
  var muting: Boolean
  var outgoing_request: Boolean
}

object LiveAddToPostFriendshipstatus {
  @scala.inline
  def apply(
    blocking: Boolean,
    followed_by: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    muting: Boolean,
    outgoing_request: Boolean
  ): LiveAddToPostFriendshipstatus = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostFriendshipstatus]
  }
}

