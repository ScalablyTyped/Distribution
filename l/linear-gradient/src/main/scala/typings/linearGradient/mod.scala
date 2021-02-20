package typings.linearGradient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linear-gradient", JSImport.Namespace)
  @js.native
  class ^ protected () extends Gradient {
    def this(colors: js.Array[Color]) = this()
  }
  
  type Color = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait Gradient extends StObject {
    
    /**
      * the input value should be normalized to the range between 0 and 1
      */
    def calcArray(normalizedPercent: Double): Color = js.native
    
    /**
      * the input value should be normalized to the range between 0 and 1
      */
    def calcHex(normalizedPrecent: Double): String = js.native
  }
  object Gradient {
    
    @scala.inline
    def apply(calcArray: Double => Color, calcHex: Double => String): Gradient = {
      val __obj = js.Dynamic.literal(calcArray = js.Any.fromFunction1(calcArray), calcHex = js.Any.fromFunction1(calcHex))
      __obj.asInstanceOf[Gradient]
    }
    
    @scala.inline
    implicit class GradientMutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalcArray(value: Double => Color): Self = StObject.set(x, "calcArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCalcHex(value: Double => String): Self = StObject.set(x, "calcHex", js.Any.fromFunction1(value))
    }
  }
}
