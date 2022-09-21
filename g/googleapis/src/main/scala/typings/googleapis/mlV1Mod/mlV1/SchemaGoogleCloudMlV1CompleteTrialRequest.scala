package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1CompleteTrialRequest extends StObject {
  
  /**
    * Optional. If provided, it will be used as the completed trial's final_measurement; Otherwise, the service will auto-select a previously reported measurement as the final-measurement
    */
  var finalMeasurement: js.UndefOr[SchemaGoogleCloudMlV1Measurement] = js.undefined
  
  /**
    * Optional. A human readable reason why the trial was infeasible. This should only be provided if `trial_infeasible` is true.
    */
  var infeasibleReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. True if the trial cannot be run with the given Parameter, and final_measurement will be ignored.
    */
  var trialInfeasible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudMlV1CompleteTrialRequest {
  
  inline def apply(): SchemaGoogleCloudMlV1CompleteTrialRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1CompleteTrialRequest]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1CompleteTrialRequest](x: Self) {
    
    inline def setFinalMeasurement(value: SchemaGoogleCloudMlV1Measurement): Self = StObject.set(x, "finalMeasurement", value.asInstanceOf[js.Any])
    
    inline def setFinalMeasurementUndefined: Self = StObject.set(x, "finalMeasurement", js.undefined)
    
    inline def setInfeasibleReason(value: String): Self = StObject.set(x, "infeasibleReason", value.asInstanceOf[js.Any])
    
    inline def setInfeasibleReasonNull: Self = StObject.set(x, "infeasibleReason", null)
    
    inline def setInfeasibleReasonUndefined: Self = StObject.set(x, "infeasibleReason", js.undefined)
    
    inline def setTrialInfeasible(value: Boolean): Self = StObject.set(x, "trialInfeasible", value.asInstanceOf[js.Any])
    
    inline def setTrialInfeasibleNull: Self = StObject.set(x, "trialInfeasible", null)
    
    inline def setTrialInfeasibleUndefined: Self = StObject.set(x, "trialInfeasible", js.undefined)
  }
}
