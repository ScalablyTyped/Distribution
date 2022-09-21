package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1AutomatedStoppingConfig extends StObject {
  
  var decayCurveStoppingConfig: js.UndefOr[SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig] = js.undefined
  
  var medianAutomatedStoppingConfig: js.UndefOr[SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig] = js.undefined
}
object SchemaGoogleCloudMlV1AutomatedStoppingConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1AutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AutomatedStoppingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1AutomatedStoppingConfig](x: Self) {
    
    inline def setDecayCurveStoppingConfig(value: SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig): Self = StObject.set(x, "decayCurveStoppingConfig", value.asInstanceOf[js.Any])
    
    inline def setDecayCurveStoppingConfigUndefined: Self = StObject.set(x, "decayCurveStoppingConfig", js.undefined)
    
    inline def setMedianAutomatedStoppingConfig(value: SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig): Self = StObject.set(x, "medianAutomatedStoppingConfig", value.asInstanceOf[js.Any])
    
    inline def setMedianAutomatedStoppingConfigUndefined: Self = StObject.set(x, "medianAutomatedStoppingConfig", js.undefined)
  }
}
