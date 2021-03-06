package typings.googleapis.testingV1Mod.testingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsTestmatricesCancel extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Cloud project that owns the test.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Test matrix that will be canceled.
    */
  var testMatrixId: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsTestmatricesCancel {
  
  @scala.inline
  def apply(): ParamsResourceProjectsTestmatricesCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTestmatricesCancel]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsTestmatricesCancelMutableBuilder[Self <: ParamsResourceProjectsTestmatricesCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
  }
}
