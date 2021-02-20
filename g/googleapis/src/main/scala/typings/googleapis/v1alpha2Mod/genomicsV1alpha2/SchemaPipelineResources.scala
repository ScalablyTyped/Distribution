package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The system resources for the pipeline run.
  */
@js.native
trait SchemaPipelineResources extends StObject {
  
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
  implicit class SchemaPipelineResourcesMutableBuilder[Self <: SchemaPipelineResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorCount(value: String): Self = StObject.set(x, "acceleratorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorCountUndefined: Self = StObject.set(x, "acceleratorCount", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    @scala.inline
    def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    @scala.inline
    def setDisks(value: js.Array[SchemaDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: SchemaDisk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setMinimumCpuCores(value: Double): Self = StObject.set(x, "minimumCpuCores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCpuCoresUndefined: Self = StObject.set(x, "minimumCpuCores", js.undefined)
    
    @scala.inline
    def setMinimumRamGb(value: Double): Self = StObject.set(x, "minimumRamGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumRamGbUndefined: Self = StObject.set(x, "minimumRamGb", js.undefined)
    
    @scala.inline
    def setNoAddress(value: Boolean): Self = StObject.set(x, "noAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAddressUndefined: Self = StObject.set(x, "noAddress", js.undefined)
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
