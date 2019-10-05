package typings.materializeDashCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternationalizationOptions extends js.Object {
  var cancel: String
  var clear: String
  var done: String
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var nextMonth: String
  var previousMonth: String
  var weekdays: js.Array[String]
  var weekdaysAbbrev: js.Array[String]
  var weekdaysShort: js.Array[String]
}

object InternationalizationOptions {
  @scala.inline
  def apply(
    cancel: String,
    clear: String,
    done: String,
    months: js.Array[String],
    monthsShort: js.Array[String],
    nextMonth: String,
    previousMonth: String,
    weekdays: js.Array[String],
    weekdaysAbbrev: js.Array[String],
    weekdaysShort: js.Array[String]
  ): InternationalizationOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel, clear = clear, done = done, months = months, monthsShort = monthsShort, nextMonth = nextMonth, previousMonth = previousMonth, weekdays = weekdays, weekdaysAbbrev = weekdaysAbbrev, weekdaysShort = weekdaysShort)
  
    __obj.asInstanceOf[InternationalizationOptions]
  }
}

