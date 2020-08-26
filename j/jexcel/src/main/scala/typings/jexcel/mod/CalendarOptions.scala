package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Column options
// ----------------------------------------------------------------------
@js.native
trait CalendarOptions extends js.Object {
  /** Date format */
  var format: js.UndefOr[String] = js.native
  /** Fullscreen (this is automatic set for screensize < 800) */
  var fullscreen: js.UndefOr[Boolean] = js.native
  /**
    * Translations can be done here
    * Default: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    */
  var months: js.UndefOr[
    js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ] = js.native
  // tslint:disable-next-line ban-types
  var onchange: js.UndefOr[js.Function] = js.native
  /** Events */
  // tslint:disable-next-line ban-types
  var onclose: js.UndefOr[js.Function] = js.native
  /** Placeholder */
  var placeholder: js.UndefOr[CellValue] = js.native
  /** Allow keyboard date entry */
  var readonly: js.UndefOr[Boolean] = js.native
  /** Show the reset button */
  var resetButton: js.UndefOr[Boolean] = js.native
  /** Show timepicker */
  var time: js.UndefOr[Boolean] = js.native
  /** Today is default */
  var today: js.UndefOr[Boolean] = js.native
  /** Value */
  var value: js.UndefOr[CellValue] = js.native
  /**
    * Default: ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
    */
  var weekdays: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.native
  /**
    * Default: ["S", "M", "T", "W", "T", "F", "S"]
    */
  var weekdays_short: js.UndefOr[js.Tuple7[String, String, String, String, String, String, String]] = js.native
}

object CalendarOptions {
  @scala.inline
  def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  @scala.inline
  implicit class CalendarOptionsOps[Self <: CalendarOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setMonths(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setOnchange(value: js.Function): Self = this.set("onchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    @scala.inline
    def setOnclose(value: js.Function): Self = this.set("onclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    @scala.inline
    def setPlaceholder(value: CellValue): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setResetButton(value: Boolean): Self = this.set("resetButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetButton: Self = this.set("resetButton", js.undefined)
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setToday(value: Boolean): Self = this.set("today", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    @scala.inline
    def setValue(value: CellValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWeekdays(value: js.Tuple7[String, String, String, String, String, String, String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    @scala.inline
    def setWeekdays_short(value: js.Tuple7[String, String, String, String, String, String, String]): Self = this.set("weekdays_short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdays_short: Self = this.set("weekdays_short", js.undefined)
  }
  
}

