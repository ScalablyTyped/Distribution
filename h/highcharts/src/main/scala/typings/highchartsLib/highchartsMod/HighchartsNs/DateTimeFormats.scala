package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeFormats extends js.Object {
  /**
    * @default '%e. %b'
    */
  var day: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%H:%M'
    */
  var hour: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%H:%M:%S.%L'
    */
  var millisecond: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%H:%M'
    */
  var minute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%b \ '%y'
    */
  var month: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%H:%M:%S'
    */
  var second: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%e. %b'
    */
  var week: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default '%Y'
    */
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeFormats {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    hour: java.lang.String = null,
    millisecond: java.lang.String = null,
    minute: java.lang.String = null,
    month: java.lang.String = null,
    second: java.lang.String = null,
    week: java.lang.String = null,
    year: java.lang.String = null
  ): DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateTimeFormats]
  }
}

