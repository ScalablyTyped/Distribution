package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toThrowAnyErrorMod {
  
  @JSImport("jasmine-expect/dist/toThrowAnyError", "toThrowAnyError")
  @js.native
  val toThrowAnyError: ToThrowAnyError_ = js.native
  
  type ToThrowAnyError_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toThrowAnyError: ToThrowAnyError_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toThrowAnyError: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toThrowAnyError = js.Any.fromFunction1(toThrowAnyError))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToThrowAnyError(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toThrowAnyError", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
