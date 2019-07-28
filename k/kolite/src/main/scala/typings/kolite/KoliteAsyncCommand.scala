package typings.kolite

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoliteAsyncCommand extends KoliteCommand {
  @JSName("isExecuting")
  var isExecuting_Original: KnockoutObservable[Boolean] = js.native
  def isExecuting(): Boolean = js.native
  def isExecuting(value: Boolean): Unit = js.native
}

