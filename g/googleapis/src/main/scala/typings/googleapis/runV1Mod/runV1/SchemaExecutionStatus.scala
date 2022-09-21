package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecutionStatus extends StObject {
  
  /**
    * Optional. The number of tasks which reached phase Cancelled. +optional
    */
  var cancelledCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the execution was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var completionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The latest available observations of an execution's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * Optional. The number of tasks which reached phase Failed. +optional
    */
  var failedCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. URI where logs for this execution can be found in Cloud Console.
    */
  var logUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The 'generation' of the execution that was last processed by the controller.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The number of tasks which have retried at least once. +optional
    */
  var retriedCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The number of actively running tasks. +optional
    */
  var runningCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the execution started to run. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of tasks which reached phase Succeeded. +optional
    */
  var succeededCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaExecutionStatus {
  
  inline def apply(): SchemaExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecutionStatus]
  }
  
  extension [Self <: SchemaExecutionStatus](x: Self) {
    
    inline def setCancelledCount(value: Double): Self = StObject.set(x, "cancelledCount", value.asInstanceOf[js.Any])
    
    inline def setCancelledCountNull: Self = StObject.set(x, "cancelledCount", null)
    
    inline def setCancelledCountUndefined: Self = StObject.set(x, "cancelledCount", js.undefined)
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeNull: Self = StObject.set(x, "completionTime", null)
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountNull: Self = StObject.set(x, "failedCount", null)
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "failedCount", js.undefined)
    
    inline def setLogUri(value: String): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriNull: Self = StObject.set(x, "logUri", null)
    
    inline def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setRetriedCount(value: Double): Self = StObject.set(x, "retriedCount", value.asInstanceOf[js.Any])
    
    inline def setRetriedCountNull: Self = StObject.set(x, "retriedCount", null)
    
    inline def setRetriedCountUndefined: Self = StObject.set(x, "retriedCount", js.undefined)
    
    inline def setRunningCount(value: Double): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    inline def setRunningCountNull: Self = StObject.set(x, "runningCount", null)
    
    inline def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSucceededCount(value: Double): Self = StObject.set(x, "succeededCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededCountNull: Self = StObject.set(x, "succeededCount", null)
    
    inline def setSucceededCountUndefined: Self = StObject.set(x, "succeededCount", js.undefined)
  }
}
