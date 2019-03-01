package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, scala.Unit]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var dates: js.UndefOr[js.Any] = js.undefined
  var depth: js.UndefOr[java.lang.String] = js.undefined
  var disableDates: js.UndefOr[js.Any | js.Function] = js.undefined
  var footer: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[MultiViewCalendarMessages] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var month: js.UndefOr[MultiViewCalendarMonth] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, scala.Unit]] = js.undefined
  var range: js.UndefOr[MultiViewCalendarRange] = js.undefined
  var selectDates: js.UndefOr[js.Any] = js.undefined
  var selectable: js.UndefOr[java.lang.String] = js.undefined
  var showViewHeader: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
  var views: js.UndefOr[scala.Double] = js.undefined
  var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
}

object MultiViewCalendarOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ MultiViewCalendarEvent, scala.Unit] = null,
    culture: java.lang.String = null,
    dates: js.Any = null,
    depth: java.lang.String = null,
    disableDates: js.Any | js.Function = null,
    footer: java.lang.String | js.Function = null,
    format: java.lang.String = null,
    max: stdLib.Date = null,
    messages: MultiViewCalendarMessages = null,
    min: stdLib.Date = null,
    month: MultiViewCalendarMonth = null,
    name: java.lang.String = null,
    navigate: js.Function1[/* e */ MultiViewCalendarEvent, scala.Unit] = null,
    range: MultiViewCalendarRange = null,
    selectDates: js.Any = null,
    selectable: java.lang.String = null,
    showViewHeader: js.UndefOr[scala.Boolean] = js.undefined,
    start: java.lang.String = null,
    value: stdLib.Date = null,
    views: scala.Int | scala.Double = null,
    weekNumber: js.UndefOr[scala.Boolean] = js.undefined
  ): MultiViewCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
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
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
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

