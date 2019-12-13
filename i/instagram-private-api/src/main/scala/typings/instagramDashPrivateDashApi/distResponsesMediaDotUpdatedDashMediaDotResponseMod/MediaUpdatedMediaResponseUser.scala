package typings.instagramDashPrivateDashApi.distResponsesMediaDotUpdatedDashMediaDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUpdatedMediaResponseUser extends js.Object {
  var friendship_status: MediaUpdatedMediaResponseFriendship_status
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_favorite: Boolean
  var is_private: Boolean
  var is_unpublished: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object MediaUpdatedMediaResponseUser {
  @scala.inline
  def apply(
    friendship_status: MediaUpdatedMediaResponseFriendship_status,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_favorite: Boolean,
    is_private: Boolean,
    is_unpublished: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): MediaUpdatedMediaResponseUser = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaUpdatedMediaResponseUser]
  }
}

