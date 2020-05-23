package typings.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseMedia extends js.Object {
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: SavedFeedResponseCaption
  var caption_is_edited: Boolean
  var carousel_media: js.UndefOr[js.Array[SavedFeedResponseCarouselMediaItem]] = js.undefined
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: String | Double
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_liked: Boolean
  var has_more_comments: Boolean
  var has_viewer_saved: Boolean
  var id: String
  var image_versions2: js.UndefOr[SavedFeedResponseImageVersions2] = js.undefined
  var inline_composer_display_condition: String
  var inline_composer_imp_trigger_time: Double
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var is_external_share_disabled: js.UndefOr[Boolean] = js.undefined
  var like_count: Double
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var next_max_id: String
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: js.UndefOr[Double] = js.undefined
  var original_width: js.UndefOr[Double] = js.undefined
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem]
  var product_tags: js.UndefOr[SavedFeedResponseProductTags] = js.undefined
  var saved_collection_ids: js.Array[_]
  var taken_at: Double
  var user: SavedFeedResponseUser
  var usertags: js.UndefOr[SavedFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[SavedFeedResponseVideoVersionsItem]] = js.undefined
  var view_count: js.UndefOr[Double] = js.undefined
}

object SavedFeedResponseMedia {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: SavedFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    has_viewer_saved: Boolean,
    id: String,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    next_max_id: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem],
    saved_collection_ids: js.Array[_],
    taken_at: Double,
    user: SavedFeedResponseUser,
    can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined,
    carousel_media: js.Array[SavedFeedResponseCarouselMediaItem] = null,
    carousel_media_count: js.UndefOr[Double] = js.undefined,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    image_versions2: SavedFeedResponseImageVersions2 = null,
    is_dash_eligible: js.UndefOr[Double] = js.undefined,
    is_external_share_disabled: js.UndefOr[Boolean] = js.undefined,
    number_of_qualities: js.UndefOr[Double] = js.undefined,
    original_height: js.UndefOr[Double] = js.undefined,
    original_width: js.UndefOr[Double] = js.undefined,
    product_tags: SavedFeedResponseProductTags = null,
    usertags: SavedFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: js.UndefOr[Double] = js.undefined,
    video_versions: js.Array[SavedFeedResponseVideoVersionsItem] = null,
    view_count: js.UndefOr[Double] = js.undefined
  ): SavedFeedResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], saved_collection_ids = saved_collection_ids.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_insights_as_brand)) __obj.updateDynamic("can_see_insights_as_brand")(can_see_insights_as_brand.get.asInstanceOf[js.Any])
    if (carousel_media != null) __obj.updateDynamic("carousel_media")(carousel_media.asInstanceOf[js.Any])
    if (!js.isUndefined(carousel_media_count)) __obj.updateDynamic("carousel_media_count")(carousel_media_count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.get.asInstanceOf[js.Any])
    if (image_versions2 != null) __obj.updateDynamic("image_versions2")(image_versions2.asInstanceOf[js.Any])
    if (!js.isUndefined(is_dash_eligible)) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_external_share_disabled)) __obj.updateDynamic("is_external_share_disabled")(is_external_share_disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number_of_qualities)) __obj.updateDynamic("number_of_qualities")(number_of_qualities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(original_height)) __obj.updateDynamic("original_height")(original_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(original_width)) __obj.updateDynamic("original_width")(original_width.get.asInstanceOf[js.Any])
    if (product_tags != null) __obj.updateDynamic("product_tags")(product_tags.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(video_duration)) __obj.updateDynamic("video_duration")(video_duration.get.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    if (!js.isUndefined(view_count)) __obj.updateDynamic("view_count")(view_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseMedia]
  }
}

