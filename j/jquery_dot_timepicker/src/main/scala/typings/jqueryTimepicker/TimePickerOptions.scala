package typings.jqueryTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerOptions extends StObject {
  
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
  var beforeShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var onClose: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, js.Any]] = js.undefined
  
  //NEW: 2011-02-03
  /** callback for enabling / disabling on selectable hours  ex : function(hour) { return true; } */
  var onHourShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** callback for enabling / disabling on time selection  ex : function(hour,minute) { return true; } */
  var onMinuteShow: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** Define a callback function when a hour / minutes is selected */
  var onSelect: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, js.Any]] = js.undefined
  
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
  
  inline def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  
  extension [Self <: TimePickerOptions](x: Self) {
    
    inline def setAltField(value: String): Self = StObject.set(x, "altField", value.asInstanceOf[js.Any])
    
    inline def setAltFieldUndefined: Self = StObject.set(x, "altField", js.undefined)
    
    inline def setAmPmText(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPmText", value.asInstanceOf[js.Any])
    
    inline def setAmPmTextUndefined: Self = StObject.set(x, "amPmText", js.undefined)
    
    inline def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
    
    inline def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
    
    inline def setAtPosition(value: String): Self = StObject.set(x, "atPosition", value.asInstanceOf[js.Any])
    
    inline def setAtPositionUndefined: Self = StObject.set(x, "atPosition", js.undefined)
    
    inline def setBeforeShow(value: () => js.Any): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setCloseButtonText(value: String): Self = StObject.set(x, "closeButtonText", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonTextUndefined: Self = StObject.set(x, "closeButtonText", js.undefined)
    
    inline def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    inline def setDeselectButtonText(value: String): Self = StObject.set(x, "deselectButtonText", value.asInstanceOf[js.Any])
    
    inline def setDeselectButtonTextUndefined: Self = StObject.set(x, "deselectButtonText", js.undefined)
    
    inline def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
    
    inline def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
    
    inline def setHours(value: TimePickerHour): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
    
    inline def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
    
    inline def setMinutes(value: TimePickerMinutes): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setMyPosition(value: String): Self = StObject.set(x, "myPosition", value.asInstanceOf[js.Any])
    
    inline def setMyPositionUndefined: Self = StObject.set(x, "myPosition", js.undefined)
    
    inline def setNowButtonText(value: String): Self = StObject.set(x, "nowButtonText", value.asInstanceOf[js.Any])
    
    inline def setNowButtonTextUndefined: Self = StObject.set(x, "nowButtonText", js.undefined)
    
    inline def setOnClose(value: (/* timeText */ String, /* inst */ js.Any) => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnHourShow(value: () => js.Any): Self = StObject.set(x, "onHourShow", js.Any.fromFunction0(value))
    
    inline def setOnHourShowUndefined: Self = StObject.set(x, "onHourShow", js.undefined)
    
    inline def setOnMinuteShow(value: () => js.Any): Self = StObject.set(x, "onMinuteShow", js.Any.fromFunction0(value))
    
    inline def setOnMinuteShowUndefined: Self = StObject.set(x, "onMinuteShow", js.undefined)
    
    inline def setOnSelect(value: (/* timeText */ String, /* inst */ js.Any) => js.Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOptionalMinutes(value: Boolean): Self = StObject.set(x, "optionalMinutes", value.asInstanceOf[js.Any])
    
    inline def setOptionalMinutesUndefined: Self = StObject.set(x, "optionalMinutes", js.undefined)
    
    inline def setPeriodSeparator(value: String): Self = StObject.set(x, "periodSeparator", value.asInstanceOf[js.Any])
    
    inline def setPeriodSeparatorUndefined: Self = StObject.set(x, "periodSeparator", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setShowAnim(value: String): Self = StObject.set(x, "showAnim", value.asInstanceOf[js.Any])
    
    inline def setShowAnimUndefined: Self = StObject.set(x, "showAnim", js.undefined)
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    inline def setShowDeselectButton(value: Boolean): Self = StObject.set(x, "showDeselectButton", value.asInstanceOf[js.Any])
    
    inline def setShowDeselectButtonUndefined: Self = StObject.set(x, "showDeselectButton", js.undefined)
    
    inline def setShowHours(value: Boolean): Self = StObject.set(x, "showHours", value.asInstanceOf[js.Any])
    
    inline def setShowHoursUndefined: Self = StObject.set(x, "showHours", js.undefined)
    
    inline def setShowLeadingZero(value: Boolean): Self = StObject.set(x, "showLeadingZero", value.asInstanceOf[js.Any])
    
    inline def setShowLeadingZeroUndefined: Self = StObject.set(x, "showLeadingZero", js.undefined)
    
    inline def setShowMinutes(value: Boolean): Self = StObject.set(x, "showMinutes", value.asInstanceOf[js.Any])
    
    inline def setShowMinutesLeadingZero(value: Boolean): Self = StObject.set(x, "showMinutesLeadingZero", value.asInstanceOf[js.Any])
    
    inline def setShowMinutesLeadingZeroUndefined: Self = StObject.set(x, "showMinutesLeadingZero", js.undefined)
    
    inline def setShowMinutesUndefined: Self = StObject.set(x, "showMinutes", js.undefined)
    
    inline def setShowNowButton(value: Boolean): Self = StObject.set(x, "showNowButton", value.asInstanceOf[js.Any])
    
    inline def setShowNowButtonUndefined: Self = StObject.set(x, "showNowButton", js.undefined)
    
    inline def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setShowOptions(value: js.Any): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
    
    inline def setShowOptionsUndefined: Self = StObject.set(x, "showOptions", js.undefined)
    
    inline def setShowPeriod(value: Boolean): Self = StObject.set(x, "showPeriod", value.asInstanceOf[js.Any])
    
    inline def setShowPeriodLabels(value: Boolean): Self = StObject.set(x, "showPeriodLabels", value.asInstanceOf[js.Any])
    
    inline def setShowPeriodLabelsUndefined: Self = StObject.set(x, "showPeriodLabels", js.undefined)
    
    inline def setShowPeriodUndefined: Self = StObject.set(x, "showPeriod", js.undefined)
    
    inline def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    inline def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
