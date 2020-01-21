package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the l-diversity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityResult extends js.Object {
  /**
    * Histogram of l-diversity equivalence class sensitive value frequencies.
    */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2LDiversityResult {
  @scala.inline
  def apply(
    sensitiveValueFrequencyHistogramBuckets: js.Array[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket] = null
  ): SchemaGooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    if (sensitiveValueFrequencyHistogramBuckets != null) __obj.updateDynamic("sensitiveValueFrequencyHistogramBuckets")(sensitiveValueFrequencyHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityResult]
  }
}

