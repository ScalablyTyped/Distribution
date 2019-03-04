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
  def apply(
    execute: js.Function1[/* repeated */ js.Any, js.Any],
    canExecute: js.Function1[/* isExecuting */ scala.Boolean, _] = null
  ): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal(execute = execute)
    if (canExecute != null) __obj.updateDynamic("canExecute")(canExecute)
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
}

