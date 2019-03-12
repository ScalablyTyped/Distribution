package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Command /////////////////////////////////////////////
@js.native
trait KoliteCommand extends js.Object {
  @JSName("canExecute")
  var canExecute_Original: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  def canExecute(): scala.Boolean = js.native
  def canExecute(value: scala.Boolean): scala.Unit = js.native
  def execute(args: js.Any*): js.Any = js.native
}

