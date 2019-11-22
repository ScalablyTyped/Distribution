package typings.instagramDashPrivateDashApi.distResponsesMediaDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCommentsFeedResponseCommentsItem extends js.Object {
  var bit_flags: Double
  var child_comment_count: Double
  var comment_index: Double
  var comment_like_count: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_liked_comment: Boolean
  var has_more_head_child_comments: js.UndefOr[Boolean] = js.undefined
  var has_more_tail_child_comments: js.UndefOr[Boolean] = js.undefined
  var has_translation: js.UndefOr[Boolean] = js.undefined
  var inline_composer_display_condition: String
  var next_min_child_cursor: js.UndefOr[String] = js.undefined
  var num_head_child_comments: js.UndefOr[Double] = js.undefined
  var num_tail_child_comments: js.UndefOr[Double] = js.undefined
  var other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem]
  var pk: String
  var preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem]
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: MediaCommentsFeedResponseUser
  var user_id: Double
}

object MediaCommentsFeedResponseCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    child_comment_count: Double,
    comment_index: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    inline_composer_display_condition: String,
    other_preview_users: js.Array[MediaCommentsFeedResponseOtherPreviewUsersItem],
    pk: String,
    preview_child_comments: js.Array[MediaCommentsFeedResponsePreviewChildCommentsItem],
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaCommentsFeedResponseUser,
    user_id: Double,
    has_more_head_child_comments: js.UndefOr[Boolean] = js.undefined,
    has_more_tail_child_comments: js.UndefOr[Boolean] = js.undefined,
    has_translation: js.UndefOr[Boolean] = js.undefined,
    next_min_child_cursor: String = null,
    num_head_child_comments: Int | Double = null,
    num_tail_child_comments: Int | Double = null
  ): MediaCommentsFeedResponseCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, child_comment_count = child_comment_count, comment_index = comment_index, comment_like_count = comment_like_count, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, did_report_as_spam = did_report_as_spam, has_liked_comment = has_liked_comment, inline_composer_display_condition = inline_composer_display_condition, other_preview_users = other_preview_users, pk = pk, preview_child_comments = preview_child_comments, share_enabled = share_enabled, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(has_more_head_child_comments)) __obj.updateDynamic("has_more_head_child_comments")(has_more_head_child_comments)
    if (!js.isUndefined(has_more_tail_child_comments)) __obj.updateDynamic("has_more_tail_child_comments")(has_more_tail_child_comments)
    if (!js.isUndefined(has_translation)) __obj.updateDynamic("has_translation")(has_translation)
    if (next_min_child_cursor != null) __obj.updateDynamic("next_min_child_cursor")(next_min_child_cursor)
    if (num_head_child_comments != null) __obj.updateDynamic("num_head_child_comments")(num_head_child_comments.asInstanceOf[js.Any])
    if (num_tail_child_comments != null) __obj.updateDynamic("num_tail_child_comments")(num_tail_child_comments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCommentsFeedResponseCommentsItem]
  }
}

