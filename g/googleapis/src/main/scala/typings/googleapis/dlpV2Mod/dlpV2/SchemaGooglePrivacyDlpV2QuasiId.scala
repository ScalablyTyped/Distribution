package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A column with a semantic tag attached.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiId extends js.Object {
  /**
    * A column can be tagged with a custom tag. In this case, the user must
    * indicate an auxiliary table that contains statistical information on the
    * possible values of this column (below).
    */
  var customTag: js.UndefOr[String] = js.native
  /**
    * Identifies the column. [required]
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * If no semantic tag is indicated, we infer the statistical model from the
    * distribution of values in the input data
    */
  var inferred: js.UndefOr[SchemaGoogleProtobufEmpty] = js.native
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset
    * as a statistical model of population, if available. We currently support
    * US ZIP codes, region codes, ages and genders. To programmatically obtain
    * the list of supported InfoTypes, use ListInfoTypes with the
    * supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}

object SchemaGooglePrivacyDlpV2QuasiId {
  @scala.inline
  def apply(
    customTag: String = null,
    field: SchemaGooglePrivacyDlpV2FieldId = null,
    inferred: SchemaGoogleProtobufEmpty = null,
    infoType: SchemaGooglePrivacyDlpV2InfoType = null
  ): SchemaGooglePrivacyDlpV2QuasiId = {
    val __obj = js.Dynamic.literal()
    if (customTag != null) __obj.updateDynamic("customTag")(customTag.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (inferred != null) __obj.updateDynamic("inferred")(inferred.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiId]
  }
}

