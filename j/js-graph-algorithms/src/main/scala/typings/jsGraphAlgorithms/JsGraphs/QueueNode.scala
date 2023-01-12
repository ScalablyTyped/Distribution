package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueNode[T] extends StObject {
  
  var next: QueueNode[T] | Null
  
  var value: T
}
object QueueNode {
  
  inline def apply[T](value: T): QueueNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = null)
    __obj.asInstanceOf[QueueNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueNode[?], T] (val x: Self & QueueNode[T]) extends AnyVal {
    
    inline def setNext(value: QueueNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
