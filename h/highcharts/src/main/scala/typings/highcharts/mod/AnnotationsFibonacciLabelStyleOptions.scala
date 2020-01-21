package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsFibonacciLabelStyleOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object AnnotationsFibonacciLabelStyleOptions {
  @scala.inline
  def apply(color: String = null): AnnotationsFibonacciLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsFibonacciLabelStyleOptions]
  }
}

