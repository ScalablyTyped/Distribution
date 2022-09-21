package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionnetworkendpointgroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the network endpoint group. It should comply with RFC1035.
    */
  var networkEndpointGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the region where the network endpoint group is located. It should comply with RFC1035.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionnetworkendpointgroupsGet {
  
  inline def apply(): ParamsResourceRegionnetworkendpointgroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionnetworkendpointgroupsGet]
  }
  
  extension [Self <: ParamsResourceRegionnetworkendpointgroupsGet](x: Self) {
    
    inline def setNetworkEndpointGroup(value: String): Self = StObject.set(x, "networkEndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointGroupUndefined: Self = StObject.set(x, "networkEndpointGroup", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
