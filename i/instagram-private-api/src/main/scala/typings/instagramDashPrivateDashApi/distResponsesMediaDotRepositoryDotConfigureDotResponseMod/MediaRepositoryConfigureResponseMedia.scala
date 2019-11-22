package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotConfigureDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryConfigureResponseMedia extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double
  var fb_user_tags: MediaRepositoryConfigureResponseFb_user_tags
  var filter_type: Double
  var has_more_comments: Boolean
  var id: String
  var image_versions2: MediaRepositoryConfigureResponseImage_versions2
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[_]
  var taken_at: Double
  var user: MediaRepositoryConfigureResponseUser
}

object MediaRepositoryConfigureResponseMedia {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    fb_user_tags: MediaRepositoryConfigureResponseFb_user_tags,
    filter_type: Double,
    has_more_comments: Boolean,
    id: String,
    image_versions2: MediaRepositoryConfigureResponseImage_versions2,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    taken_at: Double,
    user: MediaRepositoryConfigureResponseUser
  ): MediaRepositoryConfigureResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments, can_viewer_reshare = can_viewer_reshare, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, client_cache_key = client_cache_key, code = code, comment_count = comment_count, comment_likes_enabled = comment_likes_enabled, comment_threading_enabled = comment_threading_enabled, device_timestamp = device_timestamp, fb_user_tags = fb_user_tags, filter_type = filter_type, has_more_comments = has_more_comments, id = id, image_versions2 = image_versions2, max_num_visible_preview_comments = max_num_visible_preview_comments, media_type = media_type, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, preview_comments = preview_comments, taken_at = taken_at, user = user)
  
    __obj.asInstanceOf[MediaRepositoryConfigureResponseMedia]
  }
}

