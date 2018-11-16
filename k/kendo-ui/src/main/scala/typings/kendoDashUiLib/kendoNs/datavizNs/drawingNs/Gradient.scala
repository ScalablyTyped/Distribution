package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Gradient")
@js.native
class Gradient ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: scala.Double, color: java.lang.String, opacity: scala.Double): kendoDashUiLib.kendoNs.drawingNs.GradientStop = js.native
  def removeStop(stop: kendoDashUiLib.kendoNs.drawingNs.GradientStop): scala.Unit = js.native
}

