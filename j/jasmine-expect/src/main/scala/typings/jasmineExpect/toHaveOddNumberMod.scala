package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveOddNumberMod {
  
  @JSImport("jasmine-expect/dist/toHaveOddNumber", "toHaveOddNumber")
  @js.native
  val toHaveOddNumber: ToHaveOddNumber_ = js.native
  
  type ToHaveOddNumber_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveOddNumber: ToHaveOddNumber_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveOddNumber: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveOddNumber = js.Any.fromFunction2(toHaveOddNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveOddNumber(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveOddNumber", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
