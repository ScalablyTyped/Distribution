package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsIapTunnelLocationsDestgroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the TunnelDestGroup to be fetched. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}/destGroups/{dest_group\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsIapTunnelLocationsDestgroupsGet {
  
  inline def apply(): ParamsResourceProjectsIapTunnelLocationsDestgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsIapTunnelLocationsDestgroupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsIapTunnelLocationsDestgroupsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
