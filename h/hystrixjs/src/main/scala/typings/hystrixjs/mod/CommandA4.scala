package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA4[R, T, U, V, W] extends js.Object {
  
  def execute(t: T, u: U, v: V, w: W): js.Thenable[R] = js.native
}
object CommandA4 {
  
  @scala.inline
  def apply[R, T, U, V, W](execute: (T, U, V, W) => js.Thenable[R]): CommandA4[R, T, U, V, W] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction4(execute))
    __obj.asInstanceOf[CommandA4[R, T, U, V, W]]
  }
  
  @scala.inline
  implicit class CommandA4Ops[Self <: CommandA4[_, _, _, _, _], R, T, U, V, W] (val x: Self with (CommandA4[R, T, U, V, W])) extends AnyVal {
    
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
    def setExecute(value: (T, U, V, W) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction4(value))
  }
}
