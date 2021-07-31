package typings.jimpJpeg

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpJpeg.jimpJpegStrings.imageSlashjpeg
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imagejpeg extends StObject {
    
    @JSName("image/jpeg")
    var imageSlashjpeg: js.Array[String]
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
  
  trait ImagejpegDecoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(data: Buffer): Bitmap
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: DecoderFn
  }
  object ImagejpegDecoderFn {
    
    @scala.inline
    def apply(imageSlashjpeg: /* data */ Buffer => Bitmap): ImagejpegDecoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(js.Any.fromFunction1(imageSlashjpeg))
      __obj.asInstanceOf[ImagejpegDecoderFn]
    }
    
    @scala.inline
    implicit class ImagejpegDecoderFnMutableBuilder[Self <: ImagejpegDecoderFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashjpeg(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/jpeg", js.Any.fromFunction1(value))
    }
  }
  
  trait ImagejpegEncoderFn extends StObject {
    
    @JSName("image/jpeg")
    def imageSlashjpeg(image: Image): Buffer
    @JSName("image/jpeg")
    var imageSlashjpeg_Original: EncoderFn[Image]
  }
  object ImagejpegEncoderFn {
    
    @scala.inline
    def apply(imageSlashjpeg: Image => Buffer): ImagejpegEncoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/jpeg")(js.Any.fromFunction1(imageSlashjpeg))
      __obj.asInstanceOf[ImagejpegEncoderFn]
    }
    
    @scala.inline
    implicit class ImagejpegEncoderFnMutableBuilder[Self <: ImagejpegEncoderFn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashjpeg(value: Image => Buffer): Self = StObject.set(x, "image/jpeg", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMEJPEG extends StObject {
    
    var MIME_JPEG: imageSlashjpeg
  }
  object MIMEJPEG {
    
    @scala.inline
    def apply(): MIMEJPEG = {
      val __obj = js.Dynamic.literal(MIME_JPEG = "image/jpeg")
      __obj.asInstanceOf[MIMEJPEG]
    }
    
    @scala.inline
    implicit class MIMEJPEGMutableBuilder[Self <: MIMEJPEG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_JPEG(value: imageSlashjpeg): Self = StObject.set(x, "MIME_JPEG", value.asInstanceOf[js.Any])
    }
  }
}
