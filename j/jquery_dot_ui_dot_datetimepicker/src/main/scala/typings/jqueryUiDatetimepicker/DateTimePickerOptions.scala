package typings.jqueryUiDatetimepicker

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DateTimePickerOptionsOps[Self <: DateTimePickerOptions] (val x: Self) extends AnyVal {
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
    def setAddSliderAccess(value: Boolean): Self = this.set("addSliderAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSliderAccess: Self = this.set("addSliderAccess", js.undefined)
    @scala.inline
    def setAltFieldTimeOnly(value: Boolean): Self = this.set("altFieldTimeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltFieldTimeOnly: Self = this.set("altFieldTimeOnly", js.undefined)
    @scala.inline
    def setAltSeparator(value: String): Self = this.set("altSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltSeparator: Self = this.set("altSeparator", js.undefined)
    @scala.inline
    def setAltTimeFormat(value: String): Self = this.set("altTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltTimeFormat: Self = this.set("altTimeFormat", js.undefined)
    @scala.inline
    def setAltTimeSuffix(value: String): Self = this.set("altTimeSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltTimeSuffix: Self = this.set("altTimeSuffix", js.undefined)
    @scala.inline
    def setAlwaysSetTime(value: Boolean): Self = this.set("alwaysSetTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysSetTime: Self = this.set("alwaysSetTime", js.undefined)
    @scala.inline
    def setAmNames(value: String): Self = this.set("amNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmNames: Self = this.set("amNames", js.undefined)
    @scala.inline
    def setControlType(value: String): Self = this.set("controlType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlType: Self = this.set("controlType", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setHourGrid(value: Double): Self = this.set("hourGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourGrid: Self = this.set("hourGrid", js.undefined)
    @scala.inline
    def setHourMax(value: Double): Self = this.set("hourMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourMax: Self = this.set("hourMax", js.undefined)
    @scala.inline
    def setHourMin(value: Double): Self = this.set("hourMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourMin: Self = this.set("hourMin", js.undefined)
    @scala.inline
    def setHourText(value: String): Self = this.set("hourText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourText: Self = this.set("hourText", js.undefined)
    @scala.inline
    def setMaxDateTime(value: Date): Self = this.set("maxDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDateTime: Self = this.set("maxDateTime", js.undefined)
    @scala.inline
    def setMicrosec(value: Double): Self = this.set("microsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosec: Self = this.set("microsec", js.undefined)
    @scala.inline
    def setMicrosecGrid(value: Double): Self = this.set("microsecGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosecGrid: Self = this.set("microsecGrid", js.undefined)
    @scala.inline
    def setMicrosecMax(value: Double): Self = this.set("microsecMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosecMax: Self = this.set("microsecMax", js.undefined)
    @scala.inline
    def setMicrosecMin(value: Double): Self = this.set("microsecMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosecMin: Self = this.set("microsecMin", js.undefined)
    @scala.inline
    def setMicrosecText(value: String): Self = this.set("microsecText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosecText: Self = this.set("microsecText", js.undefined)
    @scala.inline
    def setMillisec(value: Double): Self = this.set("millisec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisec: Self = this.set("millisec", js.undefined)
    @scala.inline
    def setMillisecGrid(value: Double): Self = this.set("millisecGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecGrid: Self = this.set("millisecGrid", js.undefined)
    @scala.inline
    def setMillisecMax(value: Double): Self = this.set("millisecMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecMax: Self = this.set("millisecMax", js.undefined)
    @scala.inline
    def setMillisecMin(value: Double): Self = this.set("millisecMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecMin: Self = this.set("millisecMin", js.undefined)
    @scala.inline
    def setMillisecText(value: String): Self = this.set("millisecText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecText: Self = this.set("millisecText", js.undefined)
    @scala.inline
    def setMinDateTime(value: Date): Self = this.set("minDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDateTime: Self = this.set("minDateTime", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMinuteGrid(value: Double): Self = this.set("minuteGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteGrid: Self = this.set("minuteGrid", js.undefined)
    @scala.inline
    def setMinuteMax(value: Double): Self = this.set("minuteMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteMax: Self = this.set("minuteMax", js.undefined)
    @scala.inline
    def setMinuteMin(value: Double): Self = this.set("minuteMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteMin: Self = this.set("minuteMin", js.undefined)
    @scala.inline
    def setMinuteText(value: String): Self = this.set("minuteText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteText: Self = this.set("minuteText", js.undefined)
    @scala.inline
    def setOnSelect(value: () => _): Self = this.set("onSelect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setParse(value: String): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setPickerTimeFormat(value: String): Self = this.set("pickerTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerTimeFormat: Self = this.set("pickerTimeFormat", js.undefined)
    @scala.inline
    def setPickerTimeSuffix(value: String): Self = this.set("pickerTimeSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerTimeSuffix: Self = this.set("pickerTimeSuffix", js.undefined)
    @scala.inline
    def setPmNames(value: String): Self = this.set("pmNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePmNames: Self = this.set("pmNames", js.undefined)
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setSecondGrid(value: Double): Self = this.set("secondGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondGrid: Self = this.set("secondGrid", js.undefined)
    @scala.inline
    def setSecondMax(value: Double): Self = this.set("secondMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondMax: Self = this.set("secondMax", js.undefined)
    @scala.inline
    def setSecondMin(value: Double): Self = this.set("secondMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondMin: Self = this.set("secondMin", js.undefined)
    @scala.inline
    def setSecondText(value: String): Self = this.set("secondText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondText: Self = this.set("secondText", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShowHour(value: Boolean): Self = this.set("showHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHour: Self = this.set("showHour", js.undefined)
    @scala.inline
    def setShowMicrosec(value: Boolean): Self = this.set("showMicrosec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMicrosec: Self = this.set("showMicrosec", js.undefined)
    @scala.inline
    def setShowMillisec(value: Boolean): Self = this.set("showMillisec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMillisec: Self = this.set("showMillisec", js.undefined)
    @scala.inline
    def setShowMinute(value: Boolean): Self = this.set("showMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMinute: Self = this.set("showMinute", js.undefined)
    @scala.inline
    def setShowSecond(value: Boolean): Self = this.set("showSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecond: Self = this.set("showSecond", js.undefined)
    @scala.inline
    def setShowTime(value: Boolean): Self = this.set("showTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    @scala.inline
    def setShowTimepicker(value: Boolean): Self = this.set("showTimepicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTimepicker: Self = this.set("showTimepicker", js.undefined)
    @scala.inline
    def setShowTimezone(value: Boolean): Self = this.set("showTimezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTimezone: Self = this.set("showTimezone", js.undefined)
    @scala.inline
    def setSliderAccessArgs(value: js.Any): Self = this.set("sliderAccessArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderAccessArgs: Self = this.set("sliderAccessArgs", js.undefined)
    @scala.inline
    def setStepHour(value: Double): Self = this.set("stepHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepHour: Self = this.set("stepHour", js.undefined)
    @scala.inline
    def setStepMicrosec(value: Double): Self = this.set("stepMicrosec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMicrosec: Self = this.set("stepMicrosec", js.undefined)
    @scala.inline
    def setStepMillisec(value: Double): Self = this.set("stepMillisec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMillisec: Self = this.set("stepMillisec", js.undefined)
    @scala.inline
    def setStepMinute(value: Double): Self = this.set("stepMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMinute: Self = this.set("stepMinute", js.undefined)
    @scala.inline
    def setStepSecond(value: Double): Self = this.set("stepSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSecond: Self = this.set("stepSecond", js.undefined)
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    @scala.inline
    def setTimeOnly(value: Boolean): Self = this.set("timeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOnly: Self = this.set("timeOnly", js.undefined)
    @scala.inline
    def setTimeOnlyTitle(value: String): Self = this.set("timeOnlyTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOnlyTitle: Self = this.set("timeOnlyTitle", js.undefined)
    @scala.inline
    def setTimeSuffix(value: String): Self = this.set("timeSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSuffix: Self = this.set("timeSuffix", js.undefined)
    @scala.inline
    def setTimeText(value: String): Self = this.set("timeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeText: Self = this.set("timeText", js.undefined)
    @scala.inline
    def setTimezone(value: Double): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setTimezoneListVarargs(value: TimezoneOptions*): Self = this.set("timezoneList", js.Array(value :_*))
    @scala.inline
    def setTimezoneList(value: js.Array[TimezoneOptions]): Self = this.set("timezoneList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneList: Self = this.set("timezoneList", js.undefined)
    @scala.inline
    def setTimezoneText(value: String): Self = this.set("timezoneText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneText: Self = this.set("timezoneText", js.undefined)
  }
  
}

