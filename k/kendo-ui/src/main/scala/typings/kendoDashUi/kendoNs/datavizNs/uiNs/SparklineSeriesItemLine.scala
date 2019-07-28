package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object SparklineSeriesItemLine {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null, style: String = null, width: String = null): SparklineSeriesItemLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SparklineSeriesItemLine]
  }
}

