package typings.jimpTiff

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpTiff.jimpTiffStrings.imageSlashtiff
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Imagetiff extends StObject {
    
    @JSName("image/tiff")
    var imageSlashtiff: js.Array[String] = js.native
  }
  object Imagetiff {
    
    @scala.inline
    def apply(imageSlashtiff: js.Array[String]): Imagetiff = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/tiff")(imageSlashtiff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagetiff]
    }
    
    @scala.inline
    implicit class ImagetiffMutableBuilder[Self <: Imagetiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashtiff(value: js.Array[String]): Self = StObject.set(x, "image/tiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSlashtiffVarargs(value: String*): Self = StObject.set(x, "image/tiff", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImagetiffDecoderFn extends StObject {
    
    @JSName("image/tiff")
    def imageSlashtiff(data: Buffer): Bitmap = js.native
    @JSName("image/tiff")
    var imageSlashtiff_Original: DecoderFn = js.native
  }
  
  @js.native
  trait ImagetiffEncoderFn extends StObject {
    
    @JSName("image/tiff")
    def imageSlashtiff(image: Image): Buffer = js.native
    @JSName("image/tiff")
    var imageSlashtiff_Original: EncoderFn[Image] = js.native
  }
  
  @js.native
  trait MIMETIFF extends StObject {
    
    var MIME_TIFF: imageSlashtiff = js.native
  }
  object MIMETIFF {
    
    @scala.inline
    def apply(MIME_TIFF: imageSlashtiff): MIMETIFF = {
      val __obj = js.Dynamic.literal(MIME_TIFF = MIME_TIFF.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMETIFF]
    }
    
    @scala.inline
    implicit class MIMETIFFMutableBuilder[Self <: MIMETIFF] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_TIFF(value: imageSlashtiff): Self = StObject.set(x, "MIME_TIFF", value.asInstanceOf[js.Any])
    }
  }
}
