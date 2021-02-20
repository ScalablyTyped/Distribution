package typings.jsRomanNumerals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-roman-numerals", JSImport.Namespace)
  @js.native
  class ^ protected () extends RomanNumeral {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @js.native
  trait RomanNumeral extends StObject {
    
    def toInt(): Double = js.native
  }
  object RomanNumeral {
    
    @scala.inline
    def apply(toInt: () => Double): RomanNumeral = {
      val __obj = js.Dynamic.literal(toInt = js.Any.fromFunction0(toInt))
      __obj.asInstanceOf[RomanNumeral]
    }
    
    @scala.inline
    implicit class RomanNumeralMutableBuilder[Self <: RomanNumeral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToInt(value: () => Double): Self = StObject.set(x, "toInt", js.Any.fromFunction0(value))
    }
  }
}
