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
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (allowed_commenter_type != null) __obj.updateDynamic("allowed_commenter_type")(allowed_commenter_type.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    if (reel_auto_archive != null) __obj.updateDynamic("reel_auto_archive")(reel_auto_archive.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseInviter]
  }
}

