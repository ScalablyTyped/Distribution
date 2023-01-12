package typings.hexRgb

import typings.hexRgb.anon.Optionsformatarray
import typings.hexRgb.anon.Optionsformatcss
import typings.hexRgb.anon.Optionsformatobject
import typings.hexRgb.hexRgbStrings.`object`
import typings.hexRgb.hexRgbStrings.array
import typings.hexRgb.hexRgbStrings.css
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hex-rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hex: String): RgbaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hex.asInstanceOf[js.Any]).asInstanceOf[RgbaObject]
  inline def default(hex: String, options: Optionsformatarray): RgbaTuple = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RgbaTuple]
  inline def default(hex: String, options: Optionsformatcss): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(hex: String, options: Optionsformatobject): RgbaObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RgbaObject]
  
  trait Options extends StObject {
    
    /**
    	Set the alpha of the color.
    	This overrides any existing alpha component in the Hex color string. For example, the `99` in `#22222299`.
    	The number must be in the range 0 to 1.
    	*/
    val alpha: js.UndefOr[Double] = js.undefined
    
    /**
    	The RGB output format.
    	Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    	@default 'object'
    	*/
    val format: js.UndefOr[`object` | array | css] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: `object` | array | css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait RgbaObject extends StObject {
    
    var alpha: Double
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object RgbaObject {
    
    inline def apply(alpha: Double, blue: Double, green: Double, red: Double): RgbaObject = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RgbaObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RgbaObject] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  type RgbaTuple = js.Tuple4[/* red */ Double, /* green */ Double, /* blue */ Double, /* alpha */ Double]
}
