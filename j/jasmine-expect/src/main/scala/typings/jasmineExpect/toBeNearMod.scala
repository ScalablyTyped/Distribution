package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeNearMod {
  
  @JSImport("jasmine-expect/dist/toBeNear", "toBeNear")
  @js.native
  val toBeNear: ToBeNear_ = js.native
  
  type ToBeNear_ = js.Function3[
    /* value */ Double, 
    /* epsilon */ Double, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeNear: ToBeNear_
      }
      object Matchers {
        
        inline def apply[T](
          toBeNear: (/* value */ Double, /* epsilon */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNear = js.Any.fromFunction3(toBeNear))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeNear(
            value: (/* value */ Double, /* epsilon */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toBeNear", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
