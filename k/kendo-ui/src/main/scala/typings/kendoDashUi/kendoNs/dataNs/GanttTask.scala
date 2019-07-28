package typings.kendoDashUi.kendoNs.dataNs

import typings.kendoDashUi.TypeofClassGanttTask
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask () extends Model {
  def this(data: js.Any) = this()
  var end: Date = js.native
  var expanded: Boolean = js.native
  var orderId: Double = js.native
  var parentId: Double = js.native
  var percentComplete: Double = js.native
  var start: Date = js.native
  var summary: Boolean = js.native
  var title: String = js.native
}

/* static members */
@JSGlobal("kendo.data.GanttTask")
@js.native
object GanttTask extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofClassGanttTask = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofClassGanttTask = js.native
}

