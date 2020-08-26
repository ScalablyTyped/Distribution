package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandA7[R, T, U, V, W, X, Y, Z] extends js.Object {
  def execute(t: T, u: U, v: V, w: W, x: X, y: Y, z: Z): js.Thenable[R] = js.native
}

object CommandA7 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y, Z](execute: (T, U, V, W, X, Y, Z) => js.Thenable[R]): CommandA7[R, T, U, V, W, X, Y, Z] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction7(execute))
    __obj.asInstanceOf[CommandA7[R, T, U, V, W, X, Y, Z]]
  }
  @scala.inline
  implicit class CommandA7Ops[Self <: CommandA7[_, _, _, _, _, _, _, _], R, T, U, V, W, X, Y, Z] (val x: Self with (CommandA7[R, T, U, V, W, X, Y, Z])) extends AnyVal {
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
    def setExecute(value: (T, U, V, W, X, Y, Z) => js.Thenable[R]): Self = this.set("execute", js.Any.fromFunction7(value))
  }
  
}

