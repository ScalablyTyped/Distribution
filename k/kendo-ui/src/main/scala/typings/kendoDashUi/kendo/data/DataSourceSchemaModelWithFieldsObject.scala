package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModelWithFieldsObject extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsObject: js.UndefOr[DataSourceSchemaModelFields] = js.undefined
}

object DataSourceSchemaModelWithFieldsObject {
  @scala.inline
  def apply(fields: DataSourceSchemaModelFields = null, id: String = null): DataSourceSchemaModelWithFieldsObject = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsObject]
  }
}

