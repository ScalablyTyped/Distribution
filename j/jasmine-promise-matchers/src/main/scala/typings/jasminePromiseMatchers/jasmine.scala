package typings.jasminePromiseMatchers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  trait Matchers[T] extends StObject {
    
    /**
      * Verifies that a value is a $q Promise.
      */
    def toBePromise(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) rejected.
      */
    def toBeRejected(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) rejected with the specified parameter.
      */
    def toBeRejectedWith(value: Any): Boolean
    
    /**
      * Verifies that a Promise is (or has been) resolved.
      */
    def toBeResolved(): Boolean
    
    /**
      * Verifies that a Promise is (or has been) resolved with the specified parameter.
      */
    def toBeResolvedWith(value: Any): Boolean
  }
  object Matchers {
    
    inline def apply[T](
      toBePromise: () => Boolean,
      toBeRejected: () => Boolean,
      toBeRejectedWith: Any => Boolean,
      toBeResolved: () => Boolean,
      toBeResolvedWith: Any => Boolean
    ): Matchers[T] = {
      val __obj = js.Dynamic.literal(toBePromise = js.Any.fromFunction0(toBePromise), toBeRejected = js.Any.fromFunction0(toBeRejected), toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = js.Any.fromFunction0(toBeResolved), toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
      __obj.asInstanceOf[Matchers[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matchers[?], T] (val x: Self & Matchers[T]) extends AnyVal {
      
      inline def setToBePromise(value: () => Boolean): Self = StObject.set(x, "toBePromise", js.Any.fromFunction0(value))
      
      inline def setToBeRejected(value: () => Boolean): Self = StObject.set(x, "toBeRejected", js.Any.fromFunction0(value))
      
      inline def setToBeRejectedWith(value: Any => Boolean): Self = StObject.set(x, "toBeRejectedWith", js.Any.fromFunction1(value))
      
      inline def setToBeResolved(value: () => Boolean): Self = StObject.set(x, "toBeResolved", js.Any.fromFunction0(value))
      
      inline def setToBeResolvedWith(value: Any => Boolean): Self = StObject.set(x, "toBeResolvedWith", js.Any.fromFunction1(value))
    }
  }
}
