package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/attachment.sticker", JSImport.Namespace)
@js.native
object attachmentStickerMod extends js.Object {
  @js.native
  class AttachmentSticker () extends InstaSticker {
    var mediaId: String = js.native
    var mediaOwnerId: String = js.native
  }
  
}

