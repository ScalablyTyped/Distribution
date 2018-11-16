package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Rect")
@js.native
class Rect protected () extends Element {
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Rect) = this()
  def this(geometry: kendoDashUiLib.kendoNs.geometryNs.Rect, options: RectOptions) = this()
  @JSName("options")
  var options_Rect: RectOptions = js.native
  def fill(color: java.lang.String): Rect = js.native
  def fill(color: java.lang.String, opacity: scala.Double): Rect = js.native
  def geometry(): kendoDashUiLib.kendoNs.geometryNs.Rect = js.native
  def geometry(value: kendoDashUiLib.kendoNs.geometryNs.Rect): scala.Unit = js.native
  def stroke(color: java.lang.String): Rect = js.native
  def stroke(color: java.lang.String, width: scala.Double): Rect = js.native
  def stroke(color: java.lang.String, width: scala.Double, opacity: scala.Double): Rect = js.native
}

