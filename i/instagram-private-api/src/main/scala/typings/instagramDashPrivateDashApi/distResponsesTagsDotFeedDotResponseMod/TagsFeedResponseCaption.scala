package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseCaption extends js.Object {
  var bit_flags: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var did_report_as_spam: Boolean
  var has_translation: js.UndefOr[Boolean] = js.undefined
  var media_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: TagsFeedResponseUser
  var user_id: Double
}

object TagsFeedResponseCaption {
  @scala.inline
  def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    did_report_as_spam: Boolean,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: TagsFeedResponseUser,
    user_id: Double,
    has_translation: js.UndefOr[Boolean] = js.undefined
  ): TagsFeedResponseCaption = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, did_report_as_spam = did_report_as_spam, media_id = media_id, pk = pk, share_enabled = share_enabled, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(has_translation)) __obj.updateDynamic("has_translation")(has_translation)
    __obj.asInstanceOf[TagsFeedResponseCaption]
  }
}

