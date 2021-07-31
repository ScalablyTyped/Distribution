package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toBeShorterThanMod {
  
  @JSImport("jasmine-expect/dist/toBeShorterThan", "toBeShorterThan")
  @js.native
  val toBeShorterThan: ToBeShorterThan_ = js.native
  
  type ToBeShorterThan_ = js.Function2[/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toBeShorterThan: ToBeShorterThan_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toBeShorterThan: (/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeShorterThan = js.Any.fromFunction2(toBeShorterThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToBeShorterThan(value: (/* other */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toBeShorterThan", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
