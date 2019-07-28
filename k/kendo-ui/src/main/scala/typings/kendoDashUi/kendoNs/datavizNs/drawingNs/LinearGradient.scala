package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import typings.kendoDashUi.kendoNs.geometryNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.drawing.LinearGradient")
@js.native
class LinearGradient ()
  extends typings.kendoDashUi.kendoNs.drawingNs.Gradient {
  def this(options: LinearGradientOptions) = this()
  @JSName("options")
  var options_LinearGradient: LinearGradientOptions = js.native
  def end(): Point = js.native
  def end(end: js.Any): Unit = js.native
  def end(end: Point): Unit = js.native
  def start(): Point = js.native
  def start(start: js.Any): Unit = js.native
  def start(start: Point): Unit = js.native
}

