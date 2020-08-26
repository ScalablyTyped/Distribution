package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisDateTimeLabelFormatsOptions extends js.Object {
  var day: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var hour: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var millisecond: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var minute: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var month: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var second: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var week: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
  var year: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.native
}

object AxisDateTimeLabelFormatsOptions {
  @scala.inline
  def apply(): AxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDateTimeLabelFormatsOptions]
  }
  @scala.inline
  implicit class AxisDateTimeLabelFormatsOptionsOps[Self <: AxisDateTimeLabelFormatsOptions] (val x: Self) extends AnyVal {
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
    def setDay(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setHour(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMillisecond(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    @scala.inline
    def setMinute(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMonth(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setSecond(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setWeek(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    @scala.inline
    def setYear(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

