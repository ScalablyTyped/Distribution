package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toHaveEmptyObject", "toHaveEmptyObject")
  @js.native
  val toHaveEmptyObject: ToHaveEmptyObject_ = js.native
  
  type ToHaveEmptyObject_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveEmptyObject: ToHaveEmptyObject_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveEmptyObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEmptyObject = js.Any.fromFunction2(toHaveEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveEmptyObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveEmptyObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
