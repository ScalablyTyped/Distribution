package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplicitBuckets extends StObject {
  
  /**
    * 'bound' is a list of strictly increasing boundaries between buckets. Note that a list of length N-1 defines N buckets because of fenceposting. See comments on `bucket_options` for details. The i'th finite bucket covers the interval [bound[i-1], bound[i]) where i ranges from 1 to bound_size() - 1. Note that there are no finite buckets at all if 'bound' only contains a single element; in that special case the single bound defines the boundary between the underflow and overflow buckets. bucket number lower bound upper bound i == 0 (underflow) -inf bound[i] 0 < i < bound_size() bound[i-1] bound[i] i == bound_size() (overflow) bound[i-1] +inf
    */
  var bounds: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaExplicitBuckets {
  
  inline def apply(): SchemaExplicitBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplicitBuckets]
  }
  
  extension [Self <: SchemaExplicitBuckets](x: Self) {
    
    inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
  }
}
