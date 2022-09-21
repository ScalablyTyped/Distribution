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
    * project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires
    * a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
    */
  var configBucket: js.UndefOr[String] = js.undefined
  
  /** Optional. The config for Dataproc metrics. */
  var dataprocMetricConfig: js.UndefOr[DataprocMetricConfig] = js.undefined
  
  /** Optional. Encryption settings for the cluster. */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  
  /** Optional. Port/endpoint configuration for this cluster */
  var endpointConfig: js.UndefOr[EndpointConfig] = js.undefined
  
  /** Optional. The shared Compute Engine config settings for all instances in a cluster. */
  var gceClusterConfig: js.UndefOr[GceClusterConfig] = js.undefined
  
  /**
    * Optional. BETA. The Kubernetes Engine config for Dataproc clusters deployed to The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. These config settings are
    * mutually exclusive with Compute Engine-based options, such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
    */
  var gkeClusterConfig: js.UndefOr[GkeClusterConfig] = js.undefined
  
  /**
    * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an
    * executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[NodeInitializationAction]] = js.undefined
  
  /** Optional. Lifecycle setting for the cluster. */
  var lifecycleConfig: js.UndefOr[LifecycleConfig] = js.undefined
  
  /** Optional. The Compute Engine config settings for the cluster's master instance. */
  var masterConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  
  /** Optional. Metastore configuration. */
  var metastoreConfig: js.UndefOr[MetastoreConfig] = js.undefined
  
  /** Optional. The Compute Engine config settings for a cluster's secondary worker instances */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  
  /** Optional. Security settings for the cluster. */
  var securityConfig: js.UndefOr[SecurityConfig] = js.undefined
  
  /** Optional. The config settings for cluster software. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.undefined
  
  /**
    * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will
    * determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage
    * this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket (see Dataproc staging and temp buckets
    * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage
    * bucket.
    */
  var tempBucket: js.UndefOr[String] = js.undefined
  
  /** Optional. The Compute Engine config settings for the cluster's worker instances. */
  var workerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
}
object ClusterConfig {
  
  inline def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  extension [Self <: ClusterConfig](x: Self) {
    
    inline def setAutoscalingConfig(value: AutoscalingConfig): Self = StObject.set(x, "autoscalingConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingConfigUndefined: Self = StObject.set(x, "autoscalingConfig", js.undefined)
    
    inline def setConfigBucket(value: String): Self = StObject.set(x, "configBucket", value.asInstanceOf[js.Any])
    
    inline def setConfigBucketUndefined: Self = StObject.set(x, "configBucket", js.undefined)
    
    inline def setDataprocMetricConfig(value: DataprocMetricConfig): Self = StObject.set(x, "dataprocMetricConfig", value.asInstanceOf[js.Any])
    
    inline def setDataprocMetricConfigUndefined: Self = StObject.set(x, "dataprocMetricConfig", js.undefined)
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setEndpointConfig(value: EndpointConfig): Self = StObject.set(x, "endpointConfig", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigUndefined: Self = StObject.set(x, "endpointConfig", js.undefined)
    
    inline def setGceClusterConfig(value: GceClusterConfig): Self = StObject.set(x, "gceClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGceClusterConfigUndefined: Self = StObject.set(x, "gceClusterConfig", js.undefined)
    
    inline def setGkeClusterConfig(value: GkeClusterConfig): Self = StObject.set(x, "gkeClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterConfigUndefined: Self = StObject.set(x, "gkeClusterConfig", js.undefined)
    
    inline def setInitializationActions(value: js.Array[NodeInitializationAction]): Self = StObject.set(x, "initializationActions", value.asInstanceOf[js.Any])
    
    inline def setInitializationActionsUndefined: Self = StObject.set(x, "initializationActions", js.undefined)
    
    inline def setInitializationActionsVarargs(value: NodeInitializationAction*): Self = StObject.set(x, "initializationActions", js.Array(value*))
    
    inline def setLifecycleConfig(value: LifecycleConfig): Self = StObject.set(x, "lifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigUndefined: Self = StObject.set(x, "lifecycleConfig", js.undefined)
    
    inline def setMasterConfig(value: InstanceGroupConfig): Self = StObject.set(x, "masterConfig", value.asInstanceOf[js.Any])
    
    inline def setMasterConfigUndefined: Self = StObject.set(x, "masterConfig", js.undefined)
    
    inline def setMetastoreConfig(value: MetastoreConfig): Self = StObject.set(x, "metastoreConfig", value.asInstanceOf[js.Any])
    
    inline def setMetastoreConfigUndefined: Self = StObject.set(x, "metastoreConfig", js.undefined)
    
    inline def setSecondaryWorkerConfig(value: InstanceGroupConfig): Self = StObject.set(x, "secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    inline def setSecondaryWorkerConfigUndefined: Self = StObject.set(x, "secondaryWorkerConfig", js.undefined)
    
    inline def setSecurityConfig(value: SecurityConfig): Self = StObject.set(x, "securityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "securityConfig", js.undefined)
    
    inline def setSoftwareConfig(value: SoftwareConfig): Self = StObject.set(x, "softwareConfig", value.asInstanceOf[js.Any])
    
    inline def setSoftwareConfigUndefined: Self = StObject.set(x, "softwareConfig", js.undefined)
    
    inline def setTempBucket(value: String): Self = StObject.set(x, "tempBucket", value.asInstanceOf[js.Any])
    
    inline def setTempBucketUndefined: Self = StObject.set(x, "tempBucket", js.undefined)
    
    inline def setWorkerConfig(value: InstanceGroupConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
  }
}
