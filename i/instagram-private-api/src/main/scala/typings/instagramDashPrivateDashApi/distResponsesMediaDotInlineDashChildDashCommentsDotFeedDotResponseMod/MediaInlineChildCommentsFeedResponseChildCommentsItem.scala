package typings.instagramDashPrivateDashApi.distResponsesMediaDotInlineDashChildDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInlineChildCommentsFeedResponseChildCommentsItem extends js.Object {
  var bit_flags: Double
  var comment_like_count: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_liked_comment: Boolean
  var parent_comment_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: MediaInlineChildCommentsFeedResponseUser
  var user_id: Double
}

object MediaInlineChildCommentsFeedResponseChildCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    parent_comment_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaInlineChildCommentsFeedResponseUser,
    user_id: Double
  ): MediaInlineChildCommentsFeedResponseChildCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, comment_like_count = comment_like_count, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, did_report_as_spam = did_report_as_spam, has_liked_comment = has_liked_comment, parent_comment_id = parent_comment_id, pk = pk, share_enabled = share_enabled, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaInlineChildCommentsFeedResponseChildCommentsItem]
  }
}

