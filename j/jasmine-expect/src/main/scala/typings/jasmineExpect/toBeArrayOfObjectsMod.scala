package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayOfObjectsMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfObjects", "toBeArrayOfObjects")
  @js.native
  val toBeArrayOfObjects: ToBeArrayOfObjects_ = js.native
  
  type ToBeArrayOfObjects_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArrayOfObjects: ToBeArrayOfObjects_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeArrayOfObjects: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfObjects = js.Any.fromFunction1(toBeArrayOfObjects))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeArrayOfObjects(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeArrayOfObjects", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
