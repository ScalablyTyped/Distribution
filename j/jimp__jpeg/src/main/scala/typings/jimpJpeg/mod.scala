package typings.jimpJpeg

import typings.jimpCore.typesEtcMod.ImageCallback
import typings.jimpJpeg.anon.Imagejpeg
import typings.jimpJpeg.anon.ImagejpegDecoderFn
import typings.jimpJpeg.anon.ImagejpegEncoderFn
import typings.jimpJpeg.anon.MIMEJPEG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/jpeg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Jpeg = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Jpeg]
  
  trait Jpeg extends StObject {
    
    var `class`: JpegClass
    
    var constants: MIMEJPEG
    
    var decoders: ImagejpegDecoderFn
    
    var encoders: ImagejpegEncoderFn
    
    var mime: Imagejpeg
  }
  object Jpeg {
    
    inline def apply(
      `class`: JpegClass,
      constants: MIMEJPEG,
      decoders: ImagejpegDecoderFn,
      encoders: ImagejpegEncoderFn,
      mime: Imagejpeg
    ): Jpeg = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jpeg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jpeg] (val x: Self) extends AnyVal {
      
      inline def setClass(value: JpegClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setConstants(value: MIMEJPEG): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setDecoders(value: ImagejpegDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setEncoders(value: ImagejpegEncoderFn): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      inline def setMime(value: Imagejpeg): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JpegClass extends StObject {
    
    var _quality: Double = js.native
    
    def quality(n: Double): this.type = js.native
    def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
