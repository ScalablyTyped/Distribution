package typings.instagramDashPrivateDashApi.distResponsesLiveDotCommentsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCommentsResponseCommentsItem extends js.Object {
  var bit_flags: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var inline_composer_display_condition: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: LiveCommentsResponseUser
  var user_id: Double
}

object LiveCommentsResponseCommentsItem {
  @scala.inline
  def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    inline_composer_display_condition: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: LiveCommentsResponseUser,
    user_id: Double
  ): LiveCommentsResponseCommentsItem = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, did_report_as_spam = did_report_as_spam, inline_composer_display_condition = inline_composer_display_condition, pk = pk, share_enabled = share_enabled, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiveCommentsResponseCommentsItem]
  }
}

