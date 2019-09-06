package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Calendar")
@js.native
class Calendar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: CalendarOptions) = this()
  @JSName("options")
  var options_Calendar: CalendarOptions = js.native
  var wrapper: JQuery = js.native
  def current(): Date = js.native
  def max(): Date = js.native
  def max(value: String): Unit = js.native
  def max(value: Date): Unit = js.native
  def min(): Date = js.native
  def min(value: String): Unit = js.native
  def min(value: Date): Unit = js.native
  def navigate(value: Date, view: String): Unit = js.native
  def navigateDown(value: Date): Unit = js.native
  def navigateToFuture(): Unit = js.native
  def navigateToPast(): Unit = js.native
  def navigateUp(): Unit = js.native
  def selectDates(): Unit = js.native
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
  def view(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.ui.Calendar")
@js.native
object Calendar extends js.Object {
  var fn: Calendar = js.native
  def extend(proto: js.Object): Calendar = js.native
}

