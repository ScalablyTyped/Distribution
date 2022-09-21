package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesDomainsList
  extends StObject
     with StandardParameters {
  
  /**
    * The page size to return. Defaults to 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token from a previous request, if provided.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent for which to list domains, in the format: sites/ site-name
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesDomainsList {
  
  inline def apply(): ParamsResourceSitesDomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesDomainsList]
  }
  
  extension [Self <: ParamsResourceSitesDomainsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
