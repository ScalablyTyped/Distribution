package typings.kendoDashUi.kendo.dataviz.drawing

import typings.kendoDashUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.Gradient")
@js.native
class Gradient () extends Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): typings.kendoDashUi.kendo.drawing.GradientStop = js.native
  def removeStop(stop: typings.kendoDashUi.kendo.drawing.GradientStop): Unit = js.native
}

