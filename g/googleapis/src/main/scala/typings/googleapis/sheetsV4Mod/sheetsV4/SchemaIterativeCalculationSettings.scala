package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings to control how circular dependencies are resolved with iterative
  * calculation.
  */
trait SchemaIterativeCalculationSettings extends StObject {
  
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[Double] = js.undefined
}
object SchemaIterativeCalculationSettings {
  
  inline def apply(): SchemaIterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIterativeCalculationSettings]
  }
  
  extension [Self <: SchemaIterativeCalculationSettings](x: Self) {
    
    inline def setConvergenceThreshold(value: Double): Self = StObject.set(x, "convergenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConvergenceThresholdUndefined: Self = StObject.set(x, "convergenceThreshold", js.undefined)
    
    inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
  }
}
