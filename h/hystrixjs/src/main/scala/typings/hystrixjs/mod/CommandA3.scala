package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA3[R, T, U, V] extends js.Object {
  def execute(t: T, u: U, v: V): js.Thenable[R] = js.native
}

object CommandA3 {
  @scala.inline
  def apply[R, T, U, V](execute: (T, U, V) => js.Thenable[R]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute))
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
  @scala.inline
  implicit class CommandA3Ops[Self <: CommandA3[_, _, _, _], R, T, U, V] (val x: Self with (CommandA3[R, T, U, V])) extends AnyVal {
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
    def setExecute(value: (T, U, V) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction3(value))
  }
  
}

