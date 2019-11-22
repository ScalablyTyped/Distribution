package typings.instagramDashPrivateDashApi.distResponsesUserDotRepositoryDotSearchDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositorySearchResponseRootObject extends js.Object {
  var has_more: Boolean
  var num_results: Double
  var rank_token: String
  var status: String
  var users: js.Array[UserRepositorySearchResponseUsersItem]
}

object UserRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    num_results: Double,
    rank_token: String,
    status: String,
    users: js.Array[UserRepositorySearchResponseUsersItem]
  ): UserRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more, num_results = num_results, rank_token = rank_token, status = status, users = users)
  
    __obj.asInstanceOf[UserRepositorySearchResponseRootObject]
  }
}

