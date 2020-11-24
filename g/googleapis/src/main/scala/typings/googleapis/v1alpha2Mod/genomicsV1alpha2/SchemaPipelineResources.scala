package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The system resources for the pipeline run.
  */
@js.native
trait SchemaPipelineResources extends js.Object {
  
  /**
    * Optional. The number of accelerators of the specified type to attach. By
    * specifying this parameter, you will download and install the following
    * third-party software onto your managed Compute Engine instances: NVIDIA®
    * Tesla® drivers and NVIDIA® CUDA toolkit.
    */
  var acceleratorCount: js.UndefOr[String] = js.native
  
  /**
    * Optional. The Compute Engine defined accelerator type. By specifying this
    * parameter, you will download and install the following third-party
    * software onto your managed Compute Engine instances: NVIDIA® Tesla®
    * drivers and NVIDIA® CUDA toolkit. Please see
    * https://cloud.google.com/compute/docs/gpus/ for a list of available
    * accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  
  /**
    * The size of the boot disk. Defaults to 10 (GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  
  /**
    * Disks to attach.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  
  /**
    * The minimum number of cores to use. Defaults to 1.
    */
  var minimumCpuCores: js.UndefOr[Double] = js.native
  
  /**
    * The minimum amount of RAM to use. Defaults to 3.75 (GB)
    */
  var minimumRamGb: js.UndefOr[Double] = js.native
  
  /**
    * Whether to assign an external IP to the instance. This is an experimental
    * feature that may go away. Defaults to false. Corresponds to
    * `--no_address` flag for [gcloud compute instances create]
    * (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create).
    * In order to use this, must be true for both create time and run time.
    * Cannot be true at run time if false at create time. If you need to ssh
    * into a private IP VM for debugging, you can ssh to a public VM and then
    * ssh into the private VM&#39;s Internal IP.  If noAddress is set, this
    * pipeline run may only load docker images from Google Container Registry
    * and not Docker Hub. Before using this, you must [configure access to
    * Google services from internal
    * IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
    */
  var noAddress: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to use preemptible VMs. Defaults to `false`. In order to use
    * this, must be true for both create time and run time. Cannot be true at
    * run time if false at create time.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  
  /**
    * List of Google Compute Engine availability zones to which resource
    * creation will restricted. If empty, any zone may be chosen.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPipelineResources {
  
  @scala.inline
  def apply(): SchemaPipelineResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineResources]
  }
  
  @scala.inline
  implicit class SchemaPipelineResourcesOps[Self <: SchemaPipelineResources] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorCount(value: String): Self = this.set("acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorCount: Self = this.set("acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    
    @scala.inline
    def setBootDiskSizeGb(value: Double): Self = this.set("bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootDiskSizeGb: Self = this.set("bootDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: SchemaDisk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[SchemaDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setMinimumCpuCores(value: Double): Self = this.set("minimumCpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCpuCores: Self = this.set("minimumCpuCores", js.undefined)
    
    @scala.inline
    def setMinimumRamGb(value: Double): Self = this.set("minimumRamGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumRamGb: Self = this.set("minimumRamGb", js.undefined)
    
    @scala.inline
    def setNoAddress(value: Boolean): Self = this.set("noAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAddress: Self = this.set("noAddress", js.undefined)
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = this.set("preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreemptible: Self = this.set("preemptible", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
