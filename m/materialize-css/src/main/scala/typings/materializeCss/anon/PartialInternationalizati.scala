package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.InternationalizationOptions> */
trait PartialInternationalizati extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var done: js.UndefOr[String] = js.undefined
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
  var nextMonth: js.UndefOr[String] = js.undefined
  var previousMonth: js.UndefOr[String] = js.undefined
  var weekdays: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysAbbrev: js.UndefOr[js.Array[String]] = js.undefined
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialInternationalizati {
  @scala.inline
  def apply(
    cancel: String = null,
    clear: String = null,
    done: String = null,
    months: js.Array[String] = null,
    monthsShort: js.Array[String] = null,
    nextMonth: String = null,
    previousMonth: String = null,
    weekdays: js.Array[String] = null,
    weekdaysAbbrev: js.Array[String] = null,
    weekdaysShort: js.Array[String] = null
  ): PartialInternationalizati = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (monthsShort != null) __obj.updateDynamic("monthsShort")(monthsShort.asInstanceOf[js.Any])
    if (nextMonth != null) __obj.updateDynamic("nextMonth")(nextMonth.asInstanceOf[js.Any])
    if (previousMonth != null) __obj.updateDynamic("previousMonth")(previousMonth.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays.asInstanceOf[js.Any])
    if (weekdaysAbbrev != null) __obj.updateDynamic("weekdaysAbbrev")(weekdaysAbbrev.asInstanceOf[js.Any])
    if (weekdaysShort != null) __obj.updateDynamic("weekdaysShort")(weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInternationalizati]
  }
}

