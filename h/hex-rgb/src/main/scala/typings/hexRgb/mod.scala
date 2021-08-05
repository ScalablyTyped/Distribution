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
  
  /**
  Convert HEX color to RGBA.
  @param hex - The color in HEX format. Leading `#` is optional.
  @example
  ```
  import hexRgb = require('hex-rgb');
  hexRgb('4183c4');
  //=> {red: 65, green: 131, blue: 196, alpha: 1}
  hexRgb('#4183c4');
  //=> {red: 65, green: 131, blue: 196, alpha: 1}
  hexRgb('#fff');
  //=> {red: 255, green: 255, blue: 255, alpha: 1}
  hexRgb('#22222299');
  //=> {red: 34, green: 34, blue: 34, alpha: 0.6}
  hexRgb('#0006');
  //=> {red: 0, green: 0, blue: 0, alpha: 0.4}
  hexRgb('#cd2222cc');
  //=> {red: 205, green: 34, blue: 34, alpha: 0.8}
  hexRgb('#cd2222cc', {format: 'array'});
  //=> [205, 34, 34, 0.8]
  hexRgb('#cd2222cc', {format: 'css'});
  //=> 'rgb(205 34 34 / 80%)'
  hexRgb('#000', {format: 'css'});
  //=> 'rgb(0 0 0)'
  ```
  */
  inline def apply(hex: String): RgbaObject = ^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any]).asInstanceOf[RgbaObject]
  inline def apply(hex: String, options: Optionsformatarray): RgbaTuple = (^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RgbaTuple]
  inline def apply(hex: String, options: Optionsformatcss): String = (^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(hex: String, options: Optionsformatobject): RgbaObject = (^.asInstanceOf[js.Dynamic].apply(hex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RgbaObject]
  
  @JSImport("hex-rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
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
    
    extension [Self <: Options](x: Self) {
      
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
    
    extension [Self <: RgbaObject](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO: Use named tuples here when TS 4 is more commonly used.
  type RgbaTuple = js.Tuple4[Double, Double, Double, Double]
}
