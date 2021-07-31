package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toStartWithMod {
  
  @JSImport("jasmine-expect/dist/toStartWith", "toStartWith")
  @js.native
  val toStartWith: ToStartWith_ = js.native
  
  type ToStartWith_ = js.Function2[/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toStartWith: ToStartWith_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toStartWith: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toStartWith = js.Any.fromFunction2(toStartWith))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToStartWith(value: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toStartWith", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
