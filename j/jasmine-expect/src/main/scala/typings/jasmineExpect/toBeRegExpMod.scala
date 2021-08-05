package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeRegExpMod {
  
  @JSImport("jasmine-expect/dist/toBeRegExp", "toBeRegExp")
  @js.native
  val toBeRegExp: ToBeRegExp_ = js.native
  
  type ToBeRegExp_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeRegExp: ToBeRegExp_
      }
      object Matchers {
        
        inline def apply[T](toBeRegExp: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeRegExp = js.Any.fromFunction1(toBeRegExp))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeRegExp(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeRegExp", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
