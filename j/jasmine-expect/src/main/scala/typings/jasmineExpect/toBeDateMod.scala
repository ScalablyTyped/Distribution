package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeDateMod {
  
  @JSImport("jasmine-expect/dist/toBeDate", "toBeDate")
  @js.native
  val toBeDate: ToBeDate_ = js.native
  
  type ToBeDate_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeDate: ToBeDate_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeDate: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeDate = js.Any.fromFunction1(toBeDate))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeDate(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeDate", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
