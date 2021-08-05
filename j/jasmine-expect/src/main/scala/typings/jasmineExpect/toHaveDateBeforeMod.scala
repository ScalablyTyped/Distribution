package typings.jasmineExpect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveDateBeforeMod {
  
  @JSImport("jasmine-expect/dist/toHaveDateBefore", "toHaveDateBefore")
  @js.native
  val toHaveDateBefore: ToHaveDateBefore_ = js.native
  
  type ToHaveDateBefore_ = js.Function3[
    /* key */ String, 
    /* otherDate */ Date, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveDateBefore: ToHaveDateBefore_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveDateBefore: (/* key */ String, /* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveDateBefore = js.Any.fromFunction3(toHaveDateBefore))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveDateBefore(
            value: (/* key */ String, /* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveDateBefore", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
