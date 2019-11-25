package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseUsersItem extends js.Object {
  var friendship_status: DirectInboxFeedResponseFriendshipStatus
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_directapp_installed: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object DirectInboxFeedResponseUsersItem {
  @scala.inline
  def apply(
    friendship_status: DirectInboxFeedResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_directapp_installed: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    profile_pic_id: String = null
  ): DirectInboxFeedResponseUsersItem = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseUsersItem]
  }
}

