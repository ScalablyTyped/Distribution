package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sortable extends Widget {
  @JSName("options")
  var options_Sortable: SortableOptions = js.native
  var wrapper: JQuery = js.native
  def indexOf(element: JQuery): Double = js.native
  def items(): JQuery = js.native
}

