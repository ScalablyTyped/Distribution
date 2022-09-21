package typings.googleapis.idsV1Mod.idsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEndpointsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The filter expression, following the syntax outlined in https://google.aip.dev/160.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of endpoints to return. The service may return fewer than this value.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. A page token, received from a previous `ListEndpoints` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListEndpoints` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent, which owns this collection of endpoints.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEndpointsList {
  
  inline def apply(): ParamsResourceProjectsLocationsEndpointsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEndpointsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEndpointsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
