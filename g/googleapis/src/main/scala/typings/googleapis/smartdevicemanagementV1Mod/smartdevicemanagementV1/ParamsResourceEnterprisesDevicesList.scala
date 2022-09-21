package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesDevicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional filter to list devices. Filters can be done on: Device custom name (substring match): 'customName=wing'
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional requested page size. Server may return fewer devices than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional token of the page to retrieve.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent enterprise to list devices under. E.g. "enterprises/XYZ".
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesDevicesList {
  
  inline def apply(): ParamsResourceEnterprisesDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesDevicesList]
  }
  
  extension [Self <: ParamsResourceEnterprisesDevicesList](x: Self) {
    
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
