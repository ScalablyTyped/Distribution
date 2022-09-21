package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNodeConfig extends StObject {
  
  /**
    * Optional. A list of hardware accelerators (https://cloud.google.com/compute/docs/gpus) to attach to each node.
    */
  var accelerators: js.UndefOr[js.Array[SchemaGkeNodePoolAcceleratorConfig]] = js.undefined
  
  /**
    * Optional. The Customer Managed Encryption Key (CMEK) (https://cloud.google.com/kubernetes-engine/docs/how-to/using-cmek) used to encrypt the boot disk attached to each node in the node pool. Specify the key using the following format: projects/KEY_PROJECT_ID/locations/LOCATION /keyRings/RING_NAME/cryptoKeys/KEY_NAME.
    */
  var bootDiskKmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of local SSD disks to attach to the node, which is limited by the maximum number of disks allowable per zone (see Adding Local SSDs (https://cloud.google.com/compute/docs/disks/local-ssd)).
    */
  var localSsdCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The name of a Compute Engine machine type (https://cloud.google.com/compute/docs/machine-types).
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Minimum CPU platform (https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform) to be used by this instance. The instance may be scheduled on the specified or a newer CPU platform. Specify the friendly names of CPU platforms, such as "Intel Haswell"` or Intel Sandy Bridge".
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether the nodes are created as preemptible VM instances (https://cloud.google.com/compute/docs/instances/preemptible). Preemptible nodes cannot be used in a node pool with the CONTROLLER role or in the DEFAULT node pool if the CONTROLLER role is not assigned (the DEFAULT node pool will assume the CONTROLLER role).
    */
  var preemptible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Spot flag for enabling Spot VM, which is a rebrand of the existing preemptible flag.
    */
  var spot: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGkeNodeConfig {
  
  inline def apply(): SchemaGkeNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNodeConfig]
  }
  
  extension [Self <: SchemaGkeNodeConfig](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaGkeNodePoolAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaGkeNodePoolAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setBootDiskKmsKey(value: String): Self = StObject.set(x, "bootDiskKmsKey", value.asInstanceOf[js.Any])
    
    inline def setBootDiskKmsKeyNull: Self = StObject.set(x, "bootDiskKmsKey", null)
    
    inline def setBootDiskKmsKeyUndefined: Self = StObject.set(x, "bootDiskKmsKey", js.undefined)
    
    inline def setLocalSsdCount(value: Double): Self = StObject.set(x, "localSsdCount", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdCountNull: Self = StObject.set(x, "localSsdCount", null)
    
    inline def setLocalSsdCountUndefined: Self = StObject.set(x, "localSsdCount", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    inline def setPreemptibleNull: Self = StObject.set(x, "preemptible", null)
    
    inline def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
    
    inline def setSpot(value: Boolean): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    inline def setSpotNull: Self = StObject.set(x, "spot", null)
    
    inline def setSpotUndefined: Self = StObject.set(x, "spot", js.undefined)
  }
}
