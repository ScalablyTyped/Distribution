package typings.instagramPrivateApi

import typings.instagramPrivateApi.pollStickerMod.Tallies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.PollSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffPollStickerInstaSticker extends js.Object {
  var _tallies: js.Any = js.native
  var finished: js.UndefOr[Boolean] = js.native
  var isSharedResult: js.UndefOr[Boolean] = js.native
  var question: String = js.native
  @JSName("tallies")
  var tallies_Original: js.Function0[Tallies] = js.native
  var viewerCanVote: js.UndefOr[Boolean] = js.native
  var viewerVote: js.UndefOr[Double] = js.native
  def tallies(): Tallies = js.native
}

