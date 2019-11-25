package typings.instagramDashPrivateDashApi.distResponsesLiveDotCommentsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCommentsResponseRootObject extends js.Object {
  var can_view_more_preview_comments: Boolean
  var caption: Null
  var caption_is_edited: Boolean
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_muted: Double
  var comments: js.Array[LiveCommentsResponseCommentsItem]
  var has_more_comments: Boolean
  var has_more_headload_comments: Boolean
  var is_first_fetch: String
  var live_seconds_per_comment: Double
  var media_header_display: String
  var status: String
  var system_comments: js.Array[LiveCommentsResponseSystemCommentsItem]
}

object LiveCommentsResponseRootObject {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    caption: Null,
    caption_is_edited: Boolean,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_muted: Double,
    comments: js.Array[LiveCommentsResponseCommentsItem],
    has_more_comments: Boolean,
    has_more_headload_comments: Boolean,
    is_first_fetch: String,
    live_seconds_per_comment: Double,
    media_header_display: String,
    status: String,
    system_comments: js.Array[LiveCommentsResponseSystemCommentsItem]
  ): LiveCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_muted = comment_muted.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_more_headload_comments = has_more_headload_comments.asInstanceOf[js.Any], is_first_fetch = is_first_fetch.asInstanceOf[js.Any], live_seconds_per_comment = live_seconds_per_comment.asInstanceOf[js.Any], media_header_display = media_header_display.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], system_comments = system_comments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveCommentsResponseRootObject]
  }
}

