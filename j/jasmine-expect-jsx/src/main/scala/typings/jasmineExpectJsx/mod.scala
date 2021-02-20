package typings.jasmineExpectJsx

import typings.jasmine.jasmine.Expected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object jasmine {
      
      @js.native
      trait Matchers[T] extends StObject {
        
        def toEqualJSX(element: Expected[T]): Boolean = js.native
        
        def toIncludeJSX(element: Expected[T]): Boolean = js.native
      }
      object Matchers {
        
        @scala.inline
        def apply[T](toEqualJSX: Expected[T] => Boolean, toIncludeJSX: Expected[T] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toEqualJSX = js.Any.fromFunction1(toEqualJSX), toIncludeJSX = js.Any.fromFunction1(toIncludeJSX))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        @scala.inline
        implicit class MatchersMutableBuilder[Self <: Matchers[_], T] (val x: Self with Matchers[T]) extends AnyVal {
          
          @scala.inline
          def setToEqualJSX(value: Expected[T] => Boolean): Self = StObject.set(x, "toEqualJSX", js.Any.fromFunction1(value))
          
          @scala.inline
          def setToIncludeJSX(value: Expected[T] => Boolean): Self = StObject.set(x, "toIncludeJSX", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
