package typings.instagramPrivateApi.userRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositorySearchResponseUsersItem extends js.Object {
  var byline: String
  var follower_count: Double
  var friendship_status: UserRepositorySearchResponseFriendshipStatus
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var mutual_followers_count: Double
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var search_social_context: js.UndefOr[String] = js.undefined
  var social_context: js.UndefOr[String] = js.undefined
  var unseen_count: js.UndefOr[Double] = js.undefined
  var username: String
}

object UserRepositorySearchResponseUsersItem {
  @scala.inline
  def apply(
    byline: String,
    follower_count: Double,
    friendship_status: UserRepositorySearchResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    mutual_followers_count: Double,
    pk: Double,
    profile_pic_url: String,
    username: String,
    latest_reel_media: js.UndefOr[Double] = js.undefined,
    profile_pic_id: String = null,
    search_social_context: String = null,
    social_context: String = null,
    unseen_count: js.UndefOr[Double] = js.undefined
  ): UserRepositorySearchResponseUsersItem = {
    val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], mutual_followers_count = mutual_followers_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(latest_reel_media)) __obj.updateDynamic("latest_reel_media")(latest_reel_media.get.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    if (search_social_context != null) __obj.updateDynamic("search_social_context")(search_social_context.asInstanceOf[js.Any])
    if (social_context != null) __obj.updateDynamic("social_context")(social_context.asInstanceOf[js.Any])
    if (!js.isUndefined(unseen_count)) __obj.updateDynamic("unseen_count")(unseen_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositorySearchResponseUsersItem]
  }
}

