package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapsible
  extends typings.kendoUi.kendo.ui.Widget {
  @JSName("options")
  var options_Collapsible: CollapsibleOptions = js.native
  var wrapper: JQuery = js.native
  def collapse(instant: Boolean): Unit = js.native
  def expand(): Unit = js.native
  def expand(instant: Boolean): Unit = js.native
  def toggle(): Unit = js.native
  def toggle(instant: Boolean): Unit = js.native
}

