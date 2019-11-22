package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseFriendship_status extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var is_restricted: Boolean
  var outgoing_request: Boolean
}

object SavedFeedResponseFriendship_status {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_restricted: Boolean, outgoing_request: Boolean): SavedFeedResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following, is_bestie = is_bestie, is_restricted = is_restricted, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[SavedFeedResponseFriendship_status]
  }
}

