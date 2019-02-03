package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Model")
@js.native
class Model () extends ObservableObject {
  def this(data: js.Any) = this()
  var _defaultId: js.Any = js.native
  var defaults: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var dirty: scala.Boolean = js.native
  var fields: DataSourceSchemaModelFields = js.native
  var id: js.Any = js.native
  var idField: java.lang.String = js.native
  def accept(): scala.Unit = js.native
  def accept(data: js.Any): scala.Unit = js.native
  def editable(field: java.lang.String): scala.Boolean = js.native
  def isNew(): scala.Boolean = js.native
}

/* static members */
@JSGlobal("kendo.data.Model")
@js.native
object Model extends js.Object {
  var fields: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelFields = js.native
  var idField: java.lang.String = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsArray): kendoDashUiLib.Anon_Data = js.native
  def define(options: kendoDashUiLib.kendoNs.dataNs.DataSourceSchemaModelWithFieldsObject): kendoDashUiLib.Anon_Data = js.native
}

