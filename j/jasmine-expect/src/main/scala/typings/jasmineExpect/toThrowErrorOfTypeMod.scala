package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toThrowErrorOfTypeMod {
  
  @JSImport("jasmine-expect/dist/toThrowErrorOfType", "toThrowErrorOfType")
  @js.native
  val toThrowErrorOfType: ToThrowErrorOfType_ = js.native
  
  type ToThrowErrorOfType_ = js.Function2[/* type */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toThrowErrorOfType: ToThrowErrorOfType_
      }
      object Matchers {
        
        inline def apply[T](toThrowErrorOfType: (/* type */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toThrowErrorOfType = js.Any.fromFunction2(toThrowErrorOfType))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToThrowErrorOfType(value: (/* type */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toThrowErrorOfType", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
