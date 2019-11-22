package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseUser extends js.Object {
  var friendship_status: js.UndefOr[TagsFeedResponseFriendship_status] = js.undefined
  var full_name: String
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var is_favorite: js.UndefOr[Boolean] = js.undefined
  var is_private: Boolean
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  var is_verified: js.UndefOr[Boolean] = js.undefined
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object TagsFeedResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    friendship_status: TagsFeedResponseFriendship_status = null,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    is_favorite: js.UndefOr[Boolean] = js.undefined,
    is_unpublished: js.UndefOr[Boolean] = js.undefined,
    is_verified: js.UndefOr[Boolean] = js.undefined,
    profile_pic_id: String = null
  ): TagsFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, pk = pk, profile_pic_url = profile_pic_url, username = username)
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status)
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture)
    if (!js.isUndefined(is_favorite)) __obj.updateDynamic("is_favorite")(is_favorite)
    if (!js.isUndefined(is_unpublished)) __obj.updateDynamic("is_unpublished")(is_unpublished)
    if (!js.isUndefined(is_verified)) __obj.updateDynamic("is_verified")(is_verified)
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    __obj.asInstanceOf[TagsFeedResponseUser]
  }
}

