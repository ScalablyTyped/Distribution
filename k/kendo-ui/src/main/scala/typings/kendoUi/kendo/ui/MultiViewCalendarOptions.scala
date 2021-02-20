package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiViewCalendarOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var dates: js.UndefOr[js.Any] = js.native
  
  var depth: js.UndefOr[String] = js.native
  
  var disableDates: js.UndefOr[js.Any | js.Function] = js.native
  
  var footer: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Date] = js.native
  
  var messages: js.UndefOr[MultiViewCalendarMessages] = js.native
  
  var min: js.UndefOr[Date] = js.native
  
  var month: js.UndefOr[MultiViewCalendarMonth] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ MultiViewCalendarEvent, Unit]] = js.native
  
  var range: js.UndefOr[MultiViewCalendarRange] = js.native
  
  var selectDates: js.UndefOr[js.Any] = js.native
  
  var selectable: js.UndefOr[String] = js.native
  
  var showViewHeader: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Date] = js.native
  
  var views: js.UndefOr[Double] = js.native
  
  var weekNumber: js.UndefOr[Boolean] = js.native
}
object MultiViewCalendarOptions {
  
  @scala.inline
  def apply(): MultiViewCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiViewCalendarOptions]
  }
  
  @scala.inline
  implicit class MultiViewCalendarOptionsMutableBuilder[Self <: MultiViewCalendarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ MultiViewCalendarEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
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
    def setFooter(value: String | js.Function): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
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
    def setMessages(value: MultiViewCalendarMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMonth(value: MultiViewCalendarMonth): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ MultiViewCalendarEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setRange(value: MultiViewCalendarRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSelectDates(value: js.Any): Self = StObject.set(x, "selectDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectDatesUndefined: Self = StObject.set(x, "selectDates", js.undefined)
    
    @scala.inline
    def setSelectable(value: String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShowViewHeader(value: Boolean): Self = StObject.set(x, "showViewHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowViewHeaderUndefined: Self = StObject.set(x, "showViewHeader", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
