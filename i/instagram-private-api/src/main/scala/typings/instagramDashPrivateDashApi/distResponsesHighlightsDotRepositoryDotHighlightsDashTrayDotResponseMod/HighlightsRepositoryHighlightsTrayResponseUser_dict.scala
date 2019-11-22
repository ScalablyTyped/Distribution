package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseUser_dict extends js.Object {
  var biography: String
  var biography_with_entities: HighlightsRepositoryHighlightsTrayResponseBiography_with_entities
  var external_lynx_url: String
  var external_url: String
  var follower_count: Double
  var following_count: Double
  var following_tag_count: Double
  var friendship_status: HighlightsRepositoryHighlightsTrayResponseFriendship_status
  var full_name: String
  var geo_media_count: Double
  var has_anonymous_profile_picture: Boolean
  var has_biography_translation: Boolean
  var is_private: Boolean
  var is_verified: Boolean
  var latest_reel_media: Double
  var media_count: Double
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var total_igtv_videos: Double
  var username: String
}

object HighlightsRepositoryHighlightsTrayResponseUser_dict {
  @scala.inline
  def apply(
    biography: String,
    biography_with_entities: HighlightsRepositoryHighlightsTrayResponseBiography_with_entities,
    external_lynx_url: String,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: HighlightsRepositoryHighlightsTrayResponseFriendship_status,
    full_name: String,
    geo_media_count: Double,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    latest_reel_media: Double,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    total_igtv_videos: Double,
    username: String
  ): HighlightsRepositoryHighlightsTrayResponseUser_dict = {
    val __obj = js.Dynamic.literal(biography = biography, biography_with_entities = biography_with_entities, external_lynx_url = external_lynx_url, external_url = external_url, follower_count = follower_count, following_count = following_count, following_tag_count = following_tag_count, friendship_status = friendship_status, full_name = full_name, geo_media_count = geo_media_count, has_anonymous_profile_picture = has_anonymous_profile_picture, has_biography_translation = has_biography_translation, is_private = is_private, is_verified = is_verified, latest_reel_media = latest_reel_media, media_count = media_count, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, total_igtv_videos = total_igtv_videos, username = username)
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseUser_dict]
  }
}

