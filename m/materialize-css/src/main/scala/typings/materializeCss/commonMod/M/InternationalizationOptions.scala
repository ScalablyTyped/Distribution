package typings.materializeCss.commonMod.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternationalizationOptions extends js.Object {
  var cancel: String = js.native
  var clear: String = js.native
  var done: String = js.native
  var months: js.Array[String] = js.native
  var monthsShort: js.Array[String] = js.native
  var nextMonth: String = js.native
  var previousMonth: String = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysAbbrev: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysAbbrev = weekdaysAbbrev.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternationalizationOptions]
  }
  @scala.inline
  implicit class InternationalizationOptionsOps[Self <: InternationalizationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: String): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMonth(value: String): Self = this.set("nextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousMonth(value: String): Self = this.set("previousMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysAbbrevVarargs(value: String*): Self = this.set("weekdaysAbbrev", js.Array(value :_*))
    @scala.inline
    def setWeekdaysAbbrev(value: js.Array[String]): Self = this.set("weekdaysAbbrev", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
  }
  
}

