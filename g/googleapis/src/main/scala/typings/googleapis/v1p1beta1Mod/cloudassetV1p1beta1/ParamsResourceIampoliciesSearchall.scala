package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIampoliciesSearchall
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The page size for search result pagination. Page size is capped at 500 even if a larger value is given. If set to zero, server will pick an appropriate default. Returned results may be fewer than requested. When this happens, there could be more results as long as `next_page_token` is returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If present, retrieve the next batch of results from the preceding call to this method. `page_token` must be the value of `next_page_token` from the previous response. The values of all other method parameters must be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The query statement. Examples: * "policy:myuser@mydomain.com" * "policy:(myuser@mydomain.com viewer)"
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The relative name of an asset. The search is limited to the resources within the `scope`. The allowed value must be: * Organization number (such as "organizations/123") * Folder number(such as "folders/1234") * Project number (such as "projects/12345") * Project id (such as "projects/abc")
    */
  var scope: js.UndefOr[String] = js.undefined
}
object ParamsResourceIampoliciesSearchall {
  
  inline def apply(): ParamsResourceIampoliciesSearchall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIampoliciesSearchall]
  }
  
  extension [Self <: ParamsResourceIampoliciesSearchall](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
