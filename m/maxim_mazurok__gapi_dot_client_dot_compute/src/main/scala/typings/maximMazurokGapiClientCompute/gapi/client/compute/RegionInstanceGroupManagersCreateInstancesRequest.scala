package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /** [Required] List of specifications of per-instance configs. */
  var instances: js.UndefOr[js.Array[PerInstanceConfig]] = js.undefined
}
object RegionInstanceGroupManagersCreateInstancesRequest {
  
  inline def apply(): RegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersCreateInstancesRequest]
  }
  
  extension [Self <: RegionInstanceGroupManagersCreateInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
