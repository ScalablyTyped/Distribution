package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.LinearGradient")
@js.native
class LinearGradient ()
  extends kendoDashUiLib.kendoNs.drawingNs.Gradient {
  def this(options: LinearGradientOptions) = this()
  @JSName("options")
  var options_LinearGradient: LinearGradientOptions = js.native
  def end(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def end(end: js.Any): scala.Unit = js.native
  def end(end: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Unit = js.native
  def start(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def start(start: js.Any): scala.Unit = js.native
  def start(start: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Unit = js.native
}

