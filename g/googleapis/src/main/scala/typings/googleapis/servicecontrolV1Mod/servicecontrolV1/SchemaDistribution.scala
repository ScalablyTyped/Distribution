package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Distribution represents a frequency distribution of double-valued sample
  * points. It contains the size of the population of sample points plus
  * additional optional information:    - the arithmetic mean of the samples -
  * the minimum and maximum of the samples   - the sum-squared-deviation of the
  * samples, used to compute variance   - a histogram of the values of the
  * sample points
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are
    * optional. If present, they must sum to the `count` value.  The buckets
    * are defined below in `bucket_option`. There are N buckets.
    * `bucket_counts[0]` is the number of samples in the underflow bucket.
    * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples in
    * each of the finite buckets. And `bucket_counts[N] is the number of
    * samples in the overflow bucket. See the comments of `bucket_option` below
    * for more details.  Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The total number of samples in the distribution. Must be &gt;= 0.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Buckets with arbitrary user-provided width.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicitBuckets] = js.native
  /**
    * Buckets with exponentially growing width.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponentialBuckets] = js.native
  /**
    * Buckets with constant width.
    */
  var linearBuckets: js.UndefOr[SchemaLinearBuckets] = js.native
  /**
    * The maximum of the population of values. Ignored if `count` is zero.
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is
    * zero then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.native
  /**
    * The minimum of the population of values. Ignored if `count` is zero.
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * The sum of squared deviations from the mean:   Sum[i=1..count]((x_i -
    * mean)^2) where each x_i is a sample values. If `count` is zero then this
    * field must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(
    bucketCounts: js.Array[String] = null,
    count: String = null,
    explicitBuckets: SchemaExplicitBuckets = null,
    exponentialBuckets: SchemaExponentialBuckets = null,
    linearBuckets: SchemaLinearBuckets = null,
    maximum: js.UndefOr[Double] = js.undefined,
    mean: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    sumOfSquaredDeviation: js.UndefOr[Double] = js.undefined
  ): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    if (bucketCounts != null) __obj.updateDynamic("bucketCounts")(bucketCounts.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (explicitBuckets != null) __obj.updateDynamic("explicitBuckets")(explicitBuckets.asInstanceOf[js.Any])
    if (exponentialBuckets != null) __obj.updateDynamic("exponentialBuckets")(exponentialBuckets.asInstanceOf[js.Any])
    if (linearBuckets != null) __obj.updateDynamic("linearBuckets")(linearBuckets.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mean)) __obj.updateDynamic("mean")(mean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOfSquaredDeviation)) __obj.updateDynamic("sumOfSquaredDeviation")(sumOfSquaredDeviation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDistribution]
  }
}

