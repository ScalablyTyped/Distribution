package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the TunnelDestGroup to delete. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}/destGroups/{dest_group\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete {
  
  inline def apply(): ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsIapTunnelLocationsDestgroupsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
