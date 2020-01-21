package typings.instagramPrivateApi.tagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseMedia extends js.Object {
  var Tags: TagsFeedResponseTags
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: TagsFeedResponseCaption | Null
  var caption_is_edited: Boolean
  var carousel_media: js.UndefOr[js.Array[TagsFeedResponseCarouselMediaItem]] = js.undefined
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.undefined
  var device_timestamp: String | Double
  var filter_type: Double
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: js.UndefOr[TagsFeedResponseImageVersions2] = js.undefined
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var lat: String
  var like_count: Double
  var lng: String
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var next_max_id: String
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: js.UndefOr[Double] = js.undefined
  var original_width: js.UndefOr[Double] = js.undefined
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[TagsFeedResponsePreviewCommentsItem]
  var taken_at: Double
  var top_likers: js.Array[_]
  var user: TagsFeedResponseUser
  var usertags: js.UndefOr[TagsFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[TagsFeedResponseVideoVersionsItem]] = js.undefined
  var view_count: js.UndefOr[Double] = js.undefined
}

object TagsFeedResponseMedia {
  @scala.inline
  def apply(
    Tags: TagsFeedResponseTags,
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
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    lat: String,
    like_count: Double,
    lng: String,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    next_max_id: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[TagsFeedResponsePreviewCommentsItem],
    taken_at: Double,
    top_likers: js.Array[_],
    user: TagsFeedResponseUser,
    can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined,
    caption: TagsFeedResponseCaption = null,
    carousel_media: js.Array[TagsFeedResponseCarouselMediaItem] = null,
    carousel_media_count: Int | Double = null,
    commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.undefined,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    image_versions2: TagsFeedResponseImageVersions2 = null,
    is_dash_eligible: Int | Double = null,
    number_of_qualities: Int | Double = null,
    original_height: Int | Double = null,
    original_width: Int | Double = null,
    usertags: TagsFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[TagsFeedResponseVideoVersionsItem] = null,
    view_count: Int | Double = null
  ): TagsFeedResponseMedia = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_insights_as_brand)) __obj.updateDynamic("can_see_insights_as_brand")(can_see_insights_as_brand.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (carousel_media != null) __obj.updateDynamic("carousel_media")(carousel_media.asInstanceOf[js.Any])
    if (carousel_media_count != null) __obj.updateDynamic("carousel_media_count")(carousel_media_count.asInstanceOf[js.Any])
    if (!js.isUndefined(commenting_disabled_for_viewer)) __obj.updateDynamic("commenting_disabled_for_viewer")(commenting_disabled_for_viewer.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.asInstanceOf[js.Any])
    if (image_versions2 != null) __obj.updateDynamic("image_versions2")(image_versions2.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (original_height != null) __obj.updateDynamic("original_height")(original_height.asInstanceOf[js.Any])
    if (original_width != null) __obj.updateDynamic("original_width")(original_width.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    if (view_count != null) __obj.updateDynamic("view_count")(view_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsFeedResponseMedia]
  }
}

