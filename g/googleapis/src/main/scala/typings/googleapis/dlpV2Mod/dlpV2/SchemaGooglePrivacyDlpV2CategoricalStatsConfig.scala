package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute numerical stats over an individual column, including number of
  * distinct values and value count distribution.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsConfig extends js.Object {
  /**
    * Field to compute categorical stats on. All column types are supported
    * except for arrays and structs. However, it may be more informative to use
    * NumericalStats when the field type is supported, depending on the data.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2CategoricalStatsConfig {
  @scala.inline
  def apply(field: SchemaGooglePrivacyDlpV2FieldId = null): SchemaGooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsConfig]
  }
}

