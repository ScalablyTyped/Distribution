package typings
package jqueryDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimePickerOptions extends js.Object {
  /** Selector for an alternate field to store selected time into */
  var altField: js.UndefOr[java.lang.String] = js.undefined
  /** Define the locale text for periods. */
  var amPmText: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  /** Display text following the input box, e.g. showing the format */
  var appendText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Position of the input element to match
       *
       * Note : if the position utility is not loaded, the timepicker will attach left top to left bottom
       * See the position utility for more info : http://jqueryui.com/demos/position/
       */
  var atPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Define a callback function executed before the timepicker is shown */
  var beforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
       * 'button' element that will trigger the timepicker.
       *
       * "button" for trigger button, or "both" for either (not yet implemented).
       */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /** Text for the confirmation button (ok button).*/
  var closeButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Used as default time when input field is empty or for inline timePicker
       * (set to 'now' for the current time, '' for no highlighted time)
       **/
  var defaultTime: js.UndefOr[java.lang.String] = js.undefined
  /** Text for the deselect button */
  var deselectButtonText: js.UndefOr[java.lang.String] = js.undefined
  // Localization
  /** Define the locale text for "Hours" */
  var hourText: js.UndefOr[java.lang.String] = js.undefined
  var hours: js.UndefOr[TimePickerHour] = js.undefined
  /** Define the locale text for "Minute" */
  var minuteText: js.UndefOr[java.lang.String] = js.undefined
  var minutes: js.UndefOr[TimePickerMinutes] = js.undefined
  /**
       * Position of the dialog relative to the input.
       *
       * See the position utility for more info : http://jqueryui.com/demos/position/
       */
  var myPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Text for the 'now' button.*/
  var nowButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** Define a callback function when the timepicker is closed */
  var onClose: js.UndefOr[js.Function2[/* timeText */ java.lang.String, /* inst */ js.Any, _]] = js.undefined
  //NEW: 2011-02-03
  /** callback for enabling / disabling on selectable hours  ex : function(hour) { return true; } */
  var onHourShow: js.UndefOr[js.Function0[_]] = js.undefined
  /** callback for enabling / disabling on time selection  ex : function(hour,minute) { return true; } */
  var onMinuteShow: js.UndefOr[js.Function0[_]] = js.undefined
  /** Define a callback function when a hour / minutes is selected */
  var onSelect: js.UndefOr[js.Function2[/* timeText */ java.lang.String, /* inst */ js.Any, _]] = js.undefined
  /** optionally parse inputs of whole hours with minutes omitted */
  var optionalMinutes: js.UndefOr[scala.Boolean] = js.undefined
  /** The character to use to separate the time from the time period. */
  var periodSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** number of rows for the input tables, minimum 2, makes more sense if you use multiple of 2 */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /** Name of jQuery animation for popup */
  var showAnim: js.UndefOr[java.lang.String] = js.undefined
  // buttons
  /** shows an OK button to confirm the edit */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the deselect time button */
  var showDeselectButton: js.UndefOr[scala.Boolean] = js.undefined
  // 2011-08-05 0.2.4
  /** display the hours section of the dialog */
  var showHours: js.UndefOr[scala.Boolean] = js.undefined
  /** Define whether or not to show a leading zero for hours < 10. [true/false] */
  var showLeadingZero: js.UndefOr[scala.Boolean] = js.undefined
  /** display the minute section of the dialog */
  var showMinutes: js.UndefOr[scala.Boolean] = js.undefined
  /** Define whether or not to show a leading zero for minutes < 10. */
  var showMinutesLeadingZero: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows the 'now' button */
  var showNowButton: js.UndefOr[scala.Boolean] = js.undefined
  /** 'focus' for popup on focus, */
  var showOn: js.UndefOr[java.lang.String] = js.undefined
  /** Options for enhanced animations */
  var showOptions: js.UndefOr[js.Any] = js.undefined
  /** Define whether or not to show AM/PM with selected time */
  var showPeriod: js.UndefOr[scala.Boolean] = js.undefined
  /** Show the AM/PM labels on the left of the time picker */
  var showPeriodLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** The character to use to separate hours and minutes. */
  var timeSeparator: js.UndefOr[java.lang.String] = js.undefined
}

