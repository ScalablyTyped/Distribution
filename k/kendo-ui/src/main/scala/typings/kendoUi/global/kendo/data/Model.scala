package typings.kendoUi.global.kendo.data

import typings.kendoUi.anon.TypeofModel
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofModel = js.native
  
  var fields: DataSourceSchemaModelFields = js.native
  
  var idField: String = js.native
}
