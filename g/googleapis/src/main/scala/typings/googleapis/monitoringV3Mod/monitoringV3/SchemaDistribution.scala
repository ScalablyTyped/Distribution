package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Distribution contains summary statistics for a population of values. It
  * optionally contains a histogram representing the distribution of those
  * values across a set of buckets.The summary statistics are the count, mean,
  * sum of the squared deviation from the mean, the minimum, and the maximum of
  * the set of population of values. The histogram is based on a sequence of
  * buckets and gives a count of values that fall into each bucket. The
  * boundaries of the buckets are given either explicitly or by formulas for
  * buckets of fixed or exponentially increasing widths.Although it is not
  * forbidden, it is generally a bad idea to include non-finite values
  * (infinities or NaNs) in the population of values, as this will render the
  * mean and sum_of_squared_deviation fields meaningless.
  */
trait SchemaDistribution extends StObject {
  
  /**
    * Required in the Stackdriver Monitoring API v3. The values for each bucket
    * specified in bucket_options. The sum of the values in bucketCounts must
    * equal the value in the count field of the Distribution object. The order
    * of the bucket counts follows the numbering schemes described for the
    * three bucket types. The underflow bucket has number 0; the finite
    * buckets, if any, have numbers 1 through N-2; and the overflow bucket has
    * number N-1. The size of bucket_counts must not be greater than N. If the
    * size is less than N, then the remaining buckets are assigned values of
    * zero.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required in the Stackdriver Monitoring API v3. Defines the histogram
    * bucket boundaries.
    */
  var bucketOptions: js.UndefOr[SchemaBucketOptions] = js.undefined
  
  /**
    * The number of values in the population. Must be non-negative. This value
    * must equal the sum of the values in bucket_counts if a histogram is
    * provided.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * Must be in increasing order of value field.
    */
  var exemplars: js.UndefOr[js.Array[SchemaExemplar]] = js.undefined
  
  /**
    * The arithmetic mean of the values in the population. If count is zero
    * then this field must be zero.
    */
  var mean: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, contains the range of the population values. The field must
    * not be present if the count is zero. This field is presently ignored by
    * the Stackdriver Monitoring API v3.
    */
  var range: js.UndefOr[SchemaRange] = js.undefined
  
  /**
    * The sum of squared deviations from the mean of the values in the
    * population. For values x_i this is: Sum[i=1..n]((x_i - mean)^2) Knuth,
    * &quot;The Art of Computer Programming&quot;, Vol. 2, page 323, 3rd
    * edition describes Welford&#39;s method for accumulating this sum in one
    * pass.If count is zero then this field must be zero.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.undefined
}
object SchemaDistribution {
  
  inline def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  
  extension [Self <: SchemaDistribution](x: Self) {
    
    inline def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    inline def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    inline def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value :_*))
    
    inline def setBucketOptions(value: SchemaBucketOptions): Self = StObject.set(x, "bucketOptions", value.asInstanceOf[js.Any])
    
    inline def setBucketOptionsUndefined: Self = StObject.set(x, "bucketOptions", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setExemplars(value: js.Array[SchemaExemplar]): Self = StObject.set(x, "exemplars", value.asInstanceOf[js.Any])
    
    inline def setExemplarsUndefined: Self = StObject.set(x, "exemplars", js.undefined)
    
    inline def setExemplarsVarargs(value: SchemaExemplar*): Self = StObject.set(x, "exemplars", js.Array(value :_*))
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setRange(value: SchemaRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSumOfSquaredDeviation(value: Double): Self = StObject.set(x, "sumOfSquaredDeviation", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquaredDeviationUndefined: Self = StObject.set(x, "sumOfSquaredDeviation", js.undefined)
  }
}
