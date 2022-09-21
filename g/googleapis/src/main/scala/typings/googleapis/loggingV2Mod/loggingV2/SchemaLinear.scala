package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLinear extends StObject {
  
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lower bound of the first bucket.
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be greater than 0.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLinear {
  
  inline def apply(): SchemaLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinear]
  }
  
  extension [Self <: SchemaLinear](x: Self) {
    
    inline def setNumFiniteBuckets(value: Double): Self = StObject.set(x, "numFiniteBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFiniteBucketsNull: Self = StObject.set(x, "numFiniteBuckets", null)
    
    inline def setNumFiniteBucketsUndefined: Self = StObject.set(x, "numFiniteBuckets", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
