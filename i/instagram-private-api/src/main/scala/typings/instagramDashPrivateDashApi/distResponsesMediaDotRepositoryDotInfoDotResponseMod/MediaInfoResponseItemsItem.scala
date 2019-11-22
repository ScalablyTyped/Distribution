package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotInfoDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfoResponseItemsItem extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: MediaInfoResponseCaption
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double
  var filter_type: Double
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: MediaInfoResponseImage_versions2
  var inline_composer_display_condition: String
  var inline_composer_imp_trigger_time: Double
  var like_count: Double
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[_]
  var taken_at: Double
  var top_likers: js.Array[_]
  var user: MediaInfoResponseUser
}

object MediaInfoResponseItemsItem {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: MediaInfoResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: MediaInfoResponseImage_versions2,
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
    preview_comments: js.Array[_],
    taken_at: Double,
    top_likers: js.Array[_],
    user: MediaInfoResponseUser
  ): MediaInfoResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments, can_viewer_reshare = can_viewer_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, client_cache_key = client_cache_key, code = code, comment_count = comment_count, comment_likes_enabled = comment_likes_enabled, comment_threading_enabled = comment_threading_enabled, device_timestamp = device_timestamp, filter_type = filter_type, has_liked = has_liked, has_more_comments = has_more_comments, id = id, image_versions2 = image_versions2, inline_composer_display_condition = inline_composer_display_condition, inline_composer_imp_trigger_time = inline_composer_imp_trigger_time, like_count = like_count, max_num_visible_preview_comments = max_num_visible_preview_comments, media_type = media_type, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, preview_comments = preview_comments, taken_at = taken_at, top_likers = top_likers, user = user)
  
    __obj.asInstanceOf[MediaInfoResponseItemsItem]
  }
}

