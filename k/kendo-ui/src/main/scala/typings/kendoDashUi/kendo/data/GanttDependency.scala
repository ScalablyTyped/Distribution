package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.TypeofClassGanttDependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttDependency")
@js.native
class GanttDependency () extends Model {
  def this(data: js.Any) = this()
  var predecessorId: Double = js.native
  var successorId: Double = js.native
  var `type`: Double = js.native
}

/* static members */
@JSGlobal("kendo.data.GanttDependency")
@js.native
object GanttDependency extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofClassGanttDependency = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofClassGanttDependency = js.native
}

