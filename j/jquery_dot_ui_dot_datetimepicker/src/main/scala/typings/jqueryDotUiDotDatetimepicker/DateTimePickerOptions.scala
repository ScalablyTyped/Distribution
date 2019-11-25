package typings.jqueryDotUiDotDatetimepicker

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
    firstDay: Int | Double = null,
    gotoCurrent: js.UndefOr[Boolean] = js.undefined,
    hideIfNoPrevNext: js.UndefOr[Boolean] = js.undefined,
    hour: Int | Double = null,
    hourGrid: Int | Double = null,
    hourMax: Int | Double = null,
    hourMin: Int | Double = null,
    hourText: String = null,
    isRTL: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Any = null,
    maxDateTime: Date = null,
    microsec: Int | Double = null,
    microsecGrid: Int | Double = null,
    microsecMax: Int | Double = null,
    microsecMin: Int | Double = null,
    microsecText: String = null,
    millisec: Int | Double = null,
    millisecGrid: Int | Double = null,
    millisecMax: Int | Double = null,
    millisecMin: Int | Double = null,
    millisecText: String = null,
    minDate: js.Any = null,
    minDateTime: Date = null,
    minute: Int | Double = null,
    minuteGrid: Int | Double = null,
    minuteMax: Int | Double = null,
    minuteMin: Int | Double = null,
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
    second: Int | Double = null,
    secondGrid: Int | Double = null,
    secondMax: Int | Double = null,
    secondMin: Int | Double = null,
    secondText: String = null,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    shortYearCutoff: js.Any = null,
    showAnim: String = null,
    showButtonPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentAtPos: Int | Double = null,
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
    stepHour: Int | Double = null,
    stepMicrosec: Int | Double = null,
    stepMillisec: Int | Double = null,
    stepMinute: Int | Double = null,
    stepMonths: Int | Double = null,
    stepSecond: Int | Double = null,
    timeFormat: String = null,
    timeOnly: js.UndefOr[Boolean] = js.undefined,
    timeOnlyTitle: String = null,
    timeSuffix: String = null,
    timeText: String = null,
    timezone: Int | Double = null,
    timezoneList: js.Array[TimezoneOptions] = null,
    timezoneText: String = null,
    weekHeader: String = null,
    yearRange: String = null,
    yearSuffix: String = null
  ): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addSliderAccess)) __obj.updateDynamic("addSliderAccess")(addSliderAccess.asInstanceOf[js.Any])
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (!js.isUndefined(altFieldTimeOnly)) __obj.updateDynamic("altFieldTimeOnly")(altFieldTimeOnly.asInstanceOf[js.Any])
    if (altFormat != null) __obj.updateDynamic("altFormat")(altFormat.asInstanceOf[js.Any])
    if (altSeparator != null) __obj.updateDynamic("altSeparator")(altSeparator.asInstanceOf[js.Any])
    if (altTimeFormat != null) __obj.updateDynamic("altTimeFormat")(altTimeFormat.asInstanceOf[js.Any])
    if (altTimeSuffix != null) __obj.updateDynamic("altTimeSuffix")(altTimeSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysSetTime)) __obj.updateDynamic("alwaysSetTime")(alwaysSetTime.asInstanceOf[js.Any])
    if (amNames != null) __obj.updateDynamic("amNames")(amNames.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction2(beforeShow))
    if (beforeShowDay != null) __obj.updateDynamic("beforeShowDay")(js.Any.fromFunction1(beforeShowDay))
    if (buttonImage != null) __obj.updateDynamic("buttonImage")(buttonImage.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonImageOnly)) __obj.updateDynamic("buttonImageOnly")(buttonImageOnly.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (calculateWeek != null) __obj.updateDynamic("calculateWeek")(js.Any.fromFunction1(calculateWeek))
    if (!js.isUndefined(changeMonth)) __obj.updateDynamic("changeMonth")(changeMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(changeYear)) __obj.updateDynamic("changeYear")(changeYear.asInstanceOf[js.Any])
    if (closeText != null) __obj.updateDynamic("closeText")(closeText.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainInput)) __obj.updateDynamic("constrainInput")(constrainInput.asInstanceOf[js.Any])
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
    if (firstDay != null) __obj.updateDynamic("firstDay")(firstDay.asInstanceOf[js.Any])
    if (!js.isUndefined(gotoCurrent)) __obj.updateDynamic("gotoCurrent")(gotoCurrent.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIfNoPrevNext)) __obj.updateDynamic("hideIfNoPrevNext")(hideIfNoPrevNext.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hourGrid != null) __obj.updateDynamic("hourGrid")(hourGrid.asInstanceOf[js.Any])
    if (hourMax != null) __obj.updateDynamic("hourMax")(hourMax.asInstanceOf[js.Any])
    if (hourMin != null) __obj.updateDynamic("hourMin")(hourMin.asInstanceOf[js.Any])
    if (hourText != null) __obj.updateDynamic("hourText")(hourText.asInstanceOf[js.Any])
    if (!js.isUndefined(isRTL)) __obj.updateDynamic("isRTL")(isRTL.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDateTime != null) __obj.updateDynamic("maxDateTime")(maxDateTime.asInstanceOf[js.Any])
    if (microsec != null) __obj.updateDynamic("microsec")(microsec.asInstanceOf[js.Any])
    if (microsecGrid != null) __obj.updateDynamic("microsecGrid")(microsecGrid.asInstanceOf[js.Any])
    if (microsecMax != null) __obj.updateDynamic("microsecMax")(microsecMax.asInstanceOf[js.Any])
    if (microsecMin != null) __obj.updateDynamic("microsecMin")(microsecMin.asInstanceOf[js.Any])
    if (microsecText != null) __obj.updateDynamic("microsecText")(microsecText.asInstanceOf[js.Any])
    if (millisec != null) __obj.updateDynamic("millisec")(millisec.asInstanceOf[js.Any])
    if (millisecGrid != null) __obj.updateDynamic("millisecGrid")(millisecGrid.asInstanceOf[js.Any])
    if (millisecMax != null) __obj.updateDynamic("millisecMax")(millisecMax.asInstanceOf[js.Any])
    if (millisecMin != null) __obj.updateDynamic("millisecMin")(millisecMin.asInstanceOf[js.Any])
    if (millisecText != null) __obj.updateDynamic("millisecText")(millisecText.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minDateTime != null) __obj.updateDynamic("minDateTime")(minDateTime.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minuteGrid != null) __obj.updateDynamic("minuteGrid")(minuteGrid.asInstanceOf[js.Any])
    if (minuteMax != null) __obj.updateDynamic("minuteMax")(minuteMax.asInstanceOf[js.Any])
    if (minuteMin != null) __obj.updateDynamic("minuteMin")(minuteMin.asInstanceOf[js.Any])
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthNamesShort != null) __obj.updateDynamic("monthNamesShort")(monthNamesShort.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationAsDateFormat)) __obj.updateDynamic("navigationAsDateFormat")(navigationAsDateFormat.asInstanceOf[js.Any])
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
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (secondGrid != null) __obj.updateDynamic("secondGrid")(secondGrid.asInstanceOf[js.Any])
    if (secondMax != null) __obj.updateDynamic("secondMax")(secondMax.asInstanceOf[js.Any])
    if (secondMin != null) __obj.updateDynamic("secondMin")(secondMin.asInstanceOf[js.Any])
    if (secondText != null) __obj.updateDynamic("secondText")(secondText.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonPanel)) __obj.updateDynamic("showButtonPanel")(showButtonPanel.asInstanceOf[js.Any])
    if (showCurrentAtPos != null) __obj.updateDynamic("showCurrentAtPos")(showCurrentAtPos.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMicrosec)) __obj.updateDynamic("showMicrosec")(showMicrosec.asInstanceOf[js.Any])
    if (!js.isUndefined(showMillisec)) __obj.updateDynamic("showMillisec")(showMillisec.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthAfterYear)) __obj.updateDynamic("showMonthAfterYear")(showMonthAfterYear.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimepicker)) __obj.updateDynamic("showTimepicker")(showTimepicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimezone)) __obj.updateDynamic("showTimezone")(showTimezone.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.asInstanceOf[js.Any])
    if (sliderAccessArgs != null) __obj.updateDynamic("sliderAccessArgs")(sliderAccessArgs.asInstanceOf[js.Any])
    if (stepHour != null) __obj.updateDynamic("stepHour")(stepHour.asInstanceOf[js.Any])
    if (stepMicrosec != null) __obj.updateDynamic("stepMicrosec")(stepMicrosec.asInstanceOf[js.Any])
    if (stepMillisec != null) __obj.updateDynamic("stepMillisec")(stepMillisec.asInstanceOf[js.Any])
    if (stepMinute != null) __obj.updateDynamic("stepMinute")(stepMinute.asInstanceOf[js.Any])
    if (stepMonths != null) __obj.updateDynamic("stepMonths")(stepMonths.asInstanceOf[js.Any])
    if (stepSecond != null) __obj.updateDynamic("stepSecond")(stepSecond.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly.asInstanceOf[js.Any])
    if (timeOnlyTitle != null) __obj.updateDynamic("timeOnlyTitle")(timeOnlyTitle.asInstanceOf[js.Any])
    if (timeSuffix != null) __obj.updateDynamic("timeSuffix")(timeSuffix.asInstanceOf[js.Any])
    if (timeText != null) __obj.updateDynamic("timeText")(timeText.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (timezoneList != null) __obj.updateDynamic("timezoneList")(timezoneList.asInstanceOf[js.Any])
    if (timezoneText != null) __obj.updateDynamic("timezoneText")(timezoneText.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (yearSuffix != null) __obj.updateDynamic("yearSuffix")(yearSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerOptions]
  }
}

