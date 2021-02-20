package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BucketOptions describes the bucket boundaries used to create a histogram
  * for the distribution. The buckets can be in a linear sequence, an
  * exponential sequence, or each bucket can be specified explicitly.
  * BucketOptions does not include the number of values in each bucket.A bucket
  * has an inclusive lower bound and exclusive upper bound for the values that
  * are counted for that bucket. The upper bound of a bucket must be strictly
  * greater than the lower bound. The sequence of N buckets for a distribution
  * consists of an underflow bucket (number 0), zero or more finite buckets
  * (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets
  * are contiguous: the lower bound of bucket i (i &gt; 0) is the same as the
  * upper bound of bucket i - 1. The buckets span the whole range of finite
  * values: lower bound of the underflow bucket is -infinity and the upper
  * bound of the overflow bucket is +infinity. The finite buckets are so-called
  * because both bounds are finite.
  */
@js.native
trait SchemaBucketOptions extends StObject {
  
  /**
    * The explicit buckets.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicit] = js.native
  
  /**
    * The exponential buckets.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponential] = js.native
  
  /**
    * The linear bucket.
    */
  var linearBuckets: js.UndefOr[SchemaLinear] = js.native
}
object SchemaBucketOptions {
  
  @scala.inline
  def apply(): SchemaBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketOptions]
  }
  
  @scala.inline
  implicit class SchemaBucketOptionsMutableBuilder[Self <: SchemaBucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitBuckets(value: SchemaExplicit): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    @scala.inline
    def setExponentialBuckets(value: SchemaExponential): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    @scala.inline
    def setLinearBuckets(value: SchemaLinear): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
  }
}
