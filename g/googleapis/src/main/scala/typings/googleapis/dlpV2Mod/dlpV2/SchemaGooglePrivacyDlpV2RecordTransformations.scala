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
  def apply(
    fieldTransformations: js.Array[SchemaGooglePrivacyDlpV2FieldTransformation] = null,
    recordSuppressions: js.Array[SchemaGooglePrivacyDlpV2RecordSuppression] = null
  ): SchemaGooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    if (fieldTransformations != null) __obj.updateDynamic("fieldTransformations")(fieldTransformations.asInstanceOf[js.Any])
    if (recordSuppressions != null) __obj.updateDynamic("recordSuppressions")(recordSuppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RecordTransformations]
  }
}

