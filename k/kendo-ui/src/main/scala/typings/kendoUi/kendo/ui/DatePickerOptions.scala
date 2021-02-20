package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerOptions extends StObject {
  
  var ARIATemplate: js.UndefOr[String] = js.native
  
  var animation: js.UndefOr[Boolean | DatePickerAnimation] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ DatePickerChangeEvent, Unit]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ DatePickerCloseEvent, Unit]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var dateInput: js.UndefOr[Boolean] = js.native
  
  var dates: js.UndefOr[js.Any] = js.native
  
  var depth: js.UndefOr[String] = js.native
  
  var disableDates: js.UndefOr[js.Any | js.Function] = js.native
  
  var footer: js.UndefOr[Boolean | String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Date] = js.native
  
  var min: js.UndefOr[Date] = js.native
  
  var month: js.UndefOr[DatePickerMonth] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ DatePickerOpenEvent, Unit]] = js.native
  
  var parseFormats: js.UndefOr[js.Any] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Date] = js.native
  
  var weekNumber: js.UndefOr[Boolean] = js.native
}
object DatePickerOptions {
  
  @scala.inline
  def apply(): DatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerOptions]
  }
  
  @scala.inline
  implicit class DatePickerOptionsMutableBuilder[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARIATemplate(value: String): Self = StObject.set(x, "ARIATemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARIATemplateUndefined: Self = StObject.set(x, "ARIATemplate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | DatePickerAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DatePickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ DatePickerCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDateInput(value: Boolean): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    @scala.inline
    def setDates(value: js.Any): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    @scala.inline
    def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setDisableDates(value: js.Any | js.Function): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean | String | js.Function): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMonth(value: DatePickerMonth): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ DatePickerOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setParseFormats(value: js.Any): Self = StObject.set(x, "parseFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFormatsUndefined: Self = StObject.set(x, "parseFormats", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
