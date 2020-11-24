package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandA1[R, T] extends js.Object {
  
  def execute(t: T): js.Thenable[R] = js.native
}
object CommandA1 {
  
  @scala.inline
  def apply[R, T](execute: T => js.Thenable[R]): CommandA1[R, T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[CommandA1[R, T]]
  }
  
  @scala.inline
  implicit class CommandA1Ops[Self <: CommandA1[_, _], R, T] (val x: Self with (CommandA1[R, T])) extends AnyVal {
    
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
    def setExecute(value: T => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction1(value))
  }
}
