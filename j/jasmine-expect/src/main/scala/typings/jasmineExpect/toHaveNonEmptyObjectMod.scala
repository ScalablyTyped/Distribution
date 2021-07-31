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
        
        @scala.inline
        def apply[T](
          toHaveNonEmptyObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNonEmptyObject = js.Any.fromFunction2(toHaveNonEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveNonEmptyObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveNonEmptyObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
