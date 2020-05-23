package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group
  extends typings.kendoUi.kendo.drawing.Element {
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def clear(): Unit = js.native
  def insert(position: Double, element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def remove(element: typings.kendoUi.kendo.drawing.Element): Unit = js.native
  def removeAt(index: Double): Unit = js.native
}

