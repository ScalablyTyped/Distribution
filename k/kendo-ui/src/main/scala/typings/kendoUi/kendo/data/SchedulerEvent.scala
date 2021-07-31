package typings.kendoUi.kendo.data

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEvent
  extends StObject
     with Model {
  
  def clone(options: js.Any, updateUid: Boolean): SchedulerEvent = js.native
  
  var description: String = js.native
  
  def duration(): Double = js.native
  
  var end: Date = js.native
  
  var endTimezone: String = js.native
  
  def expand(start: Date, end: Date, zone: js.Any): js.Array[SchedulerEvent] = js.native
  
  def init(data: SchedulerEventData): Unit = js.native
  
  var isAllDay: Boolean = js.native
  
  def isException(): Boolean = js.native
  
  def isMultiDay(): Boolean = js.native
  
  def isOccurrence(): Boolean = js.native
  
  def isRecurrenceHead(): Boolean = js.native
  
  def isRecurring(): Boolean = js.native
  
  var recurrenceException: String = js.native
  
  var recurrenceId: js.Any = js.native
  
  var recurrenceRule: String = js.native
  
  var start: Date = js.native
  
  var startTimezone: String = js.native
  
  var title: String = js.native
  
  def toOccurrence(options: js.Any): SchedulerEvent = js.native
  
  def update(eventInfo: SchedulerEventData): Unit = js.native
}
