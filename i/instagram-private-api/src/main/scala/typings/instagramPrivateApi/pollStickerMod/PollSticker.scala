package typings.instagramPrivateApi.pollStickerMod

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/poll.sticker", "PollSticker")
@js.native
class PollSticker () extends InstaSticker {
  var _tallies: js.Any = js.native
  var finished: js.UndefOr[Boolean] = js.native
  var isSharedResult: js.UndefOr[Boolean] = js.native
  var question: String = js.native
  var viewerCanVote: js.UndefOr[Boolean] = js.native
  var viewerVote: js.UndefOr[Double] = js.native
  def tallies: Tallies = js.native
  def tallies(value: Tallies): js.Any = js.native
}

