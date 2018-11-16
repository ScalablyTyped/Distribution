package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Gradient")
@js.native
class Gradient ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: scala.Double, color: java.lang.String, opacity: scala.Double): GradientStop = js.native
  def removeStop(stop: GradientStop): scala.Unit = js.native
}

