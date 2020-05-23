package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofTreeListModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TreeListModel")
@js.native
class TreeListModel ()
  extends typings.kendoUi.kendo.data.TreeListModel {
  def this(data: js.Any) = this()
}

/* static members */
@JSGlobal("kendo.data.TreeListModel")
@js.native
object TreeListModel extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofTreeListModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofTreeListModel = js.native
}

