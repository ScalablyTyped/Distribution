package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveStringLongerThanMod {
  
  @JSImport("jasmine-expect/dist/toHaveStringLongerThan", "toHaveStringLongerThan")
  @js.native
  val toHaveStringLongerThan: ToHaveStringLongerThan_ = js.native
  
  type ToHaveStringLongerThan_ = js.Function3[
    /* key */ String, 
    /* other */ String, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveStringLongerThan: ToHaveStringLongerThan_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveStringLongerThan: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveStringLongerThan = js.Any.fromFunction3(toHaveStringLongerThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveStringLongerThan(
            value: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveStringLongerThan", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
