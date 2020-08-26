package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  def execute(args: js.Any*): js.Thenable[_] = js.native
}

object Command {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Thenable[_]): Command = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def setExecute(value: /* repeated */ js.Any => js.Thenable[_]): Self = this.set("execute", js.Any.fromFunction1(value))
  }
  
}

