package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Rect")
@js.native
class Rect protected ()
  extends typings.kendoDashUi.kendoNs.drawingNs.Element {
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Rect) = this()
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: String): typings.kendoDashUi.kendoNs.drawingNs.Rect = js.native
  def fill(color: String, opacity: Double): typings.kendoDashUi.kendoNs.drawingNs.Rect = js.native
  def geometry(): typings.kendoDashUi.kendoNs.geometryNs.Rect = js.native
  def geometry(value: typings.kendoDashUi.kendoNs.geometryNs.Rect): Unit = js.native
  def stroke(color: String): typings.kendoDashUi.kendoNs.drawingNs.Rect = js.native
  def stroke(color: String, width: Double): typings.kendoDashUi.kendoNs.drawingNs.Rect = js.native
  def stroke(color: String, width: Double, opacity: Double): typings.kendoDashUi.kendoNs.drawingNs.Rect = js.native
}

