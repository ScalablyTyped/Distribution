package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends Class {
  var options: GradientStopOptions
}

object GradientStop {
  @scala.inline
  def apply(options: GradientStopOptions): GradientStop = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientStop]
  }
}

