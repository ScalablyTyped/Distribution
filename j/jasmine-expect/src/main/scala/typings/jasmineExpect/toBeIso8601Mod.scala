package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeIso8601Mod {
  
  @JSImport("jasmine-expect/dist/toBeIso8601", "toBeIso8601")
  @js.native
  val toBeIso8601: ToBeIso8601_ = js.native
  
  type ToBeIso8601_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeIso8601: ToBeIso8601_
      }
      object Matchers {
        
        inline def apply[T](toBeIso8601: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeIso8601 = js.Any.fromFunction1(toBeIso8601))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeIso8601(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeIso8601", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
