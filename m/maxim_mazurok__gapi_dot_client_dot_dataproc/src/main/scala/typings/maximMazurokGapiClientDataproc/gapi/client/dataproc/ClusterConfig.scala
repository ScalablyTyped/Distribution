package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfig extends StObject {
  
  /** Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset. */
  var autoscalingConfig: js.UndefOr[AutoscalingConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a
    * Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this
    * project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
    */
  var configBucket: js.UndefOr[String] = js.undefined
  
  /** Optional. Encryption settings for the cluster. */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  
  /** Optional. Port/endpoint configuration for this cluster */
  var endpointConfig: js.UndefOr[EndpointConfig] = js.undefined
  
  /** Optional. The shared Compute Engine config settings for all instances in a cluster. */
  var gceClusterConfig: js.UndefOr[GceClusterConfig] = js.undefined
  
  /**
    * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an
    * executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[NodeInitializationAction]] = js.undefined
  
  /** Optional. Lifecycle setting for the cluster. */
  var lifecycleConfig: js.UndefOr[LifecycleConfig] = js.undefined
  
  /** Optional. The Compute Engine config settings for the master instance in a cluster. */
  var masterConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  
  /** Optional. The Compute Engine config settings for additional worker instances in a cluster. */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  
  /** Optional. Security settings for the cluster. */
  var securityConfig: js.UndefOr[SecurityConfig] = js.undefined
  
  /** Optional. The config settings for software inside the cluster. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will
    * determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage
    * this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket.
    */
  var tempBucket: js.UndefOr[String] = js.undefined
  
  /** Optional. The Compute Engine config settings for worker instances in a cluster. */
  var workerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
}
object ClusterConfig {
  
  @scala.inline
  def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  @scala.inline
  implicit class ClusterConfigMutableBuilder[Self <: ClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingConfig(value: AutoscalingConfig): Self = StObject.set(x, "autoscalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingConfigUndefined: Self = StObject.set(x, "autoscalingConfig", js.undefined)
    
    @scala.inline
    def setConfigBucket(value: String): Self = StObject.set(x, "configBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigBucketUndefined: Self = StObject.set(x, "configBucket", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    @scala.inline
    def setEndpointConfig(value: EndpointConfig): Self = StObject.set(x, "endpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigUndefined: Self = StObject.set(x, "endpointConfig", js.undefined)
    
    @scala.inline
    def setGceClusterConfig(value: GceClusterConfig): Self = StObject.set(x, "gceClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGceClusterConfigUndefined: Self = StObject.set(x, "gceClusterConfig", js.undefined)
    
    @scala.inline
    def setInitializationActions(value: js.Array[NodeInitializationAction]): Self = StObject.set(x, "initializationActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationActionsUndefined: Self = StObject.set(x, "initializationActions", js.undefined)
    
    @scala.inline
    def setInitializationActionsVarargs(value: NodeInitializationAction*): Self = StObject.set(x, "initializationActions", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleConfig(value: LifecycleConfig): Self = StObject.set(x, "lifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigUndefined: Self = StObject.set(x, "lifecycleConfig", js.undefined)
    
    @scala.inline
    def setMasterConfig(value: InstanceGroupConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    @scala.inline
    def setSecondaryWorkerConfig(value: InstanceGroupConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    @scala.inline
    def setSecurityConfig(value: SecurityConfig): Self = StObject.set(x, "securityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigUndefined: Self = StObject.set(x, "securityConfig", js.undefined)
    
    @scala.inline
    def setSoftwareConfig(value: SoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    @scala.inline
    def setTempBucket(value: String): Self = StObject.set(x, "tempBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempBucketUndefined: Self = StObject.set(x, "tempBucket", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: InstanceGroupConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
