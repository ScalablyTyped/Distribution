package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesList
  extends StObject
     with StandardParameters {
  
  /**
    * Number of AccessPolicy instances to include in the list. Default 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Next page token for the next batch of AccessPolicy instances. Defaults to the first page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for the container to list AccessPolicy instances from. Format: `organizations/{org_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesList {
  
  inline def apply(): ParamsResourceAccesspoliciesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesList]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
