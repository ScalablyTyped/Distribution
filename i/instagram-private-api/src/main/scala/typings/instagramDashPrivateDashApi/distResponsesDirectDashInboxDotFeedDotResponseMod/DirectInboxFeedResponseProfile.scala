package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseProfile extends js.Object {
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object DirectInboxFeedResponseProfile {
  @scala.inline
  def apply(
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): DirectInboxFeedResponseProfile = {
    val __obj = js.Dynamic.literal(full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[DirectInboxFeedResponseProfile]
  }
}

