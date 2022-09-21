package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBucketOptions extends StObject {
  
  /**
    * The explicit buckets.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicit] = js.undefined
  
  /**
    * The exponential buckets.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponential] = js.undefined
  
  /**
    * The linear bucket.
    */
  var linearBuckets: js.UndefOr[SchemaLinear] = js.undefined
}
object SchemaBucketOptions {
  
  inline def apply(): SchemaBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketOptions]
  }
  
  extension [Self <: SchemaBucketOptions](x: Self) {
    
    inline def setExplicitBuckets(value: SchemaExplicit): Self = StObject.set(x, "explicitBuckets", value.asInstanceOf[js.Any])
    
    inline def setExplicitBucketsUndefined: Self = StObject.set(x, "explicitBuckets", js.undefined)
    
    inline def setExponentialBuckets(value: SchemaExponential): Self = StObject.set(x, "exponentialBuckets", value.asInstanceOf[js.Any])
    
    inline def setExponentialBucketsUndefined: Self = StObject.set(x, "exponentialBuckets", js.undefined)
    
    inline def setLinearBuckets(value: SchemaLinear): Self = StObject.set(x, "linearBuckets", value.asInstanceOf[js.Any])
    
    inline def setLinearBucketsUndefined: Self = StObject.set(x, "linearBuckets", js.undefined)
  }
}
