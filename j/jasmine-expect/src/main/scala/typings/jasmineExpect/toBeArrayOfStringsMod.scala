package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayOfStringsMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfStrings", "toBeArrayOfStrings")
  @js.native
  val toBeArrayOfStrings: ToBeArrayOfStrings_ = js.native
  
  type ToBeArrayOfStrings_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArrayOfStrings: ToBeArrayOfStrings_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeArrayOfStrings: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfStrings = js.Any.fromFunction1(toBeArrayOfStrings))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeArrayOfStrings(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeArrayOfStrings", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
