package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[T] extends StObject {
  
  var complete: Any
  
  var error: Any
  
  var next: Any
  
  var subscribe: T
}
object Complete {
  
  inline def apply[T](complete: Any, error: Any, next: Any, subscribe: T): Complete[T] = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Complete[?], T] (val x: Self & Complete[T]) extends AnyVal {
    
    inline def setComplete(value: Any): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setSubscribe(value: T): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
  }
}
