package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsDomainmappingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to delete. Example:
    * apps/myapp/domainMappings/example.com.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var domainMappingsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsDomainmappingsDelete {
  
  inline def apply(): ParamsResourceAppsDomainmappingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsDelete]
  }
  
  extension [Self <: ParamsResourceAppsDomainmappingsDelete](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDomainMappingsId(value: String): Self = StObject.set(x, "domainMappingsId", value.asInstanceOf[js.Any])
    
    inline def setDomainMappingsIdUndefined: Self = StObject.set(x, "domainMappingsId", js.undefined)
  }
}
