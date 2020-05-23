package typings.instagramPrivateApi.userFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponseItemsItem extends js.Object {
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null | UserFeedResponseCaption
  var caption_is_edited: Boolean
  var carousel_media: js.UndefOr[js.Array[UserFeedResponseCarouselMediaItem]] = js.undefined
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: String | Double
  var direct_reply_to_author_enabled: Boolean
  var facepile_top_likers: js.UndefOr[js.Array[UserFeedResponseFacepileTopLikersItem]] = js.undefined
  var fb_user_tags: js.UndefOr[UserFeedResponseFbUserTags] = js.undefined
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: UserFeedResponseImageVersions2
  var inline_composer_display_condition: String
  var inline_composer_imp_trigger_time: Double
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var like_count: Double
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var next_max_id: js.UndefOr[String] = js.undefined
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[UserFeedResponsePreviewCommentsItem]
  var taken_at: Double
  var top_likers: js.Array[String]
  var user: UserFeedResponseUser
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[UserFeedResponseVideoVersionsItem]] = js.undefined
  var view_count: js.UndefOr[Double] = js.undefined
}

object UserFeedResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: String | Double,
    direct_reply_to_author_enabled: Boolean,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: UserFeedResponseImageVersions2,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[UserFeedResponsePreviewCommentsItem],
    taken_at: Double,
    top_likers: js.Array[String],
    user: UserFeedResponseUser,
    can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined,
    caption: UserFeedResponseCaption = null,
    carousel_media: js.Array[UserFeedResponseCarouselMediaItem] = null,
    carousel_media_count: js.UndefOr[Double] = js.undefined,
    facepile_top_likers: js.Array[UserFeedResponseFacepileTopLikersItem] = null,
    fb_user_tags: UserFeedResponseFbUserTags = null,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    is_dash_eligible: js.UndefOr[Double] = js.undefined,
    next_max_id: String = null,
    number_of_qualities: js.UndefOr[Double] = js.undefined,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: js.UndefOr[Double] = js.undefined,
    video_versions: js.Array[UserFeedResponseVideoVersionsItem] = null,
    view_count: js.UndefOr[Double] = js.undefined
  ): UserFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_insights_as_brand)) __obj.updateDynamic("can_see_insights_as_brand")(can_see_insights_as_brand.get.asInstanceOf[js.Any])
    if (carousel_media != null) __obj.updateDynamic("carousel_media")(carousel_media.asInstanceOf[js.Any])
    if (!js.isUndefined(carousel_media_count)) __obj.updateDynamic("carousel_media_count")(carousel_media_count.get.asInstanceOf[js.Any])
    if (facepile_top_likers != null) __obj.updateDynamic("facepile_top_likers")(facepile_top_likers.asInstanceOf[js.Any])
    if (fb_user_tags != null) __obj.updateDynamic("fb_user_tags")(fb_user_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_dash_eligible)) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.get.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id.asInstanceOf[js.Any])
    if (!js.isUndefined(number_of_qualities)) __obj.updateDynamic("number_of_qualities")(number_of_qualities.get.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (!js.isUndefined(video_duration)) __obj.updateDynamic("video_duration")(video_duration.get.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    if (!js.isUndefined(view_count)) __obj.updateDynamic("view_count")(view_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedResponseItemsItem]
  }
}

