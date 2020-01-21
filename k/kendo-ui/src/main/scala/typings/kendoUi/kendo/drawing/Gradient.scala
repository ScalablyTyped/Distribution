package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Gradient")
@js.native
class Gradient () extends Class {
  def this(options: GradientOptions) = this()
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): GradientStop = js.native
  def removeStop(stop: GradientStop): Unit = js.native
}

