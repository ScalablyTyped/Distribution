package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MultiViewCalendar")
@js.native
class MultiViewCalendar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: MultiViewCalendarOptions) = this()
  @JSName("options")
  var options_MultiViewCalendar: MultiViewCalendarOptions = js.native
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
  def selectDates(): js.Any = js.native
  def selectDates(dates: js.Any): Unit = js.native
  def selectRange(): js.Any = js.native
  def selectRange(range: js.Any): Unit = js.native
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
  def view(): js.Any = js.native
}

/* static members */
@JSGlobal("kendo.ui.MultiViewCalendar")
@js.native
object MultiViewCalendar extends js.Object {
  var fn: MultiViewCalendar = js.native
  def extend(proto: js.Object): MultiViewCalendar = js.native
}

