package typings.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toHaveMemberMod {
  
  @JSImport("jasmine-expect/dist/toHaveMember", "toHaveMember")
  @js.native
  val toHaveMember: ToHaveMember_ = js.native
  
  type ToHaveMember_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        var toHaveMember: ToHaveMember_
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toHaveMember: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveMember = js.Any.fromFunction2(toHaveMember))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToHaveMember(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "toHaveMember", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
