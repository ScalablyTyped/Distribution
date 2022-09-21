package typings.materializeCss.M

import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatepickerOptions extends StObject {
  
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: Boolean
  
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: Element | Null
  
  /**
    * The initial date to view when first opened.
    * @default null
    */
  var defaultDate: js.Date | Null
  
  /**
    * Custom function to disable certain days.
    * @default null
    */
  var disableDayFn: (js.Function1[/* day */ js.Date, Boolean]) | Null
  
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: Boolean
  
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[String]
  
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: Double
  
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: String
  
  /**
    * Internationalization options
    */
  var i18n: Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ Any
  ]
  
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: Boolean
  
  /**
    * The latest date that can be selected.
    * @default null
    */
  var maxDate: js.Date | Null
  
  /**
    * The earliest date that can be selected.
    * @default null
    */
  var minDate: js.Date | Null
  
  /**
    * Callback function when Datepicker is closed
    * @default null
    */
  var onClose: (js.ThisFunction0[/* this */ Datepicker, Unit]) | Null
  
  /**
    * Callback function when Datepicker HTML is refreshed
    * @default null
    */
  var onDraw: (js.ThisFunction0[/* this */ Datepicker, Unit]) | Null
  
  /**
    * Callback function when Datepicker is opened
    * @default null
    */
  var onOpen: (js.ThisFunction0[/* this */ Datepicker, Unit]) | Null
  
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    * @default null
    */
  var onSelect: (js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ js.Date, Unit]) | Null
  
  /**
    * Used to create date object from current input string.
    * @default null
    */
  var parse: (js.Function2[/* value */ String, /* format */ String, js.Date]) | Null
  
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: Boolean
  
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: Boolean
  
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: Boolean
  
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: Boolean
  
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: Double | js.Array[Double]
}
object DatepickerOptions {
  
  inline def apply(
    autoClose: Boolean,
    disableWeekends: Boolean,
    events: js.Array[String],
    firstDay: Double,
    format: String,
    i18n: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ Any
    ],
    isRTL: Boolean,
    setDefaultDate: Boolean,
    showClearBtn: Boolean,
    showDaysInNextAndPreviousMonths: Boolean,
    showMonthAfterYear: Boolean,
    yearRange: Double | js.Array[Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disableWeekends = disableWeekends.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], setDefaultDate = setDefaultDate.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths.asInstanceOf[js.Any], showMonthAfterYear = showMonthAfterYear.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any], container = null, defaultDate = null, disableDayFn = null, maxDate = null, minDate = null, onClose = null, onDraw = null, onOpen = null, onSelect = null, parse = null)
    __obj.asInstanceOf[DatepickerOptions]
  }
  
  extension [Self <: DatepickerOptions](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateNull: Self = StObject.set(x, "defaultDate", null)
    
    inline def setDisableDayFn(value: /* day */ js.Date => Boolean): Self = StObject.set(x, "disableDayFn", js.Any.fromFunction1(value))
    
    inline def setDisableDayFnNull: Self = StObject.set(x, "disableDayFn", null)
    
    inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setI18n(
      value: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ Any
        ]
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
    
    inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
    
    inline def setOnClose(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnDraw(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onDraw", value.asInstanceOf[js.Any])
    
    inline def setOnDrawNull: Self = StObject.set(x, "onDraw", null)
    
    inline def setOnOpen(value: js.ThisFunction0[/* this */ Datepicker, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    inline def setOnOpenNull: Self = StObject.set(x, "onOpen", null)
    
    inline def setOnSelect(value: js.ThisFunction1[/* this */ Datepicker, /* selectedDate */ js.Date, Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectNull: Self = StObject.set(x, "onSelect", null)
    
    inline def setParse(value: (/* value */ String, /* format */ String) => js.Date): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setParseNull: Self = StObject.set(x, "parse", null)
    
    inline def setSetDefaultDate(value: Boolean): Self = StObject.set(x, "setDefaultDate", value.asInstanceOf[js.Any])
    
    inline def setShowClearBtn(value: Boolean): Self = StObject.set(x, "showClearBtn", value.asInstanceOf[js.Any])
    
    inline def setShowDaysInNextAndPreviousMonths(value: Boolean): Self = StObject.set(x, "showDaysInNextAndPreviousMonths", value.asInstanceOf[js.Any])
    
    inline def setShowMonthAfterYear(value: Boolean): Self = StObject.set(x, "showMonthAfterYear", value.asInstanceOf[js.Any])
    
    inline def setYearRange(value: Double | js.Array[Double]): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
    
    inline def setYearRangeVarargs(value: Double*): Self = StObject.set(x, "yearRange", js.Array(value*))
  }
}
