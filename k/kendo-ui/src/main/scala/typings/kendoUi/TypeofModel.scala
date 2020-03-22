package typings.kendoUi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kendoUi.kendo.data.DataSourceSchemaModelFields
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typings.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import typings.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofModel
  extends Instantiable0[Model]
     with Instantiable1[/* data */ js.Any, Model] {
  var fields: DataSourceSchemaModelFields = js.native
  var idField: String = js.native
  def define(options: DataSourceSchemaModelWithFieldsArray): /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any = js.native
  def define(options: DataSourceSchemaModelWithFieldsObject): /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any = js.native
}

