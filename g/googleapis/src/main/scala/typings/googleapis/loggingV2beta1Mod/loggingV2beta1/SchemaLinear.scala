package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a linear sequence of buckets that all have the same width (except
  * overflow and underflow). Each bucket represents a constant absolute
  * uncertainty on the specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): offset + (width * i).  Lower
  * bound (1 &lt;= i &lt; N): offset + (width * (i - 1)).
  */
trait SchemaLinear extends StObject {
  
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  
  /**
    * Lower bound of the first bucket.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Must be greater than 0.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SchemaLinear {
  
  inline def apply(): SchemaLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinear]
  }
  
  extension [Self <: SchemaLinear](x: Self) {
    
    inline def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
