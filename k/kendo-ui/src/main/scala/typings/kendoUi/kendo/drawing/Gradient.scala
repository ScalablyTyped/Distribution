package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends Class {
  var options: GradientOptions
  var stops: js.Any
  def addStop(offset: Double, color: String, opacity: Double): GradientStop
  def removeStop(stop: GradientStop): Unit
}

object Gradient {
  @scala.inline
  def apply(
    addStop: (Double, String, Double) => GradientStop,
    options: GradientOptions,
    removeStop: GradientStop => Unit,
    stops: js.Any
  ): Gradient = {
    val __obj = js.Dynamic.literal(addStop = js.Any.fromFunction3(addStop), options = options.asInstanceOf[js.Any], removeStop = js.Any.fromFunction1(removeStop), stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
}

