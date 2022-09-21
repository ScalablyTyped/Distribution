package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Trial extends StObject {
  
  /**
    * Output only. The identifier of the client that originally requested this trial.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Time at which the trial's status changed to COMPLETED.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The final measurement containing the objective value.
    */
  var finalMeasurement: js.UndefOr[SchemaGoogleCloudMlV1Measurement] = js.undefined
  
  /**
    * Output only. A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true.
    */
  var infeasibleReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
    */
  var measurements: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Measurement]] = js.undefined
  
  /**
    * Output only. Name of the trial assigned by the service.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The parameters of the trial.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudMlV1TrialParameter]] = js.undefined
  
  /**
    * Output only. Time at which the trial was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The detailed state of a trial.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If true, the parameters in this trial are not attempted again.
    */
  var trialInfeasible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudMlV1Trial {
  
  inline def apply(): SchemaGoogleCloudMlV1Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Trial]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1Trial](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFinalMeasurement(value: SchemaGoogleCloudMlV1Measurement): Self = StObject.set(x, "finalMeasurement", value.asInstanceOf[js.Any])
    
    inline def setFinalMeasurementUndefined: Self = StObject.set(x, "finalMeasurement", js.undefined)
    
    inline def setInfeasibleReason(value: String): Self = StObject.set(x, "infeasibleReason", value.asInstanceOf[js.Any])
    
    inline def setInfeasibleReasonNull: Self = StObject.set(x, "infeasibleReason", null)
    
    inline def setInfeasibleReasonUndefined: Self = StObject.set(x, "infeasibleReason", js.undefined)
    
    inline def setMeasurements(value: js.Array[SchemaGoogleCloudMlV1Measurement]): Self = StObject.set(x, "measurements", value.asInstanceOf[js.Any])
    
    inline def setMeasurementsUndefined: Self = StObject.set(x, "measurements", js.undefined)
    
    inline def setMeasurementsVarargs(value: SchemaGoogleCloudMlV1Measurement*): Self = StObject.set(x, "measurements", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudMlV1TrialParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudMlV1TrialParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrialInfeasible(value: Boolean): Self = StObject.set(x, "trialInfeasible", value.asInstanceOf[js.Any])
    
    inline def setTrialInfeasibleNull: Self = StObject.set(x, "trialInfeasible", null)
    
    inline def setTrialInfeasibleUndefined: Self = StObject.set(x, "trialInfeasible", js.undefined)
  }
}
