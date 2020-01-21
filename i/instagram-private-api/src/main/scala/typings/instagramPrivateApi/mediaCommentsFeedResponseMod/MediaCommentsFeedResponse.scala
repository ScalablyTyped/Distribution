package typings.instagramPrivateApi.mediaCommentsFeedResponseMod

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
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], initiate_at_top = initiate_at_top.asInstanceOf[js.Any], insert_new_comment_to_top = insert_new_comment_to_top.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_min_id = next_min_id.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], quick_response_emojis = quick_response_emojis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threading_enabled = threading_enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaCommentsFeedResponse]
  }
}

