package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseItemsItem extends js.Object {
  var attribution: js.UndefOr[TagFeedResponseAttribution] = js.undefined
  var can_reply: js.UndefOr[Boolean] = js.undefined
  var can_reshare: js.UndefOr[Boolean] = js.undefined
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.undefined
  var can_viewer_reshare: js.UndefOr[Boolean] = js.undefined
  var can_viewer_save: Boolean
  var caption: TagFeedResponseCaption | Null
  var caption_is_edited: Boolean
  var caption_position: js.UndefOr[Double] = js.undefined
  var carousel_media: js.UndefOr[js.Array[TagFeedResponseCarouselMediaItem]] = js.undefined
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  var client_cache_key: String
  var code: String
  var comment_count: js.UndefOr[Double] = js.undefined
  var comment_likes_enabled: js.UndefOr[Boolean] = js.undefined
  var comment_threading_enabled: js.UndefOr[Boolean] = js.undefined
  var commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.undefined
  var comments_disabled: js.UndefOr[Boolean] = js.undefined
  var creative_config: js.UndefOr[TagFeedResponseCreative_config] = js.undefined
  var device_timestamp: String | Double
  var expiring_at: js.UndefOr[Double] = js.undefined
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_liked: js.UndefOr[Boolean] = js.undefined
  var has_more_comments: js.UndefOr[Boolean] = js.undefined
  var has_shared_to_fb: js.UndefOr[Double] = js.undefined
  var id: String
  var image_versions2: js.UndefOr[TagFeedResponseImage_versions2] = js.undefined
  var imported_taken_at: js.UndefOr[Double] = js.undefined
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var is_reel_media: js.UndefOr[Boolean] = js.undefined
  var lat: js.UndefOr[Double | String] = js.undefined
  var like_count: js.UndefOr[Double] = js.undefined
  var likers: js.UndefOr[js.Array[TagFeedResponseLikersItem]] = js.undefined
  var lng: js.UndefOr[Double | String] = js.undefined
  var location: js.UndefOr[TagFeedResponseLocation] = js.undefined
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.undefined
  var media_type: Double
  var next_max_id: js.UndefOr[String] = js.undefined
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: js.UndefOr[Double] = js.undefined
  var original_width: js.UndefOr[Double] = js.undefined
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.undefined
  var reel_mentions: js.UndefOr[js.Array[TagFeedResponseReelMentionsItem]] = js.undefined
  var show_one_tap_fb_share_tooltip: js.UndefOr[Boolean] = js.undefined
  var story_hashtags: js.UndefOr[js.Array[TagFeedResponseStoryHashtagsItem]] = js.undefined
  var story_locations: js.UndefOr[js.Array[TagFeedResponseStoryLocationsItem]] = js.undefined
  var supports_reel_reactions: js.UndefOr[Boolean] = js.undefined
  var taken_at: Double
  var user: TagFeedResponseUser
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[TagFeedResponseVideoVersionsItem]] = js.undefined
  var view_count: js.UndefOr[Double] = js.undefined
}

object TagFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_viewer_save: Boolean,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    id: String,
    media_type: Double,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser,
    attribution: TagFeedResponseAttribution = null,
    can_reply: js.UndefOr[Boolean] = js.undefined,
    can_reshare: js.UndefOr[Boolean] = js.undefined,
    can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined,
    can_view_more_preview_comments: js.UndefOr[Boolean] = js.undefined,
    can_viewer_reshare: js.UndefOr[Boolean] = js.undefined,
    caption: TagFeedResponseCaption = null,
    caption_position: Int | Double = null,
    carousel_media: js.Array[TagFeedResponseCarouselMediaItem] = null,
    carousel_media_count: Int | Double = null,
    comment_count: Int | Double = null,
    comment_likes_enabled: js.UndefOr[Boolean] = js.undefined,
    comment_threading_enabled: js.UndefOr[Boolean] = js.undefined,
    commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.undefined,
    comments_disabled: js.UndefOr[Boolean] = js.undefined,
    creative_config: TagFeedResponseCreative_config = null,
    expiring_at: Int | Double = null,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    has_liked: js.UndefOr[Boolean] = js.undefined,
    has_more_comments: js.UndefOr[Boolean] = js.undefined,
    has_shared_to_fb: Int | Double = null,
    image_versions2: TagFeedResponseImage_versions2 = null,
    imported_taken_at: Int | Double = null,
    is_dash_eligible: Int | Double = null,
    is_reel_media: js.UndefOr[Boolean] = js.undefined,
    lat: Double | String = null,
    like_count: Int | Double = null,
    likers: js.Array[TagFeedResponseLikersItem] = null,
    lng: Double | String = null,
    location: TagFeedResponseLocation = null,
    max_num_visible_preview_comments: Int | Double = null,
    next_max_id: String = null,
    number_of_qualities: Int | Double = null,
    original_height: Int | Double = null,
    original_width: Int | Double = null,
    preview_comments: js.Array[TagFeedResponsePreviewCommentsItem] = null,
    reel_mentions: js.Array[TagFeedResponseReelMentionsItem] = null,
    show_one_tap_fb_share_tooltip: js.UndefOr[Boolean] = js.undefined,
    story_hashtags: js.Array[TagFeedResponseStoryHashtagsItem] = null,
    story_locations: js.Array[TagFeedResponseStoryLocationsItem] = null,
    supports_reel_reactions: js.UndefOr[Boolean] = js.undefined,
    usertags: TagFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[TagFeedResponseVideoVersionsItem] = null,
    view_count: Int | Double = null
  ): TagFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(can_reply)) __obj.updateDynamic("can_reply")(can_reply.asInstanceOf[js.Any])
    if (!js.isUndefined(can_reshare)) __obj.updateDynamic("can_reshare")(can_reshare.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_insights_as_brand)) __obj.updateDynamic("can_see_insights_as_brand")(can_see_insights_as_brand.asInstanceOf[js.Any])
    if (!js.isUndefined(can_view_more_preview_comments)) __obj.updateDynamic("can_view_more_preview_comments")(can_view_more_preview_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(can_viewer_reshare)) __obj.updateDynamic("can_viewer_reshare")(can_viewer_reshare.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (caption_position != null) __obj.updateDynamic("caption_position")(caption_position.asInstanceOf[js.Any])
    if (carousel_media != null) __obj.updateDynamic("carousel_media")(carousel_media.asInstanceOf[js.Any])
    if (carousel_media_count != null) __obj.updateDynamic("carousel_media_count")(carousel_media_count.asInstanceOf[js.Any])
    if (comment_count != null) __obj.updateDynamic("comment_count")(comment_count.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_likes_enabled)) __obj.updateDynamic("comment_likes_enabled")(comment_likes_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_threading_enabled)) __obj.updateDynamic("comment_threading_enabled")(comment_threading_enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(commenting_disabled_for_viewer)) __obj.updateDynamic("commenting_disabled_for_viewer")(commenting_disabled_for_viewer.asInstanceOf[js.Any])
    if (!js.isUndefined(comments_disabled)) __obj.updateDynamic("comments_disabled")(comments_disabled.asInstanceOf[js.Any])
    if (creative_config != null) __obj.updateDynamic("creative_config")(creative_config.asInstanceOf[js.Any])
    if (expiring_at != null) __obj.updateDynamic("expiring_at")(expiring_at.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.asInstanceOf[js.Any])
    if (!js.isUndefined(has_liked)) __obj.updateDynamic("has_liked")(has_liked.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more_comments)) __obj.updateDynamic("has_more_comments")(has_more_comments.asInstanceOf[js.Any])
    if (has_shared_to_fb != null) __obj.updateDynamic("has_shared_to_fb")(has_shared_to_fb.asInstanceOf[js.Any])
    if (image_versions2 != null) __obj.updateDynamic("image_versions2")(image_versions2.asInstanceOf[js.Any])
    if (imported_taken_at != null) __obj.updateDynamic("imported_taken_at")(imported_taken_at.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (!js.isUndefined(is_reel_media)) __obj.updateDynamic("is_reel_media")(is_reel_media.asInstanceOf[js.Any])
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (like_count != null) __obj.updateDynamic("like_count")(like_count.asInstanceOf[js.Any])
    if (likers != null) __obj.updateDynamic("likers")(likers.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (max_num_visible_preview_comments != null) __obj.updateDynamic("max_num_visible_preview_comments")(max_num_visible_preview_comments.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (original_height != null) __obj.updateDynamic("original_height")(original_height.asInstanceOf[js.Any])
    if (original_width != null) __obj.updateDynamic("original_width")(original_width.asInstanceOf[js.Any])
    if (preview_comments != null) __obj.updateDynamic("preview_comments")(preview_comments.asInstanceOf[js.Any])
    if (reel_mentions != null) __obj.updateDynamic("reel_mentions")(reel_mentions.asInstanceOf[js.Any])
    if (!js.isUndefined(show_one_tap_fb_share_tooltip)) __obj.updateDynamic("show_one_tap_fb_share_tooltip")(show_one_tap_fb_share_tooltip.asInstanceOf[js.Any])
    if (story_hashtags != null) __obj.updateDynamic("story_hashtags")(story_hashtags.asInstanceOf[js.Any])
    if (story_locations != null) __obj.updateDynamic("story_locations")(story_locations.asInstanceOf[js.Any])
    if (!js.isUndefined(supports_reel_reactions)) __obj.updateDynamic("supports_reel_reactions")(supports_reel_reactions.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    if (view_count != null) __obj.updateDynamic("view_count")(view_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseItemsItem]
  }
}

