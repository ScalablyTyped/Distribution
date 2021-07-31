package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsVersionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The name of the model.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.undefined
  
  /**
    * Required. Specifies the path, relative to `Version`, of the field to
    * update. Must be present and non-empty.  For example, to change the
    * description of a version to "foo", the `update_mask` parameter would be
    * specified as `description`, and the `PATCH` request body would specify
    * the new value, as follows:     {       "description": "foo"     }
    * Currently the only supported update mask fields are `description` and
    * `autoScaling.minNodes`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsVersionsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsModelsVersionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsVersionsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsModelsVersionsPatchMutableBuilder[Self <: ParamsResourceProjectsModelsVersionsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudMlV1Version): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
