package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Arc")
@js.native
class Arc protected ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Arc) = this()
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Arc, options: ArcOptions) = this()
  @JSName("options")
  var options_Arc: ArcOptions = js.native
  def fill(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Arc = js.native
  def fill(color: java.lang.String, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Arc = js.native
  def geometry(): kendoDashUiLib.kendoNs.geometryNs.Arc = js.native
  def geometry(value: kendoDashUiLib.kendoNs.geometryNs.Arc): scala.Unit = js.native
  def stroke(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Arc = js.native
  def stroke(color: java.lang.String, width: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Arc = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Arc = js.native
}

