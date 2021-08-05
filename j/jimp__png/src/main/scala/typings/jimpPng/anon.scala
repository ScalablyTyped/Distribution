package typings.jimpPng

import typings.jimpCore.etcMod.Bitmap
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpPng.jimpPngBooleans.`true`
import typings.jimpPng.jimpPngNumbers.`-1`
import typings.jimpPng.jimpPngNumbers.`1`
import typings.jimpPng.jimpPngNumbers.`2`
import typings.jimpPng.jimpPngNumbers.`3`
import typings.jimpPng.jimpPngNumbers.`4`
import typings.jimpPng.jimpPngStrings.imageSlashpng
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    @JSName("image/png")
    var imageSlashpng: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setImageSlashpng(value: `true`): Self = StObject.set(x, "image/png", value.asInstanceOf[js.Any])
    }
  }
  
  trait Imagepng extends StObject {
    
    @JSName("image/png")
    var imageSlashpng: js.Array[String]
  }
  object Imagepng {
    
    inline def apply(imageSlashpng: js.Array[String]): Imagepng = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagepng]
    }
    
    extension [Self <: Imagepng](x: Self) {
      
      inline def setImageSlashpng(value: js.Array[String]): Self = StObject.set(x, "image/png", value.asInstanceOf[js.Any])
      
      inline def setImageSlashpngVarargs(value: String*): Self = StObject.set(x, "image/png", js.Array(value :_*))
    }
  }
  
  trait ImagepngDecoderFn extends StObject {
    
    @JSName("image/png")
    def imageSlashpng(data: Buffer): Bitmap
    @JSName("image/png")
    var imageSlashpng_Original: DecoderFn
  }
  object ImagepngDecoderFn {
    
    inline def apply(imageSlashpng: /* data */ Buffer => Bitmap): ImagepngDecoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(js.Any.fromFunction1(imageSlashpng))
      __obj.asInstanceOf[ImagepngDecoderFn]
    }
    
    extension [Self <: ImagepngDecoderFn](x: Self) {
      
      inline def setImageSlashpng(value: /* data */ Buffer => Bitmap): Self = StObject.set(x, "image/png", js.Any.fromFunction1(value))
    }
  }
  
  trait ImagepngEncoderFn extends StObject {
    
    @JSName("image/png")
    def imageSlashpng(image: Image): Buffer
    @JSName("image/png")
    var imageSlashpng_Original: EncoderFn[Image]
  }
  object ImagepngEncoderFn {
    
    inline def apply(imageSlashpng: Image => Buffer): ImagepngEncoderFn = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(js.Any.fromFunction1(imageSlashpng))
      __obj.asInstanceOf[ImagepngEncoderFn]
    }
    
    extension [Self <: ImagepngEncoderFn](x: Self) {
      
      inline def setImageSlashpng(value: Image => Buffer): Self = StObject.set(x, "image/png", js.Any.fromFunction1(value))
    }
  }
  
  trait MIMEPNG extends StObject {
    
    var MIME_PNG: imageSlashpng
    
    // PNG filter types
    var PNG_FILTER_AUTO: `-1`
    
    var PNG_FILTER_AVERAGE: `3`
    
    var PNG_FILTER_NONE: typings.jimpPng.jimpPngNumbers.`0`
    
    var PNG_FILTER_PATH: `4`
    
    var PNG_FILTER_SUB: `1`
    
    var PNG_FILTER_UP: `2`
  }
  object MIMEPNG {
    
    inline def apply(): MIMEPNG = {
      val __obj = js.Dynamic.literal(MIME_PNG = "image/png", PNG_FILTER_AUTO = -1, PNG_FILTER_AVERAGE = 3, PNG_FILTER_NONE = 0, PNG_FILTER_PATH = 4, PNG_FILTER_SUB = 1, PNG_FILTER_UP = 2)
      __obj.asInstanceOf[MIMEPNG]
    }
    
    extension [Self <: MIMEPNG](x: Self) {
      
      inline def setMIME_PNG(value: imageSlashpng): Self = StObject.set(x, "MIME_PNG", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_AUTO(value: `-1`): Self = StObject.set(x, "PNG_FILTER_AUTO", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_AVERAGE(value: `3`): Self = StObject.set(x, "PNG_FILTER_AVERAGE", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_NONE(value: typings.jimpPng.jimpPngNumbers.`0`): Self = StObject.set(x, "PNG_FILTER_NONE", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_PATH(value: `4`): Self = StObject.set(x, "PNG_FILTER_PATH", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_SUB(value: `1`): Self = StObject.set(x, "PNG_FILTER_SUB", value.asInstanceOf[js.Any])
      
      inline def setPNG_FILTER_UP(value: `2`): Self = StObject.set(x, "PNG_FILTER_UP", value.asInstanceOf[js.Any])
    }
  }
}
