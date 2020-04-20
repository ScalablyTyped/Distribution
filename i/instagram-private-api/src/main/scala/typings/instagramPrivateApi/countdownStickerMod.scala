package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.luxon.mod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/countdown.sticker", JSImport.Namespace)
@js.native
object countdownStickerMod extends js.Object {
  @js.native
  class CountdownSticker () extends InstaSticker {
    var _endTs: js.Any = js.native
    var digitCardColor: js.UndefOr[String] = js.native
    var digitColor: js.UndefOr[String] = js.native
    var endBackgroundColor: js.UndefOr[String] = js.native
    var followingEnabled: js.UndefOr[Boolean] = js.native
    var startBackgroundColor: js.UndefOr[String] = js.native
    var text: String = js.native
    var textColor: js.UndefOr[String] = js.native
    def endTs: DateTime | Double = js.native
    def endTs(value: Double): js.Any = js.native
    def endTs(value: DateTime): js.Any = js.native
  }
  
}

