package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeFunctionMod {
  
  @JSImport("jasmine-expect/dist/toBeFunction", "toBeFunction")
  @js.native
  val toBeFunction: ToBeFunction_ = js.native
  
  type ToBeFunction_ = js.Function1[/* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeFunction: ToBeFunction_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeFunction: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeFunction = js.Any.fromFunction1(toBeFunction))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeFunction(value: /* expectationFailOutput */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "toBeFunction", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
