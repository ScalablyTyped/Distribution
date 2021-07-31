package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveStringSameLengthAsMod {
  
  @JSImport("jasmine-expect/dist/toHaveStringSameLengthAs", "toHaveStringSameLengthAs")
  @js.native
  val toHaveStringSameLengthAs: ToHaveStringSameLengthAs_ = js.native
  
  type ToHaveStringSameLengthAs_ = js.Function3[
    /* key */ String, 
    /* other */ String, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveStringSameLengthAs: ToHaveStringSameLengthAs_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toHaveStringSameLengthAs: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveStringSameLengthAs = js.Any.fromFunction3(toHaveStringSameLengthAs))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveStringSameLengthAs(
            value: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toHaveStringSameLengthAs", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
