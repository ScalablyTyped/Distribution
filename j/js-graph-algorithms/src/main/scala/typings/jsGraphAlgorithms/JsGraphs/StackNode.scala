package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackNode[T] extends StObject {
  
  var next: StackNode[T] | Null
  
  var value: T
}
object StackNode {
  
  inline def apply[T](value: T): StackNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = null)
    __obj.asInstanceOf[StackNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackNode[?], T] (val x: Self & StackNode[T]) extends AnyVal {
    
    inline def setNext(value: StackNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
