package typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationFeedResponseFriendship_status extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var outgoing_request: Boolean
}

object LocationFeedResponseFriendship_status {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, outgoing_request: Boolean): LocationFeedResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following, is_bestie = is_bestie, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[LocationFeedResponseFriendship_status]
  }
}

