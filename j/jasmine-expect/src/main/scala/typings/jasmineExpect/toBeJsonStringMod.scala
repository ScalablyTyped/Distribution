package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeJsonStringMod {
  
  @JSImport("jasmine-expect/dist/toBeJsonString", "toBeJsonString")
  @js.native
  val toBeJsonString: ToBeJsonString_ = js.native
  
  type ToBeJsonString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeJsonString: ToBeJsonString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeJsonString: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeJsonString = js.Any.fromFunction1(toBeJsonString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeJsonString(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeJsonString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
