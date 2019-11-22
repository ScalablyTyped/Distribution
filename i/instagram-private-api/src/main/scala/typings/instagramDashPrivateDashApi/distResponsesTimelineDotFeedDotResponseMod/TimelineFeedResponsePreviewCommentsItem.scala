package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponsePreviewCommentsItem extends js.Object {
  var bit_flags: Double
  var comment_like_count: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_liked_comment: Boolean
  var has_translation: js.UndefOr[Boolean] = js.undefined
  var media_id: String
  var parent_comment_id: js.UndefOr[String] = js.undefined
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: TimelineFeedResponseUser
  var user_id: Double
}

object TimelineFeedResponsePreviewCommentsItem {
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
    user: TimelineFeedResponseUser,
    user_id: Double,
    has_translation: js.UndefOr[Boolean] = js.undefined,
    parent_comment_id: String = null
  ): TimelineFeedResponsePreviewCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, comment_like_count = comment_like_count, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, did_report_as_spam = did_report_as_spam, has_liked_comment = has_liked_comment, media_id = media_id, pk = pk, share_enabled = share_enabled, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(has_translation)) __obj.updateDynamic("has_translation")(has_translation)
    if (parent_comment_id != null) __obj.updateDynamic("parent_comment_id")(parent_comment_id)
    __obj.asInstanceOf[TimelineFeedResponsePreviewCommentsItem]
  }
}

