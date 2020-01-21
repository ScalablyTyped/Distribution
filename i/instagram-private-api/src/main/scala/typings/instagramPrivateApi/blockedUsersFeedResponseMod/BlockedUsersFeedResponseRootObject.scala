package typings.instagramPrivateApi.blockedUsersFeedResponseMod

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
    val __obj = js.Dynamic.literal(blocked_list = blocked_list.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockedUsersFeedResponseRootObject]
  }
}

