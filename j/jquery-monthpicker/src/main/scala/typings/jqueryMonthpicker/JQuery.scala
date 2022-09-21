package typings.jqueryMonthpicker

import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Clear
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.ClearAllCallbacks
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Close
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Disable
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Enable
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.GetSelectedDate
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.GetSelectedMonth
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.GetSelectedMonthYear
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.GetSelectedYear
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Open
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Toggle
import typings.jqueryMonthpicker.jqueryMonthpickerStrings.Validate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def MonthPicker(options: JQueryMonthPickerOptions): JQuery = js.native
  /** Clears the state of all input and validation warnings. */
  @JSName("MonthPicker")
  def MonthPicker_Clear(methodName: Clear): Unit = js.native
  /** Disables all previously assigned event callbacks listed in the Events tab. */
  @JSName("MonthPicker")
  def MonthPicker_ClearAllCallbacks(methodName: ClearAllCallbacks): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Closes the month picker if it's already open. */
  @JSName("MonthPicker")
  def MonthPicker_Close(methodName: Close): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Disables the MonthPicker and its associated elements. */
  @JSName("MonthPicker")
  def MonthPicker_Disable(methodName: Disable): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Enables the MonthPicker and its associated elements. */
  @JSName("MonthPicker")
  def MonthPicker_Enable(methodName: Enable): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Returns the selected month as a Date object. */
  @JSName("MonthPicker")
  def MonthPicker_GetSelectedDate(methodName: GetSelectedDate): js.Date = js.native
  /** Returns only the month portion of the selected date as an integer. Returns NaN if there is no valid date. */
  @JSName("MonthPicker")
  def MonthPicker_GetSelectedMonth(methodName: GetSelectedMonth): Double = js.native
  /** Validates the selected month/year and returns the selected value as a string (for example '1/2015') if it is a valid date. */
  @JSName("MonthPicker")
  def MonthPicker_GetSelectedMonthYear(methodName: GetSelectedMonthYear): String | Null = js.native
  /** Returns only the year portion of the selected date as an integer. Returns NaN if there is no valid date. */
  @JSName("MonthPicker")
  def MonthPicker_GetSelectedYear(methodName: GetSelectedYear): Double = js.native
  // tslint:disable-line:unified-signatures
  /** Opens the month picker menu and keeps it open if it's already open, see the OnBeforeMenuClose event to prevent the menu from closing on click (or other) events. */
  @JSName("MonthPicker")
  def MonthPicker_Open(methodName: Open): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Opens the month picker menu or closes the menu if it's already open, see the OnBeforeMenuClose event to prevent the menu from closing on click (or other) events.  */
  @JSName("MonthPicker")
  def MonthPicker_Toggle(methodName: Toggle): Unit = js.native
  // tslint:disable-line:unified-signatures
  /** Validates the selected month/year and returns the selected value as a Date object if it is a valid date. */
  @JSName("MonthPicker")
  def MonthPicker_Validate(methodName: Validate): Unit = js.native
}
