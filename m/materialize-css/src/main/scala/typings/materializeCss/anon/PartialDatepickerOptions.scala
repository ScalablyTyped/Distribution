package typings.materializeCss.anon

import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.DatepickerOptions> */
trait PartialDatepickerOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[Element] = js.undefined
  var defaultDate: js.UndefOr[Date] = js.undefined
  var disableDayFn: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.undefined
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var firstDay: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var i18n: js.UndefOr[PartialInternationalizati] = js.undefined
  var isRTL: js.UndefOr[Boolean] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onDraw: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* selectedDate */ Date, Unit]] = js.undefined
  var parse: js.UndefOr[js.Function2[/* value */ String, /* format */ String, Date]] = js.undefined
  var setDefaultDate: js.UndefOr[Boolean] = js.undefined
  var showClearBtn: js.UndefOr[Boolean] = js.undefined
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
  var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object PartialDatepickerOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    container: Element = null,
    defaultDate: Date = null,
    disableDayFn: /* day */ Date => Boolean = null,
    disableWeekends: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[String] = null,
    firstDay: js.UndefOr[Double] = js.undefined,
    format: String = null,
    i18n: PartialInternationalizati = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxDate: Date = null,
    minDate: Date = null,
    onClose: js.ThisFunction0[PartialDatepickerOptions, Unit] = null,
    onDraw: js.ThisFunction0[PartialDatepickerOptions, Unit] = null,
    onOpen: js.ThisFunction0[PartialDatepickerOptions, Unit] = null,
    onSelect: js.ThisFunction1[PartialDatepickerOptions, /* selectedDate */ Date, Unit] = null,
    parse: (/* value */ String, /* format */ String) => Date = null,
    setDefaultDate: js.UndefOr[Boolean] = js.undefined,
    showClearBtn: js.UndefOr[Boolean] = js.undefined,
    showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined,
    showMonthAfterYear: js.UndefOr[Boolean] = js.undefined,
    yearRange: Double | js.Array[Double] = null
  ): PartialDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disableDayFn != null) __obj.updateDynamic("disableDayFn")(js.Any.fromFunction1(disableDayFn))
    if (!js.isUndefined(disableWeekends)) __obj.updateDynamic("disableWeekends")(disableWeekends.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDay)) __obj.updateDynamic("firstDay")(firstDay.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onDraw != null) __obj.updateDynamic("onDraw")(onDraw.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2(parse))
    if (!js.isUndefined(setDefaultDate)) __obj.updateDynamic("setDefaultDate")(setDefaultDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearBtn)) __obj.updateDynamic("showClearBtn")(showClearBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDaysInNextAndPreviousMonths)) __obj.updateDynamic("showDaysInNextAndPreviousMonths")(showDaysInNextAndPreviousMonths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.get.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDatepickerOptions]
  }
}

