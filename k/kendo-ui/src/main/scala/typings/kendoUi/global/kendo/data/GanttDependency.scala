package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofGanttDependency
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.GanttDependency")
@js.native
class GanttDependency ()
  extends typings.kendoUi.kendo.data.GanttDependency {
  def this(data: js.Any) = this()
}
/* static members */
@JSGlobal("kendo.data.GanttDependency")
@js.native
object GanttDependency extends js.Object {
  
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofGanttDependency = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofGanttDependency = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var idField: String = js.native
}
