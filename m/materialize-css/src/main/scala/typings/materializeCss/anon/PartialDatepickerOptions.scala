package typings.materializeCss.anon

import typings.materializeCss.M.Datepicker
import typings.std.Date
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.DatepickerOptions> */
trait PartialDatepickerOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[Element] = js.undefined
  
  var defaultDate: js.UndefOr[Date] = js.undefined
  
  var disableDayFn: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.undefined
  
  var disableWeekends: js.UndefOr[Boolean] = js.undefined
  
  var events: js.UndefOr[js.Array[String]] = js.undefined
  
  var firstDay: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var i18n: js.UndefOr[
    Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ js.Any
    ]
  ] = js.undefined
  
  var isRTL: js.UndefOr[Boolean] = js.undefined
  
  var maxDate: js.UndefOr[Date] = js.undefined
  
  var minDate: js.UndefOr[Date] = js.undefined
  
  var onClose: js.UndefOr[js.ThisFunction0[/* this */ Datepicker, Unit]] = js.undefined
  
  var onDraw: js.UndefOr[js.ThisFunction0[/* this */ Datepicker, Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.ThisFunction0[/* this */ Datepicker, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ Date, Unit]] = js.undefined
  
  var parse: js.UndefOr[js.Function2[/* value */ String, /* format */ String, Date]] = js.undefined
  
  var setDefaultDate: js.UndefOr[Boolean] = js.undefined
  
  var showClearBtn: js.UndefOr[Boolean] = js.undefined
  
  var showDaysInNextAndPreviousMonths: js.UndefOr[Boolean] = js.undefined
  
  var showMonthAfterYear: js.UndefOr[Boolean] = js.undefined
  
  var yearRange: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object PartialDatepickerOptions {
  
  @scala.inline
  def apply(): PartialDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatepickerOptions]
  }
  
  @scala.inline
  implicit class PartialDatepickerOptionsMutableBuilder[Self <: PartialDatepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    @scala.inline
    def setDisableDayFn(value: /* day */ Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableDayFnUndefined: Self = StObject.set(x, "disableDayFn", js.undefined)
    
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ js.Any
        ]
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setOnClose(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnDraw(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ Date, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setParse(value: (/* value */ String, /* format */ String) => Date): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultDateUndefined: Self = StObject.set(x, "setDefaultDate", js.undefined)
    
    @scala.inline
    def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearBtnUndefined: Self = StObject.set(x, "showClearBtn", js.undefined)
    
    @scala.inline
    def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDaysInNextAndPreviousMonthsUndefined: Self = StObject.set(x, "showDaysInNextAndPreviousMonths", js.undefined)
    
    @scala.inline
    def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMonthAfterYearUndefined: Self = StObject.set(x, "showMonthAfterYear", js.undefined)
    
    @scala.inline
    def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    
    @scala.inline
    def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value :_*))
  }
}
