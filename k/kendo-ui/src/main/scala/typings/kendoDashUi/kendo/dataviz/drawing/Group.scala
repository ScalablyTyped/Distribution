package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Group")
@js.native
class Group ()
  extends typings.kendoDashUi.kendo.drawing.Element {
  def this(options: GroupOptions) = this()
  var children: js.Any = js.native
  @JSName("options")
  var options_Group: GroupOptions = js.native
  def append(element: typings.kendoDashUi.kendo.drawing.Element): Unit = js.native
  def clear(): Unit = js.native
  def insert(position: Double, element: typings.kendoDashUi.kendo.drawing.Element): Unit = js.native
  def remove(element: typings.kendoDashUi.kendo.drawing.Element): Unit = js.native
  def removeAt(index: Double): Unit = js.native
}

