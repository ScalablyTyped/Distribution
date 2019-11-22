package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MediaId extends js.Object {
  var mediaId: String
  var module: js.UndefOr[String] = js.undefined
  var replyToCommentId: js.UndefOr[String] = js.undefined
  var text: String
}

object Anon_MediaId {
  @scala.inline
  def apply(mediaId: String, text: String, module: String = null, replyToCommentId: String = null): Anon_MediaId = {
    val __obj = js.Dynamic.literal(mediaId = mediaId, text = text)
    if (module != null) __obj.updateDynamic("module")(module)
    if (replyToCommentId != null) __obj.updateDynamic("replyToCommentId")(replyToCommentId)
    __obj.asInstanceOf[Anon_MediaId]
  }
}

