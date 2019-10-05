package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemTargetLine extends js.Object {
  var width: js.UndefOr[js.Any | js.Function] = js.undefined
}

object SparklineSeriesItemTargetLine {
  @scala.inline
  def apply(width: js.Any | js.Function = null): SparklineSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemTargetLine]
  }
}

