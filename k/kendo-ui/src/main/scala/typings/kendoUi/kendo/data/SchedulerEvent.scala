package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEvent
  extends StObject
     with Model {
  
  def clone(options: Any, updateUid: Boolean): SchedulerEvent = js.native
  
  var description: String = js.native
  
  def duration(): Double = js.native
  
  var end: js.Date = js.native
  
  var endTimezone: String = js.native
  
  def expand(start: js.Date, end: js.Date, zone: Any): js.Array[SchedulerEvent] = js.native
  
  def init(data: SchedulerEventData): Unit = js.native
  
  var isAllDay: Boolean = js.native
  
  def isException(): Boolean = js.native
  
  def isMultiDay(): Boolean = js.native
  
  def isOccurrence(): Boolean = js.native
  
  def isRecurrenceHead(): Boolean = js.native
  
  def isRecurring(): Boolean = js.native
  
  var recurrenceException: String = js.native
  
  var recurrenceId: Any = js.native
  
  var recurrenceRule: String = js.native
  
  var start: js.Date = js.native
  
  var startTimezone: String = js.native
  
  var title: String = js.native
  
  def toOccurrence(options: Any): SchedulerEvent = js.native
  
  def update(eventInfo: SchedulerEventData): Unit = js.native
}
