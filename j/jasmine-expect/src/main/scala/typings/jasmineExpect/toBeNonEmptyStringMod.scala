package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeNonEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyString", "toBeNonEmptyString")
  @js.native
  val toBeNonEmptyString: ToBeNonEmptyString_ = js.native
  
  type ToBeNonEmptyString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeNonEmptyString: ToBeNonEmptyString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeNonEmptyString: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyString = js.Any.fromFunction1(toBeNonEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeNonEmptyString(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
