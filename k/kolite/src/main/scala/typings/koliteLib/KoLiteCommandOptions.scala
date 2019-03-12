package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteCommandOptions extends js.Object {
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ scala.Boolean, _]] = js.undefined
  def execute(args: js.Any*): js.Any
}

object KoLiteCommandOptions {
  @scala.inline
  def apply(execute: /* repeated */ js.Any => js.Any, canExecute: /* isExecuting */ scala.Boolean => _ = null): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    if (canExecute != null) __obj.updateDynamic("canExecute")(js.Any.fromFunction1(canExecute))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
}

