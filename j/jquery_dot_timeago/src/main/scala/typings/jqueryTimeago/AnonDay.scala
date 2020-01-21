package typings.jqueryTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  var day: js.UndefOr[js.Any] = js.undefined
  var days: js.UndefOr[js.Any] = js.undefined
  var hour: js.UndefOr[js.Any] = js.undefined
  var hours: js.UndefOr[js.Any] = js.undefined
  var minute: js.UndefOr[js.Any] = js.undefined
  var minutes: js.UndefOr[js.Any] = js.undefined
  var month: js.UndefOr[js.Any] = js.undefined
  var months: js.UndefOr[js.Any] = js.undefined
  var numbers: js.UndefOr[js.Array[_]] = js.undefined
  var prefixAgo: js.UndefOr[String] = js.undefined
  var prefixFromNow: js.UndefOr[String] = js.undefined
  // Those can be string or Function
  var seconds: js.UndefOr[js.Any] = js.undefined
  var suffixAgo: js.UndefOr[String] = js.undefined
  var suffixFromNow: js.UndefOr[String] = js.undefined
  var wordSeparator: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[js.Any] = js.undefined
  var years: js.UndefOr[js.Any] = js.undefined
}

object AnonDay {
  @scala.inline
  def apply(
    day: js.Any = null,
    days: js.Any = null,
    hour: js.Any = null,
    hours: js.Any = null,
    minute: js.Any = null,
    minutes: js.Any = null,
    month: js.Any = null,
    months: js.Any = null,
    numbers: js.Array[_] = null,
    prefixAgo: String = null,
    prefixFromNow: String = null,
    seconds: js.Any = null,
    suffixAgo: String = null,
    suffixFromNow: String = null,
    wordSeparator: String = null,
    year: js.Any = null,
    years: js.Any = null
  ): AnonDay = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (numbers != null) __obj.updateDynamic("numbers")(numbers.asInstanceOf[js.Any])
    if (prefixAgo != null) __obj.updateDynamic("prefixAgo")(prefixAgo.asInstanceOf[js.Any])
    if (prefixFromNow != null) __obj.updateDynamic("prefixFromNow")(prefixFromNow.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (suffixAgo != null) __obj.updateDynamic("suffixAgo")(suffixAgo.asInstanceOf[js.Any])
    if (suffixFromNow != null) __obj.updateDynamic("suffixFromNow")(suffixFromNow.asInstanceOf[js.Any])
    if (wordSeparator != null) __obj.updateDynamic("wordSeparator")(wordSeparator.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDay]
  }
}

