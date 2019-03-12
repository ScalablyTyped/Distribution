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

object TimePickerOptions {
  @scala.inline
  def apply(
    altField: java.lang.String = null,
    amPmText: js.Tuple2[java.lang.String, java.lang.String] = null,
    appendText: java.lang.String = null,
    atPosition: java.lang.String = null,
    beforeShow: () => _ = null,
    button: java.lang.String = null,
    closeButtonText: java.lang.String = null,
    defaultTime: java.lang.String = null,
    deselectButtonText: java.lang.String = null,
    hourText: java.lang.String = null,
    hours: TimePickerHour = null,
    minuteText: java.lang.String = null,
    minutes: TimePickerMinutes = null,
    myPosition: java.lang.String = null,
    nowButtonText: java.lang.String = null,
    onClose: (/* timeText */ java.lang.String, /* inst */ js.Any) => _ = null,
    onHourShow: () => _ = null,
    onMinuteShow: () => _ = null,
    onSelect: (/* timeText */ java.lang.String, /* inst */ js.Any) => _ = null,
    optionalMinutes: js.UndefOr[scala.Boolean] = js.undefined,
    periodSeparator: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    showAnim: java.lang.String = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showDeselectButton: js.UndefOr[scala.Boolean] = js.undefined,
    showHours: js.UndefOr[scala.Boolean] = js.undefined,
    showLeadingZero: js.UndefOr[scala.Boolean] = js.undefined,
    showMinutes: js.UndefOr[scala.Boolean] = js.undefined,
    showMinutesLeadingZero: js.UndefOr[scala.Boolean] = js.undefined,
    showNowButton: js.UndefOr[scala.Boolean] = js.undefined,
    showOn: java.lang.String = null,
    showOptions: js.Any = null,
    showPeriod: js.UndefOr[scala.Boolean] = js.undefined,
    showPeriodLabels: js.UndefOr[scala.Boolean] = js.undefined,
    timeSeparator: java.lang.String = null
  ): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (altField != null) __obj.updateDynamic("altField")(altField)
    if (amPmText != null) __obj.updateDynamic("amPmText")(amPmText)
    if (appendText != null) __obj.updateDynamic("appendText")(appendText)
    if (atPosition != null) __obj.updateDynamic("atPosition")(atPosition)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction0(beforeShow))
    if (button != null) __obj.updateDynamic("button")(button)
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText)
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime)
    if (deselectButtonText != null) __obj.updateDynamic("deselectButtonText")(deselectButtonText)
    if (hourText != null) __obj.updateDynamic("hourText")(hourText)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes)
    if (myPosition != null) __obj.updateDynamic("myPosition")(myPosition)
    if (nowButtonText != null) __obj.updateDynamic("nowButtonText")(nowButtonText)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHourShow != null) __obj.updateDynamic("onHourShow")(js.Any.fromFunction0(onHourShow))
    if (onMinuteShow != null) __obj.updateDynamic("onMinuteShow")(js.Any.fromFunction0(onMinuteShow))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(optionalMinutes)) __obj.updateDynamic("optionalMinutes")(optionalMinutes)
    if (periodSeparator != null) __obj.updateDynamic("periodSeparator")(periodSeparator)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showDeselectButton)) __obj.updateDynamic("showDeselectButton")(showDeselectButton)
    if (!js.isUndefined(showHours)) __obj.updateDynamic("showHours")(showHours)
    if (!js.isUndefined(showLeadingZero)) __obj.updateDynamic("showLeadingZero")(showLeadingZero)
    if (!js.isUndefined(showMinutes)) __obj.updateDynamic("showMinutes")(showMinutes)
    if (!js.isUndefined(showMinutesLeadingZero)) __obj.updateDynamic("showMinutesLeadingZero")(showMinutesLeadingZero)
    if (!js.isUndefined(showNowButton)) __obj.updateDynamic("showNowButton")(showNowButton)
    if (showOn != null) __obj.updateDynamic("showOn")(showOn)
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions)
    if (!js.isUndefined(showPeriod)) __obj.updateDynamic("showPeriod")(showPeriod)
    if (!js.isUndefined(showPeriodLabels)) __obj.updateDynamic("showPeriodLabels")(showPeriodLabels)
    if (timeSeparator != null) __obj.updateDynamic("timeSeparator")(timeSeparator)
    __obj.asInstanceOf[TimePickerOptions]
  }
}

