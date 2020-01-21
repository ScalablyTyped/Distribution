package typings.instagramPrivateApi.sliderStickerMod

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/slider.sticker", "SliderSticker")
@js.native
class SliderSticker ()
  extends InstaSticker
     with SliderStickerOptions {
  @JSName("backgroundColor")
  var backgroundColor_SliderSticker: String = js.native
  /* CompleteClass */
  override var emoji: String = js.native
  /* CompleteClass */
  override var question: String = js.native
  var sliderVoteAverage: Double = js.native
  var sliderVoteCount: Double = js.native
  @JSName("textColor")
  var textColor_SliderSticker: String = js.native
  var viewerCanVote: Boolean = js.native
  var viewerVote: Double = js.native
}

