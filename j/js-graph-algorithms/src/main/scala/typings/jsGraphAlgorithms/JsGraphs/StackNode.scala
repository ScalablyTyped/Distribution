package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNode[T] extends js.Object {
  
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
  implicit class StackNodeOps[Self <: StackNode[_], T] (val x: Self with StackNode[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: StackNode[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
  }
}
