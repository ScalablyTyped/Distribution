package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayOfNumbersMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfNumbers", "toBeArrayOfNumbers")
  @js.native
  val toBeArrayOfNumbers: ToBeArrayOfNumbers_ = js.native
  
  type ToBeArrayOfNumbers_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArrayOfNumbers: ToBeArrayOfNumbers_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeArrayOfNumbers: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfNumbers = js.Any.fromFunction1(toBeArrayOfNumbers))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeArrayOfNumbers(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeArrayOfNumbers", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
