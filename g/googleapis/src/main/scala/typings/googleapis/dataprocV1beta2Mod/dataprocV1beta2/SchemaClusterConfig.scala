package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The cluster config.
  */
@js.native
trait SchemaClusterConfig extends js.Object {
  /**
    * Optional. Autoscaling config for the policy associated with the cluster.
    * Cluster does not autoscale if this field is unset.
    */
  var autoscalingConfig: js.UndefOr[SchemaAutoscalingConfig] = js.native
  /**
    * Optional. A Google Cloud Storage bucket used to stage job dependencies,
    * config files, and job driver console output. If you do not specify a
    * staging bucket, Cloud Dataproc will determine a Cloud Storage location
    * (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the
    * Google Compute Engine zone where your cluster is deployed, and then
    * create and manage this project-level, per-location bucket (see Cloud
    * Dataproc staging bucket).
    */
  var configBucket: js.UndefOr[String] = js.native
  /**
    * Optional. Encryption settings for the cluster.
    */
  var encryptionConfig: js.UndefOr[SchemaEncryptionConfig] = js.native
  /**
    * Optional. Port/endpoint configuration for this cluster
    */
  var endpointConfig: js.UndefOr[SchemaEndpointConfig] = js.native
  /**
    * Optional. The shared Compute Engine config settings for all instances in
    * a cluster.
    */
  var gceClusterConfig: js.UndefOr[SchemaGceClusterConfig] = js.native
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
  var initializationActions: js.UndefOr[js.Array[SchemaNodeInitializationAction]] = js.native
  /**
    * Optional. The config setting for auto delete cluster schedule.
    */
  var lifecycleConfig: js.UndefOr[SchemaLifecycleConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for the master instance in a
    * cluster.
    */
  var masterConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for additional worker
    * instances in a cluster.
    */
  var secondaryWorkerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
  /**
    * Optional. Security related configuration.
    */
  var securityConfig: js.UndefOr[SchemaSecurityConfig] = js.native
  /**
    * Optional. The config settings for software inside the cluster.
    */
  var softwareConfig: js.UndefOr[SchemaSoftwareConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for worker instances in a
    * cluster.
    */
  var workerConfig: js.UndefOr[SchemaInstanceGroupConfig] = js.native
}

object SchemaClusterConfig {
  @scala.inline
  def apply(): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterConfig]
  }
  @scala.inline
  implicit class SchemaClusterConfigOps[Self <: SchemaClusterConfig] (val x: Self) extends AnyVal {
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
    def setAutoscalingConfig(value: SchemaAutoscalingConfig): Self = this.set("autoscalingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingConfig: Self = this.set("autoscalingConfig", js.undefined)
    @scala.inline
    def setConfigBucket(value: String): Self = this.set("configBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigBucket: Self = this.set("configBucket", js.undefined)
    @scala.inline
    def setEncryptionConfig(value: SchemaEncryptionConfig): Self = this.set("encryptionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("encryptionConfig", js.undefined)
    @scala.inline
    def setEndpointConfig(value: SchemaEndpointConfig): Self = this.set("endpointConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointConfig: Self = this.set("endpointConfig", js.undefined)
    @scala.inline
    def setGceClusterConfig(value: SchemaGceClusterConfig): Self = this.set("gceClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGceClusterConfig: Self = this.set("gceClusterConfig", js.undefined)
    @scala.inline
    def setInitializationActionsVarargs(value: SchemaNodeInitializationAction*): Self = this.set("initializationActions", js.Array(value :_*))
    @scala.inline
    def setInitializationActions(value: js.Array[SchemaNodeInitializationAction]): Self = this.set("initializationActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializationActions: Self = this.set("initializationActions", js.undefined)
    @scala.inline
    def setLifecycleConfig(value: SchemaLifecycleConfig): Self = this.set("lifecycleConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleConfig: Self = this.set("lifecycleConfig", js.undefined)
    @scala.inline
    def setMasterConfig(value: SchemaInstanceGroupConfig): Self = this.set("masterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterConfig: Self = this.set("masterConfig", js.undefined)
    @scala.inline
    def setSecondaryWorkerConfig(value: SchemaInstanceGroupConfig): Self = this.set("secondaryWorkerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryWorkerConfig: Self = this.set("secondaryWorkerConfig", js.undefined)
    @scala.inline
    def setSecurityConfig(value: SchemaSecurityConfig): Self = this.set("securityConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfig: Self = this.set("securityConfig", js.undefined)
    @scala.inline
    def setSoftwareConfig(value: SchemaSoftwareConfig): Self = this.set("softwareConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareConfig: Self = this.set("softwareConfig", js.undefined)
    @scala.inline
    def setWorkerConfig(value: SchemaInstanceGroupConfig): Self = this.set("workerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerConfig: Self = this.set("workerConfig", js.undefined)
  }
  
}

