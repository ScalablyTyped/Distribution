package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaModelField extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var nullable: js.UndefOr[Boolean] = js.native
  var parse: js.UndefOr[js.Function] = js.native
  var `type`: js.UndefOr[String] = js.native
  var validation: js.UndefOr[DataSourceSchemaModelFieldValidation] = js.native
}

object DataSourceSchemaModelField {
  @scala.inline
  def apply(): DataSourceSchemaModelField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelField]
  }
  @scala.inline
  implicit class DataSourceSchemaModelFieldOps[Self <: DataSourceSchemaModelField] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    @scala.inline
    def setParse(value: js.Function): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidation(value: DataSourceSchemaModelFieldValidation): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
  
}

