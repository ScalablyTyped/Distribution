package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNode[T] extends StObject {
  
  var next: StackNode[T] | Null = js.native
  
  var value: T = js.native
}
object StackNode {
  
  @scala.inline
  def apply[T](value: T): StackNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNode[T]]
  }
  
  @scala.inline
  implicit class StackNodeMutableBuilder[Self <: StackNode[_], T] (val x: Self with StackNode[T]) extends AnyVal {
    
    @scala.inline
    def setNext(value: StackNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = StObject.set(x, "next", null)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
