package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseUser extends js.Object {
  var can_be_reported_as_fraud: js.UndefOr[Boolean] = js.undefined
  var friendship_status: js.UndefOr[SavedFeedResponseFriendship_status] = js.undefined
  var full_name: String
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var is_favorite: js.UndefOr[Boolean] = js.undefined
  var is_private: Boolean
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  var is_verified: Boolean
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var shoppable_posts_count: js.UndefOr[Double] = js.undefined
  var show_shoppable_feed: js.UndefOr[Boolean] = js.undefined
  var username: String
}

object SavedFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    can_be_reported_as_fraud: js.UndefOr[Boolean] = js.undefined,
    friendship_status: SavedFeedResponseFriendship_status = null,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    is_favorite: js.UndefOr[Boolean] = js.undefined,
    is_unpublished: js.UndefOr[Boolean] = js.undefined,
    latest_reel_media: Int | Double = null,
    profile_pic_id: String = null,
    shoppable_posts_count: Int | Double = null,
    show_shoppable_feed: js.UndefOr[Boolean] = js.undefined
  ): SavedFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(can_be_reported_as_fraud)) __obj.updateDynamic("can_be_reported_as_fraud")(can_be_reported_as_fraud.asInstanceOf[js.Any])
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture.asInstanceOf[js.Any])
    if (!js.isUndefined(is_favorite)) __obj.updateDynamic("is_favorite")(is_favorite.asInstanceOf[js.Any])
    if (!js.isUndefined(is_unpublished)) __obj.updateDynamic("is_unpublished")(is_unpublished.asInstanceOf[js.Any])
    if (latest_reel_media != null) __obj.updateDynamic("latest_reel_media")(latest_reel_media.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    if (shoppable_posts_count != null) __obj.updateDynamic("shoppable_posts_count")(shoppable_posts_count.asInstanceOf[js.Any])
    if (!js.isUndefined(show_shoppable_feed)) __obj.updateDynamic("show_shoppable_feed")(show_shoppable_feed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseUser]
  }
}

