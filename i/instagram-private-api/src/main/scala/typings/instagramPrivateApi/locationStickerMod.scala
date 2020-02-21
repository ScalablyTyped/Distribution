package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/location.sticker", JSImport.Namespace)
@js.native
object locationStickerMod extends js.Object {
  @js.native
  class LocationSticker () extends InstaSticker {
    var locationId: String = js.native
  }
  
}

