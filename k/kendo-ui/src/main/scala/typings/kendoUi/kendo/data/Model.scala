package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import typings.kendoUi.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Model")
@js.native
class Model () extends ObservableObject {
  def this(data: js.Any) = this()
  var _defaultId: js.Any = js.native
  var defaults: StringDictionary[js.Any] = js.native
  var dirty: Boolean = js.native
  var fields: DataSourceSchemaModelFields = js.native
  var id: js.Any = js.native
  var idField: String = js.native
  def accept(): Unit = js.native
  def accept(data: js.Any): Unit = js.native
  def editable(field: String): Boolean = js.native
  def isNew(): Boolean = js.native
}

/* static members */
@JSGlobal("kendo.data.Model")
@js.native
object Model extends js.Object {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): TypeofClassModel = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): TypeofClassModel = js.native
}

