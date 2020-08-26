package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSchemaModelFieldValidation
  extends /* index */ StringDictionary[js.Any] {
  var max: js.UndefOr[js.Any] = js.native
  var maxLength: js.UndefOr[js.Any] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var minLength: js.UndefOr[js.Any] = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object DataSourceSchemaModelFieldValidation {
  @scala.inline
  def apply(): DataSourceSchemaModelFieldValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSchemaModelFieldValidation]
  }
  @scala.inline
  implicit class DataSourceSchemaModelFieldValidationOps[Self <: DataSourceSchemaModelFieldValidation] (val x: Self) extends AnyVal {
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
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: js.Any): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: js.Any): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

