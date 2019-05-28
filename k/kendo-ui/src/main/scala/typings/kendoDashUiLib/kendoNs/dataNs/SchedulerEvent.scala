package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
class SchedulerEvent () extends Model {
  def this(data: SchedulerEventData) = this()
  var description: java.lang.String = js.native
  var end: stdLib.Date = js.native
  var endTimezone: java.lang.String = js.native
  var isAllDay: scala.Boolean = js.native
  var recurrenceException: java.lang.String = js.native
  var recurrenceId: js.Any = js.native
  var recurrenceRule: java.lang.String = js.native
  var start: stdLib.Date = js.native
  var startTimezone: java.lang.String = js.native
  var title: java.lang.String = js.native
  def clone(options: js.Any, updateUid: scala.Boolean): SchedulerEvent = js.native
  def duration(): scala.Double = js.native
  def expand(start: stdLib.Date, end: stdLib.Date, zone: js.Any): js.Array[SchedulerEvent] = js.native
  def init(data: SchedulerEventData): scala.Unit = js.native
  def isException(): scala.Boolean = js.native
  def isMultiDay(): scala.Boolean = js.native
  def isOccurrence(): scala.Boolean = js.native
  def isRecurrenceHead(): scala.Boolean = js.native
  def isRecurring(): scala.Boolean = js.native
  def toOccurrence(options: js.Any): SchedulerEvent = js.native
  def update(eventInfo: SchedulerEventData): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.data.SchedulerEvent")
@js.native
object SchedulerEvent extends js.Object {
  var fields: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelFields = js.native
  var idField: java.lang.String = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsArray): kendoDashUiLib.TypeofClassSchedulerEvent = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsObject): kendoDashUiLib.TypeofClassSchedulerEvent = js.native
}

