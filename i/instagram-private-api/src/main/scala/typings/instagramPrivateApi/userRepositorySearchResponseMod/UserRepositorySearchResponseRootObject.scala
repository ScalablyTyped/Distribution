package typings.instagramPrivateApi.userRepositorySearchResponseMod

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
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserRepositorySearchResponseRootObject]
  }
}

