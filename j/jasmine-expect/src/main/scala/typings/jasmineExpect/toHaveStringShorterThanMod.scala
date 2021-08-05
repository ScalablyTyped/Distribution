package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveStringShorterThanMod {
  
  @JSImport("jasmine-expect/dist/toHaveStringShorterThan", "toHaveStringShorterThan")
  @js.native
  val toHaveStringShorterThan: ToHaveStringShorterThan_ = js.native
  
  type ToHaveStringShorterThan_ = js.Function3[
    /* key */ String, 
    /* other */ String, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveStringShorterThan: ToHaveStringShorterThan_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveStringShorterThan: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveStringShorterThan = js.Any.fromFunction3(toHaveStringShorterThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveStringShorterThan(
            value: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveStringShorterThan", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
