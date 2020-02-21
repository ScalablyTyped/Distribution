package typings.instagramPrivateApi

import typings.luxon.mod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.CountdownSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffCountdownStickerInstaSticker extends js.Object {
  var _endTs: js.Any = js.native
  var digitCardColor: js.UndefOr[String] = js.native
  var digitColor: js.UndefOr[String] = js.native
  var endBackgroundColor: js.UndefOr[String] = js.native
  @JSName("endTs")
  var endTs_Original: js.Function0[DateTime | Double] = js.native
  var followingEnabled: js.UndefOr[Boolean] = js.native
  var startBackgroundColor: js.UndefOr[String] = js.native
  var text: String = js.native
  var textColor: js.UndefOr[String] = js.native
  def endTs(): DateTime | Double = js.native
}

