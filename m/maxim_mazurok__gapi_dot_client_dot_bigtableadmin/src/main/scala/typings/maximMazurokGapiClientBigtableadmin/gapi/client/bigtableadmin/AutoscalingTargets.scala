package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscalingTargets extends StObject {
  
  /**
    * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80,
    * otherwise it will return INVALID_ARGUMENT error.
    */
  var cpuUtilizationPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * The storage utilization that the Autoscaler should be trying to achieve. This number is limited between 2560 (2.5TiB) and 5120 (5TiB) for a SSD cluster and between 8192 (8TiB) and
    * 16384 (16TiB) for an HDD cluster, otherwise it will return INVALID_ARGUMENT error. If this value is set to 0, it will be treated as if it were set to the default value: 2560 for
    * SSD, 8192 for HDD.
    */
  var storageUtilizationGibPerNode: js.UndefOr[Double] = js.undefined
}
object AutoscalingTargets {
  
  inline def apply(): AutoscalingTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingTargets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoscalingTargets] (val x: Self) extends AnyVal {
    
    inline def setCpuUtilizationPercent(value: Double): Self = StObject.set(x, "cpuUtilizationPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationPercentUndefined: Self = StObject.set(x, "cpuUtilizationPercent", js.undefined)
    
    inline def setStorageUtilizationGibPerNode(value: Double): Self = StObject.set(x, "storageUtilizationGibPerNode", value.asInstanceOf[js.Any])
    
    inline def setStorageUtilizationGibPerNodeUndefined: Self = StObject.set(x, "storageUtilizationGibPerNode", js.undefined)
  }
}
