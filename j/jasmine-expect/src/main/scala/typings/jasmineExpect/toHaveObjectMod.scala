package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveObjectMod {
  
  @JSImport("jasmine-expect/dist/toHaveObject", "toHaveObject")
  @js.native
  val toHaveObject: ToHaveObject_ = js.native
  
  type ToHaveObject_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveObject: ToHaveObject_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveObject = js.Any.fromFunction2(toHaveObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
