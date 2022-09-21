package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVpngatewaysGetstatus
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the VPN gateway to return.
    */
  var vpnGateway: js.UndefOr[String] = js.undefined
}
object ParamsResourceVpngatewaysGetstatus {
  
  inline def apply(): ParamsResourceVpngatewaysGetstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVpngatewaysGetstatus]
  }
  
  extension [Self <: ParamsResourceVpngatewaysGetstatus](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setVpnGateway(value: String): Self = StObject.set(x, "vpnGateway", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayUndefined: Self = StObject.set(x, "vpnGateway", js.undefined)
  }
}
