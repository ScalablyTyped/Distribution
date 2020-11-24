package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/sticker-builder/stickers/slider.sticker", JSImport.Namespace)
@js.native
object sliderStickerMod extends js.Object {
  
  @js.native
  class SliderSticker () extends InstaSticker {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var emoji: String = js.native
    
    var question: String = js.native
    
    var sliderVoteAverage: js.UndefOr[Double] = js.native
    
    var sliderVoteCount: js.UndefOr[Double] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var viewerCanVote: js.UndefOr[Boolean] = js.native
    
    var viewerVote: js.UndefOr[Double] = js.native
  }
}
