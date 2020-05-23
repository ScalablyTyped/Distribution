package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Touch extends Widget {
  @JSName("options")
  var options_Touch: TouchOptions = js.native
  var wrapper: JQuery = js.native
  def cancel(): Unit = js.native
}

