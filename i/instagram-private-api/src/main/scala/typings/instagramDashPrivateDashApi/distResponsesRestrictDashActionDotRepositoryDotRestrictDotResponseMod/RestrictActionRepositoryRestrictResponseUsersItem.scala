package typings.instagramDashPrivateDashApi.distResponsesRestrictDashActionDotRepositoryDotRestrictDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictActionRepositoryRestrictResponseUsersItem extends js.Object {
  var friendship_status: RestrictActionRepositoryRestrictResponseFriendship_status
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_url: String
  var username: String
}

object RestrictActionRepositoryRestrictResponseUsersItem {
  @scala.inline
  def apply(
    friendship_status: RestrictActionRepositoryRestrictResponseFriendship_status,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): RestrictActionRepositoryRestrictResponseUsersItem = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status, full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseUsersItem]
  }
}

