package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseFriendship_status extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var outgoing_request: Boolean
}

object TagsFeedResponseFriendship_status {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, outgoing_request: Boolean): TagsFeedResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsFeedResponseFriendship_status]
  }
}

