package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofGanttTask
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask ()
  extends typings.kendoUi.kendo.data.GanttTask {
  def this(data: js.Any) = this()
}
/* static members */
@JSGlobal("kendo.data.GanttTask")
@js.native
object GanttTask extends js.Object {
  
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttTask = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttTask = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var idField: String = js.native
}
