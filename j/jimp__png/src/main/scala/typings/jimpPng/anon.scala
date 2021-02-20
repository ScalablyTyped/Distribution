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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    @JSName("image/png")
    var imageSlashpng: `true` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(imageSlashpng: `true`): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashpng(value: `true`): Self = StObject.set(x, "image/png", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Imagepng extends StObject {
    
    @JSName("image/png")
    var imageSlashpng: js.Array[String] = js.native
  }
  object Imagepng {
    
    @scala.inline
    def apply(imageSlashpng: js.Array[String]): Imagepng = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Imagepng]
    }
    
    @scala.inline
    implicit class ImagepngMutableBuilder[Self <: Imagepng] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageSlashpng(value: js.Array[String]): Self = StObject.set(x, "image/png", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSlashpngVarargs(value: String*): Self = StObject.set(x, "image/png", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImagepngDecoderFn extends StObject {
    
    @JSName("image/png")
    def imageSlashpng(data: Buffer): Bitmap = js.native
    @JSName("image/png")
    var imageSlashpng_Original: DecoderFn = js.native
  }
  
  @js.native
  trait ImagepngEncoderFn extends StObject {
    
    @JSName("image/png")
    def imageSlashpng(image: Image): Buffer = js.native
    @JSName("image/png")
    var imageSlashpng_Original: EncoderFn[Image] = js.native
  }
  
  @js.native
  trait MIMEPNG extends StObject {
    
    var MIME_PNG: imageSlashpng = js.native
    
    // PNG filter types
    var PNG_FILTER_AUTO: `-1` = js.native
    
    var PNG_FILTER_AVERAGE: `3` = js.native
    
    var PNG_FILTER_NONE: typings.jimpPng.jimpPngNumbers.`0` = js.native
    
    var PNG_FILTER_PATH: `4` = js.native
    
    var PNG_FILTER_SUB: `1` = js.native
    
    var PNG_FILTER_UP: `2` = js.native
  }
  object MIMEPNG {
    
    @scala.inline
    def apply(
      MIME_PNG: imageSlashpng,
      PNG_FILTER_AUTO: `-1`,
      PNG_FILTER_AVERAGE: `3`,
      PNG_FILTER_NONE: typings.jimpPng.jimpPngNumbers.`0`,
      PNG_FILTER_PATH: `4`,
      PNG_FILTER_SUB: `1`,
      PNG_FILTER_UP: `2`
    ): MIMEPNG = {
      val __obj = js.Dynamic.literal(MIME_PNG = MIME_PNG.asInstanceOf[js.Any], PNG_FILTER_AUTO = PNG_FILTER_AUTO.asInstanceOf[js.Any], PNG_FILTER_AVERAGE = PNG_FILTER_AVERAGE.asInstanceOf[js.Any], PNG_FILTER_NONE = PNG_FILTER_NONE.asInstanceOf[js.Any], PNG_FILTER_PATH = PNG_FILTER_PATH.asInstanceOf[js.Any], PNG_FILTER_SUB = PNG_FILTER_SUB.asInstanceOf[js.Any], PNG_FILTER_UP = PNG_FILTER_UP.asInstanceOf[js.Any])
      __obj.asInstanceOf[MIMEPNG]
    }
    
    @scala.inline
    implicit class MIMEPNGMutableBuilder[Self <: MIMEPNG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMIME_PNG(value: imageSlashpng): Self = StObject.set(x, "MIME_PNG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_AUTO(value: `-1`): Self = StObject.set(x, "PNG_FILTER_AUTO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_AVERAGE(value: `3`): Self = StObject.set(x, "PNG_FILTER_AVERAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_NONE(value: typings.jimpPng.jimpPngNumbers.`0`): Self = StObject.set(x, "PNG_FILTER_NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_PATH(value: `4`): Self = StObject.set(x, "PNG_FILTER_PATH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_SUB(value: `1`): Self = StObject.set(x, "PNG_FILTER_SUB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPNG_FILTER_UP(value: `2`): Self = StObject.set(x, "PNG_FILTER_UP", value.asInstanceOf[js.Any])
    }
  }
}
