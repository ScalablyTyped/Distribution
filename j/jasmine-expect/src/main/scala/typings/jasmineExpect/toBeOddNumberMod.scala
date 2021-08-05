package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeOddNumberMod {
  
  @JSImport("jasmine-expect/dist/toBeOddNumber", "toBeOddNumber")
  @js.native
  val toBeOddNumber: ToBeOddNumber_ = js.native
  
  type ToBeOddNumber_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeOddNumber: ToBeOddNumber_
      }
      object Matchers {
        
        inline def apply[T](toBeOddNumber: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeOddNumber = js.Any.fromFunction1(toBeOddNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeOddNumber(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeOddNumber", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
