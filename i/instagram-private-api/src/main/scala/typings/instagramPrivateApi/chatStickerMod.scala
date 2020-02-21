package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/chat.sticker", JSImport.Namespace)
@js.native
object chatStickerMod extends js.Object {
  @js.native
  class ChatSticker () extends InstaSticker {
    var endBackgroundColor: js.UndefOr[String] = js.native
    var hasStartedChat: js.UndefOr[Boolean] = js.native
    var startBackgroundColor: js.UndefOr[String] = js.native
    var text: String = js.native
  }
  
}

