package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseUser extends js.Object {
  var biography: js.UndefOr[String] = js.undefined
  var biography_with_entities: js.UndefOr[IgtvSearchResponseBiographyWithEntities] = js.undefined
  var external_lynx_url: js.UndefOr[String] = js.undefined
  var external_url: js.UndefOr[String] = js.undefined
  var friendship_status: js.UndefOr[IgtvSearchResponseFriendshipStatus] = js.undefined
  var full_name: js.UndefOr[String] = js.undefined
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  var has_biography_translation: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var is_private: js.UndefOr[Boolean] = js.undefined
  var is_verified: js.UndefOr[Boolean] = js.undefined
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var mutual_followers_count: js.UndefOr[Double] = js.undefined
  var pk: js.UndefOr[Double] = js.undefined
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: js.UndefOr[String] = js.undefined
  var username: String
}

object IgtvSearchResponseUser {
  @scala.inline
  def apply(
    username: String,
    biography: String = null,
    biography_with_entities: IgtvSearchResponseBiographyWithEntities = null,
    external_lynx_url: String = null,
    external_url: String = null,
    friendship_status: IgtvSearchResponseFriendshipStatus = null,
    full_name: String = null,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    has_biography_translation: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    is_private: js.UndefOr[Boolean] = js.undefined,
    is_verified: js.UndefOr[Boolean] = js.undefined,
    latest_reel_media: js.UndefOr[Double] = js.undefined,
    mutual_followers_count: js.UndefOr[Double] = js.undefined,
    pk: js.UndefOr[Double] = js.undefined,
    profile_pic_id: String = null,
    profile_pic_url: String = null
  ): IgtvSearchResponseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    if (biography != null) __obj.updateDynamic("biography")(biography.asInstanceOf[js.Any])
    if (biography_with_entities != null) __obj.updateDynamic("biography_with_entities")(biography_with_entities.asInstanceOf[js.Any])
    if (external_lynx_url != null) __obj.updateDynamic("external_lynx_url")(external_lynx_url.asInstanceOf[js.Any])
    if (external_url != null) __obj.updateDynamic("external_url")(external_url.asInstanceOf[js.Any])
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status.asInstanceOf[js.Any])
    if (full_name != null) __obj.updateDynamic("full_name")(full_name.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_biography_translation)) __obj.updateDynamic("has_biography_translation")(has_biography_translation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_private)) __obj.updateDynamic("is_private")(is_private.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_verified)) __obj.updateDynamic("is_verified")(is_verified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latest_reel_media)) __obj.updateDynamic("latest_reel_media")(latest_reel_media.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mutual_followers_count)) __obj.updateDynamic("mutual_followers_count")(mutual_followers_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pk)) __obj.updateDynamic("pk")(pk.get.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    if (profile_pic_url != null) __obj.updateDynamic("profile_pic_url")(profile_pic_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseUser]
  }
}

