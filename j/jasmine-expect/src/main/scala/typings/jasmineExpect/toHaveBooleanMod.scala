package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveBooleanMod {
  
  @JSImport("jasmine-expect/dist/toHaveBoolean", "toHaveBoolean")
  @js.native
  val toHaveBoolean: ToHaveBoolean_ = js.native
  
  type ToHaveBoolean_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveBoolean: ToHaveBoolean_
      }
      object Matchers {
        
        inline def apply[T](toHaveBoolean: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveBoolean = js.Any.fromFunction2(toHaveBoolean))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveBoolean(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveBoolean", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
