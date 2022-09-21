package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. A filter specifying constraints of a list operation. For example, `Domain.fqdn="mydomain.myorginization"`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Specifies the ordering of results. See [Sorting order](https://cloud.google.com/apis/design/design_patterns#sorting_order) for more information.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of items to return. If not specified, a default value of 1000 will be used. Regardless of the page_size value, the response may include a partial list. Callers should rely on a response's next_page_token to determine if there are additional results to list.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The `next_page_token` value returned from a previous ListDomainsRequest request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the domain location using the form: `projects/{project_id\}/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsList {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsList](x: Self) {
    
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
