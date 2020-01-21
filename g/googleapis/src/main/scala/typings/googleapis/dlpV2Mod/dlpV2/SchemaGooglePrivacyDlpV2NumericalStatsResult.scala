package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the numerical stats computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2NumericalStatsResult extends js.Object {
  /**
    * Maximum value appearing in the column.
    */
  var maxValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * Minimum value appearing in the column.
    */
  var minValue: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.native
  /**
    * List of 99 values that partition the set of field values into 100 equal
    * sized buckets.
    */
  var quantileValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2NumericalStatsResult {
  @scala.inline
  def apply(
    maxValue: SchemaGooglePrivacyDlpV2Value = null,
    minValue: SchemaGooglePrivacyDlpV2Value = null,
    quantileValues: js.Array[SchemaGooglePrivacyDlpV2Value] = null
  ): SchemaGooglePrivacyDlpV2NumericalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (quantileValues != null) __obj.updateDynamic("quantileValues")(quantileValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2NumericalStatsResult]
  }
}

