package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveCalculableMod {
  
  @JSImport("jasmine-expect/dist/toHaveCalculable", "toHaveCalculable")
  @js.native
  val toHaveCalculable: ToHaveCalculable_ = js.native
  
  type ToHaveCalculable_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveCalculable: ToHaveCalculable_
      }
      object Matchers {
        
        inline def apply[T](toHaveCalculable: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveCalculable = js.Any.fromFunction2(toHaveCalculable))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveCalculable(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveCalculable", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
