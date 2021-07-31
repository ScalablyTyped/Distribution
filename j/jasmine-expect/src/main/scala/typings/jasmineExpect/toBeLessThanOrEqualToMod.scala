package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeLessThanOrEqualToMod {
  
  @JSImport("jasmine-expect/dist/toBeLessThanOrEqualTo", "toBeLessThanOrEqualTo")
  @js.native
  val toBeLessThanOrEqualTo: ToBeLessThanOrEqualTo_ = js.native
  
  type ToBeLessThanOrEqualTo_ = js.Function2[/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeLessThanOrEqualTo: ToBeLessThanOrEqualTo_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](
          toBeLessThanOrEqualTo: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeLessThanOrEqualTo = js.Any.fromFunction2(toBeLessThanOrEqualTo))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeLessThanOrEqualTo(value: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeLessThanOrEqualTo", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
