package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoliteAsyncCommand extends KoliteCommand {
  @JSName("isExecuting")
  var isExecuting_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  def isExecuting(): scala.Boolean = js.native
  def isExecuting(value: scala.Boolean): scala.Unit = js.native
}

