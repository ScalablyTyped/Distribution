package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA5[R, T, U, V, W, X] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X): js.Thenable[R] = js.native
}

object CommandA5 {
  @scala.inline
  def apply[R, T, U, V, W, X](execute: (T, U, V, W, X) => js.Thenable[R]): CommandA5[R, T, U, V, W, X] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction5(execute))
    __obj.asInstanceOf[CommandA5[R, T, U, V, W, X]]
  }
  @scala.inline
  implicit class CommandA5Ops[Self <: CommandA5[_, _, _, _, _, _], R, T, U, V, W, X] (val x: Self with (CommandA5[R, T, U, V, W, X])) extends AnyVal {
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
    def setExecute(value: (T, U, V, W, X) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction5(value))
  }
  
}

