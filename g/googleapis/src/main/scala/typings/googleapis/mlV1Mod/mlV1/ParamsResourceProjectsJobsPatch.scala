package typings.googleapis.mlV1Mod.mlV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The job name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1Job] = js.undefined
  
  /**
    * Required. Specifies the path, relative to `Job`, of the field to update.
    * To adopt etag mechanism, include `etag` field in the mask, and include
    * the `etag` value in your job resource.  For example, to change the labels
    * of a job, the `update_mask` parameter would be specified as `labels`,
    * `etag`, and the `PATCH` request body would specify the new value, as
    * follows:     {       "labels": {          "owner": "Google", "color":
    * "Blue"       }       "etag": "33a64df551425fcc55e4d42a148795d9f25f89d4"
    * } If `etag` matches the one on the server, the labels of the job will be
    * replaced with the given ones, and the server end `etag` will be
    * recalculated.  Currently the only supported update masks are `labels` and
    * `etag`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsPatch {
  
  inline def apply(): ParamsResourceProjectsJobsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsJobsPatch](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudMlV1Job): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
