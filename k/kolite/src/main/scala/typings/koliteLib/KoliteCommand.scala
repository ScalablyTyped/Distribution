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

