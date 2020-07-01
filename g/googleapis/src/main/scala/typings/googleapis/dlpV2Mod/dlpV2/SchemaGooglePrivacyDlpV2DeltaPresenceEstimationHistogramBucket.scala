package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DeltaPresenceEstimationHistogramBucket message with the following values:
  * min_probability: 0.1   max_probability: 0.2   frequency: 42 means that
  * there are 42 records for which δ is in [0.1, 0.2). An important particular
  * case is when min_probability = max_probability = 1: then, every individual
  * who shares this quasi-identifier combination is in the dataset.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends js.Object {
  /**
    * Number of records within these probability bounds.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct quasi-identifier tuple values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of quasi-identifier tuple values in this bucket. The total number
    * of classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]] = js.native
  /**
    * Always greater than or equal to min_probability.
    */
  var maxProbability: js.UndefOr[Double] = js.native
  /**
    * Between 0 and 1.
    */
  var minProbability: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValueCount: String = null,
    bucketValues: js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues] = null,
    maxProbability: js.UndefOr[Double] = js.undefined,
    minProbability: js.UndefOr[Double] = js.undefined
  ): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (bucketValueCount != null) __obj.updateDynamic("bucketValueCount")(bucketValueCount.asInstanceOf[js.Any])
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProbability)) __obj.updateDynamic("maxProbability")(maxProbability.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProbability)) __obj.updateDynamic("minProbability")(minProbability.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]
  }
}

