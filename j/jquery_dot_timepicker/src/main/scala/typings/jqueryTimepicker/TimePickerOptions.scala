package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  /** Selector for an alternate field to store selected time into */
  var altField: js.UndefOr[String] = js.undefined
  /** Define the locale text for periods. */
  var amPmText: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  /** Display text following the input box, e.g. showing the format */
  var appendText: js.UndefOr[String] = js.undefined
  /**
    * Position of the input element to match
    *
    * Note : if the position utility is not loaded, the timepicker will attach left top to left bottom
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var atPosition: js.UndefOr[String] = js.undefined
  /** Define a callback function executed before the timepicker is shown */
  var beforeShow: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * 'button' element that will trigger the timepicker.
    *
    * "button" for trigger button, or "both" for either (not yet implemented).
    */
  var button: js.UndefOr[String] = js.undefined
  /** Text for the confirmation button (ok button).*/
  var closeButtonText: js.UndefOr[String] = js.undefined
  /**
    * Used as default time when input field is empty or for inline timePicker
    * (set to 'now' for the current time, '' for no highlighted time)
    **/
  var defaultTime: js.UndefOr[String] = js.undefined
  /** Text for the deselect button */
  var deselectButtonText: js.UndefOr[String] = js.undefined
  // Localization
  /** Define the locale text for "Hours" */
  var hourText: js.UndefOr[String] = js.undefined
  var hours: js.UndefOr[TimePickerHour] = js.undefined
  /** Define the locale text for "Minute" */
  var minuteText: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[TimePickerMinutes] = js.undefined
  /**
    * Position of the dialog relative to the input.
    *
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var myPosition: js.UndefOr[String] = js.undefined
  /** Text for the 'now' button.*/
  var nowButtonText: js.UndefOr[String] = js.undefined
  /** Define a callback function when the timepicker is closed */
  var onClose: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.undefined
  //NEW: 2011-02-03
  /** callback for enabling / disabling on selectable hours  ex : function(hour) { return true; } */
  var onHourShow: js.UndefOr[js.Function0[_]] = js.undefined
  /** callback for enabling / disabling on time selection  ex : function(hour,minute) { return true; } */
  var onMinuteShow: js.UndefOr[js.Function0[_]] = js.undefined
  /** Define a callback function when a hour / minutes is selected */
  var onSelect: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.undefined
  /** optionally parse inputs of whole hours with minutes omitted */
  var optionalMinutes: js.UndefOr[Boolean] = js.undefined
  /** The character to use to separate the time from the time period. */
  var periodSeparator: js.UndefOr[String] = js.undefined
  /** number of rows for the input tables, minimum 2, makes more sense if you use multiple of 2 */
  var rows: js.UndefOr[Double] = js.undefined
  /** Name of jQuery animation for popup */
  var showAnim: js.UndefOr[String] = js.undefined
  // buttons
  /** shows an OK button to confirm the edit */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /** Shows the deselect time button */
  var showDeselectButton: js.UndefOr[Boolean] = js.undefined
  // 2011-08-05 0.2.4
  /** display the hours section of the dialog */
  var showHours: js.UndefOr[Boolean] = js.undefined
  /** Define whether or not to show a leading zero for hours < 10. [true/false] */
  var showLeadingZero: js.UndefOr[Boolean] = js.undefined
  /** display the minute section of the dialog */
  var showMinutes: js.UndefOr[Boolean] = js.undefined
  /** Define whether or not to show a leading zero for minutes < 10. */
  var showMinutesLeadingZero: js.UndefOr[Boolean] = js.undefined
  /** Shows the 'now' button */
  var showNowButton: js.UndefOr[Boolean] = js.undefined
  /** 'focus' for popup on focus, */
  var showOn: js.UndefOr[String] = js.undefined
  /** Options for enhanced animations */
  var showOptions: js.UndefOr[js.Any] = js.undefined
  /** Define whether or not to show AM/PM with selected time */
  var showPeriod: js.UndefOr[Boolean] = js.undefined
  /** Show the AM/PM labels on the left of the time picker */
  var showPeriodLabels: js.UndefOr[Boolean] = js.undefined
  /** The character to use to separate hours and minutes. */
  var timeSeparator: js.UndefOr[String] = js.undefined
}

object TimePickerOptions {
  @scala.inline
  def apply(
    altField: String = null,
    amPmText: js.Tuple2[String, String] = null,
    appendText: String = null,
    atPosition: String = null,
    beforeShow: () => _ = null,
    button: String = null,
    closeButtonText: String = null,
    defaultTime: String = null,
    deselectButtonText: String = null,
    hourText: String = null,
    hours: TimePickerHour = null,
    minuteText: String = null,
    minutes: TimePickerMinutes = null,
    myPosition: String = null,
    nowButtonText: String = null,
    onClose: (/* timeText */ String, /* inst */ js.Any) => _ = null,
    onHourShow: () => _ = null,
    onMinuteShow: () => _ = null,
    onSelect: (/* timeText */ String, /* inst */ js.Any) => _ = null,
    optionalMinutes: js.UndefOr[Boolean] = js.undefined,
    periodSeparator: String = null,
    rows: js.UndefOr[Double] = js.undefined,
    showAnim: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showDeselectButton: js.UndefOr[Boolean] = js.undefined,
    showHours: js.UndefOr[Boolean] = js.undefined,
    showLeadingZero: js.UndefOr[Boolean] = js.undefined,
    showMinutes: js.UndefOr[Boolean] = js.undefined,
    showMinutesLeadingZero: js.UndefOr[Boolean] = js.undefined,
    showNowButton: js.UndefOr[Boolean] = js.undefined,
    showOn: String = null,
    showOptions: js.Any = null,
    showPeriod: js.UndefOr[Boolean] = js.undefined,
    showPeriodLabels: js.UndefOr[Boolean] = js.undefined,
    timeSeparator: String = null
  ): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (altField != null) __obj.updateDynamic("altField")(altField.asInstanceOf[js.Any])
    if (amPmText != null) __obj.updateDynamic("amPmText")(amPmText.asInstanceOf[js.Any])
    if (appendText != null) __obj.updateDynamic("appendText")(appendText.asInstanceOf[js.Any])
    if (atPosition != null) __obj.updateDynamic("atPosition")(atPosition.asInstanceOf[js.Any])
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(js.Any.fromFunction0(beforeShow))
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (deselectButtonText != null) __obj.updateDynamic("deselectButtonText")(deselectButtonText.asInstanceOf[js.Any])
    if (hourText != null) __obj.updateDynamic("hourText")(hourText.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minuteText != null) __obj.updateDynamic("minuteText")(minuteText.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (myPosition != null) __obj.updateDynamic("myPosition")(myPosition.asInstanceOf[js.Any])
    if (nowButtonText != null) __obj.updateDynamic("nowButtonText")(nowButtonText.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHourShow != null) __obj.updateDynamic("onHourShow")(js.Any.fromFunction0(onHourShow))
    if (onMinuteShow != null) __obj.updateDynamic("onMinuteShow")(js.Any.fromFunction0(onMinuteShow))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(optionalMinutes)) __obj.updateDynamic("optionalMinutes")(optionalMinutes.get.asInstanceOf[js.Any])
    if (periodSeparator != null) __obj.updateDynamic("periodSeparator")(periodSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (showAnim != null) __obj.updateDynamic("showAnim")(showAnim.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeselectButton)) __obj.updateDynamic("showDeselectButton")(showDeselectButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHours)) __obj.updateDynamic("showHours")(showHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLeadingZero)) __obj.updateDynamic("showLeadingZero")(showLeadingZero.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinutes)) __obj.updateDynamic("showMinutes")(showMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinutesLeadingZero)) __obj.updateDynamic("showMinutesLeadingZero")(showMinutesLeadingZero.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNowButton)) __obj.updateDynamic("showNowButton")(showNowButton.get.asInstanceOf[js.Any])
    if (showOn != null) __obj.updateDynamic("showOn")(showOn.asInstanceOf[js.Any])
    if (showOptions != null) __obj.updateDynamic("showOptions")(showOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showPeriod)) __obj.updateDynamic("showPeriod")(showPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPeriodLabels)) __obj.updateDynamic("showPeriodLabels")(showPeriodLabels.get.asInstanceOf[js.Any])
    if (timeSeparator != null) __obj.updateDynamic("timeSeparator")(timeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerOptions]
  }
}

