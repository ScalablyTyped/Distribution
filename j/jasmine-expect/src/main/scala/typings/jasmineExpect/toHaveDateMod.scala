package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveDateMod {
  
  @JSImport("jasmine-expect/dist/toHaveDate", "toHaveDate")
  @js.native
  val toHaveDate: ToHaveDate_ = js.native
  
  type ToHaveDate_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveDate: ToHaveDate_
      }
      object Matchers {
        
        inline def apply[T](toHaveDate: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveDate = js.Any.fromFunction2(toHaveDate))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveDate(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveDate", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
