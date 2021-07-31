package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toBeEmptyObject", "toBeEmptyObject")
  @js.native
  val toBeEmptyObject: ToBeEmptyObject_ = js.native
  
  type ToBeEmptyObject_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeEmptyObject: ToBeEmptyObject_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeEmptyObject: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEmptyObject = js.Any.fromFunction1(toBeEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeEmptyObject(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeEmptyObject", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
