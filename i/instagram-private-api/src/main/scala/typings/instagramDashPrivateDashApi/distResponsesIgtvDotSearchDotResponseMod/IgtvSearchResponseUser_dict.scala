package typings.instagramDashPrivateDashApi.distResponsesIgtvDotSearchDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvSearchResponseUser_dict extends js.Object {
  var biography: String
  var biography_with_entities: IgtvSearchResponseBiography_with_entities
  var external_lynx_url: js.UndefOr[String] = js.undefined
  var external_url: String
  var follower_count: Double
  var following_count: Double
  var following_tag_count: Double
  var friendship_status: IgtvSearchResponseFriendship_status
  var full_name: String
  var geo_media_count: js.UndefOr[Double] = js.undefined
  var has_anonymous_profile_picture: Boolean
  var has_biography_translation: js.UndefOr[Boolean] = js.undefined
  var has_igtv_series: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var media_count: Double
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var total_igtv_videos: Double
  var username: String
}

object IgtvSearchResponseUser_dict {
  @scala.inline
  def apply(
    biography: String,
    biography_with_entities: IgtvSearchResponseBiography_with_entities,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvSearchResponseFriendship_status,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_igtv_series: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    total_igtv_videos: Double,
    username: String,
    external_lynx_url: String = null,
    geo_media_count: Int | Double = null,
    has_biography_translation: js.UndefOr[Boolean] = js.undefined
  ): IgtvSearchResponseUser_dict = {
    val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_igtv_series = has_igtv_series.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (external_lynx_url != null) __obj.updateDynamic("external_lynx_url")(external_lynx_url.asInstanceOf[js.Any])
    if (geo_media_count != null) __obj.updateDynamic("geo_media_count")(geo_media_count.asInstanceOf[js.Any])
    if (!js.isUndefined(has_biography_translation)) __obj.updateDynamic("has_biography_translation")(has_biography_translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseUser_dict]
  }
}

