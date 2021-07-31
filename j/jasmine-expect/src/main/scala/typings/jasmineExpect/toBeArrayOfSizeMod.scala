package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeArrayOfSizeMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfSize", "toBeArrayOfSize")
  @js.native
  val toBeArrayOfSize: ToBeArrayOfSize_ = js.native
  
  type ToBeArrayOfSize_ = js.Function2[/* size */ Double, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeArrayOfSize: ToBeArrayOfSize_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeArrayOfSize: (/* size */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfSize = js.Any.fromFunction2(toBeArrayOfSize))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeArrayOfSize(value: (/* size */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeArrayOfSize", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
