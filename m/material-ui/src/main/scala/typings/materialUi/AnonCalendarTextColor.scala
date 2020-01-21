package typings.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalendarTextColor extends js.Object {
  var calendarTextColor: js.UndefOr[String] = js.undefined
  var calendarYearBackgroundColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var headerColor: js.UndefOr[String] = js.undefined
  var selectColor: js.UndefOr[String] = js.undefined
  var selectTextColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object AnonCalendarTextColor {
  @scala.inline
  def apply(
    calendarTextColor: String = null,
    calendarYearBackgroundColor: String = null,
    color: String = null,
    headerColor: String = null,
    selectColor: String = null,
    selectTextColor: String = null,
    textColor: String = null
  ): AnonCalendarTextColor = {
    val __obj = js.Dynamic.literal()
    if (calendarTextColor != null) __obj.updateDynamic("calendarTextColor")(calendarTextColor.asInstanceOf[js.Any])
    if (calendarYearBackgroundColor != null) __obj.updateDynamic("calendarYearBackgroundColor")(calendarYearBackgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (selectColor != null) __obj.updateDynamic("selectColor")(selectColor.asInstanceOf[js.Any])
    if (selectTextColor != null) __obj.updateDynamic("selectTextColor")(selectTextColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalendarTextColor]
  }
}

