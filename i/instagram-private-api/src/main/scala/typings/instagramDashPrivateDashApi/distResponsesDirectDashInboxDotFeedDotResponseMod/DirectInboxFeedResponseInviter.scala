package typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseInviter extends js.Object {
  var allowed_commenter_type: js.UndefOr[String] = js.undefined
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var reel_auto_archive: js.UndefOr[String] = js.undefined
  var username: String
}

object DirectInboxFeedResponseInviter {
  @scala.inline
  def apply(
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    allowed_commenter_type: String = null,
    profile_pic_id: String = null,
    reel_auto_archive: String = null
  ): DirectInboxFeedResponseInviter = {
    val __obj = js.Dynamic.literal(full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_url = profile_pic_url, username = username)
    if (allowed_commenter_type != null) __obj.updateDynamic("allowed_commenter_type")(allowed_commenter_type)
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    if (reel_auto_archive != null) __obj.updateDynamic("reel_auto_archive")(reel_auto_archive)
    __obj.asInstanceOf[DirectInboxFeedResponseInviter]
  }
}

