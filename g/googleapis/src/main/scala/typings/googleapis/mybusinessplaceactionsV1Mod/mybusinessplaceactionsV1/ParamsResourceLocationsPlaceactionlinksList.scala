package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsPlaceactionlinksList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A filter constraining the place action links to return. The response includes entries that match the filter. We support only the following filter: 1. place_action_type=XYZ where XYZ is a valid PlaceActionType.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. How many place action links to return per page. Default of 10. The minimum is 1.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If specified, returns the next page of place action links.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the location whose place action links will be listed. `locations/{location_id\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsPlaceactionlinksList {
  
  inline def apply(): ParamsResourceLocationsPlaceactionlinksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsPlaceactionlinksList]
  }
  
  extension [Self <: ParamsResourceLocationsPlaceactionlinksList](x: Self) {
    
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
