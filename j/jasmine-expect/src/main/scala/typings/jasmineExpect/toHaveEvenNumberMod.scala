package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveEvenNumberMod {
  
  @JSImport("jasmine-expect/dist/toHaveEvenNumber", "toHaveEvenNumber")
  @js.native
  val toHaveEvenNumber: ToHaveEvenNumber_ = js.native
  
  type ToHaveEvenNumber_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveEvenNumber: ToHaveEvenNumber_
      }
      object Matchers {
        
        inline def apply[T](toHaveEvenNumber: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEvenNumber = js.Any.fromFunction2(toHaveEvenNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveEvenNumber(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveEvenNumber", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
