package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeBooleanMod {
  
  @JSImport("jasmine-expect/dist/toBeBoolean", "toBeBoolean")
  @js.native
  val toBeBoolean: ToBeBoolean_ = js.native
  
  type ToBeBoolean_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeBoolean: ToBeBoolean_
      }
      object Matchers {
        
        inline def apply[T](toBeBoolean: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeBoolean = js.Any.fromFunction1(toBeBoolean))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeBoolean(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeBoolean", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
