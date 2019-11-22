package typings.instagramDashPrivateDashApi.distResponsesAccountDashFollowingDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountFollowingFeedResponse extends js.Object {
  var big_list: Boolean
  var next_max_id: Null
  var page_size: Double
  var sections: Null
  var status: String
  var users: js.Array[AccountFollowingFeedResponseUsersItem]
}

object AccountFollowingFeedResponse {
  @scala.inline
  def apply(
    big_list: Boolean,
    next_max_id: Null,
    page_size: Double,
    sections: Null,
    status: String,
    users: js.Array[AccountFollowingFeedResponseUsersItem]
  ): AccountFollowingFeedResponse = {
    val __obj = js.Dynamic.literal(big_list = big_list, next_max_id = next_max_id, page_size = page_size, sections = sections, status = status, users = users)
  
    __obj.asInstanceOf[AccountFollowingFeedResponse]
  }
}

