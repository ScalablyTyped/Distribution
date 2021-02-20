package typings.jimpGif

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpGif.jimpGifStrings.imageSlashgif
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Imagegif extends StObject {
    
    @JSName("image/gif")
    var imageSlashgif: js.Array[String] = js.native
  }
  object Imagegif {
    
    @scala.inline
    def apply(imageSlashgif: js.Array[String]): Imagegif = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagegif]
    }
    
    @scala.inline
    implicit class ImagegifMutableBuilder[Self <: Imagegif] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashgif(value: js.Array[String]): Self = StObject.set(x, "image/gif", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSlashgifVarargs(value: String*): Self = StObject.set(x, "image/gif", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImagegifDecoderFn extends StObject {
    
    @JSName("image/gif")
    def imageSlashgif(data: Buffer): Bitmap = js.native
    @JSName("image/gif")
    var imageSlashgif_Original: DecoderFn = js.native
  }
  
  @js.native
  trait MIMEGIF extends StObject {
    
    var MIME_GIF: imageSlashgif = js.native
  }
  object MIMEGIF {
    
    @scala.inline
    def apply(MIME_GIF: imageSlashgif): MIMEGIF = {
      val __obj = js.Dynamic.literal(MIME_GIF = MIME_GIF.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMEGIF]
    }
    
    @scala.inline
    implicit class MIMEGIFMutableBuilder[Self <: MIMEGIF] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_GIF(value: imageSlashgif): Self = StObject.set(x, "MIME_GIF", value.asInstanceOf[js.Any])
    }
  }
}
