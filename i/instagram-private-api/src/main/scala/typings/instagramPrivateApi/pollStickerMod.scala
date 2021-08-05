package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/poll.sticker", "PollSticker")
  @js.native
  class PollSticker () extends InstaSticker {
    
    /* private */ var _tallies: js.Any = js.native
    
    var finished: js.UndefOr[Boolean] = js.native
    
    var isSharedResult: js.UndefOr[Boolean] = js.native
    
    var question: String = js.native
    
    def tallies: Tallies = js.native
    def tallies_=(value: Tallies): Unit = js.native
    
    var viewerCanVote: js.UndefOr[Boolean] = js.native
    
    var viewerVote: js.UndefOr[Double] = js.native
  }
  
  trait PollStickerTallie extends StObject {
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var text: String
  }
  object PollStickerTallie {
    
    inline def apply(text: String): PollStickerTallie = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollStickerTallie]
    }
    
    extension [Self <: PollStickerTallie](x: Self) {
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type Tallies = js.Tuple2[PollStickerTallie, PollStickerTallie]
}
