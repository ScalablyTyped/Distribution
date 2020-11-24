package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA0[R] extends js.Object {
  
  def execute[R](): js.Thenable[R] = js.native
}
object CommandA0 {
  
  @scala.inline
  def apply[R](execute: () => js.Thenable[js.Any]): CommandA0[R] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[CommandA0[R]]
  }
  
  @scala.inline
  implicit class CommandA0Ops[Self <: CommandA0[_], R] (val x: Self with CommandA0[R]) extends AnyVal {
    
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
    def setExecute(value: () => js.Thenable[js.Any]): Self = this.set("execute", js.Any.fromFunction0(value))
  }
}
