package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describing buckets with exponentially growing width.
  */
trait SchemaExponentialBuckets extends StObject {
  
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be &gt; 0.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object SchemaExponentialBuckets {
  
  inline def apply(): SchemaExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponentialBuckets]
  }
  
  extension [Self <: SchemaExponentialBuckets](x: Self) {
    
    inline def setGrowthFactor(value: Double): Self = StObject.set(x, "growthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "growthFactor", js.undefined)
    
    inline def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
