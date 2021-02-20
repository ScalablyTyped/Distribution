package typings.jimpPng

import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPng.anon.Imagepng
import typings.jimpPng.anon.ImagepngDecoderFn
import typings.jimpPng.anon.ImagepngEncoderFn
import typings.jimpPng.anon.MIMEPNG
import typings.jimpPng.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/png", JSImport.Default)
  @js.native
  def default(): PNG = js.native
  
  @js.native
  trait PNG extends StObject {
    
    var `class`: PNGClass = js.native
    
    var constants: MIMEPNG = js.native
    
    var decoders: ImagepngDecoderFn = js.native
    
    var encoders: ImagepngEncoderFn = js.native
    
    var hasAlpha: `0` = js.native
    
    var mime: Imagepng = js.native
  }
  object PNG {
    
    @scala.inline
    def apply(
      `class`: PNGClass,
      constants: MIMEPNG,
      decoders: ImagepngDecoderFn,
      encoders: ImagepngEncoderFn,
      hasAlpha: `0`,
      mime: Imagepng
    ): PNG = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNG]
    }
    
    @scala.inline
    implicit class PNGMutableBuilder[Self <: PNG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: PNGClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstants(value: MIMEPNG): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoders(value: ImagepngDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: ImagepngEncoderFn): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasAlpha(value: `0`): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: Imagepng): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PNGClass extends StObject {
    
    var _colorType: Double = js.native
    
    var _deflateLevel: Double = js.native
    
    var _deflateStrategy: Double = js.native
    
    var _filterType: Double = js.native
    
    def colorType(s: Double): this.type = js.native
    def colorType(s: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def deflateLevel(l: Double): this.type = js.native
    def deflateLevel(l: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def deflateStrategy(s: Double): this.type = js.native
    def deflateStrategy(s: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def filterType(f: Double): this.type = js.native
    def filterType(f: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
