package typings.instagramDashPrivateDashApi.distResponsesMediaDotInlineDashChildDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInlineChildCommentsFeedResponseUser extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object MediaInlineChildCommentsFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    profile_pic_id: String = null
  ): MediaInlineChildCommentsFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseUser]
  }
}

