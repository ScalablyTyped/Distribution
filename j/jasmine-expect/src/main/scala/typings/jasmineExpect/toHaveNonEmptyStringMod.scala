package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveNonEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveNonEmptyString", "toHaveNonEmptyString")
  @js.native
  val toHaveNonEmptyString: ToHaveNonEmptyString_ = js.native
  
  type ToHaveNonEmptyString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveNonEmptyString: ToHaveNonEmptyString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveNonEmptyString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNonEmptyString = js.Any.fromFunction2(toHaveNonEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveNonEmptyString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveNonEmptyString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
