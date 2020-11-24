package typings.instagramPrivateApi.pollStickerMod

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/sticker-builder/stickers/poll.sticker", "PollSticker")
@js.native
class PollSticker () extends InstaSticker {
  
  var _tallies: js.Any = js.native
  
  var finished: js.UndefOr[Boolean] = js.native
  
  var isSharedResult: js.UndefOr[Boolean] = js.native
  
  var question: String = js.native
  
  def tallies: Tallies = js.native
  def tallies_=(value: Tallies): Unit = js.native
  
  var viewerCanVote: js.UndefOr[Boolean] = js.native
  
  var viewerVote: js.UndefOr[Double] = js.native
}
