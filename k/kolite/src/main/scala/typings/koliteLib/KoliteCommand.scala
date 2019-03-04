package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Command /////////////////////////////////////////////
trait KoliteCommand extends js.Object {
  var canExecute: knockoutLib.KnockoutComputed[scala.Boolean]
  def execute(args: js.Any*): js.Any
}

object KoliteCommand {
  @scala.inline
  def apply(
    canExecute: knockoutLib.KnockoutComputed[scala.Boolean],
    execute: js.Function1[/* repeated */ js.Any, js.Any]
  ): KoliteCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute, execute = execute)
  
    __obj.asInstanceOf[KoliteCommand]
  }
}

