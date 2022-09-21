package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2TaskTemplate extends StObject {
  
  /**
    * Holds the single container that defines the unit of execution for this task.
    */
  var containers: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Container]] = js.undefined
  
  /**
    * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
    */
  var encryptionKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The execution environment being used to host this Task.
    */
  var executionEnvironment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of retries allowed per Task, before marking this Task failed.
    */
  var maxRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project's default service account.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Volumes to make available to containers.
    */
  var volumes: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Volume]] = js.undefined
  
  /**
    * VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
    */
  var vpcAccess: js.UndefOr[SchemaGoogleCloudRunV2VpcAccess] = js.undefined
}
object SchemaGoogleCloudRunV2TaskTemplate {
  
  inline def apply(): SchemaGoogleCloudRunV2TaskTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2TaskTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2TaskTemplate](x: Self) {
    
    inline def setContainers(value: js.Array[SchemaGoogleCloudRunV2Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaGoogleCloudRunV2Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyNull: Self = StObject.set(x, "encryptionKey", null)
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setExecutionEnvironment(value: String): Self = StObject.set(x, "executionEnvironment", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnvironmentNull: Self = StObject.set(x, "executionEnvironment", null)
    
    inline def setExecutionEnvironmentUndefined: Self = StObject.set(x, "executionEnvironment", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesNull: Self = StObject.set(x, "maxRetries", null)
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaGoogleCloudRunV2Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaGoogleCloudRunV2Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
    
    inline def setVpcAccess(value: SchemaGoogleCloudRunV2VpcAccess): Self = StObject.set(x, "vpcAccess", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessUndefined: Self = StObject.set(x, "vpcAccess", js.undefined)
  }
}
