package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.RadialGradient")
@js.native
class RadialGradient ()
  extends kendoDashUiLib.kendoNs.drawingNs.Gradient {
  def this(options: RadialGradientOptions) = this()
  @JSName("options")
  var options_RadialGradient: RadialGradientOptions = js.native
  def center(): kendoDashUiLib.kendoNs.geometryNs.Point = js.native
  def center(center: js.Any): scala.Unit = js.native
  def center(center: kendoDashUiLib.kendoNs.geometryNs.Point): scala.Unit = js.native
  def radius(): scala.Double = js.native
  def radius(value: scala.Double): scala.Unit = js.native
}

