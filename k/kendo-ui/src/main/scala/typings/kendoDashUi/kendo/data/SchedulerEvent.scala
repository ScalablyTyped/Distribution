package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.TypeofClassSchedulerEvent
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
class SchedulerEvent () extends Model {
  def this(data: SchedulerEventData) = this()
  var description: String = js.native
  var end: Date = js.native
  var endTimezone: String = js.native
  var isAllDay: Boolean = js.native
  var recurrenceException: String = js.native
  var recurrenceId: js.Any = js.native
  var recurrenceRule: String = js.native
  var start: Date = js.native
  var startTimezone: String = js.native
  var title: String = js.native
  def clone(options: js.Any, updateUid: Boolean): SchedulerEvent = js.native
  def duration(): Double = js.native
  def expand(start: Date, end: Date, zone: js.Any): js.Array[SchedulerEvent] = js.native
  def init(data: SchedulerEventData): Unit = js.native
  def isException(): Boolean = js.native
  def isMultiDay(): Boolean = js.native
  def isOccurrence(): Boolean = js.native
  def isRecurrenceHead(): Boolean = js.native
  def isRecurring(): Boolean = js.native
  def toOccurrence(options: js.Any): SchedulerEvent = js.native
  def update(eventInfo: SchedulerEventData): Unit = js.native
}

/* static members */
@JSGlobal("kendo.data.SchedulerEvent")
@js.native
object SchedulerEvent extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofClassSchedulerEvent = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofClassSchedulerEvent = js.native
}

