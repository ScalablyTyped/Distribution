package typings.instagramPrivateApi.mediaRepositoryCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryCommentResponseComment extends js.Object {
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var media_id: String
  var pk: String
  var share_enabled: Boolean
  var status: String
  var text: String
  var `type`: Double
  var user: MediaRepositoryCommentResponseUser
}

object MediaRepositoryCommentResponseComment {
  @scala.inline
  def apply(
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaRepositoryCommentResponseUser
  ): MediaRepositoryCommentResponseComment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryCommentResponseComment]
  }
}

