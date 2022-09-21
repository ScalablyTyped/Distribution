package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig extends StObject {
  
  /**
    * If true, measurement.elapsed_time is used as the x-axis of each Trials Decay Curve. Otherwise, Measurement.steps will be used as the x-axis.
    */
  var useElapsedTime: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1AutomatedStoppingConfigDecayCurveAutomatedStoppingConfig](x: Self) {
    
    inline def setUseElapsedTime(value: Boolean): Self = StObject.set(x, "useElapsedTime", value.asInstanceOf[js.Any])
    
    inline def setUseElapsedTimeNull: Self = StObject.set(x, "useElapsedTime", null)
    
    inline def setUseElapsedTimeUndefined: Self = StObject.set(x, "useElapsedTime", js.undefined)
  }
}
