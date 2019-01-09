package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TreeListModel")
@js.native
class TreeListModel () extends Model {
  def this(data: js.Any) = this()
  var parentId: js.Any = js.native
  def loaded(): scala.Boolean = js.native
  def loaded(value: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("kendo.data.TreeListModel")
@js.native
object TreeListModel extends js.Object {
  var fields: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelFields = js.native
  var idField: java.lang.String = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsArray): kendoDashUiLib.Anon_DataDefineFields = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsObject): kendoDashUiLib.Anon_DataDefineFields = js.native
}

