package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiViewCalendar
  extends StObject
     with Widget {
  
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
  
  @JSName("options")
  var options_MultiViewCalendar: MultiViewCalendarOptions = js.native
  
  def selectDates(): js.Any = js.native
  def selectDates(dates: js.Any): Unit = js.native
  
  def selectRange(): js.Any = js.native
  def selectRange(range: js.Any): Unit = js.native
  
  def value(): Date = js.native
  def value(value: String): Unit = js.native
  def value(value: Date): Unit = js.native
  
  def view(): js.Any = js.native
  
  var wrapper: JQuery = js.native
}
