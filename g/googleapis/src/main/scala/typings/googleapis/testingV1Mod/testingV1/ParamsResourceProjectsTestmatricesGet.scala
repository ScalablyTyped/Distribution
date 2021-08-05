package typings.googleapis.testingV1Mod.testingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTestmatricesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique test matrix id which was assigned by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTestmatricesGet {
  
  inline def apply(): ParamsResourceProjectsTestmatricesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTestmatricesGet]
  }
  
  extension [Self <: ParamsResourceProjectsTestmatricesGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    inline def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
  }
}
