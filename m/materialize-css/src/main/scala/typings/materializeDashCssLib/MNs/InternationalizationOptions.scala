package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternationalizationOptions extends js.Object {
  var cancel: java.lang.String
  var clear: java.lang.String
  var done: java.lang.String
  var months: js.Array[java.lang.String]
  var monthsShort: js.Array[java.lang.String]
  var nextMonth: java.lang.String
  var previousMonth: java.lang.String
  var weekdays: js.Array[java.lang.String]
  var weekdaysAbbrev: js.Array[java.lang.String]
  var weekdaysShort: js.Array[java.lang.String]
}

object InternationalizationOptions {
  @scala.inline
  def apply(
    cancel: java.lang.String,
    clear: java.lang.String,
    done: java.lang.String,
    months: js.Array[java.lang.String],
    monthsShort: js.Array[java.lang.String],
    nextMonth: java.lang.String,
    previousMonth: java.lang.String,
    weekdays: js.Array[java.lang.String],
    weekdaysAbbrev: js.Array[java.lang.String],
    weekdaysShort: js.Array[java.lang.String]
  ): InternationalizationOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel, clear = clear, done = done, months = months, monthsShort = monthsShort, nextMonth = nextMonth, previousMonth = previousMonth, weekdays = weekdays, weekdaysAbbrev = weekdaysAbbrev, weekdaysShort = weekdaysShort)
  
    __obj.asInstanceOf[InternationalizationOptions]
  }
}

