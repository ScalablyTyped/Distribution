package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeValidDateMod {
  
  @JSImport("jasmine-expect/dist/toBeValidDate", "toBeValidDate")
  @js.native
  val toBeValidDate: ToBeValidDate_ = js.native
  
  type ToBeValidDate_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeValidDate: ToBeValidDate_
      }
      object Matchers {
        
        inline def apply[T](toBeValidDate: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeValidDate = js.Any.fromFunction1(toBeValidDate))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeValidDate(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeValidDate", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
