package typings.jimpGif

import typings.jimpGif.anon.Imagegif
import typings.jimpGif.anon.ImagegifDecoderFn
import typings.jimpGif.anon.MIMEGIF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/gif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Gif = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Gif]
  
  trait Gif extends StObject {
    
    var constants: MIMEGIF
    
    var decoders: ImagegifDecoderFn
    
    var mime: Imagegif
  }
  object Gif {
    
    inline def apply(constants: MIMEGIF, decoders: ImagegifDecoderFn, mime: Imagegif): Gif = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gif]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Gif] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: MIMEGIF): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setDecoders(value: ImagegifDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setMime(value: Imagegif): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
