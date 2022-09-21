package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTargetvpngatewaysGet
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
    * Name of the target VPN gateway to return.
    */
  var targetVpnGateway: js.UndefOr[String] = js.undefined
}
object ParamsResourceTargetvpngatewaysGet {
  
  inline def apply(): ParamsResourceTargetvpngatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargetvpngatewaysGet]
  }
  
  extension [Self <: ParamsResourceTargetvpngatewaysGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTargetVpnGateway(value: String): Self = StObject.set(x, "targetVpnGateway", value.asInstanceOf[js.Any])
    
    inline def setTargetVpnGatewayUndefined: Self = StObject.set(x, "targetVpnGateway", js.undefined)
  }
}
