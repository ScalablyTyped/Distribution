package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExponentialBuckets extends StObject {
  
  /**
    * The i'th exponential bucket covers the interval [scale * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to num_finite_buckets inclusive. Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of finite buckets. With the underflow and overflow buckets, the total number of buckets is `num_finite_buckets` + 2. See comments on `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The i'th exponential bucket covers the interval [scale * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to num_finite_buckets inclusive. Must be \> 0.
    */
  var scale: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExponentialBuckets {
  
  inline def apply(): SchemaExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponentialBuckets]
  }
  
  extension [Self <: SchemaExponentialBuckets](x: Self) {
    
    inline def setGrowthFactor(value: Double): Self = StObject.set(x, "growthFactor", value.asInstanceOf[js.Any])
    
    inline def setGrowthFactorNull: Self = StObject.set(x, "growthFactor", null)
    
    inline def setGrowthFactorUndefined: Self = StObject.set(x, "growthFactor", js.undefined)
    
    inline def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFiniteBucketsNull: Self = StObject.set(x, "numFiniteBuckets", null)
    
    inline def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
