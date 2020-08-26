package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that is applied over structured data such as a
  * table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RecordTransformations extends js.Object {
  /**
    * Transform the record by applying various field transformations.
    */
  var fieldTransformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]] = js.native
  /**
    * Configuration defining which records get suppressed entirely. Records
    * that match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]] = js.native
}

object SchemaGooglePrivacyDlpV2RecordTransformations {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformations]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RecordTransformationsOps[Self <: SchemaGooglePrivacyDlpV2RecordTransformations] (val x: Self) extends AnyVal {
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
    def setFieldTransformationsVarargs(value: SchemaGooglePrivacyDlpV2FieldTransformation*): Self = this.set("fieldTransformations", js.Array(value :_*))
    @scala.inline
    def setFieldTransformations(value: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation]): Self = this.set("fieldTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransformations: Self = this.set("fieldTransformations", js.undefined)
    @scala.inline
    def setRecordSuppressionsVarargs(value: SchemaGooglePrivacyDlpV2RecordSuppression*): Self = this.set("recordSuppressions", js.Array(value :_*))
    @scala.inline
    def setRecordSuppressions(value: js.Array[SchemaGooglePrivacyDlpV2RecordSuppression]): Self = this.set("recordSuppressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordSuppressions: Self = this.set("recordSuppressions", js.undefined)
  }
  
}

