package typings.googleapis.gmailpostmastertoolsV1beta1Mod.gmailpostmastertoolsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainsList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested page size. Server may return fewer domains than requested. If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any. This is the value of ListDomainsResponse.next_page_token returned from the previous call to `ListDomains` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainsList {
  
  inline def apply(): ParamsResourceDomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainsList]
  }
  
  extension [Self <: ParamsResourceDomainsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
