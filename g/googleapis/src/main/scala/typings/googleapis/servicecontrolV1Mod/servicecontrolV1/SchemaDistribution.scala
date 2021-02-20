package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Distribution represents a frequency distribution of double-valued sample
  * points. It contains the size of the population of sample points plus
  * additional optional information:    - the arithmetic mean of the samples -
  * the minimum and maximum of the samples   - the sum-squared-deviation of the
  * samples, used to compute variance   - a histogram of the values of the
  * sample points
  */
@js.native
trait SchemaDistribution extends StObject {
  
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
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  
  @scala.inline
  implicit class SchemaDistributionMutableBuilder[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    @scala.inline
    def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setExplicitBuckets(value: SchemaExplicitBuckets): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    @scala.inline
    def setExponentialBuckets(value: SchemaExponentialBuckets): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    @scala.inline
    def setLinearBuckets(value: SchemaLinearBuckets): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setSumOfSquaredDeviation(value: Double): Self = StObject.set(x, "sumOfSquaredDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOfSquaredDeviationUndefined: Self = StObject.set(x, "sumOfSquaredDeviation", js.undefined)
  }
}
