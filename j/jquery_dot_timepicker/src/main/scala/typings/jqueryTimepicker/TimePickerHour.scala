package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerHour extends js.Object {
  /** last displayed hour */
  var ends: js.UndefOr[Double] = js.undefined
  /** first displayed hour */
  var starts: js.UndefOr[Double] = js.undefined
}

object TimePickerHour {
  @scala.inline
  def apply(ends: js.UndefOr[Double] = js.undefined, starts: js.UndefOr[Double] = js.undefined): TimePickerHour = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ends)) __obj.updateDynamic("ends")(ends.get.asInstanceOf[js.Any])
    if (!js.isUndefined(starts)) __obj.updateDynamic("starts")(starts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerHour]
  }
}

