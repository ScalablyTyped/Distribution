package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The project name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1Model] = js.undefined
  
  /**
    * Required. Specifies the path, relative to `Model`, of the field to
    * update.  For example, to change the description of a model to "foo" and
    * set its default version to "version_1", the `update_mask` parameter would
    * be specified as `description`, `default_version.name`, and the `PATCH`
    * request body would specify the new value, as follows:     {
    * "description": "foo",       "defaultVersion": { "name":"version_1" } }
    * Currently the supported update masks are `description` and
    * `default_version.name`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsModelsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsModelsPatchMutableBuilder[Self <: ParamsResourceProjectsModelsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudMlV1Model): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
