package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesTenancyunitsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Filter expression over tenancy resources field. Optional.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of results returned by this request.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Managed service and service consumer. Required. services/{service\}/{collection id\}/{resource id\} {collection id\} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id\} is the consumer numeric id, such as project number: '123456'. {service\} the name of a service, such as 'service.googleapis.com'.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesTenancyunitsList {
  
  inline def apply(): ParamsResourceServicesTenancyunitsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesTenancyunitsList]
  }
  
  extension [Self <: ParamsResourceServicesTenancyunitsList](x: Self) {
    
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
