package typings.instagramDashPrivateDashApi.distResponsesMediaDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCommentsFeedResponse extends js.Object {
  var can_view_more_preview_comments: Boolean
  var caption: MediaCommentsFeedResponseCaption
  var caption_is_edited: Boolean
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comments: js.Array[MediaCommentsFeedResponseCommentsItem]
  var has_more_comments: Boolean
  var has_more_headload_comments: Boolean
  var initiate_at_top: Boolean
  var insert_new_comment_to_top: Boolean
  var media_header_display: String
  var next_max_id: String
  var next_min_id: String
  var preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem]
  var quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem]
  var status: String
  var threading_enabled: Boolean
}

object MediaCommentsFeedResponse {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: MediaCommentsFeedResponseCaption,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comments: js.Array[MediaCommentsFeedResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    initiate_at_top: Boolean,
    insert_new_comment_to_top: Boolean,
    media_header_display: String,
    next_max_id: String,
    next_min_id: String,
    preview_comments: js.Array[MediaCommentsFeedResponsePreviewCommentsItem],
    quick_response_emojis: js.Array[MediaCommentsFeedResponseQuickResponseEmojisItem],
    status: String,
    threading_enabled: Boolean
  ): MediaCommentsFeedResponse = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments, caption = caption, caption_is_edited = caption_is_edited, comment_count = comment_count, comment_likes_enabled = comment_likes_enabled, comments = comments, has_more_comments = has_more_comments, has_more_headload_comments = has_more_headload_comments, initiate_at_top = initiate_at_top, insert_new_comment_to_top = insert_new_comment_to_top, media_header_display = media_header_display, next_max_id = next_max_id, next_min_id = next_min_id, preview_comments = preview_comments, quick_response_emojis = quick_response_emojis, status = status, threading_enabled = threading_enabled)
  
    __obj.asInstanceOf[MediaCommentsFeedResponse]
  }
}

