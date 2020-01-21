package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  // [required] sets the command action method
  var action: js.Function
  // [optional] function to determine if command can be executed
  var canExecute: js.UndefOr[js.Function0[Boolean]] = js.undefined
  // [optional] context to use in the command
  var context: js.UndefOr[js.Any] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(action: js.Function, canExecute: () => Boolean = null, context: js.Any = null): CommandOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (canExecute != null) __obj.updateDynamic("canExecute")(js.Any.fromFunction0(canExecute))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

