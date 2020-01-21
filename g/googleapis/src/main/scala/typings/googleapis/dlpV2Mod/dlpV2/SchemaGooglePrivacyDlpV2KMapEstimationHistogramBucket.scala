package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A KMapEstimationHistogramBucket message with the following values:
  * min_anonymity: 3   max_anonymity: 5   frequency: 42 means that there are 42
  * records whose quasi-identifier values correspond to 3, 4 or 5 people in the
  * overlying population. An important particular case is when min_anonymity =
  * max_anonymity = 1: the frequency field then corresponds to the number of
  * uniquely identifiable records.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket extends js.Object {
  /**
    * Number of records within these anonymity bounds.
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
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]] = js.native
  /**
    * Always greater than or equal to min_anonymity.
    */
  var maxAnonymity: js.UndefOr[String] = js.native
  /**
    * Always positive.
    */
  var minAnonymity: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValueCount: String = null,
    bucketValues: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues] = null,
    maxAnonymity: String = null,
    minAnonymity: String = null
  ): SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (bucketValueCount != null) __obj.updateDynamic("bucketValueCount")(bucketValueCount.asInstanceOf[js.Any])
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues.asInstanceOf[js.Any])
    if (maxAnonymity != null) __obj.updateDynamic("maxAnonymity")(maxAnonymity.asInstanceOf[js.Any])
    if (minAnonymity != null) __obj.updateDynamic("minAnonymity")(minAnonymity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]
  }
}

