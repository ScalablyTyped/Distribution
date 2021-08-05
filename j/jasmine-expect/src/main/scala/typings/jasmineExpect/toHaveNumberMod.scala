package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveNumberMod {
  
  @JSImport("jasmine-expect/dist/toHaveNumber", "toHaveNumber")
  @js.native
  val toHaveNumber: ToHaveNumber_ = js.native
  
  type ToHaveNumber_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveNumber: ToHaveNumber_
      }
      object Matchers {
        
        inline def apply[T](toHaveNumber: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNumber = js.Any.fromFunction2(toHaveNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveNumber(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveNumber", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
