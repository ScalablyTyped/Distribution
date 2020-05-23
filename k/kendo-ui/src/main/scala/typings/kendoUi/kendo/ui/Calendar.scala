package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends Widget {
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

