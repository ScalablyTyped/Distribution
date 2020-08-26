package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA2[R, T, U] extends js.Object {
  def execute(t: T, u: U): js.Thenable[R] = js.native
}

object CommandA2 {
  @scala.inline
  def apply[R, T, U](execute: (T, U) => js.Thenable[R]): CommandA2[R, T, U] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute))
    __obj.asInstanceOf[CommandA2[R, T, U]]
  }
  @scala.inline
  implicit class CommandA2Ops[Self <: CommandA2[_, _, _], R, T, U] (val x: Self with (CommandA2[R, T, U])) extends AnyVal {
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
    def setExecute(value: (T, U) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction2(value))
  }
  
}

