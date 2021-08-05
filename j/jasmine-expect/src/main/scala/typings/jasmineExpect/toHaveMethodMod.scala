package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveMethodMod {
  
  @JSImport("jasmine-expect/dist/toHaveMethod", "toHaveMethod")
  @js.native
  val toHaveMethod: ToHaveMethod_ = js.native
  
  type ToHaveMethod_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveMethod: ToHaveMethod_
      }
      object Matchers {
        
        inline def apply[T](toHaveMethod: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveMethod = js.Any.fromFunction2(toHaveMethod))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveMethod(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveMethod", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
