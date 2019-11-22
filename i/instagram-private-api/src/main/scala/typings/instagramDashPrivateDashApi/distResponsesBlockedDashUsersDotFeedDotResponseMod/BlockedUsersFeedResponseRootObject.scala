package typings.instagramDashPrivateDashApi.distResponsesBlockedDashUsersDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedUsersFeedResponseRootObject extends js.Object {
  var blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem]
  var next_max_id: String
  var page_size: Double
  var status: String
}

object BlockedUsersFeedResponseRootObject {
  @scala.inline
  def apply(
    blocked_list: js.Array[BlockedUsersFeedResponseBlockedListItem],
    next_max_id: String,
    page_size: Double,
    status: String
  ): BlockedUsersFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(blocked_list = blocked_list, next_max_id = next_max_id, page_size = page_size, status = status)
  
    __obj.asInstanceOf[BlockedUsersFeedResponseRootObject]
  }
}

