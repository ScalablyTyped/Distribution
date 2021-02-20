package typings.jestMatcherOneOf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jest {
  
  @js.native
  trait Matchers[R, T] extends StObject {
    
    def toBeOneOf(expected: js.Array[_]): R = js.native
  }
  object Matchers {
    
    @scala.inline
    def apply[R, T](toBeOneOf: js.Array[_] => R): Matchers[R, T] = {
      val __obj = js.Dynamic.literal(toBeOneOf = js.Any.fromFunction1(toBeOneOf))
      __obj.asInstanceOf[Matchers[R, T]]
    }
    
    @scala.inline
    implicit class MatchersMutableBuilder[Self <: Matchers[_, _], R, T] (val x: Self with (Matchers[R, T])) extends AnyVal {
      
      @scala.inline
      def setToBeOneOf(value: js.Array[_] => R): Self = StObject.set(x, "toBeOneOf", js.Any.fromFunction1(value))
    }
  }
}
