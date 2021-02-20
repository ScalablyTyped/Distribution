package typings.jimpGif

import typings.jimpGif.anon.Imagegif
import typings.jimpGif.anon.ImagegifDecoderFn
import typings.jimpGif.anon.MIMEGIF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/gif", JSImport.Default)
  @js.native
  def default(): Gif = js.native
  
  @js.native
  trait Gif extends StObject {
    
    var constants: MIMEGIF = js.native
    
    var decoders: ImagegifDecoderFn = js.native
    
    var mime: Imagegif = js.native
  }
  object Gif {
    
    @scala.inline
    def apply(constants: MIMEGIF, decoders: ImagegifDecoderFn, mime: Imagegif): Gif = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gif]
    }
    
    @scala.inline
    implicit class GifMutableBuilder[Self <: Gif] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: MIMEGIF): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoders(value: ImagegifDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: Imagegif): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
