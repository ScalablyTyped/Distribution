package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveHtmlStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveHtmlString", "toHaveHtmlString")
  @js.native
  val toHaveHtmlString: ToHaveHtmlString_ = js.native
  
  type ToHaveHtmlString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveHtmlString: ToHaveHtmlString_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveHtmlString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveHtmlString = js.Any.fromFunction2(toHaveHtmlString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveHtmlString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveHtmlString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
