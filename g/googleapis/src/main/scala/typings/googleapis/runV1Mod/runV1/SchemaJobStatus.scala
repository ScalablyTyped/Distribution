package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatus extends StObject {
  
  /**
    * The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.UndefOr[js.Array[SchemaGoogleCloudRunV1Condition]] = js.undefined
  
  /**
    * Number of executions created for this job.
    */
  var executionCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A pointer to the most recently created execution for this job. This is set regardless of the eventual state of the execution.
    */
  var latestCreatedExecution: js.UndefOr[SchemaExecutionReference] = js.undefined
  
  /**
    * The 'generation' of the job that was last processed by the controller.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
}
object SchemaJobStatus {
  
  inline def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  extension [Self <: SchemaJobStatus](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGoogleCloudRunV1Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGoogleCloudRunV1Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setExecutionCount(value: Double): Self = StObject.set(x, "executionCount", value.asInstanceOf[js.Any])
    
    inline def setExecutionCountNull: Self = StObject.set(x, "executionCount", null)
    
    inline def setExecutionCountUndefined: Self = StObject.set(x, "executionCount", js.undefined)
    
    inline def setLatestCreatedExecution(value: SchemaExecutionReference): Self = StObject.set(x, "latestCreatedExecution", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedExecutionUndefined: Self = StObject.set(x, "latestCreatedExecution", js.undefined)
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
  }
}
