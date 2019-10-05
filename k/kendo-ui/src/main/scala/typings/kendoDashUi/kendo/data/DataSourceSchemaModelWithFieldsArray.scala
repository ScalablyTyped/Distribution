package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModelWithFieldsArray extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsArray: js.UndefOr[js.Array[DataSourceSchemaModelField]] = js.undefined
}

object DataSourceSchemaModelWithFieldsArray {
  @scala.inline
  def apply(fields: js.Array[DataSourceSchemaModelField] = null, id: String = null): DataSourceSchemaModelWithFieldsArray = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsArray]
  }
}

