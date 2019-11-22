package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotAddDashUserDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryAddUserResponseFriendshipStatus extends js.Object {
  var blocking: Boolean
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object DirectThreadRepositoryAddUserResponseFriendshipStatus {
  @scala.inline
  def apply(
    blocking: Boolean,
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    outgoing_request: Boolean
  ): DirectThreadRepositoryAddUserResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(blocking = blocking, following = following, incoming_request = incoming_request, is_bestie = is_bestie, is_private = is_private, is_restricted = is_restricted, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseFriendshipStatus]
  }
}

