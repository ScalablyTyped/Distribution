package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var mediaId: String
  var module: js.UndefOr[String] = js.undefined
  var replyToCommentId: js.UndefOr[String] = js.undefined
  var text: String
}

object Module {
  @scala.inline
  def apply(mediaId: String, text: String, module: String = null, replyToCommentId: String = null): Module = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (replyToCommentId != null) __obj.updateDynamic("replyToCommentId")(replyToCommentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

