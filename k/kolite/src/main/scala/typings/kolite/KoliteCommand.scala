package typings.kolite

import typings.knockout.KnockoutComputed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Command /////////////////////////////////////////////
@js.native
trait KoliteCommand extends js.Object {
  @JSName("canExecute")
  var canExecute_Original: KnockoutComputed[Boolean] = js.native
  def canExecute(): Boolean = js.native
  def canExecute(value: Boolean): Unit = js.native
  def execute(args: js.Any*): js.Any = js.native
}

