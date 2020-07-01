package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Use this field to specify bucketing option for the histogram
  * search response.
  */
@js.native
trait SchemaNumericBucketingOption extends js.Object {
  /**
    * Required.  Two adjacent values form a histogram bucket. Values should be
    * in ascending order. For example, if [5, 10, 15] are provided, four
    * buckets are created: (-inf, 5), 5, 10), [10, 15), [15, inf). At most 20
    * [buckets_bound is supported.
    */
  var bucketBounds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Optional.  If set to true, the histogram result includes minimum/maximum
    * value of the numeric field.
    */
  var requiresMinMax: js.UndefOr[Boolean] = js.native
}

object SchemaNumericBucketingOption {
  @scala.inline
  def apply(bucketBounds: js.Array[Double] = null, requiresMinMax: js.UndefOr[Boolean] = js.undefined): SchemaNumericBucketingOption = {
    val __obj = js.Dynamic.literal()
    if (bucketBounds != null) __obj.updateDynamic("bucketBounds")(bucketBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresMinMax)) __obj.updateDynamic("requiresMinMax")(requiresMinMax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNumericBucketingOption]
  }
}

