package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotAddDashUserDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryAddUserResponseInviter extends js.Object {
  var allowed_commenter_type: String
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var reel_auto_archive: String
  var username: String
}

object DirectThreadRepositoryAddUserResponseInviter {
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    username: String
  ): DirectThreadRepositoryAddUserResponseInviter = {
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type, full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, reel_auto_archive = reel_auto_archive, username = username)
  
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseInviter]
  }
}

