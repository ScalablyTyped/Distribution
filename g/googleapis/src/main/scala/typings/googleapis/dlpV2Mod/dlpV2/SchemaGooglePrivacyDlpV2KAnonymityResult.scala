package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the k-anonymity computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityResult extends js.Object {
  /**
    * Histogram of k-anonymity equivalence classes.
    */
  var equivalenceClassHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2KAnonymityResult {
  @scala.inline
  def apply(
    equivalenceClassHistogramBuckets: js.Array[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket] = null
  ): SchemaGooglePrivacyDlpV2KAnonymityResult = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassHistogramBuckets != null) __obj.updateDynamic("equivalenceClassHistogramBuckets")(equivalenceClassHistogramBuckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityResult]
  }
}

