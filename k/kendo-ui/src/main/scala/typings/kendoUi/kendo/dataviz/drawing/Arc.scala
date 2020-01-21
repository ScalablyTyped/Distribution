package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Arc")
@js.native
class Arc protected ()
  extends typings.kendoUi.kendo.drawing.Element {
  def this(geometry: typings.kendoUi.kendo.geometry.Arc) = this()
  def this(geometry: typings.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: String): typings.kendoUi.kendo.drawing.Arc = js.native
  def fill(color: String, opacity: Double): typings.kendoUi.kendo.drawing.Arc = js.native
  def geometry(): typings.kendoUi.kendo.geometry.Arc = js.native
  def geometry(value: typings.kendoUi.kendo.geometry.Arc): Unit = js.native
  def stroke(color: String): typings.kendoUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double): typings.kendoUi.kendo.drawing.Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoUi.kendo.drawing.Arc = js.native
}

