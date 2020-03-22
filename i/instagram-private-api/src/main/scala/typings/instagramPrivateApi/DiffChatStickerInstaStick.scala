package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.ChatSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffChatStickerInstaStick extends js.Object {
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  var hasStartedChat: js.UndefOr[Boolean] = js.undefined
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  var text: String
}

object DiffChatStickerInstaStick {
  @scala.inline
  def apply(
    text: String,
    endBackgroundColor: String = null,
    hasStartedChat: js.UndefOr[Boolean] = js.undefined,
    startBackgroundColor: String = null
  ): DiffChatStickerInstaStick = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (endBackgroundColor != null) __obj.updateDynamic("endBackgroundColor")(endBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasStartedChat)) __obj.updateDynamic("hasStartedChat")(hasStartedChat.asInstanceOf[js.Any])
    if (startBackgroundColor != null) __obj.updateDynamic("startBackgroundColor")(startBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffChatStickerInstaStick]
  }
}

