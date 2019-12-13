package typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod

import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersInstaDashStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/poll.sticker", "PollSticker")
@js.native
class PollSticker ()
  extends InstaSticker
     with PollStickerOptions {
  var finished: Boolean = js.native
  var isSharedResult: Boolean = js.native
  /* CompleteClass */
  override var question: String = js.native
  /* CompleteClass */
  override var tallies: js.Tuple2[PollStickerTallie, PollStickerTallie] = js.native
  var viewerCanVote: Boolean = js.native
  var viewerVote: Double = js.native
}

