package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Calendar")
@js.native
class Calendar protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: CalendarOptions) = this()
  @JSName("options")
  var options_Calendar: CalendarOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def current(): stdLib.Date = js.native
  def max(): stdLib.Date = js.native
  def max(value: java.lang.String): scala.Unit = js.native
  def max(value: stdLib.Date): scala.Unit = js.native
  def min(): stdLib.Date = js.native
  def min(value: java.lang.String): scala.Unit = js.native
  def min(value: stdLib.Date): scala.Unit = js.native
  def navigate(value: stdLib.Date, view: java.lang.String): scala.Unit = js.native
  def navigateDown(value: stdLib.Date): scala.Unit = js.native
  def navigateToFuture(): scala.Unit = js.native
  def navigateToPast(): scala.Unit = js.native
  def navigateUp(): scala.Unit = js.native
  def selectDates(): scala.Unit = js.native
  def selectDates(datesToSelect: js.Any): scala.Unit = js.native
  //somehow the same interface got implemented twice which are the same
  //kendo-ui supports date selection(https://docs.telerik.com/kendo-ui/knowledge-base/calendar-select-range-of-dates)
  def value(): stdLib.Date = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: stdLib.Date): scala.Unit = js.native
  def view(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.ui.Calendar")
@js.native
object Calendar extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Calendar = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Calendar = js.native
}

