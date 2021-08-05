package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupManagerUpdateInstanceConfigReq extends StObject {
  
  /** The list of per-instance configs to insert or patch on this managed instance group. */
  var perInstanceConfigs: js.UndefOr[js.Array[PerInstanceConfig]] = js.undefined
}
object RegionInstanceGroupManagerUpdateInstanceConfigReq {
  
  inline def apply(): RegionInstanceGroupManagerUpdateInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagerUpdateInstanceConfigReq]
  }
  
  extension [Self <: RegionInstanceGroupManagerUpdateInstanceConfigReq](x: Self) {
    
    inline def setPerInstanceConfigs(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "perInstanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setPerInstanceConfigsUndefined: Self = StObject.set(x, "perInstanceConfigs", js.undefined)
    
    inline def setPerInstanceConfigsVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "perInstanceConfigs", js.Array(value :_*))
  }
}
