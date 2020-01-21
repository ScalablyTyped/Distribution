package typings.kendoUi.kendo.data

import typings.kendoUi.TypeofClassTreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TreeListModel")
@js.native
class TreeListModel () extends Model {
  def this(data: js.Any) = this()
  var parentId: js.Any = js.native
  def loaded(): Boolean = js.native
  def loaded(value: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.data.TreeListModel")
@js.native
object TreeListModel extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofClassTreeListModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofClassTreeListModel = js.native
}

