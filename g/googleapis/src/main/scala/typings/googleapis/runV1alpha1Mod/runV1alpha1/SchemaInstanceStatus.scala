package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceStatus extends StObject {
  
  /**
    * Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var completionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of times this instance exited with code \> 0; +optional
    */
  var failed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Index of the instance, unique per Job, and beginning at 0.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Result of the last attempt of this instance. +optional
    */
  var lastAttemptResult: js.UndefOr[SchemaInstanceAttemptResult] = js.undefined
  
  /**
    * Optional. Last exit code seen for this instance. +optional
    */
  var lastExitCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
    */
  var restarted: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of times this instance exited with code == 0. +optional
    */
  var succeeded: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstanceStatus {
  
  inline def apply(): SchemaInstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceStatus]
  }
  
  extension [Self <: SchemaInstanceStatus](x: Self) {
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeNull: Self = StObject.set(x, "completionTime", null)
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedNull: Self = StObject.set(x, "failed", null)
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLastAttemptResult(value: SchemaInstanceAttemptResult): Self = StObject.set(x, "lastAttemptResult", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptResultUndefined: Self = StObject.set(x, "lastAttemptResult", js.undefined)
    
    inline def setLastExitCode(value: Double): Self = StObject.set(x, "lastExitCode", value.asInstanceOf[js.Any])
    
    inline def setLastExitCodeNull: Self = StObject.set(x, "lastExitCode", null)
    
    inline def setLastExitCodeUndefined: Self = StObject.set(x, "lastExitCode", js.undefined)
    
    inline def setRestarted(value: Double): Self = StObject.set(x, "restarted", value.asInstanceOf[js.Any])
    
    inline def setRestartedNull: Self = StObject.set(x, "restarted", null)
    
    inline def setRestartedUndefined: Self = StObject.set(x, "restarted", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededNull: Self = StObject.set(x, "succeeded", null)
    
    inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
  }
}
