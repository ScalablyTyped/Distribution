package typings.instagramDashPrivateDashApi.distResponsesMediaDashCommentsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaCommentsFeedResponsePreviewChildCommentsItem extends js.Object {
  var comment_like_count: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var has_liked_comment: Boolean
  var media_id: String
  var parent_comment_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: MediaCommentsFeedResponseUser
}

object MediaCommentsFeedResponsePreviewChildCommentsItem {
  @scala.inline
  def apply(
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    has_liked_comment: Boolean,
    media_id: String,
    parent_comment_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaCommentsFeedResponseUser
  ): MediaCommentsFeedResponsePreviewChildCommentsItem = {
    val __obj = js.Dynamic.literal(comment_like_count = comment_like_count, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, has_liked_comment = has_liked_comment, media_id = media_id, parent_comment_id = parent_comment_id, pk = pk, share_enabled = share_enabled, status = status, text = text, user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MediaCommentsFeedResponsePreviewChildCommentsItem]
  }
}

