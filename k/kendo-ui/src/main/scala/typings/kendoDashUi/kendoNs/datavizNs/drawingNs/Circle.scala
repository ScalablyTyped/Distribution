package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends typings.kendoDashUi.kendoNs.drawingNs.Element {
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Circle) = this()
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: String): typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
  def geometry(): typings.kendoDashUi.kendoNs.geometryNs.Circle = js.native
  def geometry(value: typings.kendoDashUi.kendoNs.geometryNs.Circle): Unit = js.native
  def stroke(color: String): typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendoNs.drawingNs.Circle = js.native
}

