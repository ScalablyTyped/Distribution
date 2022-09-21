package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsIdentityawareproxyclientsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of clients to return. The service may return fewer than this value. If unspecified, at most 100 clients will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListIdentityAwareProxyClients` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListIdentityAwareProxyClients` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Full brand path. In the following format: projects/{project_number/id\}/brands/{brand\}.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrandsIdentityawareproxyclientsList {
  
  inline def apply(): ParamsResourceProjectsBrandsIdentityawareproxyclientsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsIdentityawareproxyclientsList]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsIdentityawareproxyclientsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
