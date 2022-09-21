package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExponential extends StObject {
  
  /**
    * Must be greater than 1.
    */
  var growthFactor: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Must be greater than 0.
    */
  var scale: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExponential {
  
  inline def apply(): SchemaExponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExponential]
  }
  
  extension [Self <: SchemaExponential](x: Self) {
    
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
