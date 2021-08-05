package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTypeprovidersGettype
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type provider type for this request.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the type provider for this request.
    */
  var typeProvider: js.UndefOr[String] = js.undefined
}
object ParamsResourceTypeprovidersGettype {
  
  inline def apply(): ParamsResourceTypeprovidersGettype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTypeprovidersGettype]
  }
  
  extension [Self <: ParamsResourceTypeprovidersGettype](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeProvider(value: String): Self = StObject.set(x, "typeProvider", value.asInstanceOf[js.Any])
    
    inline def setTypeProviderUndefined: Self = StObject.set(x, "typeProvider", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
