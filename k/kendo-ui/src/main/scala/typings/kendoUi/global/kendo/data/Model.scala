package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Model")
@js.native
class Model ()
  extends typings.kendoUi.kendo.data.Model {
  def this(data: js.Any) = this()
}

/* static members */
@JSGlobal("kendo.data.Model")
@js.native
object Model extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofModel = js.native
}

