package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveWholeNumberMod {
  
  @JSImport("jasmine-expect/dist/toHaveWholeNumber", "toHaveWholeNumber")
  @js.native
  val toHaveWholeNumber: ToHaveWholeNumber_ = js.native
  
  type ToHaveWholeNumber_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveWholeNumber: ToHaveWholeNumber_
      }
      object Matchers {
        
        inline def apply[T](toHaveWholeNumber: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveWholeNumber = js.Any.fromFunction2(toHaveWholeNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveWholeNumber(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveWholeNumber", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
