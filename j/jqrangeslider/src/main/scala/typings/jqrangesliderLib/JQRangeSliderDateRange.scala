package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQRangeSliderDateRange extends js.Object {
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
}

object JQRangeSliderDateRange {
  @scala.inline
  def apply(max: stdLib.Date = null, min: stdLib.Date = null): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
}

