package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotUpdateDashTitleDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryUpdateTitleResponseUsersItem extends js.Object {
  var friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_directapp_installed: Boolean
  var is_private: Boolean
  var is_using_unified_inbox_for_direct: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object DirectThreadRepositoryUpdateTitleResponseUsersItem {
  @scala.inline
  def apply(
    friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_directapp_installed: Boolean,
    is_private: Boolean,
    is_using_unified_inbox_for_direct: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): DirectThreadRepositoryUpdateTitleResponseUsersItem = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status, full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_directapp_installed = is_directapp_installed, is_private = is_private, is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseUsersItem]
  }
}

