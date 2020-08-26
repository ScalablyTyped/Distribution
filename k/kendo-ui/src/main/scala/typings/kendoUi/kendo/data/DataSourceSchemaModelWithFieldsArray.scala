package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaModelWithFieldsArray extends DataSourceSchemaModel {
  @JSName("fields")
  var fields_DataSourceSchemaModelWithFieldsArray: js.UndefOr[js.Array[DataSourceSchemaModelField]] = js.native
}

object DataSourceSchemaModelWithFieldsArray {
  @scala.inline
  def apply(): DataSourceSchemaModelWithFieldsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelWithFieldsArray]
  }
  @scala.inline
  implicit class DataSourceSchemaModelWithFieldsArrayOps[Self <: DataSourceSchemaModelWithFieldsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsVarargs(value: DataSourceSchemaModelField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[DataSourceSchemaModelField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

