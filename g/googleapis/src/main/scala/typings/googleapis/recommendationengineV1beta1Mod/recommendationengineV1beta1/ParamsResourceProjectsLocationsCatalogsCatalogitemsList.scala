package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsCatalogitemsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Use of this field is not supported by version v1beta1.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Maximum number of results to return per page. If zero, the service will choose a reasonable default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The previous ListCatalogItemsResponse.next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent catalog resource name, such as `projects/x/locations/global/catalogs/default_catalog`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsCatalogitemsList {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsCatalogitemsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsCatalogitemsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsCatalogitemsList](x: Self) {
    
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
