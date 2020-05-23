package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.pollStickerMod.Tallies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.PollSticker> */
@js.native
trait StickerOptionsPollSticker extends js.Object {
  var _tallies: js.Any = js.native
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.native
  var bottom: js.UndefOr[js.Function0[this.type]] = js.native
  var center: js.UndefOr[js.Function0[this.type]] = js.native
  var finished: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[js.Function0[String]] = js.native
  var isSharedResult: js.UndefOr[Boolean] = js.native
  var isSticker: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Function0[String]] = js.native
  var left: js.UndefOr[js.Function0[this.type]] = js.native
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  var question: String = js.native
  var right: js.UndefOr[js.Function0[this.type]] = js.native
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.native
  @JSName("tallies")
  var tallies_Original: js.Function0[Tallies] = js.native
  var toJSON: js.UndefOr[js.Function0[_]] = js.native
  var top: js.UndefOr[js.Function0[this.type]] = js.native
  var viewerCanVote: js.UndefOr[Boolean] = js.native
  var viewerVote: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var z: js.UndefOr[Double] = js.native
  def tallies(): Tallies = js.native
}

