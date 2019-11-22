package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfoResponseUser extends js.Object {
  var friendship_status: MediaInfoResponseFriendship_status
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

object MediaInfoResponseUser {
  @scala.inline
  def apply(
    friendship_status: MediaInfoResponseFriendship_status,
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
  ): MediaInfoResponseUser = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status, full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_favorite = is_favorite, is_private = is_private, is_unpublished = is_unpublished, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[MediaInfoResponseUser]
  }
}

