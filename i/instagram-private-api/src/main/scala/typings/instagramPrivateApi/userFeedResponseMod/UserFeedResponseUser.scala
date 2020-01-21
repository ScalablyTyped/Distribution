package typings.instagramPrivateApi.userFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponseUser extends js.Object {
  var allowed_commenter_type: js.UndefOr[String] = js.undefined
  var can_boost_post: js.UndefOr[Boolean] = js.undefined
  var can_see_organic_insights: js.UndefOr[Boolean] = js.undefined
  var full_name: String
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var is_private: Boolean
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var reel_auto_archive: js.UndefOr[String] = js.undefined
  var show_insights_terms: js.UndefOr[Boolean] = js.undefined
  var username: String
}

object UserFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    allowed_commenter_type: String = null,
    can_boost_post: js.UndefOr[Boolean] = js.undefined,
    can_see_organic_insights: js.UndefOr[Boolean] = js.undefined,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    is_unpublished: js.UndefOr[Boolean] = js.undefined,
    profile_pic_id: String = null,
    reel_auto_archive: String = null,
    show_insights_terms: js.UndefOr[Boolean] = js.undefined
  ): UserFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (allowed_commenter_type != null) __obj.updateDynamic("allowed_commenter_type")(allowed_commenter_type.asInstanceOf[js.Any])
    if (!js.isUndefined(can_boost_post)) __obj.updateDynamic("can_boost_post")(can_boost_post.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_organic_insights)) __obj.updateDynamic("can_see_organic_insights")(can_see_organic_insights.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture.asInstanceOf[js.Any])
    if (!js.isUndefined(is_unpublished)) __obj.updateDynamic("is_unpublished")(is_unpublished.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    if (reel_auto_archive != null) __obj.updateDynamic("reel_auto_archive")(reel_auto_archive.asInstanceOf[js.Any])
    if (!js.isUndefined(show_insights_terms)) __obj.updateDynamic("show_insights_terms")(show_insights_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedResponseUser]
  }
}

