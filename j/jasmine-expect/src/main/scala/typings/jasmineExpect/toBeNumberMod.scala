package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeNumberMod {
  
  @JSImport("jasmine-expect/dist/toBeNumber", "toBeNumber")
  @js.native
  val toBeNumber: ToBeNumber_ = js.native
  
  type ToBeNumber_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeNumber: ToBeNumber_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeNumber: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNumber = js.Any.fromFunction1(toBeNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeNumber(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeNumber", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
