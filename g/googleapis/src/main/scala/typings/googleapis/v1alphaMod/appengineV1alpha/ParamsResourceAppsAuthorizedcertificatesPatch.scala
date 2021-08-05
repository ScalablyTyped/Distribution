package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsAuthorizedcertificatesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/authorizedCertificates/12345.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var authorizedCertificatesId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAuthorizedCertificate] = js.undefined
  
  /**
    * Standard field mask for the set of fields to be updated. Updates are only
    * supported on the certificate_raw_data and display_name fields.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsAuthorizedcertificatesPatch {
  
  inline def apply(): ParamsResourceAppsAuthorizedcertificatesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsAuthorizedcertificatesPatch]
  }
  
  extension [Self <: ParamsResourceAppsAuthorizedcertificatesPatch](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setAuthorizedCertificatesId(value: String): Self = StObject.set(x, "authorizedCertificatesId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedCertificatesIdUndefined: Self = StObject.set(x, "authorizedCertificatesId", js.undefined)
    
    inline def setRequestBody(value: SchemaAuthorizedCertificate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
