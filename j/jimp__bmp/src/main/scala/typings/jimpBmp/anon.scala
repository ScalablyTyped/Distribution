package typings.jimpBmp

import typings.jimpBmp.jimpBmpStrings.`imageSlashx-ms-bmp`
import typings.jimpBmp.jimpBmpStrings.imageSlashbmp
import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Imagebmp extends StObject {
    
    @JSName("image/bmp")
    var imageSlashbmp: js.Array[String] = js.native
  }
  object Imagebmp {
    
    @scala.inline
    def apply(imageSlashbmp: js.Array[String]): Imagebmp = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagebmp]
    }
    
    @scala.inline
    implicit class ImagebmpMutableBuilder[Self <: Imagebmp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashbmp(value: js.Array[String]): Self = StObject.set(x, "image/bmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSlashbmpVarargs(value: String*): Self = StObject.set(x, "image/bmp", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImagebmpImagexmsbmp extends StObject {
    
    @JSName("image/bmp")
    def imageSlashbmp(image: Image): Buffer = js.native
    @JSName("image/bmp")
    var imageSlashbmp_Original: EncoderFn[Image] = js.native
    
    @JSName("image/x-ms-bmp")
    def `imageSlashx-ms-bmp`(image: Image): Buffer = js.native
    @JSName("image/x-ms-bmp")
    var `imageSlashx-ms-bmp_Original`: EncoderFn[Image] = js.native
  }
  
  @js.native
  trait Imagexmsbmp extends StObject {
    
    @JSName("image/bmp")
    def imageSlashbmp(data: Buffer): Bitmap = js.native
    @JSName("image/bmp")
    var imageSlashbmp_Original: DecoderFn = js.native
    
    @JSName("image/x-ms-bmp")
    def `imageSlashx-ms-bmp`(data: Buffer): Bitmap = js.native
    @JSName("image/x-ms-bmp")
    var `imageSlashx-ms-bmp_Original`: DecoderFn = js.native
  }
  
  @js.native
  trait MIMEBMP extends StObject {
    
    var MIME_BMP: imageSlashbmp = js.native
    
    var MIME_X_MS_BMP: `imageSlashx-ms-bmp` = js.native
  }
  object MIMEBMP {
    
    @scala.inline
    def apply(MIME_BMP: imageSlashbmp, MIME_X_MS_BMP: `imageSlashx-ms-bmp`): MIMEBMP = {
      val __obj = js.Dynamic.literal(MIME_BMP = MIME_BMP.asInstanceOf[js.Any], MIME_X_MS_BMP = MIME_X_MS_BMP.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMEBMP]
    }
    
    @scala.inline
    implicit class MIMEBMPMutableBuilder[Self <: MIMEBMP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_BMP(value: imageSlashbmp): Self = StObject.set(x, "MIME_BMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIME_X_MS_BMP(value: `imageSlashx-ms-bmp`): Self = StObject.set(x, "MIME_X_MS_BMP", value.asInstanceOf[js.Any])
    }
  }
}
