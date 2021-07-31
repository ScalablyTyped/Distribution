package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeNonEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyObject", "toBeNonEmptyObject")
  @js.native
  val toBeNonEmptyObject: ToBeNonEmptyObject_ = js.native
  
  type ToBeNonEmptyObject_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeNonEmptyObject: ToBeNonEmptyObject_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeNonEmptyObject: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyObject = js.Any.fromFunction1(toBeNonEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeNonEmptyObject(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyObject", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
