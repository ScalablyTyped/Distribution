package typings.jasmineExpect

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeBeforeMod {
  
  @JSImport("jasmine-expect/dist/toBeBefore", "toBeBefore")
  @js.native
  val toBeBefore: ToBeBefore_ = js.native
  
  type ToBeBefore_ = js.Function2[/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeBefore: ToBeBefore_
      }
      object Matchers {
        
        inline def apply[T](toBeBefore: (/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeBefore = js.Any.fromFunction2(toBeBefore))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeBefore(value: (/* otherDate */ Date, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeBefore", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
