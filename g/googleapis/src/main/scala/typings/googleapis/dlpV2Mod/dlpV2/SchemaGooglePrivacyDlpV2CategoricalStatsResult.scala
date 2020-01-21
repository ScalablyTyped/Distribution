package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the categorical stats computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsResult extends js.Object {
  /**
    * Histogram of value frequencies in the column.
    */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2CategoricalStatsResult {
  @scala.inline
  def apply(
    valueFrequencyHistogramBuckets: js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket] = null
  ): SchemaGooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    if (valueFrequencyHistogramBuckets != null) __obj.updateDynamic("valueFrequencyHistogramBuckets")(valueFrequencyHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsResult]
  }
}

