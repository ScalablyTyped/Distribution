package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceSpec extends StObject {
  
  /**
    * Optional. Optional duration in seconds the instance may be active relative to StartTime before the system will actively try to mark it failed and kill associated containers. If set to zero, the system will never attempt to kill an instance based on time. Otherwise, value must be a positive integer. +optional
    */
  var activeDeadlineSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. List of containers belonging to the instance. We disallow a number of fields on this Container. Only a single container may be provided.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Optional. Restart policy for all containers within the instance. Allowed values are: - OnFailure: Instances will always be restarted on failure if the backoffLimit has not been reached. - Never: Instances are never restarted and all failures are permanent. Cannot be used if backoffLimit is set. +optional
    */
  var restartPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Email address of the IAM service account associated with the instance of a Job. The service account represents the identity of the running instance, and determines what permissions the instance has. If not provided, the instance will use the project's default service account. +optional
    */
  var serviceAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Optional duration in seconds the instance needs to terminate gracefully. Value must be non-negative integer. The value zero indicates delete immediately. The grace period is the duration in seconds after the processes running in the instance are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. +optional
    */
  var terminationGracePeriodSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. List of volumes that can be mounted by containers belonging to the instance. More info: https://kubernetes.io/docs/concepts/storage/volumes +optional
    */
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object SchemaInstanceSpec {
  
  inline def apply(): SchemaInstanceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceSpec]
  }
  
  extension [Self <: SchemaInstanceSpec](x: Self) {
    
    inline def setActiveDeadlineSeconds(value: String): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setActiveDeadlineSecondsNull: Self = StObject.set(x, "activeDeadlineSeconds", null)
    
    inline def setActiveDeadlineSecondsUndefined: Self = StObject.set(x, "activeDeadlineSeconds", js.undefined)
    
    inline def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setRestartPolicy(value: String): Self = StObject.set(x, "restartPolicy", value.asInstanceOf[js.Any])
    
    inline def setRestartPolicyNull: Self = StObject.set(x, "restartPolicy", null)
    
    inline def setRestartPolicyUndefined: Self = StObject.set(x, "restartPolicy", js.undefined)
    
    inline def setServiceAccountName(value: String): Self = StObject.set(x, "serviceAccountName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNameNull: Self = StObject.set(x, "serviceAccountName", null)
    
    inline def setServiceAccountNameUndefined: Self = StObject.set(x, "serviceAccountName", js.undefined)
    
    inline def setTerminationGracePeriodSeconds(value: String): Self = StObject.set(x, "terminationGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    inline def setTerminationGracePeriodSecondsNull: Self = StObject.set(x, "terminationGracePeriodSeconds", null)
    
    inline def setTerminationGracePeriodSecondsUndefined: Self = StObject.set(x, "terminationGracePeriodSeconds", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
