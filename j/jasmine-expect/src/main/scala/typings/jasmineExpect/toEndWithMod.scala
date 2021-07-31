package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toEndWithMod {
  
  @JSImport("jasmine-expect/dist/toEndWith", "toEndWith")
  @js.native
  val toEndWith: ToEndWith_ = js.native
  
  type ToEndWith_ = js.Function2[/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toEndWith: ToEndWith_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toEndWith: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toEndWith = js.Any.fromFunction2(toEndWith))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToEndWith(value: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toEndWith", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
