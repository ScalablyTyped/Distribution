package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveJsonStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveJsonString", "toHaveJsonString")
  @js.native
  val toHaveJsonString: ToHaveJsonString_ = js.native
  
  type ToHaveJsonString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveJsonString: ToHaveJsonString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveJsonString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveJsonString = js.Any.fromFunction2(toHaveJsonString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveJsonString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveJsonString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
