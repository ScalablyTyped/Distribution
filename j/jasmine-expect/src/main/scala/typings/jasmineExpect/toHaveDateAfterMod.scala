package typings.jasmineExpect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveDateAfterMod {
  
  @JSImport("jasmine-expect/dist/toHaveDateAfter", "toHaveDateAfter")
  @js.native
  val toHaveDateAfter: ToHaveDateAfter_ = js.native
  
  type ToHaveDateAfter_ = js.Function3[
    /* key */ String, 
    /* otherDate */ Date, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveDateAfter: ToHaveDateAfter_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveDateAfter: (/* key */ String, /* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveDateAfter = js.Any.fromFunction3(toHaveDateAfter))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveDateAfter(
            value: (/* key */ String, /* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveDateAfter", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
