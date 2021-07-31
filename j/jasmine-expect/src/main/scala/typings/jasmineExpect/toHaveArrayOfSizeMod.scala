package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveArrayOfSizeMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfSize", "toHaveArrayOfSize")
  @js.native
  val toHaveArrayOfSize: ToHaveArrayOfSize_ = js.native
  
  type ToHaveArrayOfSize_ = js.Function3[
    /* key */ String, 
    /* size */ js.UndefOr[Double], 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveArrayOfSize: ToHaveArrayOfSize_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveArrayOfSize: (/* key */ String, /* size */ js.UndefOr[Double], /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfSize = js.Any.fromFunction3(toHaveArrayOfSize))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveArrayOfSize(
            value: (/* key */ String, /* size */ js.UndefOr[Double], /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveArrayOfSize", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
