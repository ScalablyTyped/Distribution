package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Group")
@js.native
class Group () extends Observable_ {
  def this(options: GroupOptions) = this()
  var drawingElement: typings.kendoUi.kendo.drawing.Group = js.native
  var options: GroupOptions = js.native
  def append(element: js.Any): Unit = js.native
  def clear(): Unit = js.native
  def position(): Unit = js.native
  def position(offset: Point): Unit = js.native
  def remove(element: js.Any): Unit = js.native
  def rotate(angle: Double, center: Point): Unit = js.native
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}

