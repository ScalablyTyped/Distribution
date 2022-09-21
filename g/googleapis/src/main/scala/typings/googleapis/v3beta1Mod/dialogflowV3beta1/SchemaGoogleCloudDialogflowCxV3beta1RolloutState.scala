package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RolloutState extends StObject {
  
  /**
    * Start time of the current step.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of the current auto rollout step.
    */
  var step: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Index of the current step in the auto rollout steps list.
    */
  var stepIndex: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RolloutState {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RolloutState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RolloutState]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RolloutState](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepIndex(value: Double): Self = StObject.set(x, "stepIndex", value.asInstanceOf[js.Any])
    
    inline def setStepIndexNull: Self = StObject.set(x, "stepIndex", null)
    
    inline def setStepIndexUndefined: Self = StObject.set(x, "stepIndex", js.undefined)
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
