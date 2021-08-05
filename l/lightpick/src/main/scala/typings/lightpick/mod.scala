package typings.lightpick

import typings.lightpick.anon.PartialPluralizeFnLocale
import typings.lightpick.mod.Options.DayOfWeek
import typings.lightpick.mod.Options.Dropdowns
import typings.lightpick.mod.Options.Dropdowns.Years
import typings.lightpick.mod.Options.Field
import typings.lightpick.mod.Options.Locale
import typings.lightpick.mod.Options.Locale.Buttons
import typings.lightpick.mod.Options.Locale.PluralizeFn
import typings.lightpick.mod.Options.OnCloseFn
import typings.lightpick.mod.Options.OnErrorFn
import typings.lightpick.mod.Options.OnMonthsChangeFn
import typings.lightpick.mod.Options.OnOpenFn
import typings.lightpick.mod.Options.OnSelectFn
import typings.lightpick.mod.Options.OnSelectStartEndFn
import typings.lightpick.mod.Options.OnYearsChangeFn
import typings.lightpick.mod.Options.Orientation
import typings.lightpick.mod.Options.WeekdayStyle
import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lightpick", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Lightpick {
    def this(options: Options) = this()
  }
  
  type DisabledDate = InputDate | InputDateRange
  
  type FormatSpecification = MomentFormatSpecification
  
  type InputDate = MomentInput | Null
  
  type InputDateRange = js.Tuple2[InputDate, InputDate]
  
  @js.native
  trait Lightpick extends StObject {
    
    /**
      * Hide the picker and remove all event listeners.
      */
    def destroy(): Unit = js.native
    
    /**
      * The calendar containing HTML element.
      */
    val el: HTMLElement = js.native
    
    /**
      * Return current date as moment object.
      */
    def getDate(): OutputDate = js.native
    
    /**
      * Return current end of date range as moment object.
      */
    def getEndDate(): OutputDate = js.native
    
    /**
      * Return current start of date range as moment object.
      */
    def getStartDate(): OutputDate = js.native
    
    def gotoDate(): Unit = js.native
    def gotoDate(date: InputDate): Unit = js.native
    
    def gotoMonth(month: Double): Unit = js.native
    
    def gotoToday(): Unit = js.native
    
    def gotoYear(year: Double): Unit = js.native
    
    /**
      * Hide the picker.
      */
    def hide(): Unit = js.native
    
    /**
      * Tells whether the picker is currently visible or not.
      * Visibility can be changed with show() / hide() methods.
      */
    val isShowing: Boolean = js.native
    
    def nextMonth(): Unit = js.native
    
    def prevMonth(): Unit = js.native
    
    /**
      * Update picker options.
      */
    def reloadOptions(options: Options): Unit = js.native
    
    def reset(): Unit = js.native
    
    /**
      * Set date when singleDate is true.
      */
    def setDate(): Unit = js.native
    def setDate(date: Unit, preventOnSelect: Boolean): Unit = js.native
    def setDate(date: InputDate): Unit = js.native
    def setDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
    
    /**
      * Set date range.
      */
    def setDateRange(): Unit = js.native
    def setDateRange(start: Unit, end: Unit, preventOnSelect: Boolean): Unit = js.native
    def setDateRange(start: Unit, end: InputDate): Unit = js.native
    def setDateRange(start: Unit, end: InputDate, preventOnSelect: Boolean): Unit = js.native
    def setDateRange(start: InputDate): Unit = js.native
    def setDateRange(start: InputDate, end: Unit, preventOnSelect: Boolean): Unit = js.native
    def setDateRange(start: InputDate, end: InputDate): Unit = js.native
    def setDateRange(start: InputDate, end: InputDate, preventOnSelect: Boolean): Unit = js.native
    
    def setDisableDates(dates: js.Array[DisabledDate]): Unit = js.native
    
    def setEndDate(): Unit = js.native
    def setEndDate(date: Unit, preventOnSelect: Boolean): Unit = js.native
    def setEndDate(date: InputDate): Unit = js.native
    def setEndDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
    
    def setStartDate(): Unit = js.native
    def setStartDate(date: Unit, preventOnSelect: Boolean): Unit = js.native
    def setStartDate(date: InputDate): Unit = js.native
    def setStartDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
    
    /**
      * Make the picker visible.
      */
    def show(): Unit = js.native
    
    /**
      * Returns the date in a string format.
      */
    def toString(format: FormatSpecification): String = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Close calendar when picked date/range.
      */
    var autoclose: js.UndefOr[Boolean] = js.undefined
    
    var disableDates: js.UndefOr[js.Array[DisabledDate]] = js.undefined
    
    /**
      * Disable Saturday and Sunday.
      */
    var disableWeekends: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `false` then will reset selected range when disabled dates exists in selected range.
      */
    var disabledDatesInRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dropdown selections for years, months. Can be false for disable both dropdowns.
      */
    var dropdowns: js.UndefOr[Boolean | Dropdowns] = js.undefined
    
    var endDate: js.UndefOr[InputDate] = js.undefined
    
    /**
      * Bind the datepicker to a form field.
      */
    var field: Field
    
    /**
      * ISO day of the week.
      */
    var firstDay: js.UndefOr[DayOfWeek] = js.undefined
    
    /**
      * Footer calendar, if set to `true` will use default footer (Reset/Apply buttons) or custom string (html).
      */
    var footer: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * The default output format.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Close calendar when clicked outside the elements specified in field or parentEl. Recommended use when autoclose is set to false.
      */
    var hideOnBodyClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show tooltip.
      */
    var hoveringTooltip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show calendar inline. If true and parentEl is not provided then will use parentNode of field.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Language code for names of days, months by Date.prototype.toLocaleString(). 'auto' will try detect user browser language.
      */
    var lang: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    /**
      * The maximum/latest date that can be selected.
      */
    var maxDate: js.UndefOr[InputDate] = js.undefined
    
    /**
      * The maximum days of the selected range.
      */
    var maxDays: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum/earliest date that can be selected.
      */
    var minDate: js.UndefOr[InputDate] = js.undefined
    
    /**
      * The minimum days of the selected range.
      */
    var minDays: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of columns months.
      */
    var numberOfColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of visible months.
      */
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    /**
      * Triggered when calendar has been closed.
      */
    var onClose: js.UndefOr[OnCloseFn] = js.undefined
    
    var onError: js.UndefOr[OnErrorFn] = js.undefined
    
    /**
      * Triggered when the months select is changed.
      */
    var onMonthsChange: js.UndefOr[OnMonthsChangeFn] = js.undefined
    
    /**
      * Triggered when calendar has been opened.
      */
    var onOpen: js.UndefOr[OnOpenFn] = js.undefined
    
    /**
      * Triggered when either date / start date or end date has been changed.
      */
    var onSelect: js.UndefOr[OnSelectFn] = js.undefined
    
    /**
      * Triggered when end date has been changed.
      */
    var onSelectEnd: js.UndefOr[OnSelectStartEndFn] = js.undefined
    
    /**
      * Triggered when start date has been changed.
      */
    var onSelectStart: js.UndefOr[OnSelectStartEndFn] = js.undefined
    
    /**
      * Triggered when the years select is changed.
      */
    var onYearsChange: js.UndefOr[OnYearsChangeFn] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    /**
      * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
      */
    var parentEl: js.UndefOr[String | Node] = js.undefined
    
    /**
      * Repick start/end instead of new range. This option working only when exists `secondField`.
      */
    var repick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If exists then end of date range will set here.
      */
    var secondField: js.UndefOr[Field] = js.undefined
    
    /**
      * Select second date before the first selected date.
      */
    var selectBackward: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select second date after the first selected date.
      */
    var selectForward: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Separator between dates when one field.
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Choose a single date instead of a date range.
      */
    var singleDate: js.UndefOr[Boolean] = js.undefined
    
    var startDate: js.UndefOr[InputDate] = js.undefined
    
    /**
      * Calc date range in nights. (For hotels when last date doesn't include to range.)
      */
    var tooltipNights: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines the weekday display style.
      * Two weekdays may have the same narrow style for some locales (e.g. Tuesday's narrow style is also T).
      */
    var weekdayStyle: js.UndefOr[WeekdayStyle] = js.undefined
  }
  object Options {
    
    inline def apply(field: Field): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.lightpick.lightpickNumbers.`1`
      - typings.lightpick.lightpickNumbers.`2`
      - typings.lightpick.lightpickNumbers.`3`
      - typings.lightpick.lightpickNumbers.`4`
      - typings.lightpick.lightpickNumbers.`5`
      - typings.lightpick.lightpickNumbers.`6`
      - typings.lightpick.lightpickNumbers.`7`
    */
    trait DayOfWeek extends StObject
    object DayOfWeek {
      
      inline def `1`: typings.lightpick.lightpickNumbers.`1` = 1.asInstanceOf[typings.lightpick.lightpickNumbers.`1`]
      
      inline def `2`: typings.lightpick.lightpickNumbers.`2` = 2.asInstanceOf[typings.lightpick.lightpickNumbers.`2`]
      
      inline def `3`: typings.lightpick.lightpickNumbers.`3` = 3.asInstanceOf[typings.lightpick.lightpickNumbers.`3`]
      
      inline def `4`: typings.lightpick.lightpickNumbers.`4` = 4.asInstanceOf[typings.lightpick.lightpickNumbers.`4`]
      
      inline def `5`: typings.lightpick.lightpickNumbers.`5` = 5.asInstanceOf[typings.lightpick.lightpickNumbers.`5`]
      
      inline def `6`: typings.lightpick.lightpickNumbers.`6` = 6.asInstanceOf[typings.lightpick.lightpickNumbers.`6`]
      
      inline def `7`: typings.lightpick.lightpickNumbers.`7` = 7.asInstanceOf[typings.lightpick.lightpickNumbers.`7`]
    }
    
    trait Dropdowns extends StObject {
      
      /**
        * true/false for enable/disable dropdown of months.
        */
      var months: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Can be false for disable dropdown of years.
        */
      var years: js.UndefOr[Boolean | Years] = js.undefined
    }
    object Dropdowns {
      
      inline def apply(): Dropdowns = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dropdowns]
      }
      
      extension [Self <: Dropdowns](x: Self) {
        
        inline def setMonths(value: Boolean): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
        
        inline def setYears(value: Boolean | Years): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
        
        inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
      }
      
      trait Years extends StObject {
        
        var max: js.UndefOr[Double] = js.undefined
        
        var min: js.UndefOr[Double] = js.undefined
      }
      object Years {
        
        inline def apply(): Years = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Years]
        }
        
        extension [Self <: Years](x: Self) {
          
          inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
          
          inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
          
          inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
          
          inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        }
      }
    }
    
    @js.native
    trait Field
      extends StObject
         with Element {
      
      var value: String = js.native
    }
    
    trait Locale extends StObject {
      
      /**
        * Text for buttons.
        */
      var buttons: js.UndefOr[Buttons] = js.undefined
      
      var pluralize: js.UndefOr[PluralizeFn] = js.undefined
      
      /**
        * Text for tooltip.
        */
      var tooltip: js.UndefOr[PartialPluralizeFnLocale] = js.undefined
      
      /**
        * Show tooltip text on disabled dates. (Eg. «Already booked»)
        */
      var tooltipOnDisabled: js.UndefOr[String] = js.undefined
    }
    object Locale {
      
      inline def apply(): Locale = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Locale]
      }
      
      trait Buttons extends StObject {
        
        @JSName("apply")
        var apply: js.UndefOr[String] = js.undefined
        
        var close: js.UndefOr[String] = js.undefined
        
        var next: js.UndefOr[String] = js.undefined
        
        var prev: js.UndefOr[String] = js.undefined
        
        var reset: js.UndefOr[String] = js.undefined
      }
      object Buttons {
        
        inline def apply(): Buttons = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Buttons]
        }
        
        extension [Self <: Buttons](x: Self) {
          
          inline def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
          
          inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
          
          inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
          
          inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
          
          inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
          
          inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
          
          inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
          
          inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
          
          inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
          
          inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
        }
      }
      
      extension [Self <: Locale](x: Self) {
        
        inline def setButtons(value: Buttons): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
        
        inline def setPluralize(value: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => String): Self = StObject.set(x, "pluralize", js.Any.fromFunction2(value))
        
        inline def setPluralizeUndefined: Self = StObject.set(x, "pluralize", js.undefined)
        
        inline def setTooltip(value: PartialPluralizeFnLocale): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        inline def setTooltipOnDisabled(value: String): Self = StObject.set(x, "tooltipOnDisabled", value.asInstanceOf[js.Any])
        
        inline def setTooltipOnDisabledUndefined: Self = StObject.set(x, "tooltipOnDisabled", js.undefined)
        
        inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
      
      /**
        * Function for calc plural text. More examples for another locales on betsol/numerous.
        *
        * @see https://github.com/betsol/numerous/tree/master/locales
        */
      type PluralizeFn = js.Function2[/* i */ String | Double, /* locale */ PluralizeFnLocale, String]
      
      trait PluralizeFnLocale extends StObject {
        
        var one: String
        
        var other: String
      }
      object PluralizeFnLocale {
        
        inline def apply(one: String, other: String): PluralizeFnLocale = {
          val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
          __obj.asInstanceOf[PluralizeFnLocale]
        }
        
        extension [Self <: PluralizeFnLocale](x: Self) {
          
          inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
          
          inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * Callback function for when the picker is hidden.
      */
    type OnCloseFn = js.ThisFunction0[/* this */ Lightpick, Unit]
    
    type OnErrorFn = js.ThisFunction1[/* this */ Lightpick, /* message */ String, Unit]
    
    /**
      * Callback function for when the months select is changed.
      */
    type OnMonthsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* month */ Double, Unit]
    
    /**
      * Callback function for when the picker becomes visible.
      */
    type OnOpenFn = js.ThisFunction0[/* this */ Lightpick, Unit]
    
    /**
      * Callback function for when a date is selected.
      */
    type OnSelectFn = js.ThisFunction2[/* this */ Lightpick, /* startDate */ OutputDate, /* endDate */ OutputDate, Unit]
    
    /**
      * Callback function for when either a start or an end date is selected.
      */
    type OnSelectStartEndFn = js.ThisFunction1[/* this */ Lightpick, /* date */ OutputDate, Unit]
    
    /**
      * Callback function for when the years select is changed.
      */
    type OnYearsChangeFn = js.ThisFunction1[/* this */ Lightpick, /* year */ Double, Unit]
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
      
      inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
      
      inline def setDisableDates(value: js.Array[DisabledDate]): Self = StObject.set(x, "disableDates", value.asInstanceOf[js.Any])
      
      inline def setDisableDatesUndefined: Self = StObject.set(x, "disableDates", js.undefined)
      
      inline def setDisableDatesVarargs(value: DisabledDate*): Self = StObject.set(x, "disableDates", js.Array(value :_*))
      
      inline def setDisableWeekends(value: Boolean): Self = StObject.set(x, "disableWeekends", value.asInstanceOf[js.Any])
      
      inline def setDisableWeekendsUndefined: Self = StObject.set(x, "disableWeekends", js.undefined)
      
      inline def setDisabledDatesInRange(value: Boolean): Self = StObject.set(x, "disabledDatesInRange", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesInRangeUndefined: Self = StObject.set(x, "disabledDatesInRange", js.undefined)
      
      inline def setDropdowns(value: Boolean | Dropdowns): Self = StObject.set(x, "dropdowns", value.asInstanceOf[js.Any])
      
      inline def setDropdownsUndefined: Self = StObject.set(x, "dropdowns", js.undefined)
      
      inline def setEndDate(value: InputDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEndDateVarargs(value: (Double | String)*): Self = StObject.set(x, "endDate", js.Array(value :_*))
      
      inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFirstDay(value: DayOfWeek): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
      
      inline def setFirstDayUndefined: Self = StObject.set(x, "firstDay", js.undefined)
      
      inline def setFooter(value: Boolean | String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHideOnBodyClick(value: Boolean): Self = StObject.set(x, "hideOnBodyClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnBodyClickUndefined: Self = StObject.set(x, "hideOnBodyClick", js.undefined)
      
      inline def setHoveringTooltip(value: Boolean): Self = StObject.set(x, "hoveringTooltip", value.asInstanceOf[js.Any])
      
      inline def setHoveringTooltipUndefined: Self = StObject.set(x, "hoveringTooltip", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: InputDate): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateNull: Self = StObject.set(x, "maxDate", null)
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDateVarargs(value: (Double | String)*): Self = StObject.set(x, "maxDate", js.Array(value :_*))
      
      inline def setMaxDays(value: Double): Self = StObject.set(x, "maxDays", value.asInstanceOf[js.Any])
      
      inline def setMaxDaysUndefined: Self = StObject.set(x, "maxDays", js.undefined)
      
      inline def setMinDate(value: InputDate): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateNull: Self = StObject.set(x, "minDate", null)
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinDateVarargs(value: (Double | String)*): Self = StObject.set(x, "minDate", js.Array(value :_*))
      
      inline def setMinDays(value: Double): Self = StObject.set(x, "minDays", value.asInstanceOf[js.Any])
      
      inline def setMinDaysUndefined: Self = StObject.set(x, "minDays", js.undefined)
      
      inline def setNumberOfColumns(value: Double): Self = StObject.set(x, "numberOfColumns", value.asInstanceOf[js.Any])
      
      inline def setNumberOfColumnsUndefined: Self = StObject.set(x, "numberOfColumns", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnClose(value: OnCloseFn): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: OnErrorFn): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnMonthsChange(value: OnMonthsChangeFn): Self = StObject.set(x, "onMonthsChange", value.asInstanceOf[js.Any])
      
      inline def setOnMonthsChangeUndefined: Self = StObject.set(x, "onMonthsChange", js.undefined)
      
      inline def setOnOpen(value: OnOpenFn): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSelect(value: OnSelectFn): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectEnd(value: OnSelectStartEndFn): Self = StObject.set(x, "onSelectEnd", value.asInstanceOf[js.Any])
      
      inline def setOnSelectEndUndefined: Self = StObject.set(x, "onSelectEnd", js.undefined)
      
      inline def setOnSelectStart(value: OnSelectStartEndFn): Self = StObject.set(x, "onSelectStart", value.asInstanceOf[js.Any])
      
      inline def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnYearsChange(value: OnYearsChangeFn): Self = StObject.set(x, "onYearsChange", value.asInstanceOf[js.Any])
      
      inline def setOnYearsChangeUndefined: Self = StObject.set(x, "onYearsChange", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setParentEl(value: String | Node): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
      
      inline def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
      
      inline def setRepick(value: Boolean): Self = StObject.set(x, "repick", value.asInstanceOf[js.Any])
      
      inline def setRepickUndefined: Self = StObject.set(x, "repick", js.undefined)
      
      inline def setSecondField(value: Field): Self = StObject.set(x, "secondField", value.asInstanceOf[js.Any])
      
      inline def setSecondFieldUndefined: Self = StObject.set(x, "secondField", js.undefined)
      
      inline def setSelectBackward(value: Boolean): Self = StObject.set(x, "selectBackward", value.asInstanceOf[js.Any])
      
      inline def setSelectBackwardUndefined: Self = StObject.set(x, "selectBackward", js.undefined)
      
      inline def setSelectForward(value: Boolean): Self = StObject.set(x, "selectForward", value.asInstanceOf[js.Any])
      
      inline def setSelectForwardUndefined: Self = StObject.set(x, "selectForward", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSingleDate(value: Boolean): Self = StObject.set(x, "singleDate", value.asInstanceOf[js.Any])
      
      inline def setSingleDateUndefined: Self = StObject.set(x, "singleDate", js.undefined)
      
      inline def setStartDate(value: InputDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setStartDateVarargs(value: (Double | String)*): Self = StObject.set(x, "startDate", js.Array(value :_*))
      
      inline def setTooltipNights(value: Boolean): Self = StObject.set(x, "tooltipNights", value.asInstanceOf[js.Any])
      
      inline def setTooltipNightsUndefined: Self = StObject.set(x, "tooltipNights", js.undefined)
      
      inline def setWeekdayStyle(value: WeekdayStyle): Self = StObject.set(x, "weekdayStyle", value.asInstanceOf[js.Any])
      
      inline def setWeekdayStyleUndefined: Self = StObject.set(x, "weekdayStyle", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.lightpick.lightpickStrings.auto
      - typings.lightpick.lightpickStrings.left
      - typings.lightpick.lightpickStrings.right
      - typings.lightpick.lightpickStrings.top
      - typings.lightpick.lightpickStrings.bottom
      - typings.lightpick.lightpickStrings.`top left`
      - typings.lightpick.lightpickStrings.`top right`
      - typings.lightpick.lightpickStrings.`bottom left`
      - typings.lightpick.lightpickStrings.`bottom right`
    */
    trait Orientation extends StObject
    object Orientation {
      
      inline def auto: typings.lightpick.lightpickStrings.auto = "auto".asInstanceOf[typings.lightpick.lightpickStrings.auto]
      
      inline def bottom: typings.lightpick.lightpickStrings.bottom = "bottom".asInstanceOf[typings.lightpick.lightpickStrings.bottom]
      
      inline def `bottom left`: typings.lightpick.lightpickStrings.`bottom left` = ("bottom left").asInstanceOf[typings.lightpick.lightpickStrings.`bottom left`]
      
      inline def `bottom right`: typings.lightpick.lightpickStrings.`bottom right` = ("bottom right").asInstanceOf[typings.lightpick.lightpickStrings.`bottom right`]
      
      inline def left: typings.lightpick.lightpickStrings.left = "left".asInstanceOf[typings.lightpick.lightpickStrings.left]
      
      inline def right: typings.lightpick.lightpickStrings.right = "right".asInstanceOf[typings.lightpick.lightpickStrings.right]
      
      inline def top: typings.lightpick.lightpickStrings.top = "top".asInstanceOf[typings.lightpick.lightpickStrings.top]
      
      inline def `top left`: typings.lightpick.lightpickStrings.`top left` = ("top left").asInstanceOf[typings.lightpick.lightpickStrings.`top left`]
      
      inline def `top right`: typings.lightpick.lightpickStrings.`top right` = ("top right").asInstanceOf[typings.lightpick.lightpickStrings.`top right`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.lightpick.lightpickStrings.long
      - typings.lightpick.lightpickStrings.short
      - typings.lightpick.lightpickStrings.narrow
    */
    trait WeekdayStyle extends StObject
    object WeekdayStyle {
      
      inline def long: typings.lightpick.lightpickStrings.long = "long".asInstanceOf[typings.lightpick.lightpickStrings.long]
      
      inline def narrow: typings.lightpick.lightpickStrings.narrow = "narrow".asInstanceOf[typings.lightpick.lightpickStrings.narrow]
      
      inline def short: typings.lightpick.lightpickStrings.short = "short".asInstanceOf[typings.lightpick.lightpickStrings.short]
    }
  }
  
  type OutputDate = Moment | Null
}
