package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the reidentifiability analysis. Note that these results are an
  * estimation, not exact values.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationResult extends js.Object {
  /**
    * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
    * doesn&#39;t correspond to any such interval, the associated frequency is
    * zero. For example, the following records:   {min_anonymity: 1,
    * max_anonymity: 1, frequency: 17}   {min_anonymity: 2, max_anonymity: 3,
    * frequency: 42}   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
    * mean that there are no record with an estimated anonymity of 4, 5, or
    * larger than 10.
    */
  var kMapEstimationHistogram: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationResultOps[Self <: SchemaGooglePrivacyDlpV2KMapEstimationResult] (val x: Self) extends AnyVal {
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
    def setKMapEstimationHistogramVarargs(value: SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket*): Self = this.set("kMapEstimationHistogram", js.Array(value :_*))
    @scala.inline
    def setKMapEstimationHistogram(value: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]): Self = this.set("kMapEstimationHistogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMapEstimationHistogram: Self = this.set("kMapEstimationHistogram", js.undefined)
  }
  
}

