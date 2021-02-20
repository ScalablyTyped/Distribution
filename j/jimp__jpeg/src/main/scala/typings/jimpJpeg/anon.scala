package typings.jimpJpeg

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpJpeg.jimpJpegStrings.imageSlashjpeg
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Imagejpeg extends StObject {
    
    @JSName("image/jpeg")
    var imageSlashjpeg: js.Array[String] = js.native
  }
  object Imagejpeg {
    
    @scala.inline
    def apply(imageSlashjpeg: js.Array[String]): Imagejpeg = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(imageSlashjpeg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagejpeg]
    }
    
    @scala.inline
    implicit class ImagejpegMutableBuilder[Self <: Imagejpeg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashjpeg(value: js.Array[String]): Self = StObject.set(x, "image/jpeg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSlashjpegVarargs(value: String*): Self = StObject.set(x, "image/jpeg", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImagejpegDecoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(data: Buffer): Bitmap = js.native
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: DecoderFn = js.native
  }
  
  @js.native
  trait ImagejpegEncoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(image: Image): Buffer = js.native
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: EncoderFn[Image] = js.native
  }
  
  @js.native
  trait MIMEJPEG extends StObject {
    
    var MIME_JPEG: imageSlashjpeg = js.native
  }
  object MIMEJPEG {
    
    @scala.inline
    def apply(MIME_JPEG: imageSlashjpeg): MIMEJPEG = {
      val __obj = js.Dynamic.literal(MIME_JPEG = MIME_JPEG.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMEJPEG]
    }
    
    @scala.inline
    implicit class MIMEJPEGMutableBuilder[Self <: MIMEJPEG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_JPEG(value: imageSlashjpeg): Self = StObject.set(x, "MIME_JPEG", value.asInstanceOf[js.Any])
    }
  }
}
