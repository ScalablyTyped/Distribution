package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDomainaliasesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Immutable ID of the G Suite account.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the parent domain for which domain aliases are to be fetched.
    */
  var parentDomainName: js.UndefOr[String] = js.undefined
}
object ParamsResourceDomainaliasesList {
  
  inline def apply(): ParamsResourceDomainaliasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDomainaliasesList]
  }
  
  extension [Self <: ParamsResourceDomainaliasesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setParentDomainName(value: String): Self = StObject.set(x, "parentDomainName", value.asInstanceOf[js.Any])
    
    inline def setParentDomainNameUndefined: Self = StObject.set(x, "parentDomainName", js.undefined)
  }
}
