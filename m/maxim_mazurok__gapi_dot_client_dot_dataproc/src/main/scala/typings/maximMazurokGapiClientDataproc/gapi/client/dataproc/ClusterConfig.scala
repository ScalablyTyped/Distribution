package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterConfig extends js.Object {
  
  /** Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset. */
  var autoscalingConfig: js.UndefOr[AutoscalingConfig] = js.native
  
  /**
    * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a
    * Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this
    * project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
    */
  var configBucket: js.UndefOr[String] = js.native
  
  /** Optional. Encryption settings for the cluster. */
  var encryptionConfig: js.UndefOr[EncryptionConfig] = js.native
  
  /** Optional. Port/endpoint configuration for this cluster */
  var endpointConfig: js.UndefOr[EndpointConfig] = js.native
  
  /** Optional. The shared Compute Engine config settings for all instances in a cluster. */
  var gceClusterConfig: js.UndefOr[GceClusterConfig] = js.native
  
  /**
    * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an
    * executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[NodeInitializationAction]] = js.native
  
  /** Optional. Lifecycle setting for the cluster. */
  var lifecycleConfig: js.UndefOr[LifecycleConfig] = js.native
  
  /** Optional. The Compute Engine config settings for the master instance in a cluster. */
  var masterConfig: js.UndefOr[InstanceGroupConfig] = js.native
  
  /** Optional. The Compute Engine config settings for additional worker instances in a cluster. */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupConfig] = js.native
  
  /** Optional. Security settings for the cluster. */
  var securityConfig: js.UndefOr[SecurityConfig] = js.native
  
  /** Optional. The config settings for software inside the cluster. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.native
  
  /**
    * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will
    * determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage
    * this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket.
    */
  var tempBucket: js.UndefOr[String] = js.native
  
  /** Optional. The Compute Engine config settings for worker instances in a cluster. */
  var workerConfig: js.UndefOr[InstanceGroupConfig] = js.native
}
object ClusterConfig {
  
  @scala.inline
  def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  @scala.inline
  implicit class ClusterConfigOps[Self <: ClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoscalingConfig(value: AutoscalingConfig): Self = this.set("autoscalingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingConfig: Self = this.set("autoscalingConfig", js.undefined)
    
    @scala.inline
    def setConfigBucket(value: String): Self = this.set("configBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigBucket: Self = this.set("configBucket", js.undefined)
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("encryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("encryptionConfig", js.undefined)
    
    @scala.inline
    def setEndpointConfig(value: EndpointConfig): Self = this.set("endpointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfig: Self = this.set("endpointConfig", js.undefined)
    
    @scala.inline
    def setGceClusterConfig(value: GceClusterConfig): Self = this.set("gceClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGceClusterConfig: Self = this.set("gceClusterConfig", js.undefined)
    
    @scala.inline
    def setInitializationActionsVarargs(value: NodeInitializationAction*): Self = this.set("initializationActions", js.Array(value :_*))
    
    @scala.inline
    def setInitializationActions(value: js.Array[NodeInitializationAction]): Self = this.set("initializationActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitializationActions: Self = this.set("initializationActions", js.undefined)
    
    @scala.inline
    def setLifecycleConfig(value: LifecycleConfig): Self = this.set("lifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleConfig: Self = this.set("lifecycleConfig", js.undefined)
    
    @scala.inline
    def setMasterConfig(value: InstanceGroupConfig): Self = this.set("masterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterConfig: Self = this.set("masterConfig", js.undefined)
    
    @scala.inline
    def setSecondaryWorkerConfig(value: InstanceGroupConfig): Self = this.set("secondaryWorkerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryWorkerConfig: Self = this.set("secondaryWorkerConfig", js.undefined)
    
    @scala.inline
    def setSecurityConfig(value: SecurityConfig): Self = this.set("securityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfig: Self = this.set("securityConfig", js.undefined)
    
    @scala.inline
    def setSoftwareConfig(value: SoftwareConfig): Self = this.set("softwareConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftwareConfig: Self = this.set("softwareConfig", js.undefined)
    
    @scala.inline
    def setTempBucket(value: String): Self = this.set("tempBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempBucket: Self = this.set("tempBucket", js.undefined)
    
    @scala.inline
    def setWorkerConfig(value: InstanceGroupConfig): Self = this.set("workerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerConfig: Self = this.set("workerConfig", js.undefined)
  }
}
