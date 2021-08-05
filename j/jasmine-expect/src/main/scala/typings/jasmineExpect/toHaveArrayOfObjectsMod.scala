package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveArrayOfObjectsMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfObjects", "toHaveArrayOfObjects")
  @js.native
  val toHaveArrayOfObjects: ToHaveArrayOfObjects_ = js.native
  
  type ToHaveArrayOfObjects_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveArrayOfObjects: ToHaveArrayOfObjects_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveArrayOfObjects: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfObjects = js.Any.fromFunction2(toHaveArrayOfObjects))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArrayOfObjects(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveArrayOfObjects", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
