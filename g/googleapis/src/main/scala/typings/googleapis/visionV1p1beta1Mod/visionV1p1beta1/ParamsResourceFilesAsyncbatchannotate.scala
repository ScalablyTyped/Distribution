package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceFilesAsyncbatchannotate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest] = js.native
}
object ParamsResourceFilesAsyncbatchannotate {
  
  @scala.inline
  def apply(): ParamsResourceFilesAsyncbatchannotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesAsyncbatchannotate]
  }
  
  @scala.inline
  implicit class ParamsResourceFilesAsyncbatchannotateMutableBuilder[Self <: ParamsResourceFilesAsyncbatchannotate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
