package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod

import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersInstaDashStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/countdown.sticker", "CountdownSticker")
@js.native
class CountdownSticker ()
  extends InstaSticker
     with CountdownStickerOptions {
  @JSName("digitCardColor")
  var digitCardColor_CountdownSticker: String = js.native
  @JSName("digitColor")
  var digitColor_CountdownSticker: String = js.native
  @JSName("endBackgroundColor")
  var endBackgroundColor_CountdownSticker: String = js.native
  /* CompleteClass */
  override var endTs: Double = js.native
  var followingEnabled: Boolean = js.native
  @JSName("startBackgroundColor")
  var startBackgroundColor_CountdownSticker: String = js.native
  /* CompleteClass */
  override var text: String = js.native
  @JSName("textColor")
  var textColor_CountdownSticker: String = js.native
}

