package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import typings.kendoDashUi.kendoNs.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Gradient")
@js.native
class Gradient () extends Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): typings.kendoDashUi.kendoNs.drawingNs.GradientStop = js.native
  def removeStop(stop: typings.kendoDashUi.kendoNs.drawingNs.GradientStop): Unit = js.native
}

