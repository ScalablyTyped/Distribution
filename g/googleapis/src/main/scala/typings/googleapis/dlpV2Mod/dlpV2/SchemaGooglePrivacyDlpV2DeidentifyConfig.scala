package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration that controls how the data will change.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyConfig extends js.Object {
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2InfoTypeTransformations] = js.native
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming a
    * column within a table.
    */
  var recordTransformations: js.UndefOr[SchemaGooglePrivacyDlpV2RecordTransformations] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyConfig {
  @scala.inline
  def apply(
    infoTypeTransformations: SchemaGooglePrivacyDlpV2InfoTypeTransformations = null,
    recordTransformations: SchemaGooglePrivacyDlpV2RecordTransformations = null
  ): SchemaGooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    if (infoTypeTransformations != null) __obj.updateDynamic("infoTypeTransformations")(infoTypeTransformations.asInstanceOf[js.Any])
    if (recordTransformations != null) __obj.updateDynamic("recordTransformations")(recordTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyConfig]
  }
}

