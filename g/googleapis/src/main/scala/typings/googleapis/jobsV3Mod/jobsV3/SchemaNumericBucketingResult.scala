package typings.googleapis.jobsV3Mod.jobsV3

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
    maxValue: Int | Double = null,
    minValue: Int | Double = null
  ): SchemaNumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    if (counts != null) __obj.updateDynamic("counts")(counts.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNumericBucketingResult]
  }
}

