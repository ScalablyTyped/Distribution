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
  def apply(
    autoscalingConfig: SchemaAutoscalingConfig = null,
    configBucket: String = null,
    encryptionConfig: SchemaEncryptionConfig = null,
    endpointConfig: SchemaEndpointConfig = null,
    gceClusterConfig: SchemaGceClusterConfig = null,
    initializationActions: js.Array[SchemaNodeInitializationAction] = null,
    lifecycleConfig: SchemaLifecycleConfig = null,
    masterConfig: SchemaInstanceGroupConfig = null,
    secondaryWorkerConfig: SchemaInstanceGroupConfig = null,
    securityConfig: SchemaSecurityConfig = null,
    softwareConfig: SchemaSoftwareConfig = null,
    workerConfig: SchemaInstanceGroupConfig = null
  ): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (autoscalingConfig != null) __obj.updateDynamic("autoscalingConfig")(autoscalingConfig.asInstanceOf[js.Any])
    if (configBucket != null) __obj.updateDynamic("configBucket")(configBucket.asInstanceOf[js.Any])
    if (encryptionConfig != null) __obj.updateDynamic("encryptionConfig")(encryptionConfig.asInstanceOf[js.Any])
    if (endpointConfig != null) __obj.updateDynamic("endpointConfig")(endpointConfig.asInstanceOf[js.Any])
    if (gceClusterConfig != null) __obj.updateDynamic("gceClusterConfig")(gceClusterConfig.asInstanceOf[js.Any])
    if (initializationActions != null) __obj.updateDynamic("initializationActions")(initializationActions.asInstanceOf[js.Any])
    if (lifecycleConfig != null) __obj.updateDynamic("lifecycleConfig")(lifecycleConfig.asInstanceOf[js.Any])
    if (masterConfig != null) __obj.updateDynamic("masterConfig")(masterConfig.asInstanceOf[js.Any])
    if (secondaryWorkerConfig != null) __obj.updateDynamic("secondaryWorkerConfig")(secondaryWorkerConfig.asInstanceOf[js.Any])
    if (securityConfig != null) __obj.updateDynamic("securityConfig")(securityConfig.asInstanceOf[js.Any])
    if (softwareConfig != null) __obj.updateDynamic("softwareConfig")(softwareConfig.asInstanceOf[js.Any])
    if (workerConfig != null) __obj.updateDynamic("workerConfig")(workerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterConfig]
  }
}

