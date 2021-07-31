package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toBeEmptyString", "toBeEmptyString")
  @js.native
  val toBeEmptyString: ToBeEmptyString_ = js.native
  
  type ToBeEmptyString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeEmptyString: ToBeEmptyString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeEmptyString: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEmptyString = js.Any.fromFunction1(toBeEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeEmptyString(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeEmptyString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
