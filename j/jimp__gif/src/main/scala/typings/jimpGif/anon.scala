package typings.jimpGif

import typings.jimpCore.typesEtcMod.Bitmap
import typings.jimpCore.typesEtcMod.DecoderFn
import typings.jimpGif.jimpGifStrings.imageSlashgif
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Imagegif extends StObject {
    
    @JSName("image/gif")
    var imageSlashgif: js.Array[String]
  }
  object Imagegif {
    
    inline def apply(imageSlashgif: js.Array[String]): Imagegif = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagegif]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imagegif] (val x: Self) extends AnyVal {
      
      inline def setImageSlashgif(value: js.Array[String]): Self = StObject.set(x, "image/gif", value.asInstanceOf[js.Any])
      
      inline def setImageSlashgifVarargs(value: String*): Self = StObject.set(x, "image/gif", js.Array(value*))
    }
  }
  
  trait ImagegifDecoderFn extends StObject {
    
    @JSName("image/gif")
    def imageSlashgif(data: Buffer): Bitmap
    @JSName("image/gif")
    var imageSlashgif_Original: DecoderFn
  }
  object ImagegifDecoderFn {
    
    inline def apply(imageSlashgif: /* data */ Buffer => Bitmap): ImagegifDecoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/gif")(js.Any.fromFunction1(imageSlashgif))
      __obj.asInstanceOf[ImagegifDecoderFn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImagegifDecoderFn] (val x: Self) extends AnyVal {
      
      inline def setImageSlashgif(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/gif", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMEGIF extends StObject {
    
    var MIME_GIF: imageSlashgif
  }
  object MIMEGIF {
    
    inline def apply(): MIMEGIF = {
      val __obj = js.Dynamic.literal(MIME_GIF = "image/gif")
      __obj.asInstanceOf[MIMEGIF]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MIMEGIF] (val x: Self) extends AnyVal {
      
      inline def setMIME_GIF(value: imageSlashgif): Self = StObject.set(x, "MIME_GIF", value.asInstanceOf[js.Any])
    }
  }
}
