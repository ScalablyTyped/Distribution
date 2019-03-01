package typings
package jqueryDotUiDotDatetimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerOptions
  extends jqueryuiLib.JQueryUINs.DatepickerOptions {
   //Default: true - Whether to show the timepicker within the datepicker.
  var addSliderAccess: js.UndefOr[scala.Boolean] = js.undefined
   //Default: 'strict' - How to parse the time string. Two methods are provided: 'strict' which must match the timeFormat exactly, and 'loose' which uses javascript's new Date(timeString) to guess the time. You may also pass in a function(timeFormat, timeString, options) to handle the parsing yourself, returning a simple object:      
  // Alt field options
  var altFieldTimeOnly: js.UndefOr[scala.Boolean] = js.undefined
    //Default: true - When altField is used from datepicker altField will only receive the formatted time and the original field only receives date.
  var altSeparator: js.UndefOr[java.lang.String] = js.undefined
        //Default: (timeSuffix option) - String always placed after the formatted time in the altField.
  var altTimeFormat: js.UndefOr[java.lang.String] = js.undefined
         //Default: (separator option) - String placed between formatted date and formatted time in the altField.
  var altTimeSuffix: js.UndefOr[java.lang.String] = js.undefined
   //Default: null - Function to be called when a date is chosen or time has changed(parameters: datetimeText, datepickerInstance).
  var alwaysSetTime: js.UndefOr[scala.Boolean] = js.undefined
        //Default: "Done", A Localization Setting - Text for the Close button.
  var amNames: js.UndefOr[java.lang.String] = js.undefined
           //Default: false, A Localization Setting - Right to Left support. 
  // Timefield options
  var controlType: js.UndefOr[java.lang.String] = js.undefined
   //Default: null - Object to pass to sliderAccess when used.
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
     //Default: 1 - Microseconds per step the slider makes.
  var hour: js.UndefOr[scala.Double] = js.undefined
      //Default: 999 - The maximum microsecond allowed for all dates.
  var hourGrid: js.UndefOr[scala.Double] = js.undefined
      //Default: 0 - The minimum microsecond allowed for all dates.
  var hourMax: js.UndefOr[scala.Double] = js.undefined
        //Default: null - Initial timezone set.This is the offset in minutes.If null the browser's local timezone will be used. If you're timezone is "-0400" you would use - 240. For backwards compatibility you may pass "-0400", however the timezone is stored in minutes and more reliable.
  var hourMin: js.UndefOr[scala.Double] = js.undefined
         //Default: "Time", A Localization Setting - Label used within timepicker for the formatted time.
  var hourText: js.UndefOr[java.lang.String] = js.undefined
   //Default: null - Date object of the minimum datetime allowed.Also available as minDate.
  var maxDateTime: js.UndefOr[stdLib.Date] = js.undefined
         //Default: 0 - Initial millisecond set.
  var microsec: js.UndefOr[scala.Double] = js.undefined
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in milliseconds) between labels.
  var microsecGrid: js.UndefOr[scala.Double] = js.undefined
      //Default: 999 - The maximum millisecond allowed for all dates.
  var microsecMax: js.UndefOr[scala.Double] = js.undefined
      //Default: 0 - The minimum millisecond allowed for all dates.
  var microsecMin: js.UndefOr[scala.Double] = js.undefined
     //Default: "Millisecond", A Localization Setting - Label used to identify the millisecond slider.
  var microsecText: js.UndefOr[java.lang.String] = js.undefined
           //Default: 0 - Initial second set.
  var millisec: js.UndefOr[scala.Double] = js.undefined
       //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in seconds) between labels.
  var millisecGrid: js.UndefOr[scala.Double] = js.undefined
        //Default: 59 - The maximum second allowed for all dates.
  var millisecMax: js.UndefOr[scala.Double] = js.undefined
        //Default: 0 - The minimum second allowed for all dates.
  var millisecMin: js.UndefOr[scala.Double] = js.undefined
       //Default: "Second", A Localization Setting - Label used to identify the second slider.
  var millisecText: js.UndefOr[java.lang.String] = js.undefined
   //Default: null - String of the default time value placed in the input on focus when the input is empty.
  var minDateTime: js.UndefOr[stdLib.Date] = js.undefined
             //Default: 0 - Initial hour set.
  var minute: js.UndefOr[scala.Double] = js.undefined
         //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in hours) between labels.
  var minuteGrid: js.UndefOr[scala.Double] = js.undefined
          //Default: 23 - The maximum hour allowed for all dates.
  var minuteMax: js.UndefOr[scala.Double] = js.undefined
          //Default: 0 - The minimum hour allowed for all dates.
  var minuteMin: js.UndefOr[scala.Double] = js.undefined
         //Default: "Hour", A Localization Setting - Label used to identify the hour slider.
  var minuteText: js.UndefOr[java.lang.String] = js.undefined
   //Default: false - Hide the datepicker and only provide a time interface.
  @JSName("onSelect")
  var onSelect_DateTimePickerOptions: js.UndefOr[js.Function0[_]] = js.undefined
   //Default: null - Date object of the maximum datetime allowed.Also Available as maxDate.
  var parse: js.UndefOr[java.lang.String] = js.undefined
   //Default: " " - When formatting the time this string is placed between the formatted date and formatted time.
  var pickerTimeFormat: js.UndefOr[java.lang.String] = js.undefined
   //Default: (timeFormat option) - How to format the time displayed within the timepicker.
  var pickerTimeSuffix: js.UndefOr[java.lang.String] = js.undefined
          //Default: ['AM', 'A'], A Localization Setting - Array of strings to try and parse against to determine AM.
  var pmNames: js.UndefOr[java.lang.String] = js.undefined
           //Default: 0 - Initial minute set.
  var second: js.UndefOr[scala.Double] = js.undefined
       //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in minutes) between labels.
  var secondGrid: js.UndefOr[scala.Double] = js.undefined
        //Default: 59 - The maximum minute allowed for all dates.
  var secondMax: js.UndefOr[scala.Double] = js.undefined
        //Default: 0 - The minimum minute allowed for all dates.
  var secondMin: js.UndefOr[scala.Double] = js.undefined
       //Default: "Minute", A Localization Setting - Label used to identify the minute slider.
  var secondText: js.UndefOr[java.lang.String] = js.undefined
   //Default: true - Always have a time set internally, even before user has chosen one.
  var separator: js.UndefOr[java.lang.String] = js.undefined
      //Default: 'slider' - Whether to use 'slider' or 'select'.If 'slider' is unavailable through jQueryUI, 'select' will be used.For advanced usage you may pass an object which implements "create", "options", "value" methods to use controls other than sliders or selects.See the _controls property in the source code for more details.
  var showHour: js.UndefOr[scala.Boolean] = js.undefined
   //Default: null - Whether to show the millisecond control. The default of null will use detection from timeFormat.
  var showMicrosec: js.UndefOr[scala.Boolean] = js.undefined
     //Default: null - Whether to show the second control. The default of null will use detection from timeFormat.
  var showMillisec: js.UndefOr[scala.Boolean] = js.undefined
       //Default: null - Whether to show the hour control. The default of null will use detection from timeFormat.
  var showMinute: js.UndefOr[scala.Boolean] = js.undefined
     //Default: null - Whether to show the minute control. The default of null will use detection from timeFormat.
  var showSecond: js.UndefOr[scala.Boolean] = js.undefined
   //Default: null - Whether to show the timezone select.
  var showTime: js.UndefOr[scala.Boolean] = js.undefined
   //Default: (timeSuffix option) - String to place after the formatted time within the timepicker.
  var showTimepicker: js.UndefOr[scala.Boolean] = js.undefined
   //Default: null - Whether to show the microsecond control. The default of null will use detection from timeFormat.
  var showTimezone: js.UndefOr[scala.Boolean] = js.undefined
   //Default: false - Adds the sliderAccess plugin to sliders within timepicker
  var sliderAccessArgs: js.UndefOr[js.Any] = js.undefined
        //Default: true - Whether to show the time selected within the datetimepicker.
  var stepHour: js.UndefOr[scala.Double] = js.undefined
     //Default: 1 - Milliseconds per step the slider makes.
  var stepMicrosec: js.UndefOr[scala.Double] = js.undefined
       //Default: 1 - Seconds per step the slider makes.
  var stepMillisec: js.UndefOr[scala.Double] = js.undefined
         //Default: 1 - Hours per step the slider makes.
  var stepMinute: js.UndefOr[scala.Double] = js.undefined
       //Default: 1 - Minutes per step the slider makes.
  var stepSecond: js.UndefOr[scala.Double] = js.undefined
          //Default: ['PM', 'P'], A Localization Setting - Array of strings to try and parse against to determine PM.
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
   //Default: true - Whether to show the button panel at the bottom.This is generally needed.
  var timeOnly: js.UndefOr[scala.Boolean] = js.undefined
       //Default: "", A Localization Setting - String to place after the formatted time.
  var timeOnlyTitle: js.UndefOr[java.lang.String] = js.undefined
       //Default: "HH:mm", A Localization Setting - String of format tokens to be replaced with the time.See Formatting.
  var timeSuffix: js.UndefOr[java.lang.String] = js.undefined
    //Default: "Choose Time", A Localization Setting - Title of the wigit when using only timepicker.
  var timeText: js.UndefOr[java.lang.String] = js.undefined
         //Default: 0 - Initial microsecond set. Note: Javascript's native Date object does not natively support microseconds. Timepicker adds ability to simply Date.setMicroseconds(m) and Date.getMicroseconds(). Date comparisons will not acknowledge microseconds. Use this only for display purposes.
  var timezone: js.UndefOr[scala.Double] = js.undefined
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in microseconds) between labels.
  // Timezone options
  var timezoneList: js.UndefOr[js.Array[TimezoneOptions]] = js.undefined
     //Default: "Microsecond", A Localization Setting - Label used to identify the microsecond slider.
  var timezoneText: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimePickerOptions {
  @scala.inline
  def apply(
    addSliderAccess: js.UndefOr[scala.Boolean] = js.undefined,
    altField: js.Any = null,
    altFieldTimeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    altFormat: java.lang.String = null,
    altSeparator: java.lang.String = null,
    altTimeFormat: java.lang.String = null,
    altTimeSuffix: java.lang.String = null,
    alwaysSetTime: js.UndefOr[scala.Boolean] = js.undefined,
    amNames: java.lang.String = null,
    appendText: java.lang.String = null,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    autohide: js.UndefOr[scala.Boolean] = js.undefined,
    beforeShow: js.Function2[
      /* input */ stdLib.Element, 
      /* inst */ js.Any, 
      jqueryuiLib.JQueryUINs.DatepickerOptions
    ] = null,
    beforeShowDay: js.Function1[/* date */ stdLib.Date, js.Array[_]] = null,
    buttonImage: java.lang.String = null,
    buttonImageOnly: js.UndefOr[scala.Boolean] = js.undefined,
    buttonText: java.lang.String = null,
    calculateWeek: js.Function1[/* date */ stdLib.Date, java.lang.String] = null,
    changeMonth: js.UndefOr[scala.Boolean] = js.undefined,
    changeYear: js.UndefOr[scala.Boolean] = js.undefined,
    closeText: java.lang.String = null,
    constrainInput: js.UndefOr[scala.Boolean] = js.undefined,
    controlType: java.lang.String = null,
    currentText: java.lang.String = null,
    dateFormat: java.lang.String = null,
    dayNames: js.Array[java.lang.String] = null,
    dayNamesMin: js.Array[java.lang.String] = null,
    dayNamesShort: js.Array[java.lang.String] = null,
    defaultDate: js.Any = null,
    defaultValue: java.lang.String = null,
    duration: java.lang.String = null,
    endDate: stdLib.Date = null,
    firstDay: scala.Int | scala.Double = null,
    gotoCurrent: js.UndefOr[scala.Boolean] = js.undefined,
    hideIfNoPrevNext: js.UndefOr[scala.Boolean] = js.undefined,
    hour: scala.Int | scala.Double = null,
    hourGrid: scala.Int | scala.Double = null,
    hourMax: scala.Int | scala.Double = null,
    hourMin: scala.Int | scala.Double = null,
    hourText: java.lang.String = null,
    isRTL: js.UndefOr[scala.Boolean] = js.undefined,
    maxDate: js.Any = null,
    maxDateTime: stdLib.Date = null,
    microsec: scala.Int | scala.Double = null,
    microsecGrid: scala.Int | scala.Double = null,
    microsecMax: scala.Int | scala.Double = null,
    microsecMin: scala.Int | scala.Double = null,
    microsecText: java.lang.String = null,
    millisec: scala.Int | scala.Double = null,
    millisecGrid: scala.Int | scala.Double = null,
    millisecMax: scala.Int | scala.Double = null,
    millisecMin: scala.Int | scala.Double = null,
    millisecText: java.lang.String = null,
    minDate: js.Any = null,
    minDateTime: stdLib.Date = null,
    minute: scala.Int | scala.Double = null,
    minuteGrid: scala.Int | scala.Double = null,
    minuteMax: scala.Int | scala.Double = null,
    minuteMin: scala.Int | scala.Double = null,
    minuteText: java.lang.String = null,
    monthNames: js.Array[java.lang.String] = null,
    monthNamesShort: js.Array[java.lang.String] = null,
    navigationAsDateFormat: js.UndefOr[scala.Boolean] = js.undefined,
    nextText: java.lang.String = null,
    numberOfMonths: js.Any = null,
    onChangeMonthYear: js.Function3[/* year */ scala.Double, /* month */ scala.Double, /* inst */ js.Any, scala.Unit] = null,
    onClose: js.Function2[/* dateText */ java.lang.String, /* inst */ js.Any, scala.Unit] = null,
    onSelect: js.Function0[_] = null,
    parse: java.lang.String = null,
    pickerTimeFormat: java.lang.String = null,
    pickerTimeSuffix: java.lang.String = null,
    pmNames: java.lang.String = null,
    prevText: java.lang.String = null,
    second: scala.Int | scala.Double = null,
    secondGrid: scala.Int | scala.Double = null,
    secondMax: scala.Int | scala.Double = null,
    secondMin: scala.Int | scala.Double = null,
    secondText: java.lang.String = null,
    selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    shortYearCutoff: js.Any = null,
    showAnim: java.lang.String = null,
    showButtonPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showCurrentAtPos: scala.Int | scala.Double = null,
    showHour: js.UndefOr[scala.Boolean] = js.undefined,
    showMicrosec: js.UndefOr[scala.Boolean] = js.undefined,
    showMillisec: js.UndefOr[scala.Boolean] = js.undefined,
    showMinute: js.UndefOr[scala.Boolean] = js.undefined,
    showMonthAfterYear: js.UndefOr[scala.Boolean] = js.undefined,
    showOn: java.lang.String = null,
    showOptions: js.Any = null,
    showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    showSecond: js.UndefOr[scala.Boolean] = js.undefined,
    showTime: js.UndefOr[scala.Boolean] = js.undefined,
    showTimepicker: js.UndefOr[scala.Boolean] = js.undefined,
    showTimezone: js.UndefOr[scala.Boolean] = js.undefined,
    showWeek: js.UndefOr[scala.Boolean] = js.undefined,
    sliderAccessArgs: js.Any = null,
    stepHour: scala.Int | scala.Double = null,
    stepMicrosec: scala.Int | scala.Double = null,
    stepMillisec: scala.Int | scala.Double = null,
    stepMinute: scala.Int | scala.Double = null,
    stepMonths: scala.Int | scala.Double = null,
    stepSecond: scala.Int | scala.Double = null,
    timeFormat: java.lang.String = null,
    timeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    timeOnlyTitle: java.lang.String = null,
    timeSuffix: java.lang.String = null,
    timeText: java.lang.String = null,
    timezone: scala.Int | scala.Double = null,
    timezoneList: js.Array[TimezoneOptions] = null,
    timezoneText: java.lang.String = null,
    weekHeader: java.lang.String = null,
    yearRange: java.lang.String = null,
    yearSuffix: java.lang.String = null
  ): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSliderAccess)) __obj.updateDynamic("addSliderAccess")(addSliderAccess)
    if (altField != null) __obj.updateDynamic("altField")(altField)
    if (!js.isUndefined(altFieldTimeOnly)) __obj.updateDynamic("altFieldTimeOnly")(altFieldTimeOnly)
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat)
    if (altSeparator != null) __obj.updateDynamic("altSeparator")(altSeparator)
    if (altTimeFormat != null) __obj.updateDynamic("altTimeFormat")(altTimeFormat)
    if (altTimeSuffix != null) __obj.updateDynamic("altTimeSuffix")(altTimeSuffix)
    if (!js.isUndefined(alwaysSetTime)) __obj.updateDynamic("alwaysSetTime")(alwaysSetTime)
    if (amNames != null) __obj.updateDynamic("amNames")(amNames)
    if (appendText != null) __obj.updateDynamic("appendText")(appendText)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(beforeShowDay)
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage)
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (calculateWeek != null) __obj.updateDynamic("calculateWeek")(calculateWeek)
    if (!js.isUndefined(changeMonth)) __obj.updateDynamic("changeMonth")(changeMonth)
    if (!js.isUndefined(changeYear)) __obj.updateDynamic("changeYear")(changeYear)
    if (closeText != null) __obj.updateDynamic("closeText")(closeText)
    if (!js.isUndefined(constrainInput)) __obj.updateDynamic("constrainInput")(constrainInput)
    if (controlType != null) __obj.updateDynamic("controlType")(controlType)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames)
    if (dayNamesMin != null) __obj.updateDynamic("dayNamesMin")(dayNamesMin)
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoCurrent)) __obj.updateDynamic("gotoCurrent")(gotoCurrent)
    if (!js.isUndefined(hideIfNoPrevNext)) __obj.updateDynamic("hideIfNoPrevNext")(hideIfNoPrevNext)
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hourGrid != null) __obj.updateDynamic("hourGrid")(hourGrid.asInstanceOf[js.Any])
    if (hourMax != null) __obj.updateDynamic("hourMax")(hourMax.asInstanceOf[js.Any])
    if (hourMin != null) __obj.updateDynamic("hourMin")(hourMin.asInstanceOf[js.Any])
    if (hourText != null) __obj.updateDynamic("hourText")(hourText)
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxDateTime != null) __obj.updateDynamic("maxDateTime")(maxDateTime)
    if (microsec != null) __obj.updateDynamic("microsec")(microsec.asInstanceOf[js.Any])
    if (microsecGrid != null) __obj.updateDynamic("microsecGrid")(microsecGrid.asInstanceOf[js.Any])
    if (microsecMax != null) __obj.updateDynamic("microsecMax")(microsecMax.asInstanceOf[js.Any])
    if (microsecMin != null) __obj.updateDynamic("microsecMin")(microsecMin.asInstanceOf[js.Any])
    if (microsecText != null) __obj.updateDynamic("microsecText")(microsecText)
    if (millisec != null) __obj.updateDynamic("millisec")(millisec.asInstanceOf[js.Any])
    if (millisecGrid != null) __obj.updateDynamic("millisecGrid")(millisecGrid.asInstanceOf[js.Any])
    if (millisecMax != null) __obj.updateDynamic("millisecMax")(millisecMax.asInstanceOf[js.Any])
    if (millisecMin != null) __obj.updateDynamic("millisecMin")(millisecMin.asInstanceOf[js.Any])
    if (millisecText != null) __obj.updateDynamic("millisecText")(millisecText)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minDateTime != null) __obj.updateDynamic("minDateTime")(minDateTime)
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minuteGrid != null) __obj.updateDynamic("minuteGrid")(minuteGrid.asInstanceOf[js.Any])
    if (minuteMax != null) __obj.updateDynamic("minuteMax")(minuteMax.asInstanceOf[js.Any])
    if (minuteMin != null) __obj.updateDynamic("minuteMin")(minuteMin.asInstanceOf[js.Any])
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort)
    if (!js.isUndefined(navigationAsDateFormat)) __obj.updateDynamic("navigationAsDateFormat")(navigationAsDateFormat)
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths)
    if (onChangeMonthYear != null) __obj.updateDynamic("onChangeMonthYear")(onChangeMonthYear)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (pickerTimeFormat != null) __obj.updateDynamic("pickerTimeFormat")(pickerTimeFormat)
    if (pickerTimeSuffix != null) __obj.updateDynamic("pickerTimeSuffix")(pickerTimeSuffix)
    if (pmNames != null) __obj.updateDynamic("pmNames")(pmNames)
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (secondGrid != null) __obj.updateDynamic("secondGrid")(secondGrid.asInstanceOf[js.Any])
    if (secondMax != null) __obj.updateDynamic("secondMax")(secondMax.asInstanceOf[js.Any])
    if (secondMin != null) __obj.updateDynamic("secondMin")(secondMin.asInstanceOf[js.Any])
    if (secondText != null) __obj.updateDynamic("secondText")(secondText)
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff)
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim)
    if (!js.isUndefined(showButtonPanel)) __obj.updateDynamic("showButtonPanel")(showButtonPanel)
    if (showCurrentAtPos != null) __obj.updateDynamic("showCurrentAtPos")(showCurrentAtPos.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour)
    if (!js.isUndefined(showMicrosec)) __obj.updateDynamic("showMicrosec")(showMicrosec)
    if (!js.isUndefined(showMillisec)) __obj.updateDynamic("showMillisec")(showMillisec)
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute)
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions)
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths)
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond)
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime)
    if (!js.isUndefined(showTimepicker)) __obj.updateDynamic("showTimepicker")(showTimepicker)
    if (!js.isUndefined(showTimezone)) __obj.updateDynamic("showTimezone")(showTimezone)
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek)
    if (sliderAccessArgs != null) __obj.updateDynamic("sliderAccessArgs")(sliderAccessArgs)
    if (stepHour != null) __obj.updateDynamic("stepHour")(stepHour.asInstanceOf[js.Any])
    if (stepMicrosec != null) __obj.updateDynamic("stepMicrosec")(stepMicrosec.asInstanceOf[js.Any])
    if (stepMillisec != null) __obj.updateDynamic("stepMillisec")(stepMillisec.asInstanceOf[js.Any])
    if (stepMinute != null) __obj.updateDynamic("stepMinute")(stepMinute.asInstanceOf[js.Any])
    if (stepMonths != null) __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    if (stepSecond != null) __obj.updateDynamic("stepSecond")(stepSecond.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly)
    if (timeOnlyTitle != null) __obj.updateDynamic("timeOnlyTitle")(timeOnlyTitle)
    if (timeSuffix != null) __obj.updateDynamic("timeSuffix")(timeSuffix)
    if (timeText != null) __obj.updateDynamic("timeText")(timeText)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (timezoneList != null) __obj.updateDynamic("timezoneList")(timezoneList)
    if (timezoneText != null) __obj.updateDynamic("timezoneText")(timezoneText)
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader)
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange)
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix)
    __obj.asInstanceOf[DateTimePickerOptions]
  }
}

