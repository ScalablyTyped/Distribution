package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialGradient
  extends typings.kendoUi.kendo.drawing.Gradient {
  @JSName("options")
  var options_RadialGradient: RadialGradientOptions = js.native
  def center(): Point = js.native
  def center(center: js.Any): Unit = js.native
  def center(center: Point): Unit = js.native
  def radius(): Double = js.native
  def radius(value: Double): Unit = js.native
}

