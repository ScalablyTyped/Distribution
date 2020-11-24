package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangePickerOptions extends js.Object {
  
  var ARIATemplate: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ DateRangePickerChangeEvent, Unit]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ DateRangePickerCloseEvent, Unit]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var dates: js.UndefOr[js.Any] = js.native
  
  var depth: js.UndefOr[String] = js.native
  
  var disableDates: js.UndefOr[js.Any | js.Function] = js.native
  
  var footer: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Date] = js.native
  
  var messages: js.UndefOr[DateRangePickerMessages] = js.native
  
  var min: js.UndefOr[Date] = js.native
  
  var month: js.UndefOr[DateRangePickerMonth] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ DateRangePickerOpenEvent, Unit]] = js.native
  
  var range: js.UndefOr[DateRangePickerRange] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var weekNumber: js.UndefOr[Boolean] = js.native
}
object DateRangePickerOptions {
  
  @scala.inline
  def apply(): DateRangePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerOptions]
  }
  
  @scala.inline
  implicit class DateRangePickerOptionsOps[Self <: DateRangePickerOptions] (val x: Self) extends AnyVal {
    
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
    def setARIATemplate(value: String): Self = this.set("ARIATemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARIATemplate: Self = this.set("ARIATemplate", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DateRangePickerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ DateRangePickerCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setDates(value: js.Any): Self = this.set("dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDates: Self = this.set("dates", js.undefined)
    
    @scala.inline
    def setDepth(value: String): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDisableDates(value: js.Any | js.Function): Self = this.set("disableDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDates: Self = this.set("disableDates", js.undefined)
    
    @scala.inline
    def setFooter(value: String | js.Function): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessages(value: DateRangePickerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMonth(value: DateRangePickerMonth): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ DateRangePickerOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setRange(value: DateRangePickerRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
  }
}
