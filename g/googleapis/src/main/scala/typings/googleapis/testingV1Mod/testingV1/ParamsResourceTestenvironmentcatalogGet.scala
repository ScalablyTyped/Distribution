package typings.googleapis.testingV1Mod.testingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTestenvironmentcatalogGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The type of environment that should be listed.
    */
  var environmentType: js.UndefOr[String] = js.undefined
  
  /**
    * For authorization, the cloud project requesting the
    * TestEnvironmentCatalog.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTestenvironmentcatalogGet {
  
  inline def apply(): ParamsResourceTestenvironmentcatalogGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTestenvironmentcatalogGet]
  }
  
  extension [Self <: ParamsResourceTestenvironmentcatalogGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setEnvironmentType(value: String): Self = StObject.set(x, "environmentType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTypeUndefined: Self = StObject.set(x, "environmentType", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
