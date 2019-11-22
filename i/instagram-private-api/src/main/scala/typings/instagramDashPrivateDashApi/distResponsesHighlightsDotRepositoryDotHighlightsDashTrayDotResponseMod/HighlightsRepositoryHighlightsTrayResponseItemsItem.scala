package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseItemsItem extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: HighlightsRepositoryHighlightsTrayResponseCaption
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double
  var filter_type: Double
  var has_audio: Boolean
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: HighlightsRepositoryHighlightsTrayResponseImage_versions2
  var is_dash_eligible: Double
  var like_count: Double
  var max_num_visible_preview_comments: Double
  var media_cropping_info: HighlightsRepositoryHighlightsTrayResponseMedia_cropping_info
  var media_type: Double
  var nearly_complete_copyright_match: Boolean
  var next_max_id: String
  var number_of_qualities: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[HighlightsRepositoryHighlightsTrayResponsePreviewCommentsItem]
  var product_type: String
  var taken_at: Double
  var thumbnails: HighlightsRepositoryHighlightsTrayResponseThumbnails
  var title: String
  var user: HighlightsRepositoryHighlightsTrayResponseUser
  var video_codec: String
  var video_dash_manifest: String
  var video_duration: Double
  var video_versions: js.Array[HighlightsRepositoryHighlightsTrayResponseVideoVersionsItem]
  var view_count: Double
}

object HighlightsRepositoryHighlightsTrayResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: HighlightsRepositoryHighlightsTrayResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    filter_type: Double,
    has_audio: Boolean,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: HighlightsRepositoryHighlightsTrayResponseImage_versions2,
    is_dash_eligible: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_cropping_info: HighlightsRepositoryHighlightsTrayResponseMedia_cropping_info,
    media_type: Double,
    nearly_complete_copyright_match: Boolean,
    next_max_id: String,
    number_of_qualities: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[HighlightsRepositoryHighlightsTrayResponsePreviewCommentsItem],
    product_type: String,
    taken_at: Double,
    thumbnails: HighlightsRepositoryHighlightsTrayResponseThumbnails,
    title: String,
    user: HighlightsRepositoryHighlightsTrayResponseUser,
    video_codec: String,
    video_dash_manifest: String,
    video_duration: Double,
    video_versions: js.Array[HighlightsRepositoryHighlightsTrayResponseVideoVersionsItem],
    view_count: Double
  ): HighlightsRepositoryHighlightsTrayResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments, can_viewer_reshare = can_viewer_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, client_cache_key = client_cache_key, code = code, comment_count = comment_count, comment_likes_enabled = comment_likes_enabled, comment_threading_enabled = comment_threading_enabled, device_timestamp = device_timestamp, filter_type = filter_type, has_audio = has_audio, has_liked = has_liked, has_more_comments = has_more_comments, id = id, image_versions2 = image_versions2, is_dash_eligible = is_dash_eligible, like_count = like_count, max_num_visible_preview_comments = max_num_visible_preview_comments, media_cropping_info = media_cropping_info, media_type = media_type, nearly_complete_copyright_match = nearly_complete_copyright_match, next_max_id = next_max_id, number_of_qualities = number_of_qualities, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, preview_comments = preview_comments, product_type = product_type, taken_at = taken_at, thumbnails = thumbnails, title = title, user = user, video_codec = video_codec, video_dash_manifest = video_dash_manifest, video_duration = video_duration, video_versions = video_versions, view_count = view_count)
  
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseItemsItem]
  }
}

