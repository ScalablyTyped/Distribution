package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersDeploymentsDevicesList
  extends StObject
     with StandardParameters {
  
  /**
    * The filter expression. The filter should have one of the following formats: "sn=123454" or "display_name=MyDevice". sn corresponds to serial number of the device. The filter is case insensitive.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of devices to return in the response. If empty or zero, all devices will be listed. Must be in the range [0, 1000].
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListDevices that indicates where this listing should continue from.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the parent resource.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersDeploymentsDevicesList {
  
  inline def apply(): ParamsResourceCustomersDeploymentsDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersDeploymentsDevicesList]
  }
  
  extension [Self <: ParamsResourceCustomersDeploymentsDevicesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
