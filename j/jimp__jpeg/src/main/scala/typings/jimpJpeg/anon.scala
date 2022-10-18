package typings.jimpJpeg

import typings.jimpCore.typesEtcMod.Bitmap
import typings.jimpCore.typesEtcMod.DecoderFn
import typings.jimpCore.typesEtcMod.EncoderFn
import typings.jimpCore.typesEtcMod.Image
import typings.jimpJpeg.jimpJpegStrings.imageSlashjpeg
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imagejpeg extends StObject {
    
    @JSName("image/jpeg")
    var imageSlashjpeg: js.Array[String]
  }
  object Imagejpeg {
    
    inline def apply(imageSlashjpeg: js.Array[String]): Imagejpeg = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagejpeg]
    }
    
    extension [Self <: Imagejpeg](x: Self) {
      
      inline def setImageSlashjpeg(value: js.Array[String]): Self = StObject.set(x, "image/jpeg", value.asInstanceOf[js.Any])
      
      inline def setImageSlashjpegVarargs(value: String*): Self = StObject.set(x, "image/jpeg", js.Array(value*))
    }
  }
  
  trait ImagejpegDecoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(data: Buffer): Bitmap
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: DecoderFn
  }
  object ImagejpegDecoderFn {
    
    inline def apply(imageSlashjpeg: /* data */ Buffer => Bitmap): ImagejpegDecoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(js.Any.fromFunction1(imageSlashjpeg))
      __obj.asInstanceOf[ImagejpegDecoderFn]
    }
    
    extension [Self <: ImagejpegDecoderFn](x: Self) {
      
      inline def setImageSlashjpeg(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/jpeg", js.Any.fromFunction1(value))
    }
  }
  
  trait ImagejpegEncoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(image: Image): Buffer
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: EncoderFn[Image]
  }
  object ImagejpegEncoderFn {
    
    inline def apply(imageSlashjpeg: Image => Buffer): ImagejpegEncoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(js.Any.fromFunction1(imageSlashjpeg))
      __obj.asInstanceOf[ImagejpegEncoderFn]
    }
    
    extension [Self <: ImagejpegEncoderFn](x: Self) {
      
      inline def setImageSlashjpeg(value: Image => Buffer): Self = StObject.set(x, "image/jpeg", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMEJPEG extends StObject {
    
    var MIME_JPEG: imageSlashjpeg
  }
  object MIMEJPEG {
    
    inline def apply(): MIMEJPEG = {
      val __obj = js.Dynamic.literal(MIME_JPEG = "image/jpeg")
      __obj.asInstanceOf[MIMEJPEG]
    }
    
    extension [Self <: MIMEJPEG](x: Self) {
      
      inline def setMIME_JPEG(value: imageSlashjpeg): Self = StObject.set(x, "MIME_JPEG", value.asInstanceOf[js.Any])
    }
  }
}
