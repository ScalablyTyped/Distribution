package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayMod {
  
  @JSImport("jasmine-expect/dist/toBeArray", "toBeArray")
  @js.native
  val toBeArray: ToBeArray_ = js.native
  
  type ToBeArray_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArray: ToBeArray_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeArray: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArray = js.Any.fromFunction1(toBeArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeArray(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeArray", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
