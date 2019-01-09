package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttTask")
@js.native
class GanttTask () extends Model {
  def this(data: js.Any) = this()
  var end: stdLib.Date = js.native
  var expanded: scala.Boolean = js.native
  var orderId: scala.Double = js.native
  var parentId: scala.Double = js.native
  var percentComplete: scala.Double = js.native
  var start: stdLib.Date = js.native
  var summary: scala.Boolean = js.native
  var title: java.lang.String = js.native
}

@JSGlobal("kendo.data.GanttTask")
@js.native
object GanttTask extends js.Object {
  var fields: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelFields = js.native
  var idField: java.lang.String = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsArray): kendoDashUiLib.Anon_DataDefineFieldsIdField = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsObject): kendoDashUiLib.Anon_DataDefineFieldsIdField = js.native
}

