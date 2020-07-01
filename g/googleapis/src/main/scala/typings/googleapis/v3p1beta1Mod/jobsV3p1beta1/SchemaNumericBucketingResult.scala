package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Custom numeric bucketing result.
  */
@js.native
trait SchemaNumericBucketingResult extends js.Object {
  /**
    * Count within each bucket. Its size is the length of
    * NumericBucketingOption.bucket_bounds plus 1.
    */
  var counts: js.UndefOr[js.Array[SchemaBucketizedCount]] = js.native
  /**
    * Stores the maximum value of the numeric field. Is populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Stores the minimum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var minValue: js.UndefOr[Double] = js.native
}

object SchemaNumericBucketingResult {
  @scala.inline
  def apply(
    counts: js.Array[SchemaBucketizedCount] = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined
  ): SchemaNumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNumericBucketingResult]
  }
}

