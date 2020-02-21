package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.instagramPrivateApi.instagramPrivateApiStrings.mention_reshare
import typings.instagramPrivateApi.instagramPrivateApiStrings.mention_username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/mention.sticker", JSImport.Namespace)
@js.native
object mentionStickerMod extends js.Object {
  @js.native
  class MentionSticker () extends InstaSticker {
    var displayType: js.UndefOr[mention_username | mention_reshare] = js.native
    var mediaId: js.UndefOr[String] = js.native
    var userId: String = js.native
  }
  
}

