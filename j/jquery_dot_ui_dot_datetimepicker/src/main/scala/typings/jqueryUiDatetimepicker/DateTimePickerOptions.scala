package typings.jqueryUiDatetimepicker

import typings.jqueryui.JQueryUI.DatepickerOptions
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerOptions extends DatepickerOptions {
   //Default: true - Whether to show the timepicker within the datepicker.
  var addSliderAccess: js.UndefOr[Boolean] = js.undefined
   //Default: 'strict' - How to parse the time string. Two methods are provided: 'strict' which must match the timeFormat exactly, and 'loose' which uses javascript's new Date(timeString) to guess the time. You may also pass in a function(timeFormat, timeString, options) to handle the parsing yourself, returning a simple object:      
  // Alt field options
  var altFieldTimeOnly: js.UndefOr[Boolean] = js.undefined
    //Default: true - When altField is used from datepicker altField will only receive the formatted time and the original field only receives date.
  var altSeparator: js.UndefOr[String] = js.undefined
        //Default: (timeSuffix option) - String always placed after the formatted time in the altField.
  var altTimeFormat: js.UndefOr[String] = js.undefined
         //Default: (separator option) - String placed between formatted date and formatted time in the altField.
  var altTimeSuffix: js.UndefOr[String] = js.undefined
   //Default: null - Function to be called when a date is chosen or time has changed(parameters: datetimeText, datepickerInstance).
  var alwaysSetTime: js.UndefOr[Boolean] = js.undefined
        //Default: "Done", A Localization Setting - Text for the Close button.
  var amNames: js.UndefOr[String] = js.undefined
           //Default: false, A Localization Setting - Right to Left support. 
  // Timefield options
  var controlType: js.UndefOr[String] = js.undefined
   //Default: null - Object to pass to sliderAccess when used.
  var defaultValue: js.UndefOr[String] = js.undefined
     //Default: 1 - Microseconds per step the slider makes.
  var hour: js.UndefOr[Double] = js.undefined
      //Default: 999 - The maximum microsecond allowed for all dates.
  var hourGrid: js.UndefOr[Double] = js.undefined
      //Default: 0 - The minimum microsecond allowed for all dates.
  var hourMax: js.UndefOr[Double] = js.undefined
        //Default: null - Initial timezone set.This is the offset in minutes.If null the browser's local timezone will be used. If you're timezone is "-0400" you would use - 240. For backwards compatibility you may pass "-0400", however the timezone is stored in minutes and more reliable.
  var hourMin: js.UndefOr[Double] = js.undefined
         //Default: "Time", A Localization Setting - Label used within timepicker for the formatted time.
  var hourText: js.UndefOr[String] = js.undefined
   //Default: null - Date object of the minimum datetime allowed.Also available as minDate.
  var maxDateTime: js.UndefOr[Date] = js.undefined
         //Default: 0 - Initial millisecond set.
  var microsec: js.UndefOr[Double] = js.undefined
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in milliseconds) between labels.
  var microsecGrid: js.UndefOr[Double] = js.undefined
      //Default: 999 - The maximum millisecond allowed for all dates.
  var microsecMax: js.UndefOr[Double] = js.undefined
      //Default: 0 - The minimum millisecond allowed for all dates.
  var microsecMin: js.UndefOr[Double] = js.undefined
     //Default: "Millisecond", A Localization Setting - Label used to identify the millisecond slider.
  var microsecText: js.UndefOr[String] = js.undefined
           //Default: 0 - Initial second set.
  var millisec: js.UndefOr[Double] = js.undefined
       //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in seconds) between labels.
  var millisecGrid: js.UndefOr[Double] = js.undefined
        //Default: 59 - The maximum second allowed for all dates.
  var millisecMax: js.UndefOr[Double] = js.undefined
        //Default: 0 - The minimum second allowed for all dates.
  var millisecMin: js.UndefOr[Double] = js.undefined
       //Default: "Second", A Localization Setting - Label used to identify the second slider.
  var millisecText: js.UndefOr[String] = js.undefined
   //Default: null - String of the default time value placed in the input on focus when the input is empty.
  var minDateTime: js.UndefOr[Date] = js.undefined
             //Default: 0 - Initial hour set.
  var minute: js.UndefOr[Double] = js.undefined
         //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in hours) between labels.
  var minuteGrid: js.UndefOr[Double] = js.undefined
          //Default: 23 - The maximum hour allowed for all dates.
  var minuteMax: js.UndefOr[Double] = js.undefined
          //Default: 0 - The minimum hour allowed for all dates.
  var minuteMin: js.UndefOr[Double] = js.undefined
         //Default: "Hour", A Localization Setting - Label used to identify the hour slider.
  var minuteText: js.UndefOr[String] = js.undefined
   //Default: false - Hide the datepicker and only provide a time interface.
  @JSName("onSelect")
  var onSelect_DateTimePickerOptions: js.UndefOr[js.Function0[_]] = js.undefined
   //Default: null - Date object of the maximum datetime allowed.Also Available as maxDate.
  var parse: js.UndefOr[String] = js.undefined
   //Default: " " - When formatting the time this string is placed between the formatted date and formatted time.
  var pickerTimeFormat: js.UndefOr[String] = js.undefined
   //Default: (timeFormat option) - How to format the time displayed within the timepicker.
  var pickerTimeSuffix: js.UndefOr[String] = js.undefined
          //Default: ['AM', 'A'], A Localization Setting - Array of strings to try and parse against to determine AM.
  var pmNames: js.UndefOr[String] = js.undefined
           //Default: 0 - Initial minute set.
  var second: js.UndefOr[Double] = js.undefined
       //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in minutes) between labels.
  var secondGrid: js.UndefOr[Double] = js.undefined
        //Default: 59 - The maximum minute allowed for all dates.
  var secondMax: js.UndefOr[Double] = js.undefined
        //Default: 0 - The minimum minute allowed for all dates.
  var secondMin: js.UndefOr[Double] = js.undefined
       //Default: "Minute", A Localization Setting - Label used to identify the minute slider.
  var secondText: js.UndefOr[String] = js.undefined
   //Default: true - Always have a time set internally, even before user has chosen one.
  var separator: js.UndefOr[String] = js.undefined
      //Default: 'slider' - Whether to use 'slider' or 'select'.If 'slider' is unavailable through jQueryUI, 'select' will be used.For advanced usage you may pass an object which implements "create", "options", "value" methods to use controls other than sliders or selects.See the _controls property in the source code for more details.
  var showHour: js.UndefOr[Boolean] = js.undefined
   //Default: null - Whether to show the millisecond control. The default of null will use detection from timeFormat.
  var showMicrosec: js.UndefOr[Boolean] = js.undefined
     //Default: null - Whether to show the second control. The default of null will use detection from timeFormat.
  var showMillisec: js.UndefOr[Boolean] = js.undefined
       //Default: null - Whether to show the hour control. The default of null will use detection from timeFormat.
  var showMinute: js.UndefOr[Boolean] = js.undefined
     //Default: null - Whether to show the minute control. The default of null will use detection from timeFormat.
  var showSecond: js.UndefOr[Boolean] = js.undefined
   //Default: null - Whether to show the timezone select.
  var showTime: js.UndefOr[Boolean] = js.undefined
   //Default: (timeSuffix option) - String to place after the formatted time within the timepicker.
  var showTimepicker: js.UndefOr[Boolean] = js.undefined
   //Default: null - Whether to show the microsecond control. The default of null will use detection from timeFormat.
  var showTimezone: js.UndefOr[Boolean] = js.undefined
   //Default: false - Adds the sliderAccess plugin to sliders within timepicker
  var sliderAccessArgs: js.UndefOr[js.Any] = js.undefined
        //Default: true - Whether to show the time selected within the datetimepicker.
  var stepHour: js.UndefOr[Double] = js.undefined
     //Default: 1 - Milliseconds per step the slider makes.
  var stepMicrosec: js.UndefOr[Double] = js.undefined
       //Default: 1 - Seconds per step the slider makes.
  var stepMillisec: js.UndefOr[Double] = js.undefined
         //Default: 1 - Hours per step the slider makes.
  var stepMinute: js.UndefOr[Double] = js.undefined
       //Default: 1 - Minutes per step the slider makes.
  var stepSecond: js.UndefOr[Double] = js.undefined
          //Default: ['PM', 'P'], A Localization Setting - Array of strings to try and parse against to determine PM.
  var timeFormat: js.UndefOr[String] = js.undefined
   //Default: true - Whether to show the button panel at the bottom.This is generally needed.
  var timeOnly: js.UndefOr[Boolean] = js.undefined
       //Default: "", A Localization Setting - String to place after the formatted time.
  var timeOnlyTitle: js.UndefOr[String] = js.undefined
       //Default: "HH:mm", A Localization Setting - String of format tokens to be replaced with the time.See Formatting.
  var timeSuffix: js.UndefOr[String] = js.undefined
    //Default: "Choose Time", A Localization Setting - Title of the wigit when using only timepicker.
  var timeText: js.UndefOr[String] = js.undefined
         //Default: 0 - Initial microsecond set. Note: Javascript's native Date object does not natively support microseconds. Timepicker adds ability to simply Date.setMicroseconds(m) and Date.getMicroseconds(). Date comparisons will not acknowledge microseconds. Use this only for display purposes.
  var timezone: js.UndefOr[Double] = js.undefined
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in microseconds) between labels.
  // Timezone options
  var timezoneList: js.UndefOr[js.Array[TimezoneOptions]] = js.undefined
     //Default: "Microsecond", A Localization Setting - Label used to identify the microsecond slider.
  var timezoneText: js.UndefOr[String] = js.undefined
}

object DateTimePickerOptions {
  @scala.inline
  def apply(
    addSliderAccess: js.UndefOr[Boolean] = js.undefined,
    altField: js.Any = null,
    altFieldTimeOnly: js.UndefOr[Boolean] = js.undefined,
    altFormat: String = null,
    altSeparator: String = null,
    altTimeFormat: String = null,
    altTimeSuffix: String = null,
    alwaysSetTime: js.UndefOr[Boolean] = js.undefined,
    amNames: String = null,
    appendText: String = null,
    autoSize: js.UndefOr[Boolean] = js.undefined,
    autohide: js.UndefOr[Boolean] = js.undefined,
    beforeShow: (/* input */ Element, /* inst */ js.Any) => DatepickerOptions = null,
    beforeShowDay: /* date */ Date => js.Array[_] = null,
    buttonImage: String = null,
    buttonImageOnly: js.UndefOr[Boolean] = js.undefined,
    buttonText: String = null,
    calculateWeek: /* date */ Date => String = null,
    changeMonth: js.UndefOr[Boolean] = js.undefined,
    changeYear: js.UndefOr[Boolean] = js.undefined,
    closeText: String = null,
    constrainInput: js.UndefOr[Boolean] = js.undefined,
    controlType: String = null,
    currentText: String = null,
    dateFormat: String = null,
    dayNames: js.Array[String] = null,
    dayNamesMin: js.Array[String] = null,
    dayNamesShort: js.Array[String] = null,
    defaultDate: js.Any = null,
    defaultValue: String = null,
    duration: String = null,
    endDate: Date = null,
    firstDay: js.UndefOr[Double] = js.undefined,
    gotoCurrent: js.UndefOr[Boolean] = js.undefined,
    hideIfNoPrevNext: js.UndefOr[Boolean] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    hourGrid: js.UndefOr[Double] = js.undefined,
    hourMax: js.UndefOr[Double] = js.undefined,
    hourMin: js.UndefOr[Double] = js.undefined,
    hourText: String = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Any = null,
    maxDateTime: Date = null,
    microsec: js.UndefOr[Double] = js.undefined,
    microsecGrid: js.UndefOr[Double] = js.undefined,
    microsecMax: js.UndefOr[Double] = js.undefined,
    microsecMin: js.UndefOr[Double] = js.undefined,
    microsecText: String = null,
    millisec: js.UndefOr[Double] = js.undefined,
    millisecGrid: js.UndefOr[Double] = js.undefined,
    millisecMax: js.UndefOr[Double] = js.undefined,
    millisecMin: js.UndefOr[Double] = js.undefined,
    millisecText: String = null,
    minDate: js.Any = null,
    minDateTime: Date = null,
    minute: js.UndefOr[Double] = js.undefined,
    minuteGrid: js.UndefOr[Double] = js.undefined,
    minuteMax: js.UndefOr[Double] = js.undefined,
    minuteMin: js.UndefOr[Double] = js.undefined,
    minuteText: String = null,
    monthNames: js.Array[String] = null,
    monthNamesShort: js.Array[String] = null,
    navigationAsDateFormat: js.UndefOr[Boolean] = js.undefined,
    nextText: String = null,
    numberOfMonths: js.Any = null,
    onChangeMonthYear: (/* year */ Double, /* month */ Double, /* inst */ js.Any) => Unit = null,
    onClose: (/* dateText */ String, /* inst */ js.Any) => Unit = null,
    onSelect: () => _ = null,
    parse: String = null,
    pickerTimeFormat: String = null,
    pickerTimeSuffix: String = null,
    pmNames: String = null,
    prevText: String = null,
    second: js.UndefOr[Double] = js.undefined,
    secondGrid: js.UndefOr[Double] = js.undefined,
    secondMax: js.UndefOr[Double] = js.undefined,
    secondMin: js.UndefOr[Double] = js.undefined,
    secondText: String = null,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    shortYearCutoff: js.Any = null,
    showAnim: String = null,
    showButtonPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentAtPos: js.UndefOr[Double] = js.undefined,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMicrosec: js.UndefOr[Boolean] = js.undefined,
    showMillisec: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showMonthAfterYear: js.UndefOr[Boolean] = js.undefined,
    showOn: String = null,
    showOptions: js.Any = null,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    showTime: js.UndefOr[Boolean] = js.undefined,
    showTimepicker: js.UndefOr[Boolean] = js.undefined,
    showTimezone: js.UndefOr[Boolean] = js.undefined,
    showWeek: js.UndefOr[Boolean] = js.undefined,
    sliderAccessArgs: js.Any = null,
    stepHour: js.UndefOr[Double] = js.undefined,
    stepMicrosec: js.UndefOr[Double] = js.undefined,
    stepMillisec: js.UndefOr[Double] = js.undefined,
    stepMinute: js.UndefOr[Double] = js.undefined,
    stepMonths: js.UndefOr[Double] = js.undefined,
    stepSecond: js.UndefOr[Double] = js.undefined,
    timeFormat: String = null,
    timeOnly: js.UndefOr[Boolean] = js.undefined,
    timeOnlyTitle: String = null,
    timeSuffix: String = null,
    timeText: String = null,
    timezone: js.UndefOr[Double] = js.undefined,
    timezoneList: js.Array[TimezoneOptions] = null,
    timezoneText: String = null,
    weekHeader: String = null,
    yearRange: String = null,
    yearSuffix: String = null
  ): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSliderAccess)) __obj.updateDynamic("addSliderAccess")(addSliderAccess.get.asInstanceOf[js.Any])
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (!js.isUndefined(altFieldTimeOnly)) __obj.updateDynamic("altFieldTimeOnly")(altFieldTimeOnly.get.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (altSeparator != null) __obj.updateDynamic("altSeparator")(altSeparator.asInstanceOf[js.Any])
    if (altTimeFormat != null) __obj.updateDynamic("altTimeFormat")(altTimeFormat.asInstanceOf[js.Any])
    if (altTimeSuffix != null) __obj.updateDynamic("altTimeSuffix")(altTimeSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysSetTime)) __obj.updateDynamic("alwaysSetTime")(alwaysSetTime.get.asInstanceOf[js.Any])
    if (amNames != null) __obj.updateDynamic("amNames")(amNames.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.get.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction2(beforeShow))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1(beforeShowDay))
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly.get.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (calculateWeek != null) __obj.updateDynamic("calculateWeek")(js.Any.fromFunction1(calculateWeek))
    if (!js.isUndefined(changeMonth)) __obj.updateDynamic("changeMonth")(changeMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(changeYear)) __obj.updateDynamic("changeYear")(changeYear.get.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainInput)) __obj.updateDynamic("constrainInput")(constrainInput.get.asInstanceOf[js.Any])
    if (controlType != null) __obj.updateDynamic("controlType")(controlType.asInstanceOf[js.Any])
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayNamesMin != null) __obj.updateDynamic("dayNamesMin")(dayNamesMin.asInstanceOf[js.Any])
    if (dayNamesShort != null) __obj.updateDynamic("dayNamesShort")(dayNamesShort.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (!js.isUndefined(firstDay)) __obj.updateDynamic("firstDay")(firstDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoCurrent)) __obj.updateDynamic("gotoCurrent")(gotoCurrent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIfNoPrevNext)) __obj.updateDynamic("hideIfNoPrevNext")(hideIfNoPrevNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourGrid)) __obj.updateDynamic("hourGrid")(hourGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourMax)) __obj.updateDynamic("hourMax")(hourMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourMin)) __obj.updateDynamic("hourMin")(hourMin.get.asInstanceOf[js.Any])
    if (hourText != null) __obj.updateDynamic("hourText")(hourText.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDateTime != null) __obj.updateDynamic("maxDateTime")(maxDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(microsec)) __obj.updateDynamic("microsec")(microsec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microsecGrid)) __obj.updateDynamic("microsecGrid")(microsecGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microsecMax)) __obj.updateDynamic("microsecMax")(microsecMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microsecMin)) __obj.updateDynamic("microsecMin")(microsecMin.get.asInstanceOf[js.Any])
    if (microsecText != null) __obj.updateDynamic("microsecText")(microsecText.asInstanceOf[js.Any])
    if (!js.isUndefined(millisec)) __obj.updateDynamic("millisec")(millisec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecGrid)) __obj.updateDynamic("millisecGrid")(millisecGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecMax)) __obj.updateDynamic("millisecMax")(millisecMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecMin)) __obj.updateDynamic("millisecMin")(millisecMin.get.asInstanceOf[js.Any])
    if (millisecText != null) __obj.updateDynamic("millisecText")(millisecText.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minDateTime != null) __obj.updateDynamic("minDateTime")(minDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteGrid)) __obj.updateDynamic("minuteGrid")(minuteGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteMax)) __obj.updateDynamic("minuteMax")(minuteMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteMin)) __obj.updateDynamic("minuteMin")(minuteMin.get.asInstanceOf[js.Any])
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationAsDateFormat)) __obj.updateDynamic("navigationAsDateFormat")(navigationAsDateFormat.get.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onChangeMonthYear != null) __obj.updateDynamic("onChangeMonthYear")(js.Any.fromFunction3(onChangeMonthYear))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction0(onSelect))
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (pickerTimeFormat != null) __obj.updateDynamic("pickerTimeFormat")(pickerTimeFormat.asInstanceOf[js.Any])
    if (pickerTimeSuffix != null) __obj.updateDynamic("pickerTimeSuffix")(pickerTimeSuffix.asInstanceOf[js.Any])
    if (pmNames != null) __obj.updateDynamic("pmNames")(pmNames.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondGrid)) __obj.updateDynamic("secondGrid")(secondGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondMax)) __obj.updateDynamic("secondMax")(secondMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondMin)) __obj.updateDynamic("secondMin")(secondMin.get.asInstanceOf[js.Any])
    if (secondText != null) __obj.updateDynamic("secondText")(secondText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonPanel)) __obj.updateDynamic("showButtonPanel")(showButtonPanel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentAtPos)) __obj.updateDynamic("showCurrentAtPos")(showCurrentAtPos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMicrosec)) __obj.updateDynamic("showMicrosec")(showMicrosec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMillisec)) __obj.updateDynamic("showMillisec")(showMillisec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.get.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimepicker)) __obj.updateDynamic("showTimepicker")(showTimepicker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimezone)) __obj.updateDynamic("showTimezone")(showTimezone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.get.asInstanceOf[js.Any])
    if (sliderAccessArgs != null) __obj.updateDynamic("sliderAccessArgs")(sliderAccessArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(stepHour)) __obj.updateDynamic("stepHour")(stepHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepMicrosec)) __obj.updateDynamic("stepMicrosec")(stepMicrosec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepMillisec)) __obj.updateDynamic("stepMillisec")(stepMillisec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepMinute)) __obj.updateDynamic("stepMinute")(stepMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepMonths)) __obj.updateDynamic("stepMonths")(stepMonths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stepSecond)) __obj.updateDynamic("stepSecond")(stepSecond.get.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly.get.asInstanceOf[js.Any])
    if (timeOnlyTitle != null) __obj.updateDynamic("timeOnlyTitle")(timeOnlyTitle.asInstanceOf[js.Any])
    if (timeSuffix != null) __obj.updateDynamic("timeSuffix")(timeSuffix.asInstanceOf[js.Any])
    if (timeText != null) __obj.updateDynamic("timeText")(timeText.asInstanceOf[js.Any])
    if (!js.isUndefined(timezone)) __obj.updateDynamic("timezone")(timezone.get.asInstanceOf[js.Any])
    if (timezoneList != null) __obj.updateDynamic("timezoneList")(timezoneList.asInstanceOf[js.Any])
    if (timezoneText != null) __obj.updateDynamic("timezoneText")(timezoneText.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerOptions]
  }
}

