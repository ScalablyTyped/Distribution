package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toBeEmptyArray", "toBeEmptyArray")
  @js.native
  val toBeEmptyArray: ToBeEmptyArray_ = js.native
  
  type ToBeEmptyArray_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeEmptyArray: ToBeEmptyArray_
      }
      object Matchers {
        
        inline def apply[T](toBeEmptyArray: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEmptyArray = js.Any.fromFunction1(toBeEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeEmptyArray(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeEmptyArray", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
