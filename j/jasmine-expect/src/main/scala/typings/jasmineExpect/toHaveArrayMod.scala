package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveArrayMod {
  
  @JSImport("jasmine-expect/dist/toHaveArray", "toHaveArray")
  @js.native
  val toHaveArray: ToHaveArray_ = js.native
  
  type ToHaveArray_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveArray: ToHaveArray_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveArray: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArray = js.Any.fromFunction2(toHaveArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveArray(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveArray", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
