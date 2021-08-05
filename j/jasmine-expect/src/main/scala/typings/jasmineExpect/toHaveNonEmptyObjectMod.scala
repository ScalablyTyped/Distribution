package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveNonEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toHaveNonEmptyObject", "toHaveNonEmptyObject")
  @js.native
  val toHaveNonEmptyObject: ToHaveNonEmptyObject_ = js.native
  
  type ToHaveNonEmptyObject_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveNonEmptyObject: ToHaveNonEmptyObject_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveNonEmptyObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNonEmptyObject = js.Any.fromFunction2(toHaveNonEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveNonEmptyObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveNonEmptyObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
