package typings.jimpBmp

import typings.jimpBmp.anon.Imagebmp
import typings.jimpBmp.anon.ImagebmpImagexmsbmp
import typings.jimpBmp.anon.Imagexmsbmp
import typings.jimpBmp.anon.MIMEBMP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/bmp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Bmp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Bmp]
  
  trait Bmp extends StObject {
    
    var constants: MIMEBMP
    
    var decoders: Imagexmsbmp
    
    var encoders: ImagebmpImagexmsbmp
    
    var mime: Imagebmp
  }
  object Bmp {
    
    inline def apply(constants: MIMEBMP, decoders: Imagexmsbmp, encoders: ImagebmpImagexmsbmp, mime: Imagebmp): Bmp = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bmp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bmp] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: MIMEBMP): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setDecoders(value: Imagexmsbmp): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: ImagebmpImagexmsbmp): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      inline def setMime(value: Imagebmp): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
