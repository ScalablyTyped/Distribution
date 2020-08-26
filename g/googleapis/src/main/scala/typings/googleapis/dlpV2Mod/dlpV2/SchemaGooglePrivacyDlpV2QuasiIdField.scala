package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quasi-identifier column has a custom_tag, used to know which column in
  * the data corresponds to which column in the statistical model.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiIdField extends js.Object {
  var customTag: js.UndefOr[String] = js.native
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2QuasiIdField {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuasiIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiIdField]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuasiIdFieldOps[Self <: SchemaGooglePrivacyDlpV2QuasiIdField] (val x: Self) extends AnyVal {
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
    def setCustomTag(value: String): Self = this.set("customTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomTag: Self = this.set("customTag", js.undefined)
    @scala.inline
    def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

