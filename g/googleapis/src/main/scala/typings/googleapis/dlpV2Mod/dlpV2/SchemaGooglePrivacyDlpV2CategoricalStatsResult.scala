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
  def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CategoricalStatsResultOps[Self <: SchemaGooglePrivacyDlpV2CategoricalStatsResult] (val x: Self) extends AnyVal {
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
    def setValueFrequencyHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = this.set("valueFrequencyHistogramBuckets", js.Array(value :_*))
    @scala.inline
    def setValueFrequencyHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = this.set("valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFrequencyHistogramBuckets: Self = this.set("valueFrequencyHistogramBuckets", js.undefined)
  }
  
}

