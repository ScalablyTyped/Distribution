package typings.jsRomanNumerals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-roman-numerals", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RomanNumeral {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    /* CompleteClass */
    override def toInt(): Double = js.native
  }
  
  trait RomanNumeral extends StObject {
    
    def toInt(): Double
  }
  object RomanNumeral {
    
    inline def apply(toInt: () => Double): RomanNumeral = {
      val __obj = js.Dynamic.literal(toInt = js.Any.fromFunction0(toInt))
      __obj.asInstanceOf[RomanNumeral]
    }
    
    extension [Self <: RomanNumeral](x: Self) {
      
      inline def setToInt(value: () => Double): Self = StObject.set(x, "toInt", js.Any.fromFunction0(value))
    }
  }
}
