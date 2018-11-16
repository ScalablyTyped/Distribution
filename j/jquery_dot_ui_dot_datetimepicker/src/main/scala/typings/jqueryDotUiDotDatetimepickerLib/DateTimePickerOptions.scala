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

