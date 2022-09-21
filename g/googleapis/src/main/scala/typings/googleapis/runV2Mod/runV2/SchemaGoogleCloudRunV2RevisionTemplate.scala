package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2RevisionTemplate extends StObject {
  
  /**
    * KRM-style annotations for the resource.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Holds the single container that defines the unit of execution for this Revision.
    */
  var containers: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Container]] = js.undefined
  
  /**
    * A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
    */
  var encryptionKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sandbox environment to host this Revision.
    */
  var executionEnvironment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * KRM-style labels for the resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Sets the maximum number of requests that each serving instance can receive.
    */
  var maxInstanceRequestConcurrency: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
    */
  var revision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scaling settings for this Revision.
    */
  var scaling: js.UndefOr[SchemaGoogleCloudRunV2RevisionScaling] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project's default service account.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max allowed time for an instance to respond to a request.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Volumes to make available to containers.
    */
  var volumes: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Volume]] = js.undefined
  
  /**
    * VPC Access configuration to use for this Revision. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
    */
  var vpcAccess: js.UndefOr[SchemaGoogleCloudRunV2VpcAccess] = js.undefined
}
object SchemaGoogleCloudRunV2RevisionTemplate {
  
  inline def apply(): SchemaGoogleCloudRunV2RevisionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2RevisionTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2RevisionTemplate](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setContainers(value: js.Array[SchemaGoogleCloudRunV2Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaGoogleCloudRunV2Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyNull: Self = StObject.set(x, "encryptionKey", null)
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setExecutionEnvironment(value: String): Self = StObject.set(x, "executionEnvironment", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnvironmentNull: Self = StObject.set(x, "executionEnvironment", null)
    
    inline def setExecutionEnvironmentUndefined: Self = StObject.set(x, "executionEnvironment", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaxInstanceRequestConcurrency(value: Double): Self = StObject.set(x, "maxInstanceRequestConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceRequestConcurrencyNull: Self = StObject.set(x, "maxInstanceRequestConcurrency", null)
    
    inline def setMaxInstanceRequestConcurrencyUndefined: Self = StObject.set(x, "maxInstanceRequestConcurrency", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setScaling(value: SchemaGoogleCloudRunV2RevisionScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
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
