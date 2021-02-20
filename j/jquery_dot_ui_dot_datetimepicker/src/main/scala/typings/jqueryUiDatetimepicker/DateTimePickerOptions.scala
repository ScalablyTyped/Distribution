package typings.jqueryUiDatetimepicker

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimePickerOptions extends DatepickerOptions {
  
  //Default: true - Whether to show the timepicker within the datepicker.
  var addSliderAccess: js.UndefOr[Boolean] = js.native
  
  //Default: 'strict' - How to parse the time string. Two methods are provided: 'strict' which must match the timeFormat exactly, and 'loose' which uses javascript's new Date(timeString) to guess the time. You may also pass in a function(timeFormat, timeString, options) to handle the parsing yourself, returning a simple object:      
  // Alt field options
  var altFieldTimeOnly: js.UndefOr[Boolean] = js.native
  
  //Default: true - When altField is used from datepicker altField will only receive the formatted time and the original field only receives date.
  var altSeparator: js.UndefOr[String] = js.native
  
  //Default: (timeSuffix option) - String always placed after the formatted time in the altField.
  var altTimeFormat: js.UndefOr[String] = js.native
  
  //Default: (separator option) - String placed between formatted date and formatted time in the altField.
  var altTimeSuffix: js.UndefOr[String] = js.native
  
  //Default: null - Function to be called when a date is chosen or time has changed(parameters: datetimeText, datepickerInstance).
  var alwaysSetTime: js.UndefOr[Boolean] = js.native
  
  //Default: "Done", A Localization Setting - Text for the Close button.
  var amNames: js.UndefOr[String] = js.native
  
  //Default: false, A Localization Setting - Right to Left support. 
  // Timefield options
  var controlType: js.UndefOr[String] = js.native
  
  //Default: null - Object to pass to sliderAccess when used.
  var defaultValue: js.UndefOr[String] = js.native
  
  //Default: 1 - Microseconds per step the slider makes.
  var hour: js.UndefOr[Double] = js.native
  
  //Default: 999 - The maximum microsecond allowed for all dates.
  var hourGrid: js.UndefOr[Double] = js.native
  
  //Default: 0 - The minimum microsecond allowed for all dates.
  var hourMax: js.UndefOr[Double] = js.native
  
  //Default: null - Initial timezone set.This is the offset in minutes.If null the browser's local timezone will be used. If you're timezone is "-0400" you would use - 240. For backwards compatibility you may pass "-0400", however the timezone is stored in minutes and more reliable.
  var hourMin: js.UndefOr[Double] = js.native
  
  //Default: "Time", A Localization Setting - Label used within timepicker for the formatted time.
  var hourText: js.UndefOr[String] = js.native
  
  //Default: null - Date object of the minimum datetime allowed.Also available as minDate.
  var maxDateTime: js.UndefOr[Date] = js.native
  
  //Default: 0 - Initial millisecond set.
  var microsec: js.UndefOr[Double] = js.native
  
  //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in milliseconds) between labels.
  var microsecGrid: js.UndefOr[Double] = js.native
  
  //Default: 999 - The maximum millisecond allowed for all dates.
  var microsecMax: js.UndefOr[Double] = js.native
  
  //Default: 0 - The minimum millisecond allowed for all dates.
  var microsecMin: js.UndefOr[Double] = js.native
  
  //Default: "Millisecond", A Localization Setting - Label used to identify the millisecond slider.
  var microsecText: js.UndefOr[String] = js.native
  
  //Default: 0 - Initial second set.
  var millisec: js.UndefOr[Double] = js.native
  
  //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in seconds) between labels.
  var millisecGrid: js.UndefOr[Double] = js.native
  
  //Default: 59 - The maximum second allowed for all dates.
  var millisecMax: js.UndefOr[Double] = js.native
  
  //Default: 0 - The minimum second allowed for all dates.
  var millisecMin: js.UndefOr[Double] = js.native
  
  //Default: "Second", A Localization Setting - Label used to identify the second slider.
  var millisecText: js.UndefOr[String] = js.native
  
  //Default: null - String of the default time value placed in the input on focus when the input is empty.
  var minDateTime: js.UndefOr[Date] = js.native
  
  //Default: 0 - Initial hour set.
  var minute: js.UndefOr[Double] = js.native
  
  //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in hours) between labels.
  var minuteGrid: js.UndefOr[Double] = js.native
  
  //Default: 23 - The maximum hour allowed for all dates.
  var minuteMax: js.UndefOr[Double] = js.native
  
  //Default: 0 - The minimum hour allowed for all dates.
  var minuteMin: js.UndefOr[Double] = js.native
  
  //Default: "Hour", A Localization Setting - Label used to identify the hour slider.
  var minuteText: js.UndefOr[String] = js.native
  
  //Default: false - Hide the datepicker and only provide a time interface.
  @JSName("onSelect")
  var onSelect_DateTimePickerOptions: js.UndefOr[js.Function0[_]] = js.native
  
  //Default: null - Date object of the maximum datetime allowed.Also Available as maxDate.
  var parse: js.UndefOr[String] = js.native
  
  //Default: " " - When formatting the time this string is placed between the formatted date and formatted time.
  var pickerTimeFormat: js.UndefOr[String] = js.native
  
  //Default: (timeFormat option) - How to format the time displayed within the timepicker.
  var pickerTimeSuffix: js.UndefOr[String] = js.native
  
  //Default: ['AM', 'A'], A Localization Setting - Array of strings to try and parse against to determine AM.
  var pmNames: js.UndefOr[String] = js.native
  
  //Default: 0 - Initial minute set.
  var second: js.UndefOr[Double] = js.native
  
  //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in minutes) between labels.
  var secondGrid: js.UndefOr[Double] = js.native
  
  //Default: 59 - The maximum minute allowed for all dates.
  var secondMax: js.UndefOr[Double] = js.native
  
  //Default: 0 - The minimum minute allowed for all dates.
  var secondMin: js.UndefOr[Double] = js.native
  
  //Default: "Minute", A Localization Setting - Label used to identify the minute slider.
  var secondText: js.UndefOr[String] = js.native
  
  //Default: true - Always have a time set internally, even before user has chosen one.
  var separator: js.UndefOr[String] = js.native
  
  //Default: 'slider' - Whether to use 'slider' or 'select'.If 'slider' is unavailable through jQueryUI, 'select' will be used.For advanced usage you may pass an object which implements "create", "options", "value" methods to use controls other than sliders or selects.See the _controls property in the source code for more details.
  var showHour: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the millisecond control. The default of null will use detection from timeFormat.
  var showMicrosec: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the second control. The default of null will use detection from timeFormat.
  var showMillisec: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the hour control. The default of null will use detection from timeFormat.
  var showMinute: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the minute control. The default of null will use detection from timeFormat.
  var showSecond: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the timezone select.
  var showTime: js.UndefOr[Boolean] = js.native
  
  //Default: (timeSuffix option) - String to place after the formatted time within the timepicker.
  var showTimepicker: js.UndefOr[Boolean] = js.native
  
  //Default: null - Whether to show the microsecond control. The default of null will use detection from timeFormat.
  var showTimezone: js.UndefOr[Boolean] = js.native
  
  //Default: false - Adds the sliderAccess plugin to sliders within timepicker
  var sliderAccessArgs: js.UndefOr[js.Any] = js.native
  
  //Default: true - Whether to show the time selected within the datetimepicker.
  var stepHour: js.UndefOr[Double] = js.native
  
  //Default: 1 - Milliseconds per step the slider makes.
  var stepMicrosec: js.UndefOr[Double] = js.native
  
  //Default: 1 - Seconds per step the slider makes.
  var stepMillisec: js.UndefOr[Double] = js.native
  
  //Default: 1 - Hours per step the slider makes.
  var stepMinute: js.UndefOr[Double] = js.native
  
  //Default: 1 - Minutes per step the slider makes.
  var stepSecond: js.UndefOr[Double] = js.native
  
  //Default: ['PM', 'P'], A Localization Setting - Array of strings to try and parse against to determine PM.
  var timeFormat: js.UndefOr[String] = js.native
  
  //Default: true - Whether to show the button panel at the bottom.This is generally needed.
  var timeOnly: js.UndefOr[Boolean] = js.native
  
  //Default: "", A Localization Setting - String to place after the formatted time.
  var timeOnlyTitle: js.UndefOr[String] = js.native
  
  //Default: "HH:mm", A Localization Setting - String of format tokens to be replaced with the time.See Formatting.
  var timeSuffix: js.UndefOr[String] = js.native
  
  //Default: "Choose Time", A Localization Setting - Title of the wigit when using only timepicker.
  var timeText: js.UndefOr[String] = js.native
  
  //Default: 0 - Initial microsecond set. Note: Javascript's native Date object does not natively support microseconds. Timepicker adds ability to simply Date.setMicroseconds(m) and Date.getMicroseconds(). Date comparisons will not acknowledge microseconds. Use this only for display purposes.
  var timezone: js.UndefOr[Double] = js.native
  
  //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in microseconds) between labels.
  // Timezone options
  var timezoneList: js.UndefOr[js.Array[TimezoneOptions]] = js.native
  
  //Default: "Microsecond", A Localization Setting - Label used to identify the microsecond slider.
  var timezoneText: js.UndefOr[String] = js.native
}
object DateTimePickerOptions {
  
  @scala.inline
  def apply(): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerOptions]
  }
  
  @scala.inline
  implicit class DateTimePickerOptionsMutableBuilder[Self <: DateTimePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSliderAccess(value: Boolean): Self = StObject.set(x, "addSliderAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddSliderAccessUndefined: Self = StObject.set(x, "addSliderAccess", js.undefined)
    
    @scala.inline
    def setAltFieldTimeOnly(value: Boolean): Self = StObject.set(x, "altFieldTimeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFieldTimeOnlyUndefined: Self = StObject.set(x, "altFieldTimeOnly", js.undefined)
    
    @scala.inline
    def setAltSeparator(value: String): Self = StObject.set(x, "altSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltSeparatorUndefined: Self = StObject.set(x, "altSeparator", js.undefined)
    
    @scala.inline
    def setAltTimeFormat(value: String): Self = StObject.set(x, "altTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTimeFormatUndefined: Self = StObject.set(x, "altTimeFormat", js.undefined)
    
    @scala.inline
    def setAltTimeSuffix(value: String): Self = StObject.set(x, "altTimeSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTimeSuffixUndefined: Self = StObject.set(x, "altTimeSuffix", js.undefined)
    
    @scala.inline
    def setAlwaysSetTime(value: Boolean): Self = StObject.set(x, "alwaysSetTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSetTimeUndefined: Self = StObject.set(x, "alwaysSetTime", js.undefined)
    
    @scala.inline
    def setAmNames(value: String): Self = StObject.set(x, "amNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmNamesUndefined: Self = StObject.set(x, "amNames", js.undefined)
    
    @scala.inline
    def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourGrid(value: Double): Self = StObject.set(x, "hourGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourGridUndefined: Self = StObject.set(x, "hourGrid", js.undefined)
    
    @scala.inline
    def setHourMax(value: Double): Self = StObject.set(x, "hourMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourMaxUndefined: Self = StObject.set(x, "hourMax", js.undefined)
    
    @scala.inline
    def setHourMin(value: Double): Self = StObject.set(x, "hourMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourMinUndefined: Self = StObject.set(x, "hourMin", js.undefined)
    
    @scala.inline
    def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMaxDateTime(value: Date): Self = StObject.set(x, "maxDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateTimeUndefined: Self = StObject.set(x, "maxDateTime", js.undefined)
    
    @scala.inline
    def setMicrosec(value: Double): Self = StObject.set(x, "microsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosecGrid(value: Double): Self = StObject.set(x, "microsecGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosecGridUndefined: Self = StObject.set(x, "microsecGrid", js.undefined)
    
    @scala.inline
    def setMicrosecMax(value: Double): Self = StObject.set(x, "microsecMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosecMaxUndefined: Self = StObject.set(x, "microsecMax", js.undefined)
    
    @scala.inline
    def setMicrosecMin(value: Double): Self = StObject.set(x, "microsecMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosecMinUndefined: Self = StObject.set(x, "microsecMin", js.undefined)
    
    @scala.inline
    def setMicrosecText(value: String): Self = StObject.set(x, "microsecText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosecTextUndefined: Self = StObject.set(x, "microsecText", js.undefined)
    
    @scala.inline
    def setMicrosecUndefined: Self = StObject.set(x, "microsec", js.undefined)
    
    @scala.inline
    def setMillisec(value: Double): Self = StObject.set(x, "millisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecGrid(value: Double): Self = StObject.set(x, "millisecGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecGridUndefined: Self = StObject.set(x, "millisecGrid", js.undefined)
    
    @scala.inline
    def setMillisecMax(value: Double): Self = StObject.set(x, "millisecMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecMaxUndefined: Self = StObject.set(x, "millisecMax", js.undefined)
    
    @scala.inline
    def setMillisecMin(value: Double): Self = StObject.set(x, "millisecMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecMinUndefined: Self = StObject.set(x, "millisecMin", js.undefined)
    
    @scala.inline
    def setMillisecText(value: String): Self = StObject.set(x, "millisecText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecTextUndefined: Self = StObject.set(x, "millisecText", js.undefined)
    
    @scala.inline
    def setMillisecUndefined: Self = StObject.set(x, "millisec", js.undefined)
    
    @scala.inline
    def setMinDateTime(value: Date): Self = StObject.set(x, "minDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateTimeUndefined: Self = StObject.set(x, "minDateTime", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteGrid(value: Double): Self = StObject.set(x, "minuteGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteGridUndefined: Self = StObject.set(x, "minuteGrid", js.undefined)
    
    @scala.inline
    def setMinuteMax(value: Double): Self = StObject.set(x, "minuteMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteMaxUndefined: Self = StObject.set(x, "minuteMax", js.undefined)
    
    @scala.inline
    def setMinuteMin(value: Double): Self = StObject.set(x, "minuteMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteMinUndefined: Self = StObject.set(x, "minuteMin", js.undefined)
    
    @scala.inline
    def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setOnSelect(value: () => _): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setParse(value: String): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setPickerTimeFormat(value: String): Self = StObject.set(x, "pickerTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerTimeFormatUndefined: Self = StObject.set(x, "pickerTimeFormat", js.undefined)
    
    @scala.inline
    def setPickerTimeSuffix(value: String): Self = StObject.set(x, "pickerTimeSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerTimeSuffixUndefined: Self = StObject.set(x, "pickerTimeSuffix", js.undefined)
    
    @scala.inline
    def setPmNames(value: String): Self = StObject.set(x, "pmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmNamesUndefined: Self = StObject.set(x, "pmNames", js.undefined)
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondGrid(value: Double): Self = StObject.set(x, "secondGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondGridUndefined: Self = StObject.set(x, "secondGrid", js.undefined)
    
    @scala.inline
    def setSecondMax(value: Double): Self = StObject.set(x, "secondMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondMaxUndefined: Self = StObject.set(x, "secondMax", js.undefined)
    
    @scala.inline
    def setSecondMin(value: Double): Self = StObject.set(x, "secondMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondMinUndefined: Self = StObject.set(x, "secondMin", js.undefined)
    
    @scala.inline
    def setSecondText(value: String): Self = StObject.set(x, "secondText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondTextUndefined: Self = StObject.set(x, "secondText", js.undefined)
    
    @scala.inline
    def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    @scala.inline
    def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
    
    @scala.inline
    def setShowMicrosec(value: Boolean): Self = StObject.set(x, "showMicrosec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMicrosecUndefined: Self = StObject.set(x, "showMicrosec", js.undefined)
    
    @scala.inline
    def setShowMillisec(value: Boolean): Self = StObject.set(x, "showMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMillisecUndefined: Self = StObject.set(x, "showMillisec", js.undefined)
    
    @scala.inline
    def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
    
    @scala.inline
    def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
    
    @scala.inline
    def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
    
    @scala.inline
    def setShowTimepicker(value: Boolean): Self = StObject.set(x, "showTimepicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTimepickerUndefined: Self = StObject.set(x, "showTimepicker", js.undefined)
    
    @scala.inline
    def setShowTimezone(value: Boolean): Self = StObject.set(x, "showTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTimezoneUndefined: Self = StObject.set(x, "showTimezone", js.undefined)
    
    @scala.inline
    def setSliderAccessArgs(value: js.Any): Self = StObject.set(x, "sliderAccessArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliderAccessArgsUndefined: Self = StObject.set(x, "sliderAccessArgs", js.undefined)
    
    @scala.inline
    def setStepHour(value: Double): Self = StObject.set(x, "stepHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepHourUndefined: Self = StObject.set(x, "stepHour", js.undefined)
    
    @scala.inline
    def setStepMicrosec(value: Double): Self = StObject.set(x, "stepMicrosec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMicrosecUndefined: Self = StObject.set(x, "stepMicrosec", js.undefined)
    
    @scala.inline
    def setStepMillisec(value: Double): Self = StObject.set(x, "stepMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMillisecUndefined: Self = StObject.set(x, "stepMillisec", js.undefined)
    
    @scala.inline
    def setStepMinute(value: Double): Self = StObject.set(x, "stepMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMinuteUndefined: Self = StObject.set(x, "stepMinute", js.undefined)
    
    @scala.inline
    def setStepSecond(value: Double): Self = StObject.set(x, "stepSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepSecondUndefined: Self = StObject.set(x, "stepSecond", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
    
    @scala.inline
    def setTimeOnly(value: Boolean): Self = StObject.set(x, "timeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOnlyTitle(value: String): Self = StObject.set(x, "timeOnlyTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOnlyTitleUndefined: Self = StObject.set(x, "timeOnlyTitle", js.undefined)
    
    @scala.inline
    def setTimeOnlyUndefined: Self = StObject.set(x, "timeOnly", js.undefined)
    
    @scala.inline
    def setTimeSuffix(value: String): Self = StObject.set(x, "timeSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSuffixUndefined: Self = StObject.set(x, "timeSuffix", js.undefined)
    
    @scala.inline
    def setTimeText(value: String): Self = StObject.set(x, "timeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeTextUndefined: Self = StObject.set(x, "timeText", js.undefined)
    
    @scala.inline
    def setTimezone(value: Double): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneList(value: js.Array[TimezoneOptions]): Self = StObject.set(x, "timezoneList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneListUndefined: Self = StObject.set(x, "timezoneList", js.undefined)
    
    @scala.inline
    def setTimezoneListVarargs(value: TimezoneOptions*): Self = StObject.set(x, "timezoneList", js.Array(value :_*))
    
    @scala.inline
    def setTimezoneText(value: String): Self = StObject.set(x, "timezoneText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneTextUndefined: Self = StObject.set(x, "timezoneText", js.undefined)
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
