package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeWithinRangeMod {
  
  @JSImport("jasmine-expect/dist/toBeWithinRange", "toBeWithinRange")
  @js.native
  val toBeWithinRange: ToBeWithinRange_ = js.native
  
  type ToBeWithinRange_ = js.Function3[
    /* floor */ Double, 
    /* ceiling */ Double, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeWithinRange: ToBeWithinRange_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toBeWithinRange: (/* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWithinRange = js.Any.fromFunction3(toBeWithinRange))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeWithinRange(
            value: (/* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
          ): Self = StObject.set(x, "toBeWithinRange", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
