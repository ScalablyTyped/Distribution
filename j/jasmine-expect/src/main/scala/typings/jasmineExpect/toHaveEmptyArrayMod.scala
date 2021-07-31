package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toHaveEmptyArray", "toHaveEmptyArray")
  @js.native
  val toHaveEmptyArray: ToHaveEmptyArray_ = js.native
  
  type ToHaveEmptyArray_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveEmptyArray: ToHaveEmptyArray_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveEmptyArray: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEmptyArray = js.Any.fromFunction2(toHaveEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveEmptyArray(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveEmptyArray", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
