package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The cluster config.
  */
trait SchemaClusterConfig extends StObject {
  
  /**
    * Optional. Autoscaling config for the policy associated with the cluster.
    * Cluster does not autoscale if this field is unset.
    */
  var autoscalingConfig: js.UndefOr[SchemaAutoscalingConfig] = js.undefined
  
  /**
    * Optional. A Google Cloud Storage bucket used to stage job dependencies,
    * config files, and job driver console output. If you do not specify a
    * staging bucket, Cloud Dataproc will determine a Cloud Storage location
    * (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the
    * Google Compute Engine zone where your cluster is deployed, and then
    * create and manage this project-level, per-location bucket (see Cloud
    * Dataproc staging bucket).
    */
  var configBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Encryption settings for the cluster.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Optional. Port/endpoint configuration for this cluster
    */
  var endpointConfig: js.UndefOr[SchemaEndpointConfig] = js.undefined
  
  /**
    * Optional. The shared Compute Engine config settings for all instances in
    * a cluster.
    */
  var gceClusterConfig: js.UndefOr[SchemaGceClusterConfig] = js.undefined
  
  /**
    * Optional. Commands to execute on each node after config is completed. By
    * default, executables are run on master and all worker nodes. You can test
    * a node&#39;s &lt;code&gt;role&lt;/code&gt; metadata to run an executable
    * on a master or worker node, as shown below using curl (you can also use
    * wget): ROLE=$(curl -H Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role)
    * if [[ &quot;${ROLE}&quot; == &#39;Master&#39; ]]; then   ... master
    * specific actions ... else   ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[SchemaNodeInitializationAction]] = js.undefined
  
  /**
    * Optional. The config setting for auto delete cluster schedule.
    */
  var lifecycleConfig: js.UndefOr[SchemaLifecycleConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for the master instance in a
    * cluster.
    */
  var masterConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for additional worker
    * instances in a cluster.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
  
  /**
    * Optional. Security related configuration.
    */
  var securityConfig: js.UndefOr[SchemaSecurityConfig] = js.undefined
  
  /**
    * Optional. The config settings for software inside the cluster.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for worker instances in a
    * cluster.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
}
object SchemaClusterConfig {
  
  @scala.inline
  def apply(): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterConfig]
  }
  
  @scala.inline
  implicit class SchemaClusterConfigMutableBuilder[Self <: SchemaClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingConfig(value: SchemaAutoscalingConfig): Self = StObject.set(x, "autoscalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingConfigUndefined: Self = StObject.set(x, "autoscalingConfig", js.undefined)
    
    @scala.inline
    def setConfigBucket(value: String): Self = StObject.set(x, "configBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigBucketUndefined: Self = StObject.set(x, "configBucket", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    @scala.inline
    def setEndpointConfig(value: SchemaEndpointConfig): Self = StObject.set(x, "endpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigUndefined: Self = StObject.set(x, "endpointConfig", js.undefined)
    
    @scala.inline
    def setGceClusterConfig(value: SchemaGceClusterConfig): Self = StObject.set(x, "gceClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGceClusterConfigUndefined: Self = StObject.set(x, "gceClusterConfig", js.undefined)
    
    @scala.inline
    def setInitializationActions(value: js.Array[SchemaNodeInitializationAction]): Self = StObject.set(x, "initializationActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializationActionsUndefined: Self = StObject.set(x, "initializationActions", js.undefined)
    
    @scala.inline
    def setInitializationActionsVarargs(value: SchemaNodeInitializationAction*): Self = StObject.set(x, "initializationActions", js.Array(value :_*))
    
    @scala.inline
    def setLifecycleConfig(value: SchemaLifecycleConfig): Self = StObject.set(x, "lifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigUndefined: Self = StObject.set(x, "lifecycleConfig", js.undefined)
    
    @scala.inline
    def setMasterConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    @scala.inline
    def setSecondaryWorkerConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    @scala.inline
    def setSecurityConfig(value: SchemaSecurityConfig): Self = StObject.set(x, "securityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigUndefined: Self = StObject.set(x, "securityConfig", js.undefined)
    
    @scala.inline
    def setSoftwareConfig(value: SchemaSoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
