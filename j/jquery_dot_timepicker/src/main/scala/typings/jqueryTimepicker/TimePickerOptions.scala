package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerOptions extends js.Object {
  
  /** Selector for an alternate field to store selected time into */
  var altField: js.UndefOr[String] = js.native
  
  /** Define the locale text for periods. */
  var amPmText: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  /** Display text following the input box, e.g. showing the format */
  var appendText: js.UndefOr[String] = js.native
  
  /**
    * Position of the input element to match
    *
    * Note : if the position utility is not loaded, the timepicker will attach left top to left bottom
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var atPosition: js.UndefOr[String] = js.native
  
  /** Define a callback function executed before the timepicker is shown */
  var beforeShow: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * 'button' element that will trigger the timepicker.
    *
    * "button" for trigger button, or "both" for either (not yet implemented).
    */
  var button: js.UndefOr[String] = js.native
  
  /** Text for the confirmation button (ok button).*/
  var closeButtonText: js.UndefOr[String] = js.native
  
  /**
    * Used as default time when input field is empty or for inline timePicker
    * (set to 'now' for the current time, '' for no highlighted time)
    **/
  var defaultTime: js.UndefOr[String] = js.native
  
  /** Text for the deselect button */
  var deselectButtonText: js.UndefOr[String] = js.native
  
  // Localization
  /** Define the locale text for "Hours" */
  var hourText: js.UndefOr[String] = js.native
  
  var hours: js.UndefOr[TimePickerHour] = js.native
  
  /** Define the locale text for "Minute" */
  var minuteText: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[TimePickerMinutes] = js.native
  
  /**
    * Position of the dialog relative to the input.
    *
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var myPosition: js.UndefOr[String] = js.native
  
  /** Text for the 'now' button.*/
  var nowButtonText: js.UndefOr[String] = js.native
  
  /** Define a callback function when the timepicker is closed */
  var onClose: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.native
  
  //NEW: 2011-02-03
  /** callback for enabling / disabling on selectable hours  ex : function(hour) { return true; } */
  var onHourShow: js.UndefOr[js.Function0[_]] = js.native
  
  /** callback for enabling / disabling on time selection  ex : function(hour,minute) { return true; } */
  var onMinuteShow: js.UndefOr[js.Function0[_]] = js.native
  
  /** Define a callback function when a hour / minutes is selected */
  var onSelect: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.native
  
  /** optionally parse inputs of whole hours with minutes omitted */
  var optionalMinutes: js.UndefOr[Boolean] = js.native
  
  /** The character to use to separate the time from the time period. */
  var periodSeparator: js.UndefOr[String] = js.native
  
  /** number of rows for the input tables, minimum 2, makes more sense if you use multiple of 2 */
  var rows: js.UndefOr[Double] = js.native
  
  /** Name of jQuery animation for popup */
  var showAnim: js.UndefOr[String] = js.native
  
  // buttons
  /** shows an OK button to confirm the edit */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /** Shows the deselect time button */
  var showDeselectButton: js.UndefOr[Boolean] = js.native
  
  // 2011-08-05 0.2.4
  /** display the hours section of the dialog */
  var showHours: js.UndefOr[Boolean] = js.native
  
  /** Define whether or not to show a leading zero for hours < 10. [true/false] */
  var showLeadingZero: js.UndefOr[Boolean] = js.native
  
  /** display the minute section of the dialog */
  var showMinutes: js.UndefOr[Boolean] = js.native
  
  /** Define whether or not to show a leading zero for minutes < 10. */
  var showMinutesLeadingZero: js.UndefOr[Boolean] = js.native
  
  /** Shows the 'now' button */
  var showNowButton: js.UndefOr[Boolean] = js.native
  
  /** 'focus' for popup on focus, */
  var showOn: js.UndefOr[String] = js.native
  
  /** Options for enhanced animations */
  var showOptions: js.UndefOr[js.Any] = js.native
  
  /** Define whether or not to show AM/PM with selected time */
  var showPeriod: js.UndefOr[Boolean] = js.native
  
  /** Show the AM/PM labels on the left of the time picker */
  var showPeriodLabels: js.UndefOr[Boolean] = js.native
  
  /** The character to use to separate hours and minutes. */
  var timeSeparator: js.UndefOr[String] = js.native
}
object TimePickerOptions {
  
  @scala.inline
  def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  
  @scala.inline
  implicit class TimePickerOptionsOps[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAltField(value: String): Self = this.set("altField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltField: Self = this.set("altField", js.undefined)
    
    @scala.inline
    def setAmPmText(value: js.Tuple2[String, String]): Self = this.set("amPmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmPmText: Self = this.set("amPmText", js.undefined)
    
    @scala.inline
    def setAppendText(value: String): Self = this.set("appendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendText: Self = this.set("appendText", js.undefined)
    
    @scala.inline
    def setAtPosition(value: String): Self = this.set("atPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtPosition: Self = this.set("atPosition", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => _): Self = this.set("beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeShow: Self = this.set("beforeShow", js.undefined)
    
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setCloseButtonText(value: String): Self = this.set("closeButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonText: Self = this.set("closeButtonText", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String): Self = this.set("defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTime: Self = this.set("defaultTime", js.undefined)
    
    @scala.inline
    def setDeselectButtonText(value: String): Self = this.set("deselectButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeselectButtonText: Self = this.set("deselectButtonText", js.undefined)
    
    @scala.inline
    def setHourText(value: String): Self = this.set("hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourText: Self = this.set("hourText", js.undefined)
    
    @scala.inline
    def setHours(value: TimePickerHour): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinuteText(value: String): Self = this.set("minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteText: Self = this.set("minuteText", js.undefined)
    
    @scala.inline
    def setMinutes(value: TimePickerMinutes): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMyPosition(value: String): Self = this.set("myPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMyPosition: Self = this.set("myPosition", js.undefined)
    
    @scala.inline
    def setNowButtonText(value: String): Self = this.set("nowButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowButtonText: Self = this.set("nowButtonText", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnHourShow(value: () => _): Self = this.set("onHourShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHourShow: Self = this.set("onHourShow", js.undefined)
    
    @scala.inline
    def setOnMinuteShow(value: () => _): Self = this.set("onMinuteShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMinuteShow: Self = this.set("onMinuteShow", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOptionalMinutes(value: Boolean): Self = this.set("optionalMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalMinutes: Self = this.set("optionalMinutes", js.undefined)
    
    @scala.inline
    def setPeriodSeparator(value: String): Self = this.set("periodSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodSeparator: Self = this.set("periodSeparator", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setShowAnim(value: String): Self = this.set("showAnim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAnim: Self = this.set("showAnim", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setShowDeselectButton(value: Boolean): Self = this.set("showDeselectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeselectButton: Self = this.set("showDeselectButton", js.undefined)
    
    @scala.inline
    def setShowHours(value: Boolean): Self = this.set("showHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHours: Self = this.set("showHours", js.undefined)
    
    @scala.inline
    def setShowLeadingZero(value: Boolean): Self = this.set("showLeadingZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLeadingZero: Self = this.set("showLeadingZero", js.undefined)
    
    @scala.inline
    def setShowMinutes(value: Boolean): Self = this.set("showMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinutes: Self = this.set("showMinutes", js.undefined)
    
    @scala.inline
    def setShowMinutesLeadingZero(value: Boolean): Self = this.set("showMinutesLeadingZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMinutesLeadingZero: Self = this.set("showMinutesLeadingZero", js.undefined)
    
    @scala.inline
    def setShowNowButton(value: Boolean): Self = this.set("showNowButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNowButton: Self = this.set("showNowButton", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = this.set("showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOn: Self = this.set("showOn", js.undefined)
    
    @scala.inline
    def setShowOptions(value: js.Any): Self = this.set("showOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOptions: Self = this.set("showOptions", js.undefined)
    
    @scala.inline
    def setShowPeriod(value: Boolean): Self = this.set("showPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPeriod: Self = this.set("showPeriod", js.undefined)
    
    @scala.inline
    def setShowPeriodLabels(value: Boolean): Self = this.set("showPeriodLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPeriodLabels: Self = this.set("showPeriodLabels", js.undefined)
    
    @scala.inline
    def setTimeSeparator(value: String): Self = this.set("timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeparator: Self = this.set("timeSeparator", js.undefined)
  }
}
