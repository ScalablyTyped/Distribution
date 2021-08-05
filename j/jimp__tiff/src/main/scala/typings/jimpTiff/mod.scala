package typings.jimpTiff

import typings.jimpTiff.anon.Imagetiff
import typings.jimpTiff.anon.ImagetiffDecoderFn
import typings.jimpTiff.anon.ImagetiffEncoderFn
import typings.jimpTiff.anon.MIMETIFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/tiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Tiff = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Tiff]
  
  trait Tiff extends StObject {
    
    var constants: MIMETIFF
    
    var decoders: ImagetiffDecoderFn
    
    var encoders: ImagetiffEncoderFn
    
    var mime: Imagetiff
  }
  object Tiff {
    
    inline def apply(constants: MIMETIFF, decoders: ImagetiffDecoderFn, encoders: ImagetiffEncoderFn, mime: Imagetiff): Tiff = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tiff]
    }
    
    extension [Self <: Tiff](x: Self) {
      
      inline def setConstants(value: MIMETIFF): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setDecoders(value: ImagetiffDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: ImagetiffEncoderFn): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      inline def setMime(value: Imagetiff): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
