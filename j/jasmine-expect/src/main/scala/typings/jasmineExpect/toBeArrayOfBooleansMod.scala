package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayOfBooleansMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfBooleans", "toBeArrayOfBooleans")
  @js.native
  val toBeArrayOfBooleans: ToBeArrayOfBooleans_ = js.native
  
  type ToBeArrayOfBooleans_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArrayOfBooleans: ToBeArrayOfBooleans_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfBooleans: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfBooleans = js.Any.fromFunction1(toBeArrayOfBooleans))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfBooleans(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeArrayOfBooleans", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
