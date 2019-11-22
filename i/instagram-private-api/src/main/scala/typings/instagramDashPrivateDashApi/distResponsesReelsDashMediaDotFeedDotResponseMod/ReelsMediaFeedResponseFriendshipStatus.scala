package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseFriendshipStatus extends js.Object {
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var outgoing_request: Boolean
}

object ReelsMediaFeedResponseFriendshipStatus {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    outgoing_request: Boolean
  ): ReelsMediaFeedResponseFriendshipStatus = {
    val __obj = js.Dynamic.literal(following = following, incoming_request = incoming_request, is_bestie = is_bestie, is_private = is_private, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[ReelsMediaFeedResponseFriendshipStatus]
  }
}

