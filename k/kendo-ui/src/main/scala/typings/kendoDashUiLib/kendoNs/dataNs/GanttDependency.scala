package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.GanttDependency")
@js.native
class GanttDependency () extends Model {
  def this(data: js.Any) = this()
  var predecessorId: scala.Double = js.native
  var successorId: scala.Double = js.native
  var `type`: scala.Double = js.native
}

/* static members */
@JSGlobal("kendo.data.GanttDependency")
@js.native
object GanttDependency extends js.Object {
  var fields: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelFields = js.native
  var idField: java.lang.String = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsArray): kendoDashUiLib.Anon_DataDefineFieldsIdFieldOptions = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsObject): kendoDashUiLib.Anon_DataDefineFieldsIdFieldOptions = js.native
}

