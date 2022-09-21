package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Google Cloud Project ID and location. In the following format: `projects/{project_number/id\}/iap_tunnel/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTunnelDestGroup] = js.undefined
  
  /**
    * Required. The ID to use for the TunnelDestGroup, which becomes the final component of the resource name. This value must be 4-63 characters, and valid characters are `[a-z]-`.
    */
  var tunnelDestGroupId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate {
  
  inline def apply(): ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsIapTunnelLocationsDestgroupsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTunnelDestGroup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTunnelDestGroupId(value: String): Self = StObject.set(x, "tunnelDestGroupId", value.asInstanceOf[js.Any])
    
    inline def setTunnelDestGroupIdUndefined: Self = StObject.set(x, "tunnelDestGroupId", js.undefined)
  }
}
