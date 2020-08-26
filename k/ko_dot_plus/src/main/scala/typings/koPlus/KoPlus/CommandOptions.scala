package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandOptions extends js.Object {
  // [required] sets the command action method
  var action: js.Function = js.native
  // [optional] function to determine if command can be executed
  var canExecute: js.UndefOr[js.Function0[Boolean]] = js.native
  // [optional] context to use in the command
  var context: js.UndefOr[js.Any] = js.native
}

object CommandOptions {
  @scala.inline
  def apply(action: js.Function): CommandOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
  @scala.inline
  implicit class CommandOptionsOps[Self <: CommandOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: js.Function): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanExecute(value: () => Boolean): Self = this.set("canExecute", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCanExecute: Self = this.set("canExecute", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

