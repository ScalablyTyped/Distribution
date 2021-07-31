package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeEvenNumberMod {
  
  @JSImport("jasmine-expect/dist/toBeEvenNumber", "toBeEvenNumber")
  @js.native
  val toBeEvenNumber: ToBeEvenNumber_ = js.native
  
  type ToBeEvenNumber_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeEvenNumber: ToBeEvenNumber_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeEvenNumber: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEvenNumber = js.Any.fromFunction1(toBeEvenNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeEvenNumber(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeEvenNumber", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
