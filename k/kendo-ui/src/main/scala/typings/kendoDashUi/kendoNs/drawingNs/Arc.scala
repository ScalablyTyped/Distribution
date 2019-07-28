package typings.kendoDashUi.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Arc")
@js.native
class Arc protected () extends Element {
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Arc) = this()
  def this(geometry: typings.kendoDashUi.kendoNs.geometryNs.Arc, options: ArcOptions) = this()
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: String): Arc = js.native
  def fill(color: String, opacity: Double): Arc = js.native
  def geometry(): typings.kendoDashUi.kendoNs.geometryNs.Arc = js.native
  def geometry(value: typings.kendoDashUi.kendoNs.geometryNs.Arc): Unit = js.native
  def stroke(color: String): Arc = js.native
  def stroke(color: String, width: Double): Arc = js.native
  def stroke(color: String, width: Double, opacity: Double): Arc = js.native
}

