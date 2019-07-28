package typings.jqrangeslider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQRangeSliderDateRange extends js.Object {
  var max: js.UndefOr[Date] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
}

object JQRangeSliderDateRange {
  @scala.inline
  def apply(max: Date = null, min: Date = null): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
}

