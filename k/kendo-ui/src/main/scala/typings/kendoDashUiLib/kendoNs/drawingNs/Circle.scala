package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Circle")
@js.native
class Circle protected () extends Element {
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Circle) = this()
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Circle, options: CircleOptions) = this()
  @JSName("options")
  var options_Circle: CircleOptions = js.native
  def fill(color: java.lang.String): Circle = js.native
  def fill(color: java.lang.String, opacity: scala.Double): Circle = js.native
  def geometry(): kendoDashUiLib.kendoNs.geometryNs.Circle = js.native
  def geometry(value: kendoDashUiLib.kendoNs.geometryNs.Circle): scala.Unit = js.native
  def stroke(color: java.lang.String): Circle = js.native
  def stroke(color: java.lang.String, width: scala.Double): Circle = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): Circle = js.native
}

