package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TimePickerAnimation] = js.native
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, Unit]] = js.native
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, Unit]] = js.native
  var culture: js.UndefOr[String] = js.native
  var dateInput: js.UndefOr[Boolean] = js.native
  var dates: js.UndefOr[js.Any] = js.native
  var format: js.UndefOr[String] = js.native
  var interval: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Date] = js.native
  var min: js.UndefOr[Date] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, Unit]] = js.native
  var parseFormats: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[Date] = js.native
}

object TimePickerOptions {
  @scala.inline
  def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  @scala.inline
  implicit class TimePickerOptionsOps[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | TimePickerAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setChange(value: /* e */ TimePickerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClose(value: /* e */ TimePickerCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDateInput(value: Boolean): Self = this.set("dateInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateInput: Self = this.set("dateInput", js.undefined)
    @scala.inline
    def setDates(value: js.Any): Self = this.set("dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDates: Self = this.set("dates", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ TimePickerOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setParseFormats(value: js.Any): Self = this.set("parseFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseFormats: Self = this.set("parseFormats", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

