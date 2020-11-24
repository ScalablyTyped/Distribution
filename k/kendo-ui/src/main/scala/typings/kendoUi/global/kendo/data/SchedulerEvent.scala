package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofSchedulerEvent
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import typings.kendoUi.kendo.data.SchedulerEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.SchedulerEvent")
@js.native
class SchedulerEvent ()
  extends typings.kendoUi.kendo.data.SchedulerEvent {
  def this(data: SchedulerEventData) = this()
}
/* static members */
@JSGlobal("kendo.data.SchedulerEvent")
@js.native
object SchedulerEvent extends js.Object {
  
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofSchedulerEvent = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofSchedulerEvent = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var idField: String = js.native
}
