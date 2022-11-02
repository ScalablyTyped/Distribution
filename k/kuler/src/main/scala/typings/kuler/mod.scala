package typings.kuler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): KulerInstance = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[KulerInstance]
  inline def apply(text: String, color: String): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("kuler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait KulerInstance extends StObject {
    
    /** Turns RGB 0-5 values into a single ANSI code. */
    def ansi(r: Double, g: Double, b: Double): String
    
    /** Parse a hex color string and parse it to it's RGB equiv. */
    def hex(color: String): js.Tuple3[Double, Double, Double]
    
    var prefix: String
    
    /** Marks an end of color sequence. */
    def reset(): String
    
    /** Transform a 255 RGB value to an RGV code. */
    def rgb(r: Double, g: Double, b: Double): String
    
    /** Colour the terminal using CSS. */
    def style(color: String): String
    
    var suffix: String
    
    var text: String
  }
  object KulerInstance {
    
    inline def apply(
      ansi: (Double, Double, Double) => String,
      hex: String => js.Tuple3[Double, Double, Double],
      prefix: String,
      reset: () => String,
      rgb: (Double, Double, Double) => String,
      style: String => String,
      suffix: String,
      text: String
    ): KulerInstance = {
      val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction3(ansi), hex = js.Any.fromFunction1(hex), prefix = prefix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), rgb = js.Any.fromFunction3(rgb), style = js.Any.fromFunction1(style), suffix = suffix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[KulerInstance]
    }
    
    extension [Self <: KulerInstance](x: Self) {
      
      inline def setAnsi(value: (Double, Double, Double) => String): Self = StObject.set(x, "ansi", js.Any.fromFunction3(value))
      
      inline def setHex(value: String => js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => String): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setRgb(value: (Double, Double, Double) => String): Self = StObject.set(x, "rgb", js.Any.fromFunction3(value))
      
      inline def setStyle(value: String => String): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
