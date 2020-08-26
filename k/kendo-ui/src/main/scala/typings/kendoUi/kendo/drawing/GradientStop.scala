package typings.kendoUi.kendo.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientStop extends Class {
  var options: GradientStopOptions = js.native
}

object GradientStop {
  @scala.inline
  def apply(options: GradientStopOptions): GradientStop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
  @scala.inline
  implicit class GradientStopOps[Self <: GradientStop] (val x: Self) extends AnyVal {
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
    def setOptions(value: GradientStopOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

