package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseUser extends js.Object {
  var byline: String
  var follower_count: Double
  var friendship_status: FbsearchRepositoryTopsearchFlatResponseFriendship_status
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
  var username: String
}

object FbsearchRepositoryTopsearchFlatResponseUser {
  @scala.inline
  def apply(
    byline: String,
    follower_count: Double,
    friendship_status: FbsearchRepositoryTopsearchFlatResponseFriendship_status,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    mutual_followers_count: Double,
    pk: Double,
    profile_pic_url: String,
    username: String,
    latest_reel_media: Int | Double = null,
    profile_pic_id: String = null,
    search_social_context: String = null,
    social_context: String = null
  ): FbsearchRepositoryTopsearchFlatResponseUser = {
    val __obj = js.Dynamic.literal(byline = byline, follower_count = follower_count, friendship_status = friendship_status, full_name = full_name, has_anonymous_profile_picture = has_anonymous_profile_picture, is_private = is_private, is_verified = is_verified, mutual_followers_count = mutual_followers_count, pk = pk, profile_pic_url = profile_pic_url, username = username)
    if (latest_reel_media != null) __obj.updateDynamic("latest_reel_media")(latest_reel_media.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    if (search_social_context != null) __obj.updateDynamic("search_social_context")(search_social_context)
    if (social_context != null) __obj.updateDynamic("social_context")(social_context)
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseUser]
  }
}

