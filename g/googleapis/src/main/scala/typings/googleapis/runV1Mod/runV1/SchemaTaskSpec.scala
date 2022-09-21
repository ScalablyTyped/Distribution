package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTaskSpec extends StObject {
  
  /**
    * Optional. List of containers belonging to the task. We disallow a number of fields on this Container. Only a single container may be provided.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Optional. Number of retries allowed per task, before marking this job failed.
    */
  var maxRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Email address of the IAM service account associated with the task of a job execution. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project's default service account. +optional
    */
  var serviceAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Optional duration in seconds the task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout. +optional
    */
  var timeoutSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. List of volumes that can be mounted by containers belonging to the task. More info: https://kubernetes.io/docs/concepts/storage/volumes +optional
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object SchemaTaskSpec {
  
  inline def apply(): SchemaTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTaskSpec]
  }
  
  extension [Self <: SchemaTaskSpec](x: Self) {
    
    inline def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesNull: Self = StObject.set(x, "maxRetries", null)
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameNull: Self = StObject.set(x, "serviceAccountName", null)
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setTimeoutSeconds(value: String): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsNull: Self = StObject.set(x, "timeoutSeconds", null)
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
