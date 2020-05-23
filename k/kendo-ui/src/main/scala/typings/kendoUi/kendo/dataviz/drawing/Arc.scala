package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc
  extends typings.kendoUi.kendo.drawing.Element {
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

