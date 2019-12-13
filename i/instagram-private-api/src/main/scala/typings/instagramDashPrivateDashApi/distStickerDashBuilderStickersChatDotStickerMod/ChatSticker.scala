package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod

import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersInstaDashStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/chat.sticker", "ChatSticker")
@js.native
class ChatSticker ()
  extends InstaSticker
     with ChatStickerOptions {
  @JSName("endBackgroundColor")
  var endBackgroundColor_ChatSticker: String = js.native
  var hasStartedChat: Boolean = js.native
  @JSName("startBackgroundColor")
  var startBackgroundColor_ChatSticker: String = js.native
  /* CompleteClass */
  override var text: String = js.native
}

