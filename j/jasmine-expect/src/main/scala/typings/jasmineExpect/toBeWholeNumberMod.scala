package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeWholeNumberMod {
  
  @JSImport("jasmine-expect/dist/toBeWholeNumber", "toBeWholeNumber")
  @js.native
  val toBeWholeNumber: ToBeWholeNumber_ = js.native
  
  type ToBeWholeNumber_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeWholeNumber: ToBeWholeNumber_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeWholeNumber: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWholeNumber = js.Any.fromFunction1(toBeWholeNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeWholeNumber(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeWholeNumber", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
