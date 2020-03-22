package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.AttachmentSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffAttachmentStickerInst extends js.Object {
  var mediaId: String
  var mediaOwnerId: String
}

object DiffAttachmentStickerInst {
  @scala.inline
  def apply(mediaId: String, mediaOwnerId: String): DiffAttachmentStickerInst = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], mediaOwnerId = mediaOwnerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiffAttachmentStickerInst]
  }
}

