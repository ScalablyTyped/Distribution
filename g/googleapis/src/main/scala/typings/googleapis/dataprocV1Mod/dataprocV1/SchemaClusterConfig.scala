package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterConfig extends StObject {
  
  /**
    * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
    */
  var autoscalingConfig: js.UndefOr[SchemaAutoscalingConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
    */
  var configBucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The config for Dataproc metrics.
    */
  var dataprocMetricConfig: js.UndefOr[SchemaDataprocMetricConfig] = js.undefined
  
  /**
    * Optional. Encryption settings for the cluster.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.undefined
  
  /**
    * Optional. Port/endpoint configuration for this cluster
    */
  var endpointConfig: js.UndefOr[SchemaEndpointConfig] = js.undefined
  
  /**
    * Optional. The shared Compute Engine config settings for all instances in a cluster.
    */
  var gceClusterConfig: js.UndefOr[SchemaGceClusterConfig] = js.undefined
  
  /**
    * Optional. BETA. The Kubernetes Engine config for Dataproc clusters deployed to The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. These config settings are mutually exclusive with Compute Engine-based options, such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
    */
  var gkeClusterConfig: js.UndefOr[SchemaGkeClusterConfig] = js.undefined
  
  /**
    * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE\}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[SchemaNodeInitializationAction]] = js.undefined
  
  /**
    * Optional. Lifecycle setting for the cluster.
    */
  var lifecycleConfig: js.UndefOr[SchemaLifecycleConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for the cluster's master instance.
    */
  var masterConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
  
  /**
    * Optional. Metastore configuration.
    */
  var metastoreConfig: js.UndefOr[SchemaMetastoreConfig] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for a cluster's secondary worker instances
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
  
  /**
    * Optional. Security settings for the cluster.
    */
  var securityConfig: js.UndefOr[SchemaSecurityConfig] = js.undefined
  
  /**
    * Optional. The config settings for cluster software.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
    */
  var tempBucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The Compute Engine config settings for the cluster's worker instances.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.undefined
}
object SchemaClusterConfig {
  
  inline def apply(): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterConfig]
  }
  
  extension [Self <: SchemaClusterConfig](x: Self) {
    
    inline def setAutoscalingConfig(value: SchemaAutoscalingConfig): Self = StObject.set(x, "autoscalingConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingConfigUndefined: Self = StObject.set(x, "autoscalingConfig", js.undefined)
    
    inline def setConfigBucket(value: String): Self = StObject.set(x, "configBucket", value.asInstanceOf[js.Any])
    
    inline def setConfigBucketNull: Self = StObject.set(x, "configBucket", null)
    
    inline def setConfigBucketUndefined: Self = StObject.set(x, "configBucket", js.undefined)
    
    inline def setDataprocMetricConfig(value: SchemaDataprocMetricConfig): Self = StObject.set(x, "dataprocMetricConfig", value.asInstanceOf[js.Any])
    
    inline def setDataprocMetricConfigUndefined: Self = StObject.set(x, "dataprocMetricConfig", js.undefined)
    
    inline def setEncryptionConfig(value: SchemaEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEndpointConfig(value: SchemaEndpointConfig): Self = StObject.set(x, "endpointConfig", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigUndefined: Self = StObject.set(x, "endpointConfig", js.undefined)
    
    inline def setGceClusterConfig(value: SchemaGceClusterConfig): Self = StObject.set(x, "gceClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGceClusterConfigUndefined: Self = StObject.set(x, "gceClusterConfig", js.undefined)
    
    inline def setGkeClusterConfig(value: SchemaGkeClusterConfig): Self = StObject.set(x, "gkeClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterConfigUndefined: Self = StObject.set(x, "gkeClusterConfig", js.undefined)
    
    inline def setInitializationActions(value: js.Array[SchemaNodeInitializationAction]): Self = StObject.set(x, "initializationActions", value.asInstanceOf[js.Any])
    
    inline def setInitializationActionsUndefined: Self = StObject.set(x, "initializationActions", js.undefined)
    
    inline def setInitializationActionsVarargs(value: SchemaNodeInitializationAction*): Self = StObject.set(x, "initializationActions", js.Array(value*))
    
    inline def setLifecycleConfig(value: SchemaLifecycleConfig): Self = StObject.set(x, "lifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigUndefined: Self = StObject.set(x, "lifecycleConfig", js.undefined)
    
    inline def setMasterConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    inline def setMetastoreConfig(value: SchemaMetastoreConfig): Self = StObject.set(x, "metastoreConfig", value.asInstanceOf[js.Any])
    
    inline def setMetastoreConfigUndefined: Self = StObject.set(x, "metastoreConfig", js.undefined)
    
    inline def setSecondaryWorkerConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    inline def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    inline def setSecurityConfig(value: SchemaSecurityConfig): Self = StObject.set(x, "securityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "securityConfig", js.undefined)
    
    inline def setSoftwareConfig(value: SchemaSoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    inline def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    inline def setTempBucket(value: String): Self = StObject.set(x, "tempBucket", value.asInstanceOf[js.Any])
    
    inline def setTempBucketNull: Self = StObject.set(x, "tempBucket", null)
    
    inline def setTempBucketUndefined: Self = StObject.set(x, "tempBucket", js.undefined)
    
    inline def setWorkerConfig(value: SchemaInstanceGroupConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
