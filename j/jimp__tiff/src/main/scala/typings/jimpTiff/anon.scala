package typings.jimpTiff

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpTiff.jimpTiffStrings.imageSlashtiff
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imagetiff extends StObject {
    
    @JSName("image/tiff")
    var imageSlashtiff: js.Array[String]
  }
  object Imagetiff {
    
    inline def apply(imageSlashtiff: js.Array[String]): Imagetiff = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagetiff]
    }
    
    extension [Self <: Imagetiff](x: Self) {
      
      inline def setImageSlashtiff(value: js.Array[String]): Self = StObject.set(x, "image/tiff", value.asInstanceOf[js.Any])
      
      inline def setImageSlashtiffVarargs(value: String*): Self = StObject.set(x, "image/tiff", js.Array(value*))
    }
  }
  
  trait ImagetiffDecoderFn extends StObject {
    
    @JSName("image/tiff")
    def imageSlashtiff(data: Buffer): Bitmap
    @JSName("image/tiff")
    var imageSlashtiff_Original: DecoderFn
  }
  object ImagetiffDecoderFn {
    
    inline def apply(imageSlashtiff: /* data */ Buffer => Bitmap): ImagetiffDecoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/tiff")(js.Any.fromFunction1(imageSlashtiff))
      __obj.asInstanceOf[ImagetiffDecoderFn]
    }
    
    extension [Self <: ImagetiffDecoderFn](x: Self) {
      
      inline def setImageSlashtiff(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/tiff", js.Any.fromFunction1(value))
    }
  }
  
  trait ImagetiffEncoderFn extends StObject {
    
    @JSName("image/tiff")
    def imageSlashtiff(image: Image): Buffer
    @JSName("image/tiff")
    var imageSlashtiff_Original: EncoderFn[Image]
  }
  object ImagetiffEncoderFn {
    
    inline def apply(imageSlashtiff: Image => Buffer): ImagetiffEncoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/tiff")(js.Any.fromFunction1(imageSlashtiff))
      __obj.asInstanceOf[ImagetiffEncoderFn]
    }
    
    extension [Self <: ImagetiffEncoderFn](x: Self) {
      
      inline def setImageSlashtiff(value: Image => Buffer): Self = StObject.set(x, "image/tiff", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMETIFF extends StObject {
    
    var MIME_TIFF: imageSlashtiff
  }
  object MIMETIFF {
    
    inline def apply(): MIMETIFF = {
      val __obj = js.Dynamic.literal(MIME_TIFF = "image/tiff")
      __obj.asInstanceOf[MIMETIFF]
    }
    
    extension [Self <: MIMETIFF](x: Self) {
      
      inline def setMIME_TIFF(value: imageSlashtiff): Self = StObject.set(x, "MIME_TIFF", value.asInstanceOf[js.Any])
    }
  }
}
