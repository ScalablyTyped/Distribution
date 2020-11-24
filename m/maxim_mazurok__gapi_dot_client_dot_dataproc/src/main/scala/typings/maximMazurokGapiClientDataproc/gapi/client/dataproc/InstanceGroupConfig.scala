package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupConfig extends js.Object {
  
  /** Optional. The Compute Engine accelerator configuration for these instances. */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.native
  
  /**
    * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples:
    * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will
    * use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name]
    * projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
    */
  var imageUri: js.UndefOr[String] = js.native
  
  /** Output only. The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group. */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. List of references to Compute Engine instances. */
  var instanceReferences: js.UndefOr[js.Array[InstanceReference]] = js.native
  
  /** Output only. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement
    * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for
    * example, n1-standard-2.
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  
  /** Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.native
  
  /** Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu). */
  var minCpuPlatform: js.UndefOr[String] = js.native
  
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for
    * secondary instances is PREEMPTIBLE.
    */
  var preemptibility: js.UndefOr[String] = js.native
}
object InstanceGroupConfig {
  
  @scala.inline
  def apply(): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  
  @scala.inline
  implicit class InstanceGroupConfigOps[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
    
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
    def setDiskConfig(value: DiskConfig): Self = this.set("diskConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskConfig: Self = this.set("diskConfig", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = this.set("instanceNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceNames(value: js.Array[String]): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceNames: Self = this.set("instanceNames", js.undefined)
    
    @scala.inline
    def setInstanceReferencesVarargs(value: InstanceReference*): Self = this.set("instanceReferences", js.Array(value :_*))
    
    @scala.inline
    def setInstanceReferences(value: js.Array[InstanceReference]): Self = this.set("instanceReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceReferences: Self = this.set("instanceReferences", js.undefined)
    
    @scala.inline
    def setIsPreemptible(value: Boolean): Self = this.set("isPreemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPreemptible: Self = this.set("isPreemptible", js.undefined)
    
    @scala.inline
    def setMachineTypeUri(value: String): Self = this.set("machineTypeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineTypeUri: Self = this.set("machineTypeUri", js.undefined)
    
    @scala.inline
    def setManagedGroupConfig(value: ManagedGroupConfig): Self = this.set("managedGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedGroupConfig: Self = this.set("managedGroupConfig", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    
    @scala.inline
    def setNumInstances(value: Double): Self = this.set("numInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumInstances: Self = this.set("numInstances", js.undefined)
    
    @scala.inline
    def setPreemptibility(value: String): Self = this.set("preemptibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptibility: Self = this.set("preemptibility", js.undefined)
  }
}
