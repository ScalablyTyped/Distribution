package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeSameLengthAsMod {
  
  @JSImport("jasmine-expect/dist/toBeSameLengthAs", "toBeSameLengthAs")
  @js.native
  val toBeSameLengthAs: ToBeSameLengthAs_ = js.native
  
  type ToBeSameLengthAs_ = js.Function2[/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeSameLengthAs: ToBeSameLengthAs_
      }
      object Matchers {
        
        inline def apply[T](toBeSameLengthAs: (/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeSameLengthAs = js.Any.fromFunction2(toBeSameLengthAs))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeSameLengthAs(value: (/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeSameLengthAs", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
