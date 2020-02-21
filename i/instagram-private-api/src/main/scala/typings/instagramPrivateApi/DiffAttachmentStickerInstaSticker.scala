package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.AttachmentSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffAttachmentStickerInstaSticker extends js.Object {
  var mediaId: String
  var mediaOwnerId: String
}

object DiffAttachmentStickerInstaSticker {
  @scala.inline
  def apply(mediaId: String, mediaOwnerId: String): DiffAttachmentStickerInstaSticker = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], mediaOwnerId = mediaOwnerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DiffAttachmentStickerInstaSticker]
  }
}

