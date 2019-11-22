package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseFriendship_status extends js.Object {
  var following: Boolean
  var incoming_request: Boolean
  var is_bestie: Boolean
  var is_private: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object ListReelMediaViewerFeedResponseFriendship_status {
  @scala.inline
  def apply(
    following: Boolean,
    incoming_request: Boolean,
    is_bestie: Boolean,
    is_private: Boolean,
    is_restricted: Boolean,
    outgoing_request: Boolean
  ): ListReelMediaViewerFeedResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following, incoming_request = incoming_request, is_bestie = is_bestie, is_private = is_private, is_restricted = is_restricted, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseFriendship_status]
  }
}

