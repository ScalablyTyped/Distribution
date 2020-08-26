package typings.lightpick.mod

import typings.lightpick.mod.Options.DayOfWeek
import typings.lightpick.mod.Options.Dropdowns
import typings.lightpick.mod.Options.Field
import typings.lightpick.mod.Options.Locale
import typings.lightpick.mod.Options.OnCloseFn
import typings.lightpick.mod.Options.OnErrorFn
import typings.lightpick.mod.Options.OnMonthsChangeFn
import typings.lightpick.mod.Options.OnOpenFn
import typings.lightpick.mod.Options.OnSelectFn
import typings.lightpick.mod.Options.OnSelectStartEndFn
import typings.lightpick.mod.Options.OnYearsChangeFn
import typings.lightpick.mod.Options.Orientation
import typings.lightpick.mod.Options.WeekdayStyle
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options_ extends js.Object {
  /**
    * Close calendar when picked date/range.
    */
  var autoclose: js.UndefOr[Boolean] = js.native
  var disableDates: js.UndefOr[js.Array[DisabledDate]] = js.native
  /**
    * Disable Saturday and Sunday.
    */
  var disableWeekends: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false` then will reset selected range when disabled dates exists in selected range.
    */
  var disabledDatesInRange: js.UndefOr[Boolean] = js.native
  /**
    * Dropdown selections for years, months. Can be false for disable both dropdowns.
    */
  var dropdowns: js.UndefOr[Boolean | Dropdowns] = js.native
  var endDate: js.UndefOr[InputDate] = js.native
  /**
    * Bind the datepicker to a form field.
    */
  var field: Field = js.native
  /**
    * ISO day of the week.
    */
  var firstDay: js.UndefOr[DayOfWeek] = js.native
  /**
    * Footer calendar, if set to `true` will use default footer (Reset/Apply buttons) or custom string (html).
    */
  var footer: js.UndefOr[Boolean | String] = js.native
  /**
    * The default output format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Close calendar when clicked outside the elements specified in field or parentEl. Recommended use when autoclose is set to false.
    */
  var hideOnBodyClick: js.UndefOr[Boolean] = js.native
  /**
    * Show tooltip.
    */
  var hoveringTooltip: js.UndefOr[Boolean] = js.native
  /**
    * Show calendar inline. If true and parentEl is not provided then will use parentNode of field.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * Language code for names of days, months by Date.prototype.toLocaleString(). 'auto' will try detect user browser language.
    */
  var lang: js.UndefOr[String] = js.native
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The maximum/latest date that can be selected.
    */
  var maxDate: js.UndefOr[InputDate] = js.native
  /**
    * The maximum days of the selected range.
    */
  var maxDays: js.UndefOr[Double] = js.native
  /**
    * The minimum/earliest date that can be selected.
    */
  var minDate: js.UndefOr[InputDate] = js.native
  /**
    * The minimum days of the selected range.
    */
  var minDays: js.UndefOr[Double] = js.native
  /**
    * Number of columns months.
    */
  var numberOfColumns: js.UndefOr[Double] = js.native
  /**
    * Number of visible months.
    */
  var numberOfMonths: js.UndefOr[Double] = js.native
  /**
    * Triggered when calendar has been closed.
    */
  var onClose: js.UndefOr[OnCloseFn] = js.native
  var onError: js.UndefOr[OnErrorFn] = js.native
  /**
    * Triggered when the months select is changed.
    */
  var onMonthsChange: js.UndefOr[OnMonthsChangeFn] = js.native
  /**
    * Triggered when calendar has been opened.
    */
  var onOpen: js.UndefOr[OnOpenFn] = js.native
  /**
    * Triggered when either date / start date or end date has been changed.
    */
  var onSelect: js.UndefOr[OnSelectFn] = js.native
  /**
    * Triggered when end date has been changed.
    */
  var onSelectEnd: js.UndefOr[OnSelectStartEndFn] = js.native
  /**
    * Triggered when start date has been changed.
    */
  var onSelectStart: js.UndefOr[OnSelectStartEndFn] = js.native
  /**
    * Triggered when the years select is changed.
    */
  var onYearsChange: js.UndefOr[OnYearsChangeFn] = js.native
  var orientation: js.UndefOr[Orientation] = js.native
  /**
    * Selector of the parent element that the date range picker will be added to, if not provided this will be 'body'.
    */
  var parentEl: js.UndefOr[String | Node] = js.native
  /**
    * Repick start/end instead of new range. This option working only when exists `secondField`.
    */
  var repick: js.UndefOr[Boolean] = js.native
  /**
    * If exists then end of date range will set here.
    */
  var secondField: js.UndefOr[Field] = js.native
  /**
    * Select second date before the first selected date.
    */
  var selectBackward: js.UndefOr[Boolean] = js.native
  /**
    * Select second date after the first selected date.
    */
  var selectForward: js.UndefOr[Boolean] = js.native
  /**
    * Separator between dates when one field.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Choose a single date instead of a date range.
    */
  var singleDate: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[InputDate] = js.native
  /**
    * Calc date range in nights. (For hotels when last date doesn't include to range.)
    */
  var tooltipNights: js.UndefOr[Boolean] = js.native
  /**
    * Determines the weekday display style.
    * Two weekdays may have the same narrow style for some locales (e.g. Tuesday's narrow style is also T).
    */
  var weekdayStyle: js.UndefOr[WeekdayStyle] = js.native
}

object Options_ {
  @scala.inline
  def apply(field: Field): Options_ = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options_]
  }
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
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
    def setField(value: Field): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    @scala.inline
    def setDisableDatesVarargs(value: DisabledDate*): Self = this.set("disableDates", js.Array(value :_*))
    @scala.inline
    def setDisableDates(value: js.Array[DisabledDate]): Self = this.set("disableDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDates: Self = this.set("disableDates", js.undefined)
    @scala.inline
    def setDisableWeekends(value: Boolean): Self = this.set("disableWeekends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWeekends: Self = this.set("disableWeekends", js.undefined)
    @scala.inline
    def setDisabledDatesInRange(value: Boolean): Self = this.set("disabledDatesInRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDatesInRange: Self = this.set("disabledDatesInRange", js.undefined)
    @scala.inline
    def setDropdowns(value: Boolean | Dropdowns): Self = this.set("dropdowns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdowns: Self = this.set("dropdowns", js.undefined)
    @scala.inline
    def setEndDateVarargs(value: (Double | String)*): Self = this.set("endDate", js.Array(value :_*))
    @scala.inline
    def setEndDate(value: InputDate): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setEndDateNull: Self = this.set("endDate", null)
    @scala.inline
    def setFirstDay(value: DayOfWeek): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    @scala.inline
    def setFooter(value: Boolean | String): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHideOnBodyClick(value: Boolean): Self = this.set("hideOnBodyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnBodyClick: Self = this.set("hideOnBodyClick", js.undefined)
    @scala.inline
    def setHoveringTooltip(value: Boolean): Self = this.set("hoveringTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoveringTooltip: Self = this.set("hoveringTooltip", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDateVarargs(value: (Double | String)*): Self = this.set("maxDate", js.Array(value :_*))
    @scala.inline
    def setMaxDate(value: InputDate): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMaxDateNull: Self = this.set("maxDate", null)
    @scala.inline
    def setMaxDays(value: Double): Self = this.set("maxDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDays: Self = this.set("maxDays", js.undefined)
    @scala.inline
    def setMinDateVarargs(value: (Double | String)*): Self = this.set("minDate", js.Array(value :_*))
    @scala.inline
    def setMinDate(value: InputDate): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinDateNull: Self = this.set("minDate", null)
    @scala.inline
    def setMinDays(value: Double): Self = this.set("minDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDays: Self = this.set("minDays", js.undefined)
    @scala.inline
    def setNumberOfColumns(value: Double): Self = this.set("numberOfColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfColumns: Self = this.set("numberOfColumns", js.undefined)
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    @scala.inline
    def setOnClose(value: OnCloseFn): Self = this.set("onClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnError(value: OnErrorFn): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnMonthsChange(value: OnMonthsChangeFn): Self = this.set("onMonthsChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMonthsChange: Self = this.set("onMonthsChange", js.undefined)
    @scala.inline
    def setOnOpen(value: OnOpenFn): Self = this.set("onOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnSelect(value: OnSelectFn): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectEnd(value: OnSelectStartEndFn): Self = this.set("onSelectEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelectEnd: Self = this.set("onSelectEnd", js.undefined)
    @scala.inline
    def setOnSelectStart(value: OnSelectStartEndFn): Self = this.set("onSelectStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelectStart: Self = this.set("onSelectStart", js.undefined)
    @scala.inline
    def setOnYearsChange(value: OnYearsChangeFn): Self = this.set("onYearsChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnYearsChange: Self = this.set("onYearsChange", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setParentEl(value: String | Node): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
    @scala.inline
    def setRepick(value: Boolean): Self = this.set("repick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepick: Self = this.set("repick", js.undefined)
    @scala.inline
    def setSecondField(value: Field): Self = this.set("secondField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondField: Self = this.set("secondField", js.undefined)
    @scala.inline
    def setSelectBackward(value: Boolean): Self = this.set("selectBackward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectBackward: Self = this.set("selectBackward", js.undefined)
    @scala.inline
    def setSelectForward(value: Boolean): Self = this.set("selectForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectForward: Self = this.set("selectForward", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSingleDate(value: Boolean): Self = this.set("singleDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleDate: Self = this.set("singleDate", js.undefined)
    @scala.inline
    def setStartDateVarargs(value: (Double | String)*): Self = this.set("startDate", js.Array(value :_*))
    @scala.inline
    def setStartDate(value: InputDate): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setStartDateNull: Self = this.set("startDate", null)
    @scala.inline
    def setTooltipNights(value: Boolean): Self = this.set("tooltipNights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipNights: Self = this.set("tooltipNights", js.undefined)
    @scala.inline
    def setWeekdayStyle(value: WeekdayStyle): Self = this.set("weekdayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekdayStyle: Self = this.set("weekdayStyle", js.undefined)
  }
  
}

