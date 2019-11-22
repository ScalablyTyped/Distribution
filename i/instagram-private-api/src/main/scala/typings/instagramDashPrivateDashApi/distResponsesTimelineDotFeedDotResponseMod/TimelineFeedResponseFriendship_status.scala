package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseFriendship_status extends js.Object {
  var following: Boolean
  var is_bestie: Boolean
  var is_muting_reel: Boolean
  var outgoing_request: Boolean
}

object TimelineFeedResponseFriendship_status {
  @scala.inline
  def apply(following: Boolean, is_bestie: Boolean, is_muting_reel: Boolean, outgoing_request: Boolean): TimelineFeedResponseFriendship_status = {
    val __obj = js.Dynamic.literal(following = following, is_bestie = is_bestie, is_muting_reel = is_muting_reel, outgoing_request = outgoing_request)
  
    __obj.asInstanceOf[TimelineFeedResponseFriendship_status]
  }
}

