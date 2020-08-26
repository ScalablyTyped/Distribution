package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gradient extends Class {
  var options: GradientOptions = js.native
  var stops: js.Any = js.native
  def addStop(offset: Double, color: String, opacity: Double): GradientStop = js.native
  def removeStop(stop: GradientStop): Unit = js.native
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
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddStop(value: (Double, String, Double) => GradientStop): Self = this.set("addStop", js.Any.fromFunction3(value))
    @scala.inline
    def setOptions(value: GradientOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveStop(value: GradientStop => Unit): Self = this.set("removeStop", js.Any.fromFunction1(value))
    @scala.inline
    def setStops(value: js.Any): Self = this.set("stops", value.asInstanceOf[js.Any])
  }
  
}

