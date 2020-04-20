package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var outgoing_request: Boolean
}

object TagsFeedResponseFriendshipStatus {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, outgoing_request: Boolean): TagsFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseFriendshipStatus]
  }
}

