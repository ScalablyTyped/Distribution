package typings.jestMatcherOneOf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jest {
  
  trait Matchers[R, T] extends StObject {
    
    def toBeOneOf(expected: js.Array[js.Any]): R
  }
  object Matchers {
    
    inline def apply[R, T](toBeOneOf: js.Array[js.Any] => R): Matchers[R, T] = {
      val __obj = js.Dynamic.literal(toBeOneOf = js.Any.fromFunction1(toBeOneOf))
      __obj.asInstanceOf[Matchers[R, T]]
    }
    
    extension [Self <: Matchers[?, ?], R, T](x: Self & (Matchers[R, T])) {
      
      inline def setToBeOneOf(value: js.Array[js.Any] => R): Self = StObject.set(x, "toBeOneOf", js.Any.fromFunction1(value))
    }
  }
}
