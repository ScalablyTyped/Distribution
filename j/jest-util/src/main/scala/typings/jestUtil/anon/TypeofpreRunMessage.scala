package typings.jestUtil.anon

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpreRunMessage extends js.Object {
  
  def print(stream: WritableStream): Unit = js.native
  
  def remove(stream: WritableStream): Unit = js.native
}
object TypeofpreRunMessage {
  
  @scala.inline
  def apply(print: WritableStream => Unit, remove: WritableStream => Unit): TypeofpreRunMessage = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofpreRunMessage]
  }
  
  @scala.inline
  implicit class TypeofpreRunMessageOps[Self <: TypeofpreRunMessage] (val x: Self) extends AnyVal {
    
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
    def setPrint(value: WritableStream => Unit): Self = this.set("print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: WritableStream => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
