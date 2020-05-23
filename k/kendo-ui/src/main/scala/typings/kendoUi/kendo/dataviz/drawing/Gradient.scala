package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends Class {
  var options: GradientOptions
  var stops: js.Any
  def addStop(offset: Double, color: String, opacity: Double): typings.kendoUi.kendo.drawing.GradientStop
  def removeStop(stop: typings.kendoUi.kendo.drawing.GradientStop): Unit
}

object Gradient {
  @scala.inline
  def apply(
    addStop: (Double, String, Double) => typings.kendoUi.kendo.drawing.GradientStop,
    options: GradientOptions,
    removeStop: typings.kendoUi.kendo.drawing.GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

