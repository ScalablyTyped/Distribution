package typings.jasmineExpect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeAfterMod {
  
  @JSImport("jasmine-expect/dist/toBeAfter", "toBeAfter")
  @js.native
  val toBeAfter: ToBeAfter_ = js.native
  
  type ToBeAfter_ = js.Function2[/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeAfter: ToBeAfter_
      }
      object Matchers {
        
        inline def apply[T](toBeAfter: (/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeAfter = js.Any.fromFunction2(toBeAfter))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeAfter(value: (/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeAfter", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
