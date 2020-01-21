package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket extends js.Object {
  /**
    * Total number of equivalence classes in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.native
  /**
    * Total number of distinct equivalence classes in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  /**
    * Sample of equivalence classes in this bucket. The total number of classes
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]] = js.native
  /**
    * Lower bound on the size of the equivalence classes in this bucket.
    */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.native
  /**
    * Upper bound on the size of the equivalence classes in this bucket.
    */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket {
  @scala.inline
  def apply(
    bucketSize: String = null,
    bucketValueCount: String = null,
    bucketValues: js.Array[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass] = null,
    equivalenceClassSizeLowerBound: String = null,
    equivalenceClassSizeUpperBound: String = null
  ): SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketSize != null) __obj.updateDynamic("bucketSize")(bucketSize.asInstanceOf[js.Any])
    if (bucketValueCount != null) __obj.updateDynamic("bucketValueCount")(bucketValueCount.asInstanceOf[js.Any])
    if (bucketValues != null) __obj.updateDynamic("bucketValues")(bucketValues.asInstanceOf[js.Any])
    if (equivalenceClassSizeLowerBound != null) __obj.updateDynamic("equivalenceClassSizeLowerBound")(equivalenceClassSizeLowerBound.asInstanceOf[js.Any])
    if (equivalenceClassSizeUpperBound != null) __obj.updateDynamic("equivalenceClassSizeUpperBound")(equivalenceClassSizeUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]
  }
}

