package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossFaded[T] extends StObject {
  
  var from: T
  
  var to: T
}
object CrossFaded {
  
  inline def apply[T](from: T, to: T): CrossFaded[T] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossFaded[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossFaded[?], T] (val x: Self & CrossFaded[T]) extends AnyVal {
    
    inline def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
