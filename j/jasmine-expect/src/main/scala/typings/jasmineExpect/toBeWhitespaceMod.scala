package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeWhitespaceMod {
  
  @JSImport("jasmine-expect/dist/toBeWhitespace", "toBeWhitespace")
  @js.native
  val toBeWhitespace: ToBeWhitespace_ = js.native
  
  type ToBeWhitespace_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeWhitespace: ToBeWhitespace_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeWhitespace: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWhitespace = js.Any.fromFunction1(toBeWhitespace))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeWhitespace(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeWhitespace", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
