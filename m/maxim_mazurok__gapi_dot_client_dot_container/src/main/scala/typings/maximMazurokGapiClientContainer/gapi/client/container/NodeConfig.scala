package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfig extends js.Object {
  
  /** A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  
  /**
    * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form
    * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see:
    * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String] = js.native
  
  /** Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB. */
  var diskSizeGb: js.UndefOr[Double] = js.native
  
  /** Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the default disk type is 'pd-standard' */
  var diskType: js.UndefOr[String] = js.native
  
  /** The image type to use for this node. Note that for a given image type, the latest version of it will be used. */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of
    * conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more
    * information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See:
    * https://cloud.google.com/compute/docs/disks/local-ssd for more information.
    */
  var localSsdCount: js.UndefOr[Double] = js.native
  
  /** The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types) If unspecified, the default machine type is `e2-medium`. */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part
    * of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: -
    * "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-os-login" - "gci-ensure-gke-docker" - "gci-metrics-enabled" -
    * "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" -
    * "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" The following keys are reserved for Windows nodes: - "serial-port-logging-enable" Values are free-form strings, and
    * only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total
    * size of all keys and values must be less than 512 KB.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
    * such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU
    * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /**
    * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant
    * nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
    */
  var nodeGroup: js.UndefOr[String] = js.native
  
  /**
    * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default
    * are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is
    * required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging
    * or Cloud Monitoring are enabled, in which case their required scopes will be added.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more information about preemptible VM instances. */
  var preemptible: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
    * to this node pool.
    */
  var reservationAffinity: js.UndefOr[ReservationAffinity] = js.native
  
  /** Sandbox configuration for this node. */
  var sandboxConfig: js.UndefOr[SandboxConfig] = js.native
  
  /**
    * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default"
    * service account is used.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Shielded Instance options. */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.native
  
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool
    * creation. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see:
    * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
    */
  var taints: js.UndefOr[js.Array[NodeTaint]] = js.native
  
  /** The workload metadata configuration for this node. */
  var workloadMetadataConfig: js.UndefOr[WorkloadMetadataConfig] = js.native
}
object NodeConfig {
  
  @scala.inline
  def apply(): NodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfig]
  }
  
  @scala.inline
  implicit class NodeConfigOps[Self <: NodeConfig] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = this.set("accelerators", js.Array(value :_*))
    
    @scala.inline
    def setAccelerators(value: js.Array[AcceleratorConfig]): Self = this.set("accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerators: Self = this.set("accelerators", js.undefined)
    
    @scala.inline
    def setBootDiskKmsKey(value: String): Self = this.set("bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskKmsKey: Self = this.set("bootDiskKmsKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLocalSsdCount(value: Double): Self = this.set("localSsdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSsdCount: Self = this.set("localSsdCount", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNodeGroup(value: String): Self = this.set("nodeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeGroup: Self = this.set("nodeGroup", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = this.set("oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = this.set("oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauthScopes: Self = this.set("oauthScopes", js.undefined)
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = this.set("preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptible: Self = this.set("preemptible", js.undefined)
    
    @scala.inline
    def setReservationAffinity(value: ReservationAffinity): Self = this.set("reservationAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationAffinity: Self = this.set("reservationAffinity", js.undefined)
    
    @scala.inline
    def setSandboxConfig(value: SandboxConfig): Self = this.set("sandboxConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandboxConfig: Self = this.set("sandboxConfig", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = this.set("shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShieldedInstanceConfig: Self = this.set("shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTaintsVarargs(value: NodeTaint*): Self = this.set("taints", js.Array(value :_*))
    
    @scala.inline
    def setTaints(value: js.Array[NodeTaint]): Self = this.set("taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaints: Self = this.set("taints", js.undefined)
    
    @scala.inline
    def setWorkloadMetadataConfig(value: WorkloadMetadataConfig): Self = this.set("workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkloadMetadataConfig: Self = this.set("workloadMetadataConfig", js.undefined)
  }
}
