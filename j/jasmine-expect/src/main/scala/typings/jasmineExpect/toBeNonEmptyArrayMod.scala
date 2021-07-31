package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeNonEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyArray", "toBeNonEmptyArray")
  @js.native
  val toBeNonEmptyArray: ToBeNonEmptyArray_ = js.native
  
  type ToBeNonEmptyArray_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeNonEmptyArray: ToBeNonEmptyArray_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeNonEmptyArray: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyArray = js.Any.fromFunction1(toBeNonEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeNonEmptyArray(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyArray", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
