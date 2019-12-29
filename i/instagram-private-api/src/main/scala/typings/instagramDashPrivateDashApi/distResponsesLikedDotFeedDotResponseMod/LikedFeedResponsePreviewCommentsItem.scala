package typings.instagramDashPrivateDashApi.distResponsesLikedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikedFeedResponsePreviewCommentsItem extends js.Object {
  var bit_flags: Double
  var comment_like_count: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_liked_comment: Boolean
  var media_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: LikedFeedResponseUser
  var user_id: Double
}

object LikedFeedResponsePreviewCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    comment_like_count: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    has_liked_comment: Boolean,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: LikedFeedResponseUser,
    user_id: Double
  ): LikedFeedResponsePreviewCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], comment_like_count = comment_like_count.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], did_report_as_spam = did_report_as_spam.asInstanceOf[js.Any], has_liked_comment = has_liked_comment.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponsePreviewCommentsItem]
  }
}

