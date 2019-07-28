package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var max: js.UndefOr[Date] = js.undefined
  var messages: js.UndefOr[MultiViewCalendarMessages] = js.undefined
  var min: js.UndefOr[Date] = js.undefined
  var month: js.UndefOr[MultiViewCalendarMonth] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.undefined
  var range: js.UndefOr[MultiViewCalendarRange] = js.undefined
  var selectDates: js.UndefOr[js.Any] = js.undefined
  var selectable: js.UndefOr[String] = js.undefined
  var showViewHeader: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
  var views: js.UndefOr[Double] = js.undefined
  var weekNumber: js.UndefOr[Boolean] = js.undefined
}

object MultiViewCalendarOptions {
  @scala.inline
  def apply(
    change: /* e */ MultiViewCalendarEvent => Unit = null,
    culture: String = null,
    dates: js.Any = null,
    depth: String = null,
    disableDates: js.Any | js.Function = null,
    footer: String | js.Function = null,
    format: String = null,
    max: Date = null,
    messages: MultiViewCalendarMessages = null,
    min: Date = null,
    month: MultiViewCalendarMonth = null,
    name: String = null,
    navigate: /* e */ MultiViewCalendarEvent => Unit = null,
    range: MultiViewCalendarRange = null,
    selectDates: js.Any = null,
    selectable: String = null,
    showViewHeader: js.UndefOr[Boolean] = js.undefined,
    start: String = null,
    value: Date = null,
    views: Int | Double = null,
    weekNumber: js.UndefOr[Boolean] = js.undefined
  ): MultiViewCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (dates != null) __obj.updateDynamic("dates")(dates)
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (disableDates != null) __obj.updateDynamic("disableDates")(disableDates.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (month != null) __obj.updateDynamic("month")(month)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (range != null) __obj.updateDynamic("range")(range)
    if (selectDates != null) __obj.updateDynamic("selectDates")(selectDates)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showViewHeader)) __obj.updateDynamic("showViewHeader")(showViewHeader)
    if (start != null) __obj.updateDynamic("start")(start)
    if (value != null) __obj.updateDynamic("value")(value)
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[MultiViewCalendarOptions]
  }
}

