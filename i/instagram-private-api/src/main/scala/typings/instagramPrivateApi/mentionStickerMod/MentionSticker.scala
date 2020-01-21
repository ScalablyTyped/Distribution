package typings.instagramPrivateApi.mentionStickerMod

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.instagramPrivateApi.mentionStickerMod.MentionStickerOptions because var conflicts: height, width. Inlined userId */ @JSImport("instagram-private-api/dist/sticker-builder/stickers/mention.sticker", "MentionSticker")
@js.native
class MentionSticker () extends InstaSticker {
  var displayType: String = js.native
  var userId: String = js.native
}

