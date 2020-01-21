package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgtvChannelFeedResponseUserDict extends js.Object {
  var biography: String
  var biography_with_entities: IgtvChannelFeedResponseBiographyWithEntities
  var external_lynx_url: String
  var external_url: String
  var follower_count: Double
  var following_count: Double
  var following_tag_count: Double
  var friendship_status: IgtvChannelFeedResponseFriendshipStatus
  var full_name: String
  var geo_media_count: Double
  var has_anonymous_profile_picture: Boolean
  var has_biography_translation: Boolean
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

object IgtvChannelFeedResponseUserDict {
  @scala.inline
  def apply(
    biography: String,
    biography_with_entities: IgtvChannelFeedResponseBiographyWithEntities,
    external_lynx_url: String,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvChannelFeedResponseFriendshipStatus,
    full_name: String,
    geo_media_count: Double,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    has_igtv_series: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    total_igtv_videos: Double,
    username: String
  ): IgtvChannelFeedResponseUserDict = {
    val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], external_lynx_url = external_lynx_url.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], geo_media_count = geo_media_count.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_igtv_series = has_igtv_series.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IgtvChannelFeedResponseUserDict]
  }
}

