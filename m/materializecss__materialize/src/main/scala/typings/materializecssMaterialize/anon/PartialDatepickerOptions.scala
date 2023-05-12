package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Datepicker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.DatepickerOptions> */
trait PartialDatepickerOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[Element | Null] = js.undefined
  
  var defaultDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var disableDayFn: js.UndefOr[(js.Function1[/* day */ js.Date, Boolean]) | Null] = js.undefined
  
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  var firstDay: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[String | (js.Function1[/* d */ js.Date, String])] = js.undefined
  
  var i18n: js.UndefOr[PartialInternationalizati] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var maxDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var minDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var onClose: js.UndefOr[(js.ThisFunction0[/* this */ Datepicker, Unit]) | Null] = js.undefined
  
  var onDraw: js.UndefOr[(js.ThisFunction0[/* this */ Datepicker, Unit]) | Null] = js.undefined
  
  var onOpen: js.UndefOr[(js.ThisFunction0[/* this */ Datepicker, Unit]) | Null] = js.undefined
  
  var onSelect: js.UndefOr[
    (js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ js.Date, Unit]) | Null
  ] = js.undefined
  
  var parse: js.UndefOr[(js.Function2[/* value */ String, /* format */ String, js.Date]) | Null] = js.undefined
  
  var setDefaultDate: js.UndefOr[Boolean] = js.undefined
  
  var showClearBtn: js.UndefOr[Boolean] = js.undefined
  
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
  
  var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
  
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var yearRangeReverse: js.UndefOr[Boolean] = js.undefined
}
object PartialDatepickerOptions {
  
  inline def apply(): PartialDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatepickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDatepickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateNull: Self = StObject.set(x, "defaultDate", null)
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setDisableDayFn(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
    
    inline def setDisableDayFnNull: Self = StObject.set(x, "disableDayFn", null)
    
    inline def setDisableDayFnUndefined: Self = StObject.set(x, "disableDayFn", js.undefined)
    
    inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
    
    inline def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    inline def setFormat(value: String | (js.Function1[/* d */ js.Date, String])): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: /* d */ js.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setI18n(value: PartialInternationalizati): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setOnClose(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnDraw(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onDraw", value.asInstanceOf[js.Any])
    
    inline def setOnDrawNull: Self = StObject.set(x, "onDraw", null)
    
    inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    inline def setOnOpen(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    inline def setOnOpenNull: Self = StObject.set(x, "onOpen", null)
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnSelect(value: js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ js.Date, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectNull: Self = StObject.set(x, "onSelect", null)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setParse(value: (/* value */ String, /* format */ String) => js.Date): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseNull: Self = StObject.set(x, "parse", null)
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultDateUndefined: Self = StObject.set(x, "setDefaultDate", js.undefined)
    
    inline def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    inline def setShowClearBtnUndefined: Self = StObject.set(x, "showClearBtn", js.undefined)
    
    inline def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    inline def setShowDaysInNextAndPreviousMonthsUndefined: Self = StObject.set(x, "showDaysInNextAndPreviousMonths", js.undefined)
    
    inline def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    inline def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
    
    inline def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    inline def setYearRangeReverse(value: Boolean): Self = StObject.set(x, "yearRangeReverse", value.asInstanceOf[js.Any])
    
    inline def setYearRangeReverseUndefined: Self = StObject.set(x, "yearRangeReverse", js.undefined)
    
    inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    inline def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value*))
  }
}
