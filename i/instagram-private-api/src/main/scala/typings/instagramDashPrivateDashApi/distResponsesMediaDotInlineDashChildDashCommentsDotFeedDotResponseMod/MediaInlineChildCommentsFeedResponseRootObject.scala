package typings.instagramDashPrivateDashApi.distResponsesMediaDotInlineDashChildDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInlineChildCommentsFeedResponseRootObject extends js.Object {
  var child_comment_count: Double
  var child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem]
  var has_more_head_child_comments: Boolean
  var has_more_tail_child_comments: Boolean
  var next_max_child_cursor: String
  var num_tail_child_comments: Double
  var parent_comment: MediaInlineChildCommentsFeedResponseParent_comment
  var status: String
}

object MediaInlineChildCommentsFeedResponseRootObject {
  @scala.inline
  def apply(
    child_comment_count: Double,
    child_comments: js.Array[MediaInlineChildCommentsFeedResponseChildCommentsItem],
    has_more_head_child_comments: Boolean,
    has_more_tail_child_comments: Boolean,
    next_max_child_cursor: String,
    num_tail_child_comments: Double,
    parent_comment: MediaInlineChildCommentsFeedResponseParent_comment,
    status: String
  ): MediaInlineChildCommentsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(child_comment_count = child_comment_count, child_comments = child_comments, has_more_head_child_comments = has_more_head_child_comments, has_more_tail_child_comments = has_more_tail_child_comments, next_max_child_cursor = next_max_child_cursor, num_tail_child_comments = num_tail_child_comments, parent_comment = parent_comment, status = status)
  
    __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseRootObject]
  }
}

