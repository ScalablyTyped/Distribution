package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveArrayOfNumbersMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfNumbers", "toHaveArrayOfNumbers")
  @js.native
  val toHaveArrayOfNumbers: ToHaveArrayOfNumbers_ = js.native
  
  type ToHaveArrayOfNumbers_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveArrayOfNumbers: ToHaveArrayOfNumbers_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveArrayOfNumbers: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfNumbers = js.Any.fromFunction2(toHaveArrayOfNumbers))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveArrayOfNumbers(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveArrayOfNumbers", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
