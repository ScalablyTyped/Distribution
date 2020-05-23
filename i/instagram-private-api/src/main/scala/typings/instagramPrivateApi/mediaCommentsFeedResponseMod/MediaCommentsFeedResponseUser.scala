package typings.instagramPrivateApi.mediaCommentsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCommentsFeedResponseUser extends js.Object {
  var full_name: String
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var is_private: Boolean
  var is_verified: Boolean
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object MediaCommentsFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    latest_reel_media: js.UndefOr[Double] = js.undefined,
    profile_pic_id: String = null
  ): MediaCommentsFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latest_reel_media)) __obj.updateDynamic("latest_reel_media")(latest_reel_media.get.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseUser]
  }
}

