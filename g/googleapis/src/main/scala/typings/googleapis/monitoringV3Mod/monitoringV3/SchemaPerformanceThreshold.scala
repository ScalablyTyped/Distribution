package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerformanceThreshold extends StObject {
  
  /**
    * BasicSli to evaluate to judge window quality.
    */
  var basicSliPerformance: js.UndefOr[SchemaBasicSli] = js.undefined
  
  /**
    * RequestBasedSli to evaluate to judge window quality.
    */
  var performance: js.UndefOr[SchemaRequestBasedSli] = js.undefined
  
  /**
    * If window performance \>= threshold, the window is counted as good.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPerformanceThreshold {
  
  inline def apply(): SchemaPerformanceThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceThreshold]
  }
  
  extension [Self <: SchemaPerformanceThreshold](x: Self) {
    
    inline def setBasicSliPerformance(value: SchemaBasicSli): Self = StObject.set(x, "basicSliPerformance", value.asInstanceOf[js.Any])
    
    inline def setBasicSliPerformanceUndefined: Self = StObject.set(x, "basicSliPerformance", js.undefined)
    
    inline def setPerformance(value: SchemaRequestBasedSli): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdNull: Self = StObject.set(x, "threshold", null)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
