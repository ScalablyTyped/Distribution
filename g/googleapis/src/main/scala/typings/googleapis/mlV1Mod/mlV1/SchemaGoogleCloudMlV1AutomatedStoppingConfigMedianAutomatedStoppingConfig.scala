package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig extends StObject {
  
  /**
    * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial's latest measurement is used to compute the median objective value for each completed trial.
    */
  var useElapsedTime: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1AutomatedStoppingConfigMedianAutomatedStoppingConfig](x: Self) {
    
    inline def setUseElapsedTime(value: Boolean): Self = StObject.set(x, "useElapsedTime", value.asInstanceOf[js.Any])
    
    inline def setUseElapsedTimeNull: Self = StObject.set(x, "useElapsedTime", null)
    
    inline def setUseElapsedTimeUndefined: Self = StObject.set(x, "useElapsedTime", js.undefined)
  }
}
