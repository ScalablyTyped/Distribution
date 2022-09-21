package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistribution extends StObject {
  
  /**
    * The number of samples in each histogram bucket. `bucket_counts` are optional. If present, they must sum to the `count` value. The buckets are defined below in `bucket_option`. There are N buckets. `bucket_counts[0]` is the number of samples in the underflow bucket. `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples in each of the finite buckets. And `bucket_counts[N] is the number of samples in the overflow bucket. See the comments of `bucket_option` below for more details. Any suffix of trailing zeros may be omitted.
    */
  var bucketCounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The total number of samples in the distribution. Must be \>= 0.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Example points. Must be in increasing order of `value` field.
    */
  var exemplars: js.UndefOr[js.Array[SchemaExemplar]] = js.undefined
  
  /**
    * Buckets with arbitrary user-provided width.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicitBuckets] = js.undefined
  
  /**
    * Buckets with exponentially growing width.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponentialBuckets] = js.undefined
  
  /**
    * Buckets with constant width.
    */
  var linearBuckets: js.UndefOr[SchemaLinearBuckets] = js.undefined
  
  /**
    * The maximum of the population of values. Ignored if `count` is zero.
    */
  var maximum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The arithmetic mean of the samples in the distribution. If `count` is zero then this field must be zero.
    */
  var mean: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum of the population of values. Ignored if `count` is zero.
    */
  var minimum: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sum of squared deviations from the mean: Sum[i=1..count]((x_i - mean)^2) where each x_i is a sample values. If `count` is zero then this field must be zero, otherwise validation of the request fails.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDistribution {
  
  inline def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  
  extension [Self <: SchemaDistribution](x: Self) {
    
    inline def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    inline def setBucketCountsNull: Self = StObject.set(x, "bucketCounts", null)
    
    inline def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    inline def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value*))
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setExemplars(value: js.Array[SchemaExemplar]): Self = StObject.set(x, "exemplars", value.asInstanceOf[js.Any])
    
    inline def setExemplarsUndefined: Self = StObject.set(x, "exemplars", js.undefined)
    
    inline def setExemplarsVarargs(value: SchemaExemplar*): Self = StObject.set(x, "exemplars", js.Array(value*))
    
    inline def setExplicitBuckets(value: SchemaExplicitBuckets): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    inline def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    inline def setExponentialBuckets(value: SchemaExponentialBuckets): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    inline def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    inline def setLinearBuckets(value: SchemaLinearBuckets): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    inline def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanNull: Self = StObject.set(x, "mean", null)
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setSumOfSquaredDeviation(value: Double): Self = StObject.set(x, "sumOfSquaredDeviation", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquaredDeviationNull: Self = StObject.set(x, "sumOfSquaredDeviation", null)
    
    inline def setSumOfSquaredDeviationUndefined: Self = StObject.set(x, "sumOfSquaredDeviation", js.undefined)
  }
}
