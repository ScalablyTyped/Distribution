package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatStickerOptions extends js.Object {
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  var text: String
}

object ChatStickerOptions {
  @scala.inline
  def apply(text: String, endBackgroundColor: String = null, startBackgroundColor: String = null): ChatStickerOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (endBackgroundColor != null) __obj.updateDynamic("endBackgroundColor")(endBackgroundColor.asInstanceOf[js.Any])
    if (startBackgroundColor != null) __obj.updateDynamic("startBackgroundColor")(startBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatStickerOptions]
  }
}

