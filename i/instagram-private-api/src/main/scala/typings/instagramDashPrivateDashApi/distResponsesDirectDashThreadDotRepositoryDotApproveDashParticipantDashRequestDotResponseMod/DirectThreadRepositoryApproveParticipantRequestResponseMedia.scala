package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotApproveDashParticipantDashRequestDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryApproveParticipantRequestResponseMedia extends js.Object {
  var can_view_more_preview_comments: Boolean
  var can_viewer_save: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var caption_position: Double
  var client_cache_key: String
  var code: String
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: Double
  var expiring_at: Double
  var fb_user_tags: DirectThreadRepositoryApproveParticipantRequestResponseFb_user_tags
  var filter_type: Double
  var has_liked: Boolean
  var has_more_comments: Boolean
  var id: String
  var image_versions2: DirectThreadRepositoryApproveParticipantRequestResponseImage_versions2
  var is_reel_media: Boolean
  var like_count: Double
  var likers: js.Array[_]
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var organic_tracking_token: String
  var original_height: Double
  var original_width: Double
  var photo_of_you: Boolean
  var pk: String
  var preview_comments: js.Array[_]
  var taken_at: Double
  var timezone_offset: Double
  var user: DirectThreadRepositoryApproveParticipantRequestResponseUser
}

object DirectThreadRepositoryApproveParticipantRequestResponseMedia {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_save: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: Double,
    expiring_at: Double,
    fb_user_tags: DirectThreadRepositoryApproveParticipantRequestResponseFb_user_tags,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    image_versions2: DirectThreadRepositoryApproveParticipantRequestResponseImage_versions2,
    is_reel_media: Boolean,
    like_count: Double,
    likers: js.Array[_],
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    taken_at: Double,
    timezone_offset: Double,
    user: DirectThreadRepositoryApproveParticipantRequestResponseUser
  ): DirectThreadRepositoryApproveParticipantRequestResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments, can_viewer_save = can_viewer_save, caption = caption, caption_is_edited = caption_is_edited, caption_position = caption_position, client_cache_key = client_cache_key, code = code, comment_count = comment_count, comment_likes_enabled = comment_likes_enabled, comment_threading_enabled = comment_threading_enabled, device_timestamp = device_timestamp, expiring_at = expiring_at, fb_user_tags = fb_user_tags, filter_type = filter_type, has_liked = has_liked, has_more_comments = has_more_comments, id = id, image_versions2 = image_versions2, is_reel_media = is_reel_media, like_count = like_count, likers = likers, max_num_visible_preview_comments = max_num_visible_preview_comments, media_type = media_type, organic_tracking_token = organic_tracking_token, original_height = original_height, original_width = original_width, photo_of_you = photo_of_you, pk = pk, preview_comments = preview_comments, taken_at = taken_at, timezone_offset = timezone_offset, user = user)
  
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseMedia]
  }
}

