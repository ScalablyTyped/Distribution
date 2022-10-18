package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeConfig extends StObject {
  
  /** A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /** Advanced features for the Compute Engine VM. */
  var advancedMachineFeatures: js.UndefOr[AdvancedMachineFeatures] = js.undefined
  
  /**
    * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form
    * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see:
    * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
    */
  var bootDiskKmsKey: js.UndefOr[String] = js.undefined
  
  /** Confidential nodes config. All the nodes in the node pool will be Confidential VM once enabled. */
  var confidentialNodes: js.UndefOr[ConfidentialNodes] = js.undefined
  
  /** Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /** Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard' */
  var diskType: js.UndefOr[String] = js.undefined
  
  /** Google Container File System (image streaming) configs. */
  var gcfsConfig: js.UndefOr[GcfsConfig] = js.undefined
  
  /** Enable or disable gvnic in the node pool. */
  var gvnic: js.UndefOr[VirtualNIC] = js.undefined
  
  /** The image type to use for this node. Note that for a given image type, the latest version of it will be used. */
  var imageType: js.UndefOr[String] = js.undefined
  
  /** Node kubelet configs. */
  var kubeletConfig: js.UndefOr[NodeKubeletConfig] = js.undefined
  
  /**
    * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of
    * conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more
    * information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Parameters that can be configured on Linux nodes. */
  var linuxNodeConfig: js.UndefOr[LinuxNodeConfig] = js.undefined
  
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
    * "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only
    * restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
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
  
  /** Spot flag for enabling Spot VM, which is a rebrand of the existing preemptible flag. */
  var spot: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(): NodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfig]
  }
  
  extension [Self <: NodeConfig](x: Self) {
    
    inline def setAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setAdvancedMachineFeatures(value: AdvancedMachineFeatures): Self = StObject.set(x, "advancedMachineFeatures", value.asInstanceOf[js.Any])
    
    inline def setAdvancedMachineFeaturesUndefined: Self = StObject.set(x, "advancedMachineFeatures", js.undefined)
    
    inline def setBootDiskKmsKey(value: String): Self = StObject.set(x, "bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    inline def setBootDiskKmsKeyUndefined: Self = StObject.set(x, "bootDiskKmsKey", js.undefined)
    
    inline def setConfidentialNodes(value: ConfidentialNodes): Self = StObject.set(x, "confidentialNodes", value.asInstanceOf[js.Any])
    
    inline def setConfidentialNodesUndefined: Self = StObject.set(x, "confidentialNodes", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setGcfsConfig(value: GcfsConfig): Self = StObject.set(x, "gcfsConfig", value.asInstanceOf[js.Any])
    
    inline def setGcfsConfigUndefined: Self = StObject.set(x, "gcfsConfig", js.undefined)
    
    inline def setGvnic(value: VirtualNIC): Self = StObject.set(x, "gvnic", value.asInstanceOf[js.Any])
    
    inline def setGvnicUndefined: Self = StObject.set(x, "gvnic", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setKubeletConfig(value: NodeKubeletConfig): Self = StObject.set(x, "kubeletConfig", value.asInstanceOf[js.Any])
    
    inline def setKubeletConfigUndefined: Self = StObject.set(x, "kubeletConfig", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLinuxNodeConfig(value: LinuxNodeConfig): Self = StObject.set(x, "linuxNodeConfig", value.asInstanceOf[js.Any])
    
    inline def setLinuxNodeConfigUndefined: Self = StObject.set(x, "linuxNodeConfig", js.undefined)
    
    inline def setLocalSsdCount(value: Double): Self = StObject.set(x, "localSsdCount", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdCountUndefined: Self = StObject.set(x, "localSsdCount", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setNodeGroup(value: String): Self = StObject.set(x, "nodeGroup", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupUndefined: Self = StObject.set(x, "nodeGroup", js.undefined)
    
    inline def setOauthScopes(value: js.Array[String]): Self = StObject.set(x, "oauthScopes", value.asInstanceOf[js.Any])
    
    inline def setOauthScopesUndefined: Self = StObject.set(x, "oauthScopes", js.undefined)
    
    inline def setOauthScopesVarargs(value: String*): Self = StObject.set(x, "oauthScopes", js.Array(value*))
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setReservationAffinity(value: ReservationAffinity): Self = StObject.set(x, "reservationAffinity", value.asInstanceOf[js.Any])
    
    inline def setReservationAffinityUndefined: Self = StObject.set(x, "reservationAffinity", js.undefined)
    
    inline def setSandboxConfig(value: SandboxConfig): Self = StObject.set(x, "sandboxConfig", value.asInstanceOf[js.Any])
    
    inline def setSandboxConfigUndefined: Self = StObject.set(x, "sandboxConfig", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setShieldedInstanceConfig(value: ShieldedInstanceConfig): Self = StObject.set(x, "shieldedInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setShieldedInstanceConfigUndefined: Self = StObject.set(x, "shieldedInstanceConfig", js.undefined)
    
    inline def setSpot(value: Boolean): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    inline def setSpotUndefined: Self = StObject.set(x, "spot", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTaints(value: js.Array[NodeTaint]): Self = StObject.set(x, "taints", value.asInstanceOf[js.Any])
    
    inline def setTaintsUndefined: Self = StObject.set(x, "taints", js.undefined)
    
    inline def setTaintsVarargs(value: NodeTaint*): Self = StObject.set(x, "taints", js.Array(value*))
    
    inline def setWorkloadMetadataConfig(value: WorkloadMetadataConfig): Self = StObject.set(x, "workloadMetadataConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkloadMetadataConfigUndefined: Self = StObject.set(x, "workloadMetadataConfig", js.undefined)
  }
}
