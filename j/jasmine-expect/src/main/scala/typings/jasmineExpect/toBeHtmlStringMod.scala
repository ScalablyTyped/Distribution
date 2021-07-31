package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeHtmlStringMod {
  
  @JSImport("jasmine-expect/dist/toBeHtmlString", "toBeHtmlString")
  @js.native
  val toBeHtmlString: ToBeHtmlString_ = js.native
  
  type ToBeHtmlString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeHtmlString: ToBeHtmlString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeHtmlString: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeHtmlString = js.Any.fromFunction1(toBeHtmlString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeHtmlString(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeHtmlString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
