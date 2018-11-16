package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Circle")
@js.native
class Circle protected ()
  extends kendoDashUiLib.kendoNs.drawingNs.Element {
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Circle) = this()
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Circle = js.native
  def fill(color: java.lang.String, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Circle = js.native
  def geometry(): kendoDashUiLib.kendoNs.geometryNs.Circle = js.native
  def geometry(value: kendoDashUiLib.kendoNs.geometryNs.Circle): scala.Unit = js.native
  def stroke(color: java.lang.String): kendoDashUiLib.kendoNs.drawingNs.Circle = js.native
  def stroke(color: java.lang.String, width: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Circle = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.Circle = js.native
}

