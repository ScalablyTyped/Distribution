package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfig extends StObject {
  
  /** A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /**
    * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form
    * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see:
    * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String] = js.undefined
  
  /** Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /** Type of the disk attached to each node (e.g. 'pd-standard' or 'pd-ssd') If unspecified, the default disk type is 'pd-standard' */
  var diskType: js.UndefOr[String] = js.undefined
  
  /** The image type to use for this node. Note that for a given image type, the latest version of it will be used. */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of
    * conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more
    * information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See:
    * https://cloud.google.com/compute/docs/disks/local-ssd for more information.
    */
  var localSsdCount: js.UndefOr[Double] = js.undefined
  
  /** The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types) If unspecified, the default machine type is `e2-medium`. */
  var machineType: js.UndefOr[String] = js.undefined
  
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
    */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms,
    * such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU
    * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
    */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant
    * nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
    */
  var nodeGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default
    * are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is
    * required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging
    * or Cloud Monitoring are enabled, in which case their required scopes will be added.
    */
  var oauthScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more information about preemptible VM instances. */
  var preemptible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
    * to this node pool.
    */
  var reservationAffinity: js.UndefOr[ReservationAffinity] = js.undefined
  
  /** Sandbox configuration for this node. */
  var sandboxConfig: js.UndefOr[SandboxConfig] = js.undefined
  
  /**
    * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default"
    * service account is used.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** Shielded Instance options. */
  var shieldedInstanceConfig: js.UndefOr[ShieldedInstanceConfig] = js.undefined
  
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool
    * creation. Each tag within the list must comply with RFC1035.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see:
    * https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
    */
  var taints: js.UndefOr[js.Array[NodeTaint]] = js.undefined
  
  /** The workload metadata configuration for this node. */
  var workloadMetadataConfig: js.UndefOr[WorkloadMetadataConfig] = js.undefined
}
object NodeConfig {
  
  @scala.inline
  def apply(): NodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfig]
  }
  
  @scala.inline
  implicit class NodeConfigMutableBuilder[Self <: NodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value :_*))
    
    @scala.inline
    def setBootDiskKmsKey(value: String): Self = StObject.set(x, "bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDiskKmsKeyUndefined: Self = StObject.set(x, "bootDiskKmsKey", js.undefined)
    
    @scala.inline
    def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocalSsdCount(value: Double): Self = StObject.set(x, "localSsdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSsdCountUndefined: Self = StObject.set(x, "localSsdCount", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.NodeConfig & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNodeGroup(value: String): Self = StObject.set(x, "nodeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupUndefined: Self = StObject.set(x, "nodeGroup", js.undefined)
    
    @scala.inline
    def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    @scala.inline
    def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value :_*))
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    @scala.inline
    def setReservationAffinity(value: ReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    @scala.inline
    def setSandboxConfig(value: SandboxConfig): Self = StObject.set(x, "sandboxConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxConfigUndefined: Self = StObject.set(x, "sandboxConfig", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    @scala.inline
    def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaints(value: js.Array[NodeTaint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    @scala.inline
    def setTaintsVarargs(value: NodeTaint*): Self = StObject.set(x, "taints", js.Array(value :_*))
    
    @scala.inline
    def setWorkloadMetadataConfig(value: WorkloadMetadataConfig): Self = StObject.set(x, "workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkloadMetadataConfigUndefined: Self = StObject.set(x, "workloadMetadataConfig", js.undefined)
  }
}
