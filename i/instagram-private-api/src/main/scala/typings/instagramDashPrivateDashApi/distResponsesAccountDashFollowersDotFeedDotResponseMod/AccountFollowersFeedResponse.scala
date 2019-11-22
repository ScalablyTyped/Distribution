package typings.instagramDashPrivateDashApi.distResponsesAccountDashFollowersDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountFollowersFeedResponse extends js.Object {
  var big_list: Boolean
  var next_max_id: String
  var page_size: Double
  var sections: Null
  var status: String
  var users: js.Array[AccountFollowersFeedResponseUsersItem]
}

object AccountFollowersFeedResponse {
  @scala.inline
  def apply(
    big_list: Boolean,
    next_max_id: String,
    page_size: Double,
    sections: Null,
    status: String,
    users: js.Array[AccountFollowersFeedResponseUsersItem]
  ): AccountFollowersFeedResponse = {
    val __obj = js.Dynamic.literal(big_list = big_list, next_max_id = next_max_id, page_size = page_size, sections = sections, status = status, users = users)
  
    __obj.asInstanceOf[AccountFollowersFeedResponse]
  }
}

