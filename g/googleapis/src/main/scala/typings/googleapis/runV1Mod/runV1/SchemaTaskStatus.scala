package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskStatus extends StObject {
  
  /**
    * Optional. Represents time when the task was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var completionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The latest available observations of a task's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * Required. Index of the task, unique per execution, and beginning at 0.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Result of the last attempt of this task. +optional
    */
  var lastAttemptResult: js.UndefOr[SchemaTaskAttemptResult] = js.undefined
  
  /**
    * Optional. URI where logs for this task can be found in Cloud Console.
    */
  var logUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The 'generation' of the execution that was last processed by the controller.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The number of times this task was retried. Instances are retried when they fail up to the maxRetries limit. +optional
    */
  var retried: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the task started to run. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTaskStatus {
  
  inline def apply(): SchemaTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskStatus]
  }
  
  extension [Self <: SchemaTaskStatus](x: Self) {
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeNull: Self = StObject.set(x, "completionTime", null)
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastAttemptResult(value: SchemaTaskAttemptResult): Self = StObject.set(x, "lastAttemptResult", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptResultUndefined: Self = StObject.set(x, "lastAttemptResult", js.undefined)
    
    inline def setLogUri(value: String): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriNull: Self = StObject.set(x, "logUri", null)
    
    inline def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setRetried(value: Double): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
    
    inline def setRetriedNull: Self = StObject.set(x, "retried", null)
    
    inline def setRetriedUndefined: Self = StObject.set(x, "retried", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
