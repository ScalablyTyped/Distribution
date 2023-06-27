package typings.makeCancellablePromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel[T] extends StObject {
    
    def cancel(): Unit
    
    var promise: js.Promise[T]
  }
  object Cancel {
    
    inline def apply[T](cancel: () => Unit, promise: js.Promise[T]): Cancel[T] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel[?], T] (val x: Self & Cancel[T]) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
}
