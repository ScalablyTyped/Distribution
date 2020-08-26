package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA6[R, T, U, V, W, X, Y] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y): js.Thenable[R] = js.native
}

object CommandA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](execute: (T, U, V, W, X, Y) => js.Thenable[R]): CommandA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction6(execute))
    __obj.asInstanceOf[CommandA6[R, T, U, V, W, X, Y]]
  }
  @scala.inline
  implicit class CommandA6Ops[Self <: CommandA6[_, _, _, _, _, _, _], R, T, U, V, W, X, Y] (val x: Self with (CommandA6[R, T, U, V, W, X, Y])) extends AnyVal {
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
    def setExecute(value: (T, U, V, W, X, Y) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction6(value))
  }
  
}

